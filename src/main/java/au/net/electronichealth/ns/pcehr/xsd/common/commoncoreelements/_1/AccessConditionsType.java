
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for accessConditionsType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="accessConditionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessLevel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Self"/&gt;
 *               &lt;enumeration value="General"/&gt;
 *               &lt;enumeration value="Limited"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accessPermission" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Permit"/&gt;
 *               &lt;enumeration value="Deny"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accessConditions" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="OpenAccess"/&gt;
 *               &lt;enumeration value="AccessRevoked"/&gt;
 *               &lt;enumeration value="PACAccess"/&gt;
 *               &lt;enumeration value="PACXAccess"/&gt;
 *               &lt;enumeration value="EmergencyAccess"/&gt;
 *               &lt;enumeration value="LocalConsentAccess"/&gt;
 *               &lt;enumeration value="AuthorisedRepresentativeAccess"/&gt;
 *               &lt;enumeration value="NominatedRepresentativeAccess"/&gt;
 *               &lt;enumeration value="IncorrectCode"/&gt;
 *               &lt;enumeration value="LocalConsentAccessDenied"/&gt;
 *               &lt;enumeration value="AccessRevoked"/&gt;
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
@XmlType(name = "accessConditionsType", propOrder = {
    "accessLevel",
    "accessPermission",
    "accessConditions"
})
public class AccessConditionsType {

    protected String accessLevel;
    protected String accessPermission;
    protected String accessConditions;

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevel(String value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the accessPermission property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessPermission() {
        return accessPermission;
    }

    /**
     * Sets the value of the accessPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessPermission(String value) {
        this.accessPermission = value;
    }

    /**
     * Gets the value of the accessConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessConditions() {
        return accessConditions;
    }

    /**
     * Sets the value of the accessConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessConditions(String value) {
        this.accessConditions = value;
    }

}
