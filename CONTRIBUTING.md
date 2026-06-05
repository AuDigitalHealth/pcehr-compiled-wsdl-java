# Contributing

**Audience:** developers building or changing **this repository** (**`1.6.5-SNAPSHOT`** / Java **11** / **Jakarta**). Integrators should use **README.md** and Maven Central coordinates.

## Prerequisites

- **JDK 11** with **`JAVA_HOME`** set.
- **Maven 3.6+** on **`PATH`**.

## Build

From the project root:

```text
mvn -B clean verify
```

| Goal | Command |
| ---- | ------- |
| Compile + unit tests + attach sources/Javadoc | `mvn -B clean verify` |
| Run unit tests only | `mvn -B clean test` |
| Skip tests | `mvn -B clean verify "-DskipTests=true"` |
| Signed release (GPG on **`PATH`**) | `mvn -B "-Dgpg.skip=false" clean verify` |
| Install snapshot locally (optional) | `mvn -B clean install` |

GPG signing is skipped by default (**`gpg.skip=true`** in **`pom.xml`**). Release builds: **`-Dgpg.skip=false`**.

## Dependencies

- Compile: **`jakarta.xml.bind:jakarta.xml.bind-api`**, **`jakarta.xml.ws:jakarta.xml.ws-api`** only (**`jakarta.jws`** is supplied by **`jakarta.xml.ws-api`**).
- Runtime SOAP stack: Eclipse EE4J **`com.sun.xml.ws:jaxws-rt`** **4.0.4** in **consuming** applications — **not** legacy Metro **`webservices-*`** bundles.
- **`maven-enforcer-plugin`** rejects Metro **`webservices-*`**, legacy **`javax.xml.bind` / `javax.xml.ws` / `javax.jws`**, and runtime JAX-WS/JAXB implementations in this POM.

## Regenerating sources

Generated Java under **`src/main/java`** (outside **`wsdls/`**) is **committed**. The root **`pom.xml`** does **not** run **`wsimport`**.

To refresh types after a WSDL change:

1. Regenerate from the WSDL/XSD in **this** repository using Jakarta **`wsimport`** (Java **11**, EE4J **`jaxws-rt`** **4.0.x**).
2. Preserve public API: same class names, packages, and **`pcehr_override`** xmldsig layout.
3. Run **`mvn -B clean verify`** and update **CHANGELOG.md**.

See **MAINTAINERS.md** for layout and release notes.

## Repository hygiene

- **Do not commit** keystores, production MHR endpoint URLs, populated **`settings.xml`** with release credentials, or **`local.properties`** with secrets. See **SECURITY.md**.
- **`1.6.5`:** generated Java under **`src/main/java`** is frozen — this POM has no **`wsimport`** profile.
- **Changes:** Keep commits focused; match existing generated-code style.
- Maintainer notes: **MAINTAINERS.md**.

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
