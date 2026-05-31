
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SlotType1 complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SlotType1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ValueList"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}LongName" /&gt;
 *       &lt;attribute name="slotType" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlotType1", propOrder = {
    "valueList"
})
public class SlotType1 {

    @XmlElement(name = "ValueList", required = true)
    protected ValueListType valueList;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "slotType")
    protected String slotType;

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link ValueListType }
     *     
     */
    public ValueListType getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueListType }
     *     
     */
    public void setValueList(ValueListType value) {
        this.valueList = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the slotType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotType() {
        return slotType;
    }

    /**
     * Sets the value of the slotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotType(String value) {
        this.slotType = value;
    }

}
