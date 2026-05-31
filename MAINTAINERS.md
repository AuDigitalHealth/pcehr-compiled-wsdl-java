# Maintainer guide (pcehr-compiled-wsdl-java)

Audience: maintainers of this repository. Facade client design lives in **mhr-b2b-client-java** `MAINTAINERS.md`.

Paths are relative to this project root (directory containing **`pom.xml`**).

---

## 1. What this repository is

Maven coordinates:

- **`au.gov.nehta:pcehr-compiled-wsdl`** (packaging **`jar`**) — MHR B2B WSDL on the classpath + **Jakarta** generated JAX-WS/JAXB types (Java **11**)

**Not** included: PCEHR facade clients, TLS/signing handlers, or runtime filesystem WSDL resolution used by **mhr-b2b-client-java**.

Sibling: **mhr-wsdl-java** (`au.gov.nehta:mhr-wsdl`) — same generated types and WSDL layout; keep in sync when changing codegen. **hi-wsdl-java** (`au.gov.nehta:hi-wsdl`) for Healthcare Identifiers.

---

## 2. Layout

| Path | Role |
| ---- | ---- |
| `src/main/resources/wsdl/` | Primary **`B2B_*.wsdl`** (packaged under **`/wsdl/`** in JAR) |
| `src/main/resources/binding/` | JAX-WS/JAXB binding fragments (**committed**; aligned with **mhr-b2b-client-java**) |
| `src/main/java/` | Committed generated types + **`au.gov.nehta.schema.DateAdapter`** |
| `src/test/java/au/gov/nehta/pcehrwsdl/` | Offline binding smoke tests |
| `schema/readme.txt` | Licensed XSD staging instructions (tracked) |
| `src/main/resources/schema/` | Local licensed XSD for regeneration (**gitignored**) |
| `scripts/` | Maintainer helpers to regenerate **`pom.xml`** wsimport block |
| `.github/workflows/ci.yml` | GitHub Actions **`mvn verify`** on push/PR |

---

## 3. MHR service coverage

Generated **`Service`** stubs cover the same **12** primary MHR B2B WSDLs used by **mhr-b2b-client-java** `wsimport`:

Document registry/repository, audit/change-history/individual-details/representative-list/view, template search/get, PCEHR profile, register, remove document, search template.

Interface-only **`B2B_*Interface.wsdl`** variants are packaged but not separately codegenned.

---

## 4. Build design

- **Java 11**, **`jakarta.*`** APIs only in **`src/main/java`** (no `javax.xml.bind` / `javax.xml.ws`).
- **`jaxws-rt`** **4.0.4** (runtime scope in POM).
- Generated sources are **committed**; root POM has **no** default **`wsimport`** execution.
- Regeneration: **`-Pregenerate-sources`** (**12** **`wsimport`** executions, WSDL from **`src/main/resources/wsdl`**, XSD under **`src/main/resources/schema`**, bindings under **`src/main/resources/binding`**). **`jaxb-xjc` 4.0.7** on the plugin classpath. Sync to Git with **`-Dpcehr.wsdl.sync.generated=true`**.
- **`maven-gpg-plugin`**: skipped unless **`-Dgpg.skip=false`** (releases).

Align **`jaxws-rt`** with **mhr-b2b-client-java** when bumping toolchain versions.

---

## 5. Release

1. Update **CHANGELOG.md** and **`pom.xml`** **`<version>`** / SCM **`<tag>`**.
2. **`mvn -B -Dgpg.skip=false clean verify`** (with signing credentials).
3. Deploy via Sonatype staging (**`distributionManagement`** in **`pom.xml`**).

---

## 6. Public commit checklist

Before pushing to a **public** remote:

1. **`git status`** — no **`*.xsd`** under **`src/main/resources/schema/`** staged or tracked (only **`.gitkeep`**).
2. No **`settings.xml`**, **`local.properties`**, keystores, or **`target/`**.
3. **`mvn -B "-Dgpg.skip=true" clean verify`** passes.
4. **CHANGELOG.md** and **`pom.xml`** version reflect the release line.

---

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
