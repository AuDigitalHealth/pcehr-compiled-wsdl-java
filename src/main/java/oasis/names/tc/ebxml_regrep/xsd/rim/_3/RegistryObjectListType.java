
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RegistryObjectListType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="RegistryObjectListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ExtrinsicObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}RegistryPackage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Classification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Association" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}Identifiable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryObjectListType", propOrder = {
    "extrinsicObject",
    "registryPackage",
    "classification",
    "association",
    "identifiable"
})
public class RegistryObjectListType {

    @XmlElement(name = "ExtrinsicObject")
    protected List<ExtrinsicObjectType> extrinsicObject;
    @XmlElement(name = "RegistryPackage")
    protected List<RegistryPackageType> registryPackage;
    @XmlElement(name = "Classification")
    protected List<ClassificationType> classification;
    @XmlElement(name = "Association")
    protected List<AssociationType1> association;
    @XmlElementRef(name = "Identifiable", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends IdentifiableType>> identifiable;

    /**
     * Gets the value of the extrinsicObject property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the extrinsicObject property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExtrinsicObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtrinsicObjectType }
     * </p>
     * 
     * 
     * @return
     *     The value of the extrinsicObject property.
     */
    public List<ExtrinsicObjectType> getExtrinsicObject() {
        if (extrinsicObject == null) {
            extrinsicObject = new ArrayList<>();
        }
        return this.extrinsicObject;
    }

    /**
     * Gets the value of the registryPackage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the registryPackage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRegistryPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistryPackageType }
     * </p>
     * 
     * 
     * @return
     *     The value of the registryPackage property.
     */
    public List<RegistryPackageType> getRegistryPackage() {
        if (registryPackage == null) {
            registryPackage = new ArrayList<>();
        }
        return this.registryPackage;
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
     * Gets the value of the association property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the association property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationType1 }
     * </p>
     * 
     * 
     * @return
     *     The value of the association property.
     */
    public List<AssociationType1> getAssociation() {
        if (association == null) {
            association = new ArrayList<>();
        }
        return this.association;
    }

    /**
     * Gets the value of the identifiable property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the identifiable property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIdentifiable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AdhocQueryType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssociationType1 }{@code >}
     * {@link JAXBElement }{@code <}{@link AuditableEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassificationNodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassificationSchemeType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassificationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExternalIdentifierType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExternalLinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtrinsicObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link FederationType }{@code >}
     * {@link JAXBElement }{@code <}{@link IdentifiableType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectRefType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganizationType }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonType }{@code >}
     * {@link JAXBElement }{@code <}{@link RegistryObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link RegistryPackageType }{@code >}
     * {@link JAXBElement }{@code <}{@link RegistryType }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceBindingType }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecificationLinkType }{@code >}
     * {@link JAXBElement }{@code <}{@link SubscriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link UserType }{@code >}
     * </p>
     * 
     * 
     * @return
     *     The value of the identifiable property.
     */
    public List<JAXBElement<? extends IdentifiableType>> getIdentifiable() {
        if (identifiable == null) {
            identifiable = new ArrayList<>();
        }
        return this.identifiable;
    }

}
