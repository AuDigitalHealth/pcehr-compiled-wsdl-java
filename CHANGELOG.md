# Change Log/Revision History

= 1.6.5-SNAPSHOT =
==================
- Java 11 / Jakarta rewrite of **`master`**: `jakarta.xml.bind`, `jakarta.xml.ws`, `jakarta.jws` (same class names and packages as the Java 8 line).
- **`maven.compiler.release`** 11; Jakarta **`jakarta.xml.bind-api`** (**4.0.5**) and **`jakarta.xml.ws-api`** (**4.0.3**) compile dependencies (`jakarta.jws` types come from **`jakarta.xml.ws-api`**).
- **`pom.xml`** matches **`master`** except Java 11 / Jakarta compile dependencies (no **`wsimport`**, no unit tests). **`gpg.skip`** defaults to **`true`**; **`maven-javadoc-plugin`** **3.12.0**; **`jaxb.xjc.version`** **4.0.7** documented for external regeneration.
- Removed feature-branch-only paths (not on **`master`**): **`schema/readme.txt`**, **`src/main/resources/schema/`**, **`src/main/resources/binding/`**, **`scripts/`**, **`src/test/`**.
- Contributor and maintainer documentation (**CONTRIBUTING.md**, **MAINTAINERS.md**, **SECURITY.md**, **README.md**).

= 1.1.1 =
=========
- Added WSDL folder and files to resources to ensure they appear in JAR.

= 1.1.0 =
=========
- Converted to Maven build to allow deployment to Maven repository

= 1.0.0 =
=========
- Initial version
