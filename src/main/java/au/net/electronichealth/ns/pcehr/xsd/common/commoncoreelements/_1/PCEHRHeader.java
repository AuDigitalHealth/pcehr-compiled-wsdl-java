
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

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
 *         &lt;element name="User"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IDType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="HPII"/&gt;
 *                         &lt;enumeration value="PortalUserIdentifier"/&gt;
 *                         &lt;enumeration value="LocalSystemIdentifier"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="useRoleForAudit" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber" minOccurs="0"/&gt;
 *         &lt;element name="productType"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="productVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="clientSystemType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="CIS"/&gt;
 *               &lt;enumeration value="CSP"/&gt;
 *               &lt;enumeration value="CRP"/&gt;
 *               &lt;enumeration value="HI"/&gt;
 *               &lt;enumeration value="Medicare"/&gt;
 *               &lt;enumeration value="CPP"/&gt;
 *               &lt;enumeration value="CCP"/&gt;
 *               &lt;enumeration value="Other"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accessingOrganisation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="organisationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="organisationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="alternateOrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
    "user",
    "ihiNumber",
    "productType",
    "clientSystemType",
    "accessingOrganisation"
})
@XmlRootElement(name = "PCEHRHeader")
public class PCEHRHeader {

    @XmlElement(name = "User", required = true)
    protected PCEHRHeader.User user;
    protected String ihiNumber;
    @XmlElement(required = true)
    protected PCEHRHeader.ProductType productType;
    @XmlElement(required = true)
    protected String clientSystemType;
    protected PCEHRHeader.AccessingOrganisation accessingOrganisation;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link PCEHRHeader.User }
     *     
     */
    public PCEHRHeader.User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCEHRHeader.User }
     *     
     */
    public void setUser(PCEHRHeader.User value) {
        this.user = value;
    }

    /**
     * Gets the value of the ihiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIhiNumber() {
        return ihiNumber;
    }

    /**
     * Sets the value of the ihiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIhiNumber(String value) {
        this.ihiNumber = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link PCEHRHeader.ProductType }
     *     
     */
    public PCEHRHeader.ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCEHRHeader.ProductType }
     *     
     */
    public void setProductType(PCEHRHeader.ProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the clientSystemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSystemType() {
        return clientSystemType;
    }

    /**
     * Sets the value of the clientSystemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSystemType(String value) {
        this.clientSystemType = value;
    }

    /**
     * Gets the value of the accessingOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link PCEHRHeader.AccessingOrganisation }
     *     
     */
    public PCEHRHeader.AccessingOrganisation getAccessingOrganisation() {
        return accessingOrganisation;
    }

    /**
     * Sets the value of the accessingOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCEHRHeader.AccessingOrganisation }
     *     
     */
    public void setAccessingOrganisation(PCEHRHeader.AccessingOrganisation value) {
        this.accessingOrganisation = value;
    }


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
     *         &lt;element name="organisationID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="organisationName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="alternateOrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "organisationID",
        "organisationName",
        "alternateOrganisationName"
    })
    public static class AccessingOrganisation {

        @XmlElement(required = true)
        protected String organisationID;
        @XmlElement(required = true)
        protected String organisationName;
        protected String alternateOrganisationName;

        /**
         * Gets the value of the organisationID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganisationID() {
            return organisationID;
        }

        /**
         * Sets the value of the organisationID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganisationID(String value) {
            this.organisationID = value;
        }

        /**
         * Gets the value of the organisationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganisationName() {
            return organisationName;
        }

        /**
         * Sets the value of the organisationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganisationName(String value) {
            this.organisationName = value;
        }

        /**
         * Gets the value of the alternateOrganisationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternateOrganisationName() {
            return alternateOrganisationName;
        }

        /**
         * Sets the value of the alternateOrganisationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternateOrganisationName(String value) {
            this.alternateOrganisationName = value;
        }

    }


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
     *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="productVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "vendor",
        "productName",
        "productVersion",
        "platform"
    })
    public static class ProductType {

        @XmlElement(required = true)
        protected String vendor;
        @XmlElement(required = true)
        protected String productName;
        @XmlElement(required = true)
        protected String productVersion;
        @XmlElement(required = true)
        protected String platform;

        /**
         * Gets the value of the vendor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendor() {
            return vendor;
        }

        /**
         * Sets the value of the vendor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendor(String value) {
            this.vendor = value;
        }

        /**
         * Gets the value of the productName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductName() {
            return productName;
        }

        /**
         * Sets the value of the productName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductName(String value) {
            this.productName = value;
        }

        /**
         * Gets the value of the productVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductVersion() {
            return productVersion;
        }

        /**
         * Sets the value of the productVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductVersion(String value) {
            this.productVersion = value;
        }

        /**
         * Gets the value of the platform property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlatform() {
            return platform;
        }

        /**
         * Sets the value of the platform property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlatform(String value) {
            this.platform = value;
        }

    }


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
     *         &lt;element name="IDType"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="HPII"/&gt;
     *               &lt;enumeration value="PortalUserIdentifier"/&gt;
     *               &lt;enumeration value="LocalSystemIdentifier"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="useRoleForAudit" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "idType",
        "id",
        "role",
        "userName",
        "useRoleForAudit"
    })
    public static class User {

        @XmlElement(name = "IDType", required = true)
        protected String idType;
        @XmlElement(name = "ID", required = true)
        protected String id;
        protected String role;
        @XmlElement(required = true)
        protected String userName;
        protected boolean useRoleForAudit;

        /**
         * Gets the value of the idType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDType() {
            return idType;
        }

        /**
         * Sets the value of the idType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDType(String value) {
            this.idType = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the role property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRole() {
            return role;
        }

        /**
         * Sets the value of the role property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRole(String value) {
            this.role = value;
        }

        /**
         * Gets the value of the userName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserName() {
            return userName;
        }

        /**
         * Sets the value of the userName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserName(String value) {
            this.userName = value;
        }

        /**
         * Gets the value of the useRoleForAudit property.
         * 
         */
        public boolean isUseRoleForAudit() {
            return useRoleForAudit;
        }

        /**
         * Sets the value of the useRoleForAudit property.
         * 
         */
        public void setUseRoleForAudit(boolean value) {
            this.useRoleForAudit = value;
        }

    }

}
