# Contributing

**Audience:** developers building or changing **this repository**. Integrators adding a Maven dependency should use **README.md**.

---

## Prerequisites

- **JDK 11+** with **`JAVA_HOME`** set.
- **Maven 3.6+** on **`PATH`**.

---

## Build

From the project root (directory containing **`pom.xml`**):

```text
mvn -B clean verify
```

Or **`build.ps1`**, **`build.sh`**, or **`build.bat`**. Set **`MVN_SETTINGS`** only if you need **`mvn -s`**.

| Goal | Command |
| ---- | ------- |
| Compile + attach sources/javadoc | `mvn -B clean verify` |
| Signed release (GPG on **`PATH`**) | `mvn -B -Dgpg.skip=false clean verify` |
| Install to local repo | `mvn -B clean install` |

**`pom.xml`** matches **`master`** (compile committed sources, attach sources/javadoc, GPG at **`verify`**) except for **Java 11**, **Jakarta compile dependencies**, and **`gpg.skip`** defaulting to **`true`**. There is **no** in-repo **`wsimport`**, no **`src/test/`**, no **`src/main/resources/binding/`**, and no extra Maven profiles.

For release publishing, set **`-Dgpg.skip=false`** (**MAINTAINERS.md**).

---

## Regenerating Jakarta sources

Generated Java under **`src/main/java`** (outside **`wsdls/`**) is **committed**. The root **`pom.xml`** does **not** run **`wsimport`**.

To refresh types after a WSDL change:

1. Regenerate from the WSDL/XSD in **this** repository (**`src/main/resources/wsdl/`**, **`src/main/java/wsdls/`** — use **`wsdls/schema/`** for XSD, not **`src/main/resources/schema/`**) using Jakarta **`wsimport`** (Java 11, **`jaxws-rt`** 4.x). Put **`jaxb-xjc`** **${jaxb.xjc.version}** (currently **4.0.7**) on the **`jaxws-maven-plugin`** classpath so schema-fragment Javadoc escapes **`<`**/**`>`** correctly and **`mvn verify`** javadoc attachment is clean.
2. Preserve **`master`** public API: same class names, packages, and **`pcehr_override`** xmldsig layout.
3. If the generator still emits legacy **`javax.*`** XML API imports, apply **`javax.*` → `jakarta.*`** only where required (`jakarta.xml.bind`, `jakarta.xml.ws`, `jakarta.jws`).
4. Run **`mvn -B clean verify`** and update **CHANGELOG.md**.

See **MAINTAINERS.md** for layout and release notes.

---

## Repository hygiene

- **Do not commit:** populated **`local.properties`**, a repo-root **`settings.xml`** with secrets, keystores, passwords, API tokens, private keys, or production MHR endpoint URLs. See **SECURITY.md**.
- **Line endings:** LF per **`.gitattributes`**. On Windows: **`git config core.autocrlf false`** in this clone before committing.
- **Changes:** Keep commits focused; match existing generated-code style.
- Maintainer notes: **MAINTAINERS.md**.

## Copyright

Copyright 2012 NEHTA. Copyright 2021-2026 ADHA. Apache License 2.0 — see **LICENSE.txt**.
