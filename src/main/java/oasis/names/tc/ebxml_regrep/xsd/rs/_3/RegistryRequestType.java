
package oasis.names.tc.ebxml_regrep.xsd.rs._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.lcm._3.AcceptObjectsRequest;
import oasis.names.tc.ebxml_regrep.xsd.lcm._3.ApproveObjectsRequest;
import oasis.names.tc.ebxml_regrep.xsd.lcm._3.DeprecateObjectsRequest;
import oasis.names.tc.ebxml_regrep.xsd.lcm._3.RelocateObjectsRequest;
import oasis.names.tc.ebxml_regrep.xsd.lcm._3.RemoveObjectsRequest;
import oasis.names.tc.ebxml_regrep.xsd.lcm._3.SubmitObjectsRequest;
import oasis.names.tc.ebxml_regrep.xsd.lcm._3.UndeprecateObjectsRequest;
import oasis.names.tc.ebxml_regrep.xsd.lcm._3.UpdateObjectsRequest;
import oasis.names.tc.ebxml_regrep.xsd.query._3.AdhocQueryRequest;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.SlotListType;


/**
 * Base type for all ebXML Registry requests
 * 
 * &lt;p&gt;Java class for RegistryRequestType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="RegistryRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestSlotList" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}SlotListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryRequestType", propOrder = {
    "requestSlotList"
})
@XmlSeeAlso({
    AcceptObjectsRequest.class,
    RelocateObjectsRequest.class,
    RemoveObjectsRequest.class,
    UndeprecateObjectsRequest.class,
    DeprecateObjectsRequest.class,
    ApproveObjectsRequest.class,
    UpdateObjectsRequest.class,
    SubmitObjectsRequest.class,
    AdhocQueryRequest.class
})
public class RegistryRequestType {

    @XmlElement(name = "RequestSlotList")
    protected SlotListType requestSlotList;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "comment")
    protected String comment;

    /**
     * Gets the value of the requestSlotList property.
     * 
     * @return
     *     possible object is
     *     {@link SlotListType }
     *     
     */
    public SlotListType getRequestSlotList() {
        return requestSlotList;
    }

    /**
     * Sets the value of the requestSlotList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotListType }
     *     
     */
    public void setRequestSlotList(SlotListType value) {
        this.requestSlotList = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
