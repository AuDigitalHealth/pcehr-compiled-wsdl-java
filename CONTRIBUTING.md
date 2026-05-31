# Contributing

**Audience:** developers building or changing **this repository**. Integrators adding a Maven dependency should use **README.md**.

---

## Prerequisites

- **JDK 11+** with **`JAVA_HOME`** set.
- **Maven 3.6+** on **`PATH`**.
- **`src/main/resources/schema/`** only when **regenerating** Jakarta stubs from WSDL (not required for default **`mvn verify`**). See **`schema/readme.txt`**.

---

## Build

From the project root (directory containing **`pom.xml`**):

```text
mvn -B "-Dgpg.skip=true" clean verify
```

Or use **`build.ps1`**, **`build.sh`**, or **`build.bat`**. Set **`MVN_SETTINGS`** if you must pass **`-s`** to Maven.

| Goal | Command |
| ---- | ------- |
| Compile + unit tests | `mvn -B "-Dgpg.skip=true" clean verify` |
| Skip tests | `mvn -B "-Dgpg.skip=true" clean verify "-DskipTests=true"` |
| Install to local repo | `mvn -B "-Dgpg.skip=true" clean install` |

Default tests: **`GeneratedWsdlBindingsTest`** in **`au.gov.nehta.pcehrwsdl`** (offline smoke tests; no licensed schema or network required).

GPG signing is skipped by default (**`-Dgpg.skip=true`**). Release builds: **`-Dgpg.skip=false`**.

---

## Regenerating Jakarta sources

Generated Java under **`src/main/java`** is **committed**. Regeneration is maintainer-only and requires:

1. Current B2B WSDL under **`src/main/resources/wsdl/`**.
2. **`src/main/resources/schema/`** present locally (see **`schema/readme.txt`**).
3. Jakarta **`wsimport`** tooling aligned with **`MAINTAINERS.md`** (**`jaxws-rt`** 4.0.x, Java 11).

```text
mvn -B clean -Pregenerate-sources generate-sources process-sources -Dpcehr.wsdl.sync.generated=true
mvn -B "-Dgpg.skip=true" clean verify
```

The **`regenerate-sources`** profile runs **12** **`wsimport`** executions with **`jaxb-xjc` 4.0.7**. Update **CHANGELOG.md** after regeneration.

---

## Repository hygiene

- **Do not commit:** populated **`local.properties`**, **`settings.xml`** (use **`settings.xml.example`** as a template only), licensed **`src/main/resources/schema/`** XSD files (only **`.gitkeep`** is tracked), keystores, or production MHR URLs. See **SECURITY.md**.
- **Do commit:** **`src/main/resources/binding/`** (JAXB customisation), WSDL, and committed generated Java under **`src/main/java/`**.
- **Before a public push:** run **`git status`** and confirm no **`*.xsd`** under **`src/main/resources/schema/`** are staged.
- **Line endings:** LF per **`.gitattributes`**. On Windows: **`git config core.autocrlf false`** in this clone before committing.
- Maintainer notes: **MAINTAINERS.md**.

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
