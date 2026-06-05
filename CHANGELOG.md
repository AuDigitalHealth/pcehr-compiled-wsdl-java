# Change Log/Revision History

= 1.6.5-SNAPSHOT =
======
- **`1.6.5`** line: Java **11** / **Jakarta** committed types and classpath WSDL (**12** `Service` stubs, MHR B2B scope).
- Namespace migration from **`javax.xml.bind` / `javax.xml.ws` / `javax.jws`** to **Jakarta** XML APIs.
- POM: **`jakarta.xml.bind-api` 4.0.5**, **`jakarta.xml.ws-api` 4.0.3**; **`maven-enforcer-plugin`** bans Metro **`webservices-*`** and legacy **`javax`** XML APIs (consumers use EE4J **`jaxws-rt` 4.0.4**). Build plugins aligned with **hi-wsdl-java** **`1.6.5`**.
- Offline unit tests: **`JakartaStackTest`**, **`PcehrCompiledWsdlArtifactTest`**, **`GeneratedWsdlBindingsTest`**.
- Documentation: README, CONTRIBUTING, MAINTAINERS, SECURITY updated for **`java-11-jakarta`**.

= 1.6.3 =
======
- Java **8** / **`javax`** line on branch **`java-8-javax`**.

= 1.1.1 =
=========
- Added WSDL folder and files to resources to ensure they appear in JAR.

= 1.1.0 =
=========
- Converted to Maven build to allow deployment to Maven repository

= 1.0.0 =
=========
- Initial version
