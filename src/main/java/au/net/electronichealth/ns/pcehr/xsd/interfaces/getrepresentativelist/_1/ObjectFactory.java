
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getrepresentativelist._1;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.pcehr.xsd.interfaces.getrepresentativelist._1 package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _GetRepresentativeList_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/interfaces/GetRepresentativeList/1.1", "getRepresentativeList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.pcehr.xsd.interfaces.getrepresentativelist._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRepresentativeListResponse }
     * 
     */
    public GetRepresentativeListResponse createGetRepresentativeListResponse() {
        return new GetRepresentativeListResponse();
    }

    /**
     * Create an instance of {@link GetRepresentativeListResponse.PCEHRRecord }
     * 
     */
    public GetRepresentativeListResponse.PCEHRRecord createGetRepresentativeListResponsePCEHRRecord() {
        return new GetRepresentativeListResponse.PCEHRRecord();
    }

    /**
     * Create an instance of {@link GetRepresentativeListResponse.PCEHRRecord.RepresentativeList }
     * 
     */
    public GetRepresentativeListResponse.PCEHRRecord.RepresentativeList createGetRepresentativeListResponsePCEHRRecordRepresentativeList() {
        return new GetRepresentativeListResponse.PCEHRRecord.RepresentativeList();
    }

    /**
     * Create an instance of {@link GetRepresentativeListResponse.PCEHRRecord.RepresentativeList.Representative }
     * 
     */
    public GetRepresentativeListResponse.PCEHRRecord.RepresentativeList.Representative createGetRepresentativeListResponsePCEHRRecordRepresentativeListRepresentative() {
        return new GetRepresentativeListResponse.PCEHRRecord.RepresentativeList.Representative();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/interfaces/GetRepresentativeList/1.1", name = "getRepresentativeList")
    public JAXBElement<Object> createGetRepresentativeList(Object value) {
        return new JAXBElement<Object>(_GetRepresentativeList_QNAME, Object.class, null, value);
    }

}
