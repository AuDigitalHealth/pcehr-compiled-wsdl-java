#!/usr/bin/env python3
"""Emit jaxws-maven-plugin wsimport executions for pom.xml (12 primary B2B WSDLs)."""

EXECUTIONS = [
    ("wsimport-b2b-document-registry", "B2B_DocumentRegistry.wsdl", "B2B_DocumentRegistry.wsdl.jxb"),
    ("wsimport-b2b-document-repository", "B2B_DocumentRepository.wsdl", "B2B_DocumentRepository.wsdl.jxb"),
    ("wsimport-b2b-get-audit-view", "B2B_GetAuditView.wsdl", "B2B_GetAuditView.wsdl.jxb"),
    ("wsimport-b2b-get-change-history-view", "B2B_GetChangeHistoryView.wsdl", "B2B_GetChangeHistoryView.wsdl.jxb"),
    ("wsimport-b2b-get-individual-details-view", "B2B_GetIndividualDetailsView.wsdl", "B2B_GetIndividualDetailsView.wsdl.jxb"),
    ("wsimport-b2b-get-representative-list", "B2B_GetRepresentativeList.wsdl", "B2B_GetRepresentativeList.wsdl.jxb"),
    ("wsimport-b2b-get-template", "B2B_GetTemplate.wsdl", "B2B_GetTemplate.wsdl.jxb"),
    ("wsimport-b2b-get-view", "B2B_GetView.wsdl", "B2B_GetView.wsdl.jxb"),
    ("wsimport-b2b-pcehr-profile", "B2B_PCEHRProfile.wsdl", "B2B_PCEHRProfile.wsdl.jxb"),
    ("wsimport-b2b-register-pcehr", "B2B_RegisterPCEHR.wsdl", "B2B_RegisterPCEHR.wsdl.jxb"),
    ("wsimport-b2b-remove-document", "B2B_RemoveDocument.wsdl", "B2B_RemoveDocument.wsdl.jxb"),
    ("wsimport-b2b-search-template", "B2B_SearchTemplate.wsdl", "B2B_SearchTemplate.wsdl.jxb"),
]

MERGE_NAMES = [e[0] for e in EXECUTIONS]

if __name__ == "__main__":
    import sys
    mode = sys.argv[1] if len(sys.argv) > 1 else "executions"
    if mode == "merge-names":
        for n in MERGE_NAMES:
            print(f"                                        '{n}',")
    else:
        for eid, wsdl, jxb in EXECUTIONS:
            loc = f"wsdl/{wsdl}"
            print(f"""                    <execution>
                        <id>{eid}</id>
                        <goals><goal>wsimport</goal></goals>
                        <configuration>
                            <destDir>${{project.build.directory}}/jaxws/dest/{eid}</destDir>
                            <staleFile>${{project.build.directory}}/jaxws/stale-{eid}</staleFile>
                            <sourceDestDir>${{project.build.directory}}/generated-sources/wsimport-parts/{eid}</sourceDestDir>
                            <wsdlDirectory>${{pcehr.wsdl.dir}}</wsdlDirectory>
                            <wsdlFiles><wsdlFile>{wsdl}</wsdlFile></wsdlFiles>
                            <wsdlLocation>{loc}</wsdlLocation>
                            <args>
                                <arg>-b</arg><arg>${{pcehr.binding.dir}}/GlobalBindings.jxb</arg>
                                <arg>-b</arg><arg>${{pcehr.binding.dir}}/PCEHR_CommonTypes.xsd.jxb</arg>
                                <arg>-b</arg><arg>${{pcehr.binding.dir}}/{jxb}</arg>
                            </args>
                        </configuration>
                    </execution>""")
