
package au.net.electronichealth.ns.wsp.xsd.standarderror._2010;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.wsp.xsd.standarderror._2010 package. 
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

    private static final QName _StandardError_QNAME = new QName("http://ns.electronichealth.net.au/wsp/xsd/StandardError/2010", "standardError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.wsp.xsd.standarderror._2010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StandardErrorType }
     * 
     * @return
     *     the new instance of {@link StandardErrorType }
     */
    public StandardErrorType createStandardErrorType() {
        return new StandardErrorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardErrorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StandardErrorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/wsp/xsd/StandardError/2010", name = "standardError")
    public JAXBElement<StandardErrorType> createStandardError(StandardErrorType value) {
        return new JAXBElement<>(_StandardError_QNAME, StandardErrorType.class, null, value);
    }

}
