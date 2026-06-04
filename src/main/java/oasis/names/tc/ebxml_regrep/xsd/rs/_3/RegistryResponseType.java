
package oasis.names.tc.ebxml_regrep.xsd.rs._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotList;


/**
 * &lt;p&gt;Java class for RegistryResponseType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="RegistryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseSlotList" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}SlotListType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryErrorList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="requestId" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryResponseType", propOrder = {
    "responseSlotList",
    "registryErrorList"
})
@XmlSeeAlso({
    au.net.electronichealth.ns.pcehr.xsd.interfaces.getchangehistoryview._1.GetChangeHistoryViewResponse.AdhocQueryResponse.class
})
public class RegistryResponseType {

    @XmlElement(name = "ResponseSlotList")
    protected SlotList responseSlotList;
    @XmlElement(name = "RegistryErrorList")
    protected RegistryErrorList registryErrorList;
    @XmlAttribute(name = "status", required = true)
    protected String status;
    @XmlAttribute(name = "requestId")
    @XmlSchemaType(name = "anyURI")
    protected String requestId;

    /**
     * Gets the value of the responseSlotList property.
     * 
     * @return
     *     possible object is
     *     {@link SlotList }
     *     
     */
    public SlotList getResponseSlotList() {
        return responseSlotList;
    }

    /**
     * Sets the value of the responseSlotList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotList }
     *     
     */
    public void setResponseSlotList(SlotList value) {
        this.responseSlotList = value;
    }

    /**
     * Gets the value of the registryErrorList property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryErrorList }
     *     
     */
    public RegistryErrorList getRegistryErrorList() {
        return registryErrorList;
    }

    /**
     * Sets the value of the registryErrorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryErrorList }
     *     
     */
    public void setRegistryErrorList(RegistryErrorList value) {
        this.registryErrorList = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

}
