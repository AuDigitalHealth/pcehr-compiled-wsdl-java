
package ihe.iti.xds_b._2007;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import oasis.names.tc.ebxml_regrep.xsd.lcm._3.SubmitObjectsRequest;


/**
 * &lt;p&gt;Java class for ProvideAndRegisterDocumentSetRequestType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ProvideAndRegisterDocumentSetRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0}SubmitObjectsRequest"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Document" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
 *                   &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProvideAndRegisterDocumentSetRequestType", propOrder = {
    "submitObjectsRequest",
    "document"
})
public class ProvideAndRegisterDocumentSetRequestType {

    /**
     * The SubmitObjectsRequest allows one to submit a list of
     *         RegistryObject elements. Each RegistryEntry element provides metadata for a single submitted
     *         object. Note that the repository item being submitted is in a separate document that is not
     *         in this DTD. The ebXML Messaging Services Specfication defines packaging, for submission, of
     *         the metadata of a repository item with the repository item itself. The value of the id
     *         attribute of the ExtrinsicObject element must be the same as the xlink:href attribute within
     *         the Reference element within the Manifest element of the MessageHeader.
     * 
     */
    @XmlElement(name = "SubmitObjectsRequest", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:lcm:3.0", required = true)
    protected SubmitObjectsRequest submitObjectsRequest;
    @XmlElement(name = "Document")
    protected List<ProvideAndRegisterDocumentSetRequestType.Document> document;

    /**
     * The SubmitObjectsRequest allows one to submit a list of
     *         RegistryObject elements. Each RegistryEntry element provides metadata for a single submitted
     *         object. Note that the repository item being submitted is in a separate document that is not
     *         in this DTD. The ebXML Messaging Services Specfication defines packaging, for submission, of
     *         the metadata of a repository item with the repository item itself. The value of the id
     *         attribute of the ExtrinsicObject element must be the same as the xlink:href attribute within
     *         the Reference element within the Manifest element of the MessageHeader.
     * 
     * @return
     *     possible object is
     *     {@link SubmitObjectsRequest }
     *     
     */
    public SubmitObjectsRequest getSubmitObjectsRequest() {
        return submitObjectsRequest;
    }

    /**
     * Sets the value of the submitObjectsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitObjectsRequest }
     *     
     * @see #getSubmitObjectsRequest()
     */
    public void setSubmitObjectsRequest(SubmitObjectsRequest value) {
        this.submitObjectsRequest = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the document property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvideAndRegisterDocumentSetRequestType.Document }
     * </p>
     * 
     * 
     * @return
     *     The value of the document property.
     */
    public List<ProvideAndRegisterDocumentSetRequestType.Document> getDocument() {
        if (document == null) {
            document = new ArrayList<>();
        }
        return this.document;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Document {

        @XmlValue
        protected byte[] value;
        /**
         * This corresponds to the ExtrinsicObject id in the eb RIM
         *                       metadata a provides a linkage between the actual document data and its
         *                       metadata
         * 
         */
        @XmlAttribute(name = "id", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String id;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setValue(byte[] value) {
            this.value = value;
        }

        /**
         * This corresponds to the ExtrinsicObject id in the eb RIM
         *                       metadata a provides a linkage between the actual document data and its
         *                       metadata
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
         * @see #getId()
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
