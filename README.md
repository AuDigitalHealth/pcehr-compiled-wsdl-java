# PCEHR compiled WSDL library (Java 11 / Jakarta)

Maven artifact **`au.gov.nehta:pcehr-compiled-wsdl`** — My Health Record **B2B WSDL resources** and **pre-generated Jakarta JAX-WS / JAXB types** for PCEHR client development.

For hand-written facade clients, TLS, and signing, use **[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)**. This repository supplies the **generated type layer** only.

The **`feature/java11-jakarta`** branch is a **Java 11 / Jakarta** rewrite of **`master`**: same artifact id, class names, packages, WSDL coverage, and repository layout. Changes are limited to the XML Web Services namespace, **`maven.compiler.release`** 11, updated Jakarta API dependencies, and documentation tidy-up.

## Dependency

```xml
<dependency>
  <groupId>au.gov.nehta</groupId>
  <artifactId>pcehr-compiled-wsdl</artifactId>
  <version>1.6.5-SNAPSHOT</version>
</dependency>
```

Compile-time APIs use **`jakarta.jws`**, **`jakarta.xml.bind`**, and **`jakarta.xml.ws`**. **`pom.xml`** declares **`jakarta.xml.bind-api`** (**4.0.5**) and **`jakarta.xml.ws-api`** (**4.0.3**); the latter also supplies **`jakarta.jws`**. There is **no** legacy Java EE **`javax.xml.bind`**, **`javax.xml.ws`**, or **`javax.jws`** in generated sources. JDK JAXP types (**`javax.xml.datatype.*`**, **`javax.xml.namespace.QName`**) remain where JAXB/JAX-WS require them.

Consumers supply a Jakarta XML Web Services runtime (for example **`jaxws-rt`**) on the classpath at runtime — same as the Java 8 line, where the JDK provided **`javax.*`** APIs.

## What is in the JAR

| Content | Location in repo |
| ------- | ---------------- |
| MHR B2B WSDL (classpath) | `src/main/resources/wsdl/B2B_*.wsdl` |
| WSDL/XSD reference tree (legacy layout) | `src/main/java/wsdls/` (WSDL under `wsdls/wsdl/External/`; XSD under `wsdls/schema/`) |
| Jakarta generated stubs | `src/main/java/` (excluding `wsdls/`) |
| Date adapter | `src/main/java/au/gov/nehta/schema/DateAdapter.java` |
| xmldsig override types | `src/main/java/pcehr_override/org/w3/` |

The published JAR includes **22** WSDL files under **`/wsdl/`** (12 service WSDLs plus 10 interface-only **`B2B_*Interface.wsdl`** files). Integrators load them from the classpath (for example **`ClassLoader.getResource("wsdl/B2B_PCEHRProfile.wsdl")`**) or pass an explicit **`URL`** to generated **`Service`** constructors — same integration pattern as the Java 8 line.

**`*Interface.wsdl`** files declare **`schemaLocation="../../schema/..."`** in XML (historical layout). There is **no** **`src/main/resources/schema/`** tree — same as **`master`**. Licensed XSD copies for reference/regeneration live under **`src/main/java/wsdls/schema/`**.

## Service coverage

Generated **`Service`** stubs cover the same **12** primary MHR B2B operations as **`master`**:

Document registry/repository; get audit, change-history, individual-details, representative-list, and view; get/search template; PCEHR profile; register PCEHR; remove document.

Interface-only **`B2B_*Interface.wsdl`** files are packaged under **`src/main/resources/wsdl/`** but are not separately codegenned.

## Build from source

Prerequisites: **JDK 11+**, **Maven 3.6+**. Generated Java is **committed**; the default build does **not** run **`wsimport`**.

```text
mvn -B clean verify
```

GPG signing is skipped by default (**`gpg.skip=true`** in **`pom.xml`**). For a signed release build, use **`-Dgpg.skip=false`** (requires GPG on **`PATH`**).

Or **`build.ps1`**, **`build.sh`**, or **`build.bat`** (same **`verify`**). Set **`MVN_SETTINGS`** only if you need **`mvn -s`**.

Install to the local repository:

```text
mvn -B clean install
```

## Related projects

**[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)** provides hand-written facade clients, TLS, and signing. It uses a **different** Maven artifact (**`mhr-b2b-client`**) and does **not** depend on **`pcehr-compiled-wsdl`**. Use **`pcehr-compiled-wsdl`** when you need this historical artifact id or classpath WSDL without the full client library.

Confirm your organisation's redistribution terms for MHR B2B WSDL before mirroring this repository.

## Documentation

| Document | Audience |
| -------- | -------- |
| **README.md** (this file) | Integrators |
| **CONTRIBUTING.md** | Contributors building from source |
| **MAINTAINERS.md** | Release and regeneration notes |
| **SECURITY.md** | Security reporting and secrets hygiene |
| **CHANGELOG.md** | Release history |
| **LICENSE.txt** | Apache License 2.0 + ADHA terms |

## License

Apache License 2.0. See **LICENSE.txt**.
