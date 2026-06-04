
package au.net.electronichealth.ns.tplt.xsd.common.templatescoreelements._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for templateUsageMetadataType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="templateUsageMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PCEHRAcceptedStartDate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PCEHRAcceptedEndDate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="containsPCEHRAtomicData" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
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
@XmlType(name = "templateUsageMetadataType", propOrder = {
    "pcehrAcceptedStartDate",
    "pcehrAcceptedEndDate",
    "containsPCEHRAtomicData"
})
public class TemplateUsageMetadataType {

    @XmlElement(name = "PCEHRAcceptedStartDate", required = true)
    protected XMLGregorianCalendar pcehrAcceptedStartDate;
    @XmlElement(name = "PCEHRAcceptedEndDate")
    protected XMLGregorianCalendar pcehrAcceptedEndDate;
    protected Boolean containsPCEHRAtomicData;

    /**
     * Gets the value of the pcehrAcceptedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPCEHRAcceptedStartDate() {
        return pcehrAcceptedStartDate;
    }

    /**
     * Sets the value of the pcehrAcceptedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPCEHRAcceptedStartDate(XMLGregorianCalendar value) {
        this.pcehrAcceptedStartDate = value;
    }

    /**
     * Gets the value of the pcehrAcceptedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPCEHRAcceptedEndDate() {
        return pcehrAcceptedEndDate;
    }

    /**
     * Sets the value of the pcehrAcceptedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPCEHRAcceptedEndDate(XMLGregorianCalendar value) {
        this.pcehrAcceptedEndDate = value;
    }

    /**
     * Gets the value of the containsPCEHRAtomicData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainsPCEHRAtomicData() {
        return containsPCEHRAtomicData;
    }

    /**
     * Sets the value of the containsPCEHRAtomicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsPCEHRAtomicData(Boolean value) {
        this.containsPCEHRAtomicData = value;
    }

}
