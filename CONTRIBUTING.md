# Contributing

**Audience:** developers building or changing **this repository**. Integrators should use **README.md** and Maven Central coordinates.

## Prerequisites

- **JDK 8** with **`JAVA_HOME`** set.
- **Maven 3.6+** on **`PATH`**.

## Build

From the project root:

```text
mvn -B clean verify
```

| Goal | Command |
| ---- | ------- |
| Compile + attach sources/Javadoc | `mvn -B clean verify` |
| Run unit tests only | `mvn -B clean test` |
| Skip tests | `mvn -B clean verify "-DskipTests=true"` |
| Signed release (GPG on **`PATH`**) | `mvn -B "-Dgpg.skip=false" clean verify` |
| Install snapshot locally (optional) | `mvn -B clean install` — only when testing unpublished changes against another project |

GPG signing is skipped by default (**`gpg.skip=true`** in **`pom.xml`**). Release builds: **`-Dgpg.skip=false`**.

## Dependencies

- Compile ( **`provided`** ): **`javax.xml.bind:jaxb-api`**, **`javax.xml.ws:jaxws-api`**, **`javax.jws:javax.jws-api`** only — on the JDK 8 classpath; **`provided`** so they are not transitive to consumers.
- Runtime SOAP stack: Eclipse EE4J **`com.sun.xml.ws:jaxws-rt`** **2.3.7** in **consuming** applications — **not** legacy Metro **`webservices-*`** bundles.
- **`maven-enforcer-plugin`** rejects Metro **`webservices-*`**, all **`jakarta.*`** XML API coordinates, and runtime JAX-WS/JAXB implementations in this POM (**`javax`** API deps only).

## Regenerating sources

Generated Java under **`src/main/java`** (outside **`wsdls/`**) is **committed**. The root **`pom.xml`** does **not** run **`wsimport`**.

To refresh types after a WSDL change on this line:

1. Regenerate from the WSDL/XSD in **this** repository (**`src/main/resources/wsdl/`**, **`src/main/java/wsdls/`**) using **`wsimport`** on Java **8** / **`javax`**.
2. Preserve public API: same class names, packages, and **`pcehr_override`** xmldsig layout.
3. Fix known JAXB Javadoc issues (for example replace **`{@link byte[]}`** with **`{@code byte[]}`** in **`pcehr_override/`**).
4. Run **`mvn -B clean verify`** and update **CHANGELOG.md**.

Java **11** / **Jakarta** MHR type regeneration and facade clients are maintained in **[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)**, not this repository.

## Repository hygiene

- **Do not commit** keystores, production MHR endpoint URLs, populated **`settings.xml`** with release credentials, or **`local.properties`** with secrets. See **SECURITY.md**.
- **`1.6.3`:** generated Java under **`src/main/java`** is frozen — this POM has no **`wsimport`** profile.
- **Changes:** Keep commits focused; match existing generated-code style.
- Maintainer notes: **MAINTAINERS.md**.

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
