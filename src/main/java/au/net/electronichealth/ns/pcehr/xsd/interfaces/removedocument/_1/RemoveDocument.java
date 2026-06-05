
package au.net.electronichealth.ns.pcehr.xsd.interfaces.removedocument._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
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
 *         &lt;element name="documentID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reasonForRemoval"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Withdrawn"/&gt;
 *               &lt;enumeration value="ElectToRemove"/&gt;
 *               &lt;enumeration value="IncorrectIdentity"/&gt;
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
@XmlType(name = "", propOrder = {
    "documentID",
    "reasonForRemoval"
})
@XmlRootElement(name = "removeDocument")
public class RemoveDocument {

    @XmlElement(required = true)
    protected String documentID;
    @XmlElement(required = true)
    protected RemoveDocument.DocumentRemovalReason reasonForRemoval;

    /**
     * Gets the value of the documentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentID(String value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the reasonForRemoval property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveDocument.DocumentRemovalReason }
     *     
     */
    public RemoveDocument.DocumentRemovalReason getReasonForRemoval() {
        return reasonForRemoval;
    }

    /**
     * Sets the value of the reasonForRemoval property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveDocument.DocumentRemovalReason }
     *     
     */
    public void setReasonForRemoval(RemoveDocument.DocumentRemovalReason value) {
        this.reasonForRemoval = value;
    }


    /**
     * &lt;p&gt;Java class for null&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * &lt;pre&gt;{&#064;code
     * &lt;simpleType&gt;
     *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *     &lt;enumeration value="Withdrawn"/&gt;
     *     &lt;enumeration value="ElectToRemove"/&gt;
     *     &lt;enumeration value="IncorrectIdentity"/&gt;
     *   &lt;/restriction&gt;
     * &lt;/simpleType&gt;
     * }&lt;/pre&gt;
     * 
     */
    @XmlType(name = "")
    @XmlEnum
    public enum DocumentRemovalReason {

        @XmlEnumValue("Withdrawn")
        WITHDRAWN("Withdrawn"),
        @XmlEnumValue("ElectToRemove")
        ELECT_TO_REMOVE("ElectToRemove"),
        @XmlEnumValue("IncorrectIdentity")
        INCORRECT_IDENTITY("IncorrectIdentity");
        private final String value;

        DocumentRemovalReason(String v) {
            value = v;
        }

        public String value() {
            return value;
        }

        public static RemoveDocument.DocumentRemovalReason fromValue(String v) {
            for (RemoveDocument.DocumentRemovalReason c: RemoveDocument.DocumentRemovalReason.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(v);
        }

    }

}
