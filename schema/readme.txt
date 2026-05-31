Licensed XSD staging (not in Git)
=================================

MHR B2B WSDL under src/main/resources/wsdl reference ../schema/... relative to
that directory. Licensed schema content must NOT be committed to a public repository.

Obtain schemas from the My Health Record / PCEHR B2B integration pack under your
licence, or copy the schema tree from a sibling mhr-b2b-client-java checkout:

  wsdls/src/main/resources/schema/

Local staging:

  Copy that schema folder to:

    src/main/resources/schema/

  (so src/main/resources/schema/Common/PCEHR_CommonTypes.xsd exists).

Required only for -Pregenerate-sources (wsimport with jaxb-xjc 4.0.7).
Default mvn verify uses committed generated sources and does not need schema/.

Binding fragments (src/main/resources/binding/) ARE committed — they are
maintainer JAXB customisation, not licensed schema content.
