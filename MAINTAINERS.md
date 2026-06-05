# Maintainer guide

Paths are relative to the repository root (directory containing **`pom.xml`**).

## Release lines

**Documentation convention:** README, CONTRIBUTING, CHANGELOG, and integrator-facing text use **version numbers only** — never Git branch names.

| Version | Java | APIs | `Service` stubs |
| ------- | ---- | ---- | ----------------- |
| **1.6.3** | 8 | **`javax.xml.ws`**, **`javax.xml.bind`**, **`javax.jws`** | **12** (MHR B2B) |
| **1.6.5** | 11 | **Jakarta** XML WS / Bind | **12** (MHR B2B) |

**Git branch mapping (maintainers / checkout only — do not use in integrator docs):**

| Version | Git branch |
| ------- | ---------- |
| **1.6.3** | `java-8-javax` |
| **1.6.5** | `java-11-jakarta` |

**This tree (`1.6.5-SNAPSHOT`):** Java **11**, committed **Jakarta** generated types, **12** primary MHR B2B **`@WebServiceClient`** services. Sources are **frozen** in Git (no **`wsimport`** in this POM).

## Artifact

- **`au.gov.nehta:pcehr-compiled-wsdl`** — MHR B2B WSDL on the classpath + pre-generated Jakarta JAX-WS/JAXB types.
- **Not included:** PCEHR facade clients, TLS/signing, or custom runtime WSDL resolution (**[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)** is a separate artifact).

## Layout

| Path | Role |
| ---- | ---- |
| `src/main/resources/wsdl/` | **`B2B_*.wsdl`** packaged under **`/wsdl/`** in the JAR |
| `src/main/java/wsdls/` | Legacy WSDL/XSD reference tree |
| `src/main/java/` | Committed generated types + **`au.gov.nehta.schema.DateAdapter`** |
| `src/main/java/pcehr_override/` | xmldsig types (override package) |
| `src/test/java/au/gov/nehta/pcehrwsdl/` | Offline binding smoke tests |

There is **no** in-repo **`wsimport`** profile.

## Build (`1.6.5` line)

- **`maven.compiler.release`** **11**
- Compile deps: **`jakarta.xml.bind-api` 4.0.5**, **`jakarta.xml.ws-api` 4.0.3** — no **`jaxws-rt`** in this POM
- **`maven-enforcer-plugin`:** bans Metro **`webservices-*`** and legacy **`javax.xml.bind` / `javax.xml.ws` / `javax.jws` / `javax.xml.soap`**
- Consumers: Eclipse EE4J **`com.sun.xml.ws:jaxws-rt` 4.0.4**
- **`maven-gpg-plugin`:** skipped unless **`-Dgpg.skip=false`**
- **`maven-javadoc-plugin`:** **`doclint=none`**, **`quiet=true`**, **`failOnWarnings=false`**
- Build plugins aligned with **hi-wsdl-java** **`1.6.5`**
- Offline unit tests: **`JakartaStackTest`**, **`PcehrCompiledWsdlArtifactTest`**, **`GeneratedWsdlBindingsTest`**
- **No source regeneration** in the default build — **`src/main/java`** and **`pcehr_override/`** are committed as-is

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
