
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ExternalIdentifier is the mapping of the same named
 *         interface in ebRIM. It extends RegistryObject.
 * 
 * &lt;p&gt;Java class for ExternalIdentifierType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ExternalIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;attribute name="registryObject" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="identificationScheme" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="value" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalIdentifierType")
public class ExternalIdentifierType
    extends RegistryObjectType
{

    @XmlAttribute(name = "registryObject", required = true)
    protected String registryObject;
    @XmlAttribute(name = "identificationScheme", required = true)
    protected String identificationScheme;
    @XmlAttribute(name = "value", required = true)
    protected String value;

    /**
     * Gets the value of the registryObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryObject() {
        return registryObject;
    }

    /**
     * Sets the value of the registryObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryObject(String value) {
        this.registryObject = value;
    }

    /**
     * Gets the value of the identificationScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationScheme() {
        return identificationScheme;
    }

    /**
     * Sets the value of the identificationScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationScheme(String value) {
        this.identificationScheme = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
