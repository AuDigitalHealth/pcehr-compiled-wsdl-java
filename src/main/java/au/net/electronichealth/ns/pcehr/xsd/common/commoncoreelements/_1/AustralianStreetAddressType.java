
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for australianStreetAddressType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="australianStreetAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="state" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}stateType"/&gt;
 *         &lt;element name="postcode" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}postcodeType"/&gt;
 *         &lt;element name="suburb" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}suburbType"/&gt;
 *         &lt;element name="addressSiteName" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}addressSiteNameType" minOccurs="0"/&gt;
 *         &lt;element name="unitGroup" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}unitGroupType" minOccurs="0"/&gt;
 *         &lt;element name="levelGroup" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}levelGroupType" minOccurs="0"/&gt;
 *         &lt;element name="lotNumber" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}lotNumberType" minOccurs="0"/&gt;
 *         &lt;element name="streetNumber" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}streetNumberType" minOccurs="0"/&gt;
 *         &lt;element name="streetName" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}streetNameType"/&gt;
 *         &lt;element name="streetType" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}streetType" minOccurs="0"/&gt;
 *         &lt;element name="streetSuffix" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}streetSuffixType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "australianStreetAddressType", propOrder = {
    "state",
    "postcode",
    "suburb",
    "addressSiteName",
    "unitGroup",
    "levelGroup",
    "lotNumber",
    "streetNumber",
    "streetName",
    "streetType",
    "streetSuffix"
})
public class AustralianStreetAddressType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StateType state;
    @XmlElement(required = true)
    protected String postcode;
    @XmlElement(required = true)
    protected String suburb;
    protected String addressSiteName;
    protected UnitGroupType unitGroup;
    protected LevelGroupType levelGroup;
    protected String lotNumber;
    protected String streetNumber;
    @XmlElement(required = true)
    protected String streetName;
    @XmlSchemaType(name = "string")
    protected StreetType streetType;
    @XmlSchemaType(name = "string")
    protected StreetSuffixType streetSuffix;

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the suburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * Sets the value of the suburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuburb(String value) {
        this.suburb = value;
    }

    /**
     * Gets the value of the addressSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressSiteName() {
        return addressSiteName;
    }

    /**
     * Sets the value of the addressSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressSiteName(String value) {
        this.addressSiteName = value;
    }

    /**
     * Gets the value of the unitGroup property.
     * 
     * @return
     *     possible object is
     *     {@link UnitGroupType }
     *     
     */
    public UnitGroupType getUnitGroup() {
        return unitGroup;
    }

    /**
     * Sets the value of the unitGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitGroupType }
     *     
     */
    public void setUnitGroup(UnitGroupType value) {
        this.unitGroup = value;
    }

    /**
     * Gets the value of the levelGroup property.
     * 
     * @return
     *     possible object is
     *     {@link LevelGroupType }
     *     
     */
    public LevelGroupType getLevelGroup() {
        return levelGroup;
    }

    /**
     * Sets the value of the levelGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelGroupType }
     *     
     */
    public void setLevelGroup(LevelGroupType value) {
        this.levelGroup = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNumber(String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the streetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the value of the streetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     * @return
     *     possible object is
     *     {@link StreetType }
     *     
     */
    public StreetType getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetType }
     *     
     */
    public void setStreetType(StreetType value) {
        this.streetType = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link StreetSuffixType }
     *     
     */
    public StreetSuffixType getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetSuffixType }
     *     
     */
    public void setStreetSuffix(StreetSuffixType value) {
        this.streetSuffix = value;
    }

}
