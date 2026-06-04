
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for nameTypeSupp complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="nameTypeSupp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameTitle" minOccurs="0"/&gt;
 *         &lt;element name="familyName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="givenName" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameSuffix" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameSuffix" minOccurs="0"/&gt;
 *         &lt;element name="usage" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}usage" minOccurs="0"/&gt;
 *         &lt;element name="preferred" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}preferred" minOccurs="0"/&gt;
 *         &lt;element name="conditionalUse" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}conditionalUse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nameTypeSupp", propOrder = {
    "nameTitle",
    "familyName",
    "givenNames",
    "nameSuffix",
    "usage",
    "preferred",
    "conditionalUse"
})
public class NameTypeSupp {

    protected String nameTitle;
    @XmlElement(required = true)
    protected String familyName;
    @XmlElement(name = "givenName")
    protected List<String> givenNames;
    protected NameSuffix nameSuffix;
    protected Usage usage;
    protected Preferred preferred;
    protected String conditionalUse;

    /**
     * Gets the value of the nameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTitle() {
        return nameTitle;
    }

    /**
     * Sets the value of the nameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTitle(String value) {
        this.nameTitle = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the givenNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGivenNames() {
        if (givenNames == null) {
            givenNames = new ArrayList<String>();
        }
        return this.givenNames;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link NameSuffix }
     *     
     */
    public NameSuffix getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSuffix }
     *     
     */
    public void setNameSuffix(NameSuffix value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link Usage }
     *     
     */
    public Usage getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usage }
     *     
     */
    public void setUsage(Usage value) {
        this.usage = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link Preferred }
     *     
     */
    public Preferred getPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preferred }
     *     
     */
    public void setPreferred(Preferred value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the conditionalUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalUse() {
        return conditionalUse;
    }

    /**
     * Sets the value of the conditionalUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalUse(String value) {
        this.conditionalUse = value;
    }

}
