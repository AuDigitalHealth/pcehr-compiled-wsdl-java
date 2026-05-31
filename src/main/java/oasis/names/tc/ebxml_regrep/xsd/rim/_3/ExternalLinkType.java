
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ExternalLink is the mapping of the same named interface
 *         in ebRIM. It extends RegistryObject.
 * 
 * &lt;p&gt;Java class for ExternalLinkType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ExternalLinkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryObjectType"&gt;
 *       &lt;attribute name="externalURI" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalLinkType")
public class ExternalLinkType
    extends RegistryObjectType
{

    @XmlAttribute(name = "externalURI", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String externalURI;

    /**
     * Gets the value of the externalURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalURI() {
        return externalURI;
    }

    /**
     * Sets the value of the externalURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalURI(String value) {
        this.externalURI = value;
    }

}
