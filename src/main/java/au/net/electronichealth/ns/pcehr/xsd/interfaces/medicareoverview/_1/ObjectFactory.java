
package au.net.electronichealth.ns.pcehr.xsd.interfaces.medicareoverview._1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.pcehr.xsd.interfaces.medicareoverview._1 package. 
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

    private static final QName _MedicareOverview_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/interfaces/MedicareOverview/1.0", "medicareOverview");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.pcehr.xsd.interfaces.medicareoverview._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MedicareOverview }
     * 
     * @return
     *     the new instance of {@link MedicareOverview }
     */
    public MedicareOverview createMedicareOverview() {
        return new MedicareOverview();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedicareOverview }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MedicareOverview }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/interfaces/MedicareOverview/1.0", name = "medicareOverview")
    public JAXBElement<MedicareOverview> createMedicareOverview(MedicareOverview value) {
        return new JAXBElement<>(_MedicareOverview_QNAME, MedicareOverview.class, null, value);
    }

}
