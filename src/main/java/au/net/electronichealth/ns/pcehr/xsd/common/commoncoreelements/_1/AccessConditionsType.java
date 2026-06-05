
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
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

    protected AccessConditionsType.AccessLevel accessLevel;
    protected AccessConditionsType.AccessPermission accessPermission;
    protected AccessConditionsType.AccessConditions accessConditions;

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AccessConditionsType.AccessLevel }
     *     
     */
    public AccessConditionsType.AccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessConditionsType.AccessLevel }
     *     
     */
    public void setAccessLevel(AccessConditionsType.AccessLevel value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the accessPermission property.
     * 
     * @return
     *     possible object is
     *     {@link AccessConditionsType.AccessPermission }
     *     
     */
    public AccessConditionsType.AccessPermission getAccessPermission() {
        return accessPermission;
    }

    /**
     * Sets the value of the accessPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessConditionsType.AccessPermission }
     *     
     */
    public void setAccessPermission(AccessConditionsType.AccessPermission value) {
        this.accessPermission = value;
    }

    /**
     * Gets the value of the accessConditions property.
     * 
     * @return
     *     possible object is
     *     {@link AccessConditionsType.AccessConditions }
     *     
     */
    public AccessConditionsType.AccessConditions getAccessConditions() {
        return accessConditions;
    }

    /**
     * Sets the value of the accessConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessConditionsType.AccessConditions }
     *     
     */
    public void setAccessConditions(AccessConditionsType.AccessConditions value) {
        this.accessConditions = value;
    }


    /**
     * &lt;p&gt;Java class for null&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * &lt;pre&gt;{&#064;code
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="OpenAccess"/&gt;
     *     &lt;enumeration value="AccessRevoked"/&gt;
     *     &lt;enumeration value="PACAccess"/&gt;
     *     &lt;enumeration value="PACXAccess"/&gt;
     *     &lt;enumeration value="EmergencyAccess"/&gt;
     *     &lt;enumeration value="LocalConsentAccess"/&gt;
     *     &lt;enumeration value="AuthorisedRepresentativeAccess"/&gt;
     *     &lt;enumeration value="NominatedRepresentativeAccess"/&gt;
     *     &lt;enumeration value="IncorrectCode"/&gt;
     *     &lt;enumeration value="LocalConsentAccessDenied"/&gt;
     *     &lt;enumeration value="AccessRevoked"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * }&lt;/pre&gt;
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum AccessConditions {

        @XmlEnumValue("OpenAccess")
        OPEN_ACCESS("OpenAccess"),
        @XmlEnumValue("AccessRevoked")
        ACCESS_REVOKED("AccessRevoked"),
        @XmlEnumValue("PACAccess")
        PAC_ACCESS("PACAccess"),
        @XmlEnumValue("PACXAccess")
        PACX_ACCESS("PACXAccess"),
        @XmlEnumValue("EmergencyAccess")
        EMERGENCY_ACCESS("EmergencyAccess"),
        @XmlEnumValue("LocalConsentAccess")
        LOCAL_CONSENT_ACCESS("LocalConsentAccess"),
        @XmlEnumValue("AuthorisedRepresentativeAccess")
        AUTHORISED_REPRESENTATIVE_ACCESS("AuthorisedRepresentativeAccess"),
        @XmlEnumValue("NominatedRepresentativeAccess")
        NOMINATED_REPRESENTATIVE_ACCESS("NominatedRepresentativeAccess"),
        @XmlEnumValue("IncorrectCode")
        INCORRECT_CODE("IncorrectCode"),
        @XmlEnumValue("LocalConsentAccessDenied")
        LOCAL_CONSENT_ACCESS_DENIED("LocalConsentAccessDenied");
        private final String value;

        AccessConditions(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static AccessConditionsType.AccessConditions fromValue(String v) {
            for (AccessConditionsType.AccessConditions c: AccessConditionsType.AccessConditions.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * &lt;p&gt;Java class for null&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * &lt;pre&gt;{&#064;code
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="Self"/&gt;
     *     &lt;enumeration value="General"/&gt;
     *     &lt;enumeration value="Limited"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * }&lt;/pre&gt;
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum AccessLevel {

        @XmlEnumValue("Self")
        SELF("Self"),
        @XmlEnumValue("General")
        GENERAL("General"),
        @XmlEnumValue("Limited")
        LIMITED("Limited");
        private final String value;

        AccessLevel(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static AccessConditionsType.AccessLevel fromValue(String v) {
            for (AccessConditionsType.AccessLevel c: AccessConditionsType.AccessLevel.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }


    /**
     * &lt;p&gt;Java class for null&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * &lt;pre&gt;{&#064;code
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="Permit"/&gt;
     *     &lt;enumeration value="Deny"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * }&lt;/pre&gt;
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum AccessPermission {

        @XmlEnumValue("Permit")
        PERMIT("Permit"),
        @XmlEnumValue("Deny")
        DENY("Deny");
        private final String value;

        AccessPermission(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static AccessConditionsType.AccessPermission fromValue(String v) {
            for (AccessConditionsType.AccessPermission c: AccessConditionsType.AccessPermission.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
