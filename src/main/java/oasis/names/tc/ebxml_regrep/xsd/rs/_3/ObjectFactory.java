
package oasis.names.tc.ebxml_regrep.xsd.rs._3;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.tc.ebxml_regrep.xsd.rs._3 package. 
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

    private static final QName _RegistryRequest_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryRequest");
    private static final QName _RegistryResponse_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", "RegistryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.tc.ebxml_regrep.xsd.rs._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistryRequestType }
     * 
     * @return
     *     the new instance of {@link RegistryRequestType }
     */
    public RegistryRequestType createRegistryRequestType() {
        return new RegistryRequestType();
    }

    /**
     * Create an instance of {@link RegistryResponseType }
     * 
     * @return
     *     the new instance of {@link RegistryResponseType }
     */
    public RegistryResponseType createRegistryResponseType() {
        return new RegistryResponseType();
    }

    /**
     * Create an instance of {@link RegistryErrorList }
     * 
     * @return
     *     the new instance of {@link RegistryErrorList }
     */
    public RegistryErrorList createRegistryErrorList() {
        return new RegistryErrorList();
    }

    /**
     * Create an instance of {@link RegistryError }
     * 
     * @return
     *     the new instance of {@link RegistryError }
     */
    public RegistryError createRegistryError() {
        return new RegistryError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistryRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", name = "RegistryRequest")
    public JAXBElement<RegistryRequestType> createRegistryRequest(RegistryRequestType value) {
        return new JAXBElement<>(_RegistryRequest_QNAME, RegistryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistryResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0", name = "RegistryResponse")
    public JAXBElement<RegistryResponseType> createRegistryResponse(RegistryResponseType value) {
        return new JAXBElement<>(_RegistryResponse_QNAME, RegistryResponseType.class, null, value);
    }

}
