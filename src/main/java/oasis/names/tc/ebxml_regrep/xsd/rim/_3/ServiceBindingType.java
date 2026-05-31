
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ServiceBindingType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ServiceBindingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}SpecificationLink" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="service" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="accessURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="targetBinding" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBindingType", propOrder = {
    "specificationLink"
})
public class ServiceBindingType
    extends RegistryObjectType
{

    @XmlElement(name = "SpecificationLink")
    protected List<SpecificationLinkType> specificationLink;
    @XmlAttribute(name = "service", required = true)
    protected String service;
    @XmlAttribute(name = "accessURI")
    @XmlSchemaType(name = "anyURI")
    protected String accessURI;
    @XmlAttribute(name = "targetBinding")
    protected String targetBinding;

    /**
     * Gets the value of the specificationLink property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the specificationLink property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSpecificationLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificationLinkType }
     * </p>
     * 
     * 
     * @return
     *     The value of the specificationLink property.
     */
    public List<SpecificationLinkType> getSpecificationLink() {
        if (specificationLink == null) {
            specificationLink = new ArrayList<>();
        }
        return this.specificationLink;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the accessURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessURI() {
        return accessURI;
    }

    /**
     * Sets the value of the accessURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessURI(String value) {
        this.accessURI = value;
    }

    /**
     * Gets the value of the targetBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetBinding() {
        return targetBinding;
    }

    /**
     * Sets the value of the targetBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetBinding(String value) {
        this.targetBinding = value;
    }

}
