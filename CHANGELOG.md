# Change Log/Revision History

= 1.7.0-SNAPSHOT =
=========
- **Java 11 / Jakarta:** migrate from Java 8 / `javax.xml.ws` to **`jakarta.*`** and **`jaxws-rt` 4.0.4**.
- Regenerated all **12** primary MHR B2B WSDL stubs with **`jaxb-xjc` 4.0.7**; committed sources under **`src/main/java/`**.
- Added **`-Pregenerate-sources`** profile, offline **`GeneratedWsdlBindingsTest`**, build scripts, and contributor docs.
- **Version:** Maven **`au.gov.nehta:pcehr-compiled-wsdl`** **1.7.0-SNAPSHOT** (aligns with **mhr-b2b-client-java** 1.7 line; types aligned with **mhr-wsdl-java** sibling).

= 1.1.2-SNAPSHOT =
=========
- Legacy Java 8 / `javax` line (pre-Jakarta).

= 1.1.1 =
=========
- Added WSDL folder and files to resources to ensure they appear in JAR.

= 1.1.0 =
=========
- Converted to Maven build to allow deployment to Maven repository

= 1.0.0 =
=========
- Initial version
