# Maintainer guide

Paths are relative to the repository root (directory containing **`pom.xml`**).

## Release line

**Documentation convention:** README, CONTRIBUTING, CHANGELOG, and integrator-facing text use **version numbers only** — never Git branch names.

| Version | Java | APIs | `Service` stubs |
| ------- | ---- | ---- | ----------------- |
| **1.6.3** | 8 | **`javax.xml.ws`**, **`javax.xml.bind`**, **`javax.jws`** | **12** (MHR B2B) |

**Git branch (maintainers / checkout only — do not use in integrator docs):** **`java-8-javax`**.

**This tree (`1.6.3-SNAPSHOT`):** Java **8**, committed **`javax`** generated types, **12** primary MHR B2B **`@WebServiceClient`** services. Sources are **frozen** in Git (no **`wsimport`** in this POM). Java **11** / **Jakarta** MHR types and facade clients live in **[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)** — not in this repository.

## Artifact

- **`au.gov.nehta:pcehr-compiled-wsdl`** — MHR B2B WSDL on the classpath + pre-generated JAX-WS/JAXB types.
- **Not included:** PCEHR facade clients, TLS/signing, or custom runtime WSDL resolution (**[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)** is a separate artifact and does not depend on this JAR).

## Layout

| Path | Role |
| ---- | ---- |
| `src/main/resources/wsdl/` | **`B2B_*.wsdl`** packaged under **`/wsdl/`** in the JAR |
| `src/main/java/wsdls/` | Legacy WSDL/XSD reference tree (**`wsdls/wsdl/External/`**, **`wsdls/schema/`**) |
| `src/main/java/` | Committed generated types + **`au.gov.nehta.schema.DateAdapter`** |
| `src/main/java/pcehr_override/` | xmldsig types (override package) |

There is **no** in-repo **`wsimport`** profile. Offline unit tests under **`src/test/java/au/gov/nehta/pcehrwsdl/`** (javax stack, WSDL classpath, generated binding smoke tests).

## Build (`1.6.3` line)

- **`maven.compiler.release`** **8**
- Compile deps ( **`provided`** ): **`jaxb-api` 2.3.1**, **`jaxws-api` 2.3.1**, **`javax.jws-api` 1.1** — no **`jaxws-rt`** in this POM
- **`maven-enforcer-plugin`:** bans Metro **`webservices-*`**, all **`jakarta.*`** XML APIs — not EE4J **`jaxws-rt`** (that belongs in consuming apps)
- Consumers: Eclipse EE4J **`com.sun.xml.ws:jaxws-rt` 2.3.7** (last **2.3.x** on Central for Java **8**)
- **`maven-gpg-plugin`:** skipped unless **`-Dgpg.skip=false`**
- **`maven-javadoc-plugin`:** **`doclint=none`**, **`quiet=true`**, **`failOnWarnings=false`**
- Build plugins aligned with **hi-wsdl-java** **`1.6.3`** (Java **8**–compatible latest releases)
- **No source regeneration** on **`1.6.3`** — **`src/main/java`** and **`pcehr_override/`** are committed as-is

## Release

1. Update **CHANGELOG.md** and **`pom.xml`** **`<version>`** / SCM **`<tag>`**.
2. **`mvn -B "-Dgpg.skip=false" clean verify`** (with signing credentials).
3. Deploy via Sonatype staging (**`distributionManagement`** in **`pom.xml`**).

## Public commit checklist

Before pushing to a **public** remote:

1. **`git status`** — no keystores, **`settings.xml`**, or **`local.properties`** staged.
2. No **`target/`** committed.
3. **`mvn -B clean verify`** passes.
4. **CHANGELOG.md** and **`pom.xml`** version reflect the release line.

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
