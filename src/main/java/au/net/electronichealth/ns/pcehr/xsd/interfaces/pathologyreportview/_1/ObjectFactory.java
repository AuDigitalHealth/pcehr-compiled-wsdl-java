
package au.net.electronichealth.ns.pcehr.xsd.interfaces.pathologyreportview._1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.pcehr.xsd.interfaces.pathologyreportview._1 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _PathologyReportViewResponse_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/interfaces/PathologyReportView/1.0", "pathologyReportViewResponse");
    private static final QName _PathologyReportView_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/interfaces/PathologyReportView/1.0", "pathologyReportView");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.pcehr.xsd.interfaces.pathologyreportview._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PathologyReportViewResponse }
     * 
     * @return
     *     the new instance of {@link PathologyReportViewResponse }
     */
    public PathologyReportViewResponse createPathologyReportViewResponse() {
        return new PathologyReportViewResponse();
    }

    /**
     * Create an instance of {@link PathologyReportViewResponse.PathologyReport }
     * 
     * @return
     *     the new instance of {@link PathologyReportViewResponse.PathologyReport }
     */
    public PathologyReportViewResponse.PathologyReport createPathologyReportViewResponsePathologyReport() {
        return new PathologyReportViewResponse.PathologyReport();
    }

    /**
     * Create an instance of {@link PathologyReportViewResponse.ViewMetadata }
     * 
     * @return
     *     the new instance of {@link PathologyReportViewResponse.ViewMetadata }
     */
    public PathologyReportViewResponse.ViewMetadata createPathologyReportViewResponseViewMetadata() {
        return new PathologyReportViewResponse.ViewMetadata();
    }

    /**
     * Create an instance of {@link PathologyReportView }
     * 
     * @return
     *     the new instance of {@link PathologyReportView }
     */
    public PathologyReportView createPathologyReportView() {
        return new PathologyReportView();
    }

    /**
     * Create an instance of {@link PathologyReportViewResponse.PathologyReport.PathologyTestResult }
     * 
     * @return
     *     the new instance of {@link PathologyReportViewResponse.PathologyReport.PathologyTestResult }
     */
    public PathologyReportViewResponse.PathologyReport.PathologyTestResult createPathologyReportViewResponsePathologyReportPathologyTestResult() {
        return new PathologyReportViewResponse.PathologyReport.PathologyTestResult();
    }

    /**
     * Create an instance of {@link PathologyReportViewResponse.ViewMetadata.IndividualProfile }
     * 
     * @return
     *     the new instance of {@link PathologyReportViewResponse.ViewMetadata.IndividualProfile }
     */
    public PathologyReportViewResponse.ViewMetadata.IndividualProfile createPathologyReportViewResponseViewMetadataIndividualProfile() {
        return new PathologyReportViewResponse.ViewMetadata.IndividualProfile();
    }

    /**
     * Create an instance of {@link PathologyReportViewResponse.ViewMetadata.ViewParameters }
     * 
     * @return
     *     the new instance of {@link PathologyReportViewResponse.ViewMetadata.ViewParameters }
     */
    public PathologyReportViewResponse.ViewMetadata.ViewParameters createPathologyReportViewResponseViewMetadataViewParameters() {
        return new PathologyReportViewResponse.ViewMetadata.ViewParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathologyReportViewResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PathologyReportViewResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/interfaces/PathologyReportView/1.0", name = "pathologyReportViewResponse")
    public JAXBElement<PathologyReportViewResponse> createPathologyReportViewResponse(PathologyReportViewResponse value) {
        return new JAXBElement<>(_PathologyReportViewResponse_QNAME, PathologyReportViewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathologyReportView }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PathologyReportView }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/interfaces/PathologyReportView/1.0", name = "pathologyReportView")
    public JAXBElement<PathologyReportView> createPathologyReportView(PathologyReportView value) {
        return new JAXBElement<>(_PathologyReportView_QNAME, PathologyReportView.class, null, value);
    }

}
