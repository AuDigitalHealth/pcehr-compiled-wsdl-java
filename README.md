# PCEHR compiled WSDL library (Java 11 / Jakarta)

Maven artifact **`au.gov.nehta:pcehr-compiled-wsdl`** — My Health Record **B2B WSDL resources** and **pre-generated Jakarta JAX-WS / JAXB types** for PCEHR client development.

For hand-written facade clients, TLS, and signing, use **[mhr-b2b-client-java](https://github.com/AuDigitalHealth/mhr-b2b-client-java)**. This repository supplies the **generated type layer** only.

## Dependency

```xml
<dependency>
  <groupId>au.gov.nehta</groupId>
  <artifactId>pcehr-compiled-wsdl</artifactId>
  <version>1.7.0-SNAPSHOT</version>
</dependency>
```

Runtime (transitive in this repo): Eclipse **`jaxws-rt`** 4.x. Align Jakarta XML Web Services versions with **`mhr-b2b-client`** if both are on the classpath.

## What is in the JAR

| Content | Location in repo |
| ------- | ---------------- |
| MHR B2B WSDL (classpath) | `src/main/resources/wsdl/B2B_*.wsdl` |
| JAX-WS/JAXB bindings | `src/main/resources/binding/` |
| Jakarta generated stubs | `src/main/java/` |
| Date adapter | `src/main/java/au/gov/nehta/schema/DateAdapter.java` |

The published JAR includes WSDL under **`/wsdl/`** (for example `/wsdl/B2B_PCEHRProfile.wsdl`). Generated **`Service`** classes reference those locations.

**JAXB binding fragments** under **`src/main/resources/binding/`** are maintainer build configuration (aligned with **mhr-b2b-client-java**). They reference XSD paths but do **not** contain licensed schema content — **commit them** for reproducible regeneration.

## Licensed PCEHR schemas (regeneration only)

WSDL files reference **`../schema/...`** relative to **`src/main/resources/wsdl/`**. The **PCEHR XSD tree is not in Git** — stage it locally when **regenerating** types (see **`schema/readme.txt`**).

A normal **`mvn verify`** on committed sources does **not** require the schema tree.

Confirm your organisation's redistribution terms for MHR B2B WSDL before mirroring this repository.

## Build from source

Prerequisites: **JDK 11+**, **Maven 3.6+**. Generated Java is **committed**; default build does not run **`wsimport`**. CI runs the same **`mvn verify`** on every push/PR (see **`.github/workflows/ci.yml`**).

```text
mvn -B "-Dgpg.skip=true" clean verify
```

Or **`build.ps1`**, **`build.sh`**, **`build.bat`**.

## Relationship to mhr-b2b-client-java

| | **pcehr-compiled-wsdl-java** (this repo) | **mhr-b2b-client-java** |
| --- | --- | --- |
| Artifact | `pcehr-compiled-wsdl` | `mhr-b2b-client` |
| Facade clients | No | Yes (`au.gov.nehta.vendorlibrary.pcehr.clients.*`) |
| Codegen | Pre-generated, committed | In-repo **`wsimport`** (12 executions) |
| WSDL in this repo | `src/main/resources/wsdl/` (shipped in JAR) | `wsdls/src/main/resources/` (not in published JAR) |

Current **`mhr-b2b-client-java`** builds its own generated types and does **not** depend on **`pcehr-compiled-wsdl`**. Use **`pcehr-compiled-wsdl`** when you need MHR types and classpath WSDL without the full client library.

## Documentation

| Document | Audience |
| -------- | -------- |
| **README.md** (this file) | Integrators |
| **CONTRIBUTING.md** | Contributors building from source |
| **MAINTAINERS.md** | Release and codegen alignment |
| **SECURITY.md** | Security reporting and secrets hygiene |
| **CHANGELOG.md** | Release history |
| **schema/readme.txt** | Licensed XSD staging (regeneration only) |

## What belongs in Git

| Path | Commit? |
| ---- | ------- |
| `src/main/resources/wsdl/` | Yes — published WSDL |
| `src/main/resources/binding/` | Yes — JAXB/JAX-WS customisation (not licensed XSD) |
| `src/main/java/` | Yes — committed generated types + `DateAdapter` |
| `schema/readme.txt` | Yes — staging instructions only |
| `src/main/resources/schema/` (XSD files) | **No** — licensed; local staging for `-Pregenerate-sources` only |

Before pushing to a **public** remote, run **`git status`** and confirm no **`*.xsd`** under **`src/main/resources/schema/`** appear in the index. See **SECURITY.md**.

## License

Apache License 2.0. See **LICENSE.txt**.
