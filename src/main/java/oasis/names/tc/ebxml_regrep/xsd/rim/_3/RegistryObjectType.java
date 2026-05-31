
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RegistryObjectType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="RegistryObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}IdentifiableType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Description" minOccurs="0"/&gt;
 *         &lt;element name="VersionInfo" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}VersionInfoType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Classification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ExternalIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lid" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="objectType" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *       &lt;attribute name="status" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}referenceURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryObjectType", propOrder = {
    "name",
    "description",
    "versionInfo",
    "classification",
    "externalIdentifier"
})
@XmlSeeAlso({
    AdhocQueryType.class,
    AssociationType1 .class,
    AuditableEventType.class,
    ClassificationType.class,
    ClassificationNodeType.class,
    ClassificationSchemeType.class,
    ExternalIdentifierType.class,
    ExternalLinkType.class,
    ExtrinsicObjectType.class,
    OrganizationType.class,
    RegistryPackageType.class,
    ServiceType.class,
    ServiceBindingType.class,
    SpecificationLinkType.class,
    PersonType.class,
    RegistryType.class,
    FederationType.class,
    NotificationType.class,
    SubscriptionType.class
})
public class RegistryObjectType
    extends IdentifiableType
{

    @XmlElement(name = "Name")
    protected InternationalStringType name;
    @XmlElement(name = "Description")
    protected InternationalStringType description;
    @XmlElement(name = "VersionInfo")
    protected VersionInfoType versionInfo;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classification;
    @XmlElement(name = "ExternalIdentifier")
    protected List<ExternalIdentifierType> externalIdentifier;
    @XmlAttribute(name = "lid")
    @XmlSchemaType(name = "anyURI")
    protected String lid;
    @XmlAttribute(name = "objectType")
    protected String objectType;
    @XmlAttribute(name = "status")
    protected String status;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalStringType }
     *     
     */
    public InternationalStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalStringType }
     *     
     */
    public void setName(InternationalStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalStringType }
     *     
     */
    public InternationalStringType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalStringType }
     *     
     */
    public void setDescription(InternationalStringType value) {
        this.description = value;
    }

    /**
     * Gets the value of the versionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VersionInfoType }
     *     
     */
    public VersionInfoType getVersionInfo() {
        return versionInfo;
    }

    /**
     * Sets the value of the versionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionInfoType }
     *     
     */
    public void setVersionInfo(VersionInfoType value) {
        this.versionInfo = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classification property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the classification property.
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<>();
        }
        return this.classification;
    }

    /**
     * Gets the value of the externalIdentifier property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the externalIdentifier property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExternalIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalIdentifierType }
     * </p>
     * 
     * 
     * @return
     *     The value of the externalIdentifier property.
     */
    public List<ExternalIdentifierType> getExternalIdentifier() {
        if (externalIdentifier == null) {
            externalIdentifier = new ArrayList<>();
        }
        return this.externalIdentifier;
    }

    /**
     * Gets the value of the lid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLid() {
        return lid;
    }

    /**
     * Sets the value of the lid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLid(String value) {
        this.lid = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
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

}
