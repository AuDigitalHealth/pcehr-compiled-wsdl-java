
package au.net.electronichealth.ns.pcehr.xsd.interfaces.pcehrprofile._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PCEHRExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="accessCodeRequired" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="WithCode"/&gt;
 *               &lt;enumeration value="WithoutCode"/&gt;
 *               &lt;enumeration value="AccessGranted"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pcehrExists",
    "accessCodeRequired"
})
@XmlRootElement(name = "doesPCEHRExistResponse")
public class DoesPCEHRExistResponse {

    @XmlElement(name = "PCEHRExists")
    protected boolean pcehrExists;
    protected String accessCodeRequired;

    /**
     * Gets the value of the pcehrExists property.
     * 
     */
    public boolean isPCEHRExists() {
        return pcehrExists;
    }

    /**
     * Sets the value of the pcehrExists property.
     * 
     */
    public void setPCEHRExists(boolean value) {
        this.pcehrExists = value;
    }

    /**
     * Gets the value of the accessCodeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessCodeRequired() {
        return accessCodeRequired;
    }

    /**
     * Sets the value of the accessCodeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessCodeRequired(String value) {
        this.accessCodeRequired = value;
    }

}
