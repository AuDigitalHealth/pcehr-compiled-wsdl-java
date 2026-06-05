# PCEHR compiled WSDL library

Maven artifact **`au.gov.nehta:pcehr-compiled-wsdl`** — My Health Record **B2B WSDL resources** and **pre-generated JAX-WS / JAXB types** for PCEHR client development.

For hand-written facade clients, TLS, and signing, use **[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)**. This repository supplies the **generated type layer** and classpath WSDL only.

## Release line

| Version | Java | XML stack | MHR service scope |
| ------- | ---- | --------- | ----------------- |
| **1.6.3** | **8** | **`javax.*`** / EE4J **`jaxws-rt` 2.3.x** at runtime in consumers | **12** `Service` stubs |

**This checkout** builds **`1.6.3-SNAPSHOT`** (Java **8** / **`javax`**) — **committed, frozen** generated types (no **`wsimport`** in the build).

For Java **11** / **Jakarta** MHR B2B clients and in-repo **`wsimport`**, use **[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)** (**`mhr-b2b-client`**) — a separate artifact that does not depend on **`pcehr-compiled-wsdl`**.

## Dependency

Published releases are consumed from **[Maven Central](https://central.sonatype.com/)** like any other dependency — no local build is required.

```xml
<dependency>
  <groupId>au.gov.nehta</groupId>
  <artifactId>pcehr-compiled-wsdl</artifactId>
  <version>VERSION</version>
</dependency>
```

Add Eclipse EE4J **`com.sun.xml.ws:jaxws-rt`** **2.3.7** at runtime in your application when you invoke SOAP endpoints (**`javax.xml.ws`** / **`javax.xml.bind`**). This JAR does not bundle **`jaxws-rt`**. Do **not** use legacy Metro **`webservices-*`** bundles (**`webservices-rt`**, **`webservices-api`**, etc.).

## What is in the JAR

| Content | Location in repo |
| ------- | ---------------- |
| MHR B2B WSDL (classpath) | `src/main/resources/wsdl/B2B_*.wsdl` |
| WSDL/XSD reference tree (legacy layout) | `src/main/java/wsdls/` (WSDL under `wsdls/wsdl/External/`; XSD under `wsdls/schema/`) |
| Generated stubs (`javax`) | `src/main/java/` (excluding `wsdls/`) |
| Date adapter | `src/main/java/au/gov/nehta/schema/DateAdapter.java` |
| xmldsig override types | `src/main/java/pcehr_override/org/w3/` |

The published JAR includes **22** WSDL files under **`/wsdl/`** (12 service WSDLs plus 10 interface-only **`B2B_*Interface.wsdl`** files). Integrators load them from the classpath (for example **`ClassLoader.getResource("wsdl/B2B_PCEHRProfile.wsdl")`**) or pass an explicit **`URL`** to generated **`Service`** constructors.

Generated **`Service`** stubs cover **12** primary MHR B2B operations: document registry/repository; get audit, change-history, individual-details, representative-list, and view; get/search template; PCEHR profile; register PCEHR; remove document.

## Building from source

**Audience:** contributors changing this repository — not integrators adding a Maven dependency.

Prerequisites: **JDK 8**, **Maven 3.6+**. All JAX-WS/JAXB types are **committed** in **`src/main/java`**; the build compiles them only (no codegen).

```text
mvn -B clean verify
```

GPG signing is skipped by default (**`gpg.skip=true`** in **`pom.xml`**). See **`CONTRIBUTING.md`** for optional **`mvn install`** when testing unpublished snapshots locally.

## Related repositories

| Repository | Role |
| ---------- | ---- |
| [mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java) | MHR facade clients (**`mhr-b2b-client`** — separate artifact; does not depend on **`pcehr-compiled-wsdl`**) |
| [hi-wsdl-java](https://github.com/AuDigitalHealth/hi-wsdl-java) | HI WSDL/types (separate domain) |

Confirm your organisation's redistribution terms for MHR B2B WSDL before mirroring this repository.

## Documentation

| Document | Audience |
| -------- | -------- |
| **README.md** (this file) | Integrators |
| **CONTRIBUTING.md** | Contributors |
| **MAINTAINERS.md** | Releases and tooling |
| **SECURITY.md** | Security reporting and secrets hygiene |
| **CHANGELOG.md** | Release history |
| **LICENSE.txt** | Apache License 2.0 + ADHA terms |

## License

Apache License 2.0. See **LICENSE.txt**.
