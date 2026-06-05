# Change Log/Revision History

= 1.6.3-SNAPSHOT =
======
- **`1.6.3`** line: Java **8** / **`javax`** committed types and classpath WSDL (**12** `Service` stubs, MHR B2B scope).
- POM: **`provided`** compile **`jaxb-api`**, **`jaxws-api`**, **`javax.jws-api`**; **`maven-enforcer-plugin`** bans Metro **`webservices-*`** and **`jakarta.*`** (consumers use EE4J **`jaxws-rt` 2.3.7**). Build plugins aligned with **hi-wsdl-java** **`1.6.3`**.
- **`maven-gpg-plugin`:** **`gpg.skip`** defaults to **`true`** for local builds.
- Offline unit tests: **`JavaxStackTest`**, **`PcehrCompiledWsdlArtifactTest`**, **`GeneratedWsdlBindingsTest`** under **`src/test/java/au/gov/nehta/pcehrwsdl/`**.
- Javadoc: fixed invalid **`{@link byte[]}`** references in **`pcehr_override/`**.
- Documentation: README, CONTRIBUTING, MAINTAINERS, SECURITY.

= 1.1.1 =
=========
- Added WSDL folder and files to resources to ensure they appear in JAR.

= 1.1.0 =
=========
- Converted to Maven build to allow deployment to Maven repository

= 1.0.0 =
=========
- Initial version
