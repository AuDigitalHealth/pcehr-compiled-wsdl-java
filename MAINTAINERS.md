# Maintainer guide (pcehr-compiled-wsdl-java)

**Audience:** maintainers of this repository.

Paths are relative to this project root (directory containing **`pom.xml`**).

---

## 1. What this repository is

Maven coordinates:

- **`au.gov.nehta:pcehr-compiled-wsdl`** (packaging **`jar`**) — MHR B2B WSDL on the classpath + **Jakarta** generated JAX-WS/JAXB types (Java **11**)

**Not** included: PCEHR facade clients, TLS/signing handlers, or custom runtime WSDL resolution.

The **`feature/java11-jakarta`** branch is a **Java 11 / Jakarta** rewrite of **`master`**: same artifact id, generated API, and tree layout. Scope is namespace migration, **`maven.compiler.release`** 11, Jakarta compile dependencies, and documentation tidy-up — not a redesign of this repository to match other projects.

---

## 2. Layout

| Path | Role |
| ---- | ---- |
| `src/main/resources/wsdl/` | **`B2B_*.wsdl`** packaged under **`/wsdl/`** in the JAR |
| `src/main/java/wsdls/` | Legacy WSDL/XSD reference tree (same layout as **`master`**: **`wsdls/wsdl/External/`**, **`wsdls/schema/`**) |
| `src/main/java/` | Committed generated types + **`au.gov.nehta.schema.DateAdapter`** |
| `src/main/java/pcehr_override/` | xmldsig types (override package; not `org.w3._2000._09.xmldsig_`) |

**Not present** (removed for **`master`** parity; were on an earlier feature-branch only): **`src/main/resources/binding/`**, **`src/main/resources/schema/`**, repo-root **`schema/`**, **`scripts/`**, **`src/test/`**.

There is **no** in-repo **`wsimport`** profile or default unit-test suite.

---

## 3. MHR service coverage

Generated **`Service`** stubs cover the same **12** primary MHR B2B WSDLs as **`master`**:

Document registry/repository; get audit, change-history, individual-details, representative-list, and view; get/search template; PCEHR profile; register PCEHR; remove document.

---

## 4. Build design

**`pom.xml`** is the **`master`** build with only these Jakarta/Java 11 deltas:

- **`maven.compiler.release`** **11** (replaces **`maven.compiler.source` / `target`** **1.8**)
- **`jakarta.xml.bind-api`** (**4.0.5**), **`jakarta.xml.ws-api`** (**4.0.3**) compile dependencies (Java 11 no longer bundles JAXB/JAX-WS on the JDK classpath; **`jakarta.jws`** annotations are provided by **`jakarta.xml.ws-api`**)

Otherwise unchanged: same plugins, same **`clean verify`** lifecycle, no **`wsimport`**, no unit tests, no extra profiles. Generated sources are **committed**.

- **Java 11**, **`jakarta.*`** for JAXB/JAX-WS/JWS in **`src/main/java`**. No **`javax.xml.bind`**, **`javax.xml.ws`**, or **`javax.jws`**. JDK JAXP **`javax.xml.datatype.*`** and **`javax.xml.namespace.QName`** are expected in generated stubs.
- **`maven-javadoc-plugin`** **3.12.0** with **`doclint`** disabled (same as other ADHA Jakarta WSDL repos).
- When refreshing committed types, run **`wsimport`** with **`jaxb-xjc`** **${jaxb.xjc.version}** (**4.0.7**) on the plugin classpath. That produces valid schema-fragment Javadoc (HTML shows **`<`**/**`>`**, not broken tag warnings from legacy JAXB output).
- **`maven-gpg-plugin`**: **`gpg.skip`** defaults to **`true`**; set **`-Dgpg.skip=false`** for release signing.

---

## 5. Contributors vs release publisher

**Contributors (PRs):** Do not change **`<version>`**, **`<scm><tag>`**, or **`distributionManagement`** unless requested. Record user-visible work under **CHANGELOG.md** in the section matching **`pom.xml`** **`<version>`**.

**Release publisher:** Bump **`<version>`** (remove **`-SNAPSHOT`** for GA), set **`<scm><tag>`** to the Git tag, update **CHANGELOG.md**, run **`mvn -B -Dgpg.skip=false clean verify`**, deploy via Sonatype staging (**`distributionManagement`** in **`pom.xml`**).

---

## 6. Public commit checklist

Before pushing to a **public** remote:

1. **`git status`** — no keystores, **`settings.xml`**, or **`local.properties`** staged.
2. No **`target/`** committed.
3. **`mvn -B clean verify`** passes.
4. **CHANGELOG.md** and **`pom.xml`** version reflect the release line.

---

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
