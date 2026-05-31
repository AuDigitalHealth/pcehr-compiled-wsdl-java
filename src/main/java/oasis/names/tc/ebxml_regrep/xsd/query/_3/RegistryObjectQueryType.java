
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for RegistryObjectQueryType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="RegistryObjectQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SlotBranch" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}SlotBranchType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NameBranch" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}InternationalStringBranchType" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionBranch" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}InternationalStringBranchType" minOccurs="0"/&gt;
 *         &lt;element name="VersionInfoFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationQuery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ExternalIdentifierQuery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ObjectTypeQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/&gt;
 *         &lt;element name="StatusQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/&gt;
 *         &lt;element name="SourceAssociationQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}AssociationQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TargetAssociationQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}AssociationQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistryObjectQueryType", propOrder = {
    "slotBranch",
    "nameBranch",
    "descriptionBranch",
    "versionInfoFilter",
    "classificationQuery",
    "externalIdentifierQuery",
    "objectTypeQuery",
    "statusQuery",
    "sourceAssociationQuery",
    "targetAssociationQuery"
})
@XmlSeeAlso({
    AssociationQueryType.class,
    AuditableEventQueryType.class,
    ClassificationQueryType.class,
    ClassificationNodeQueryType.class,
    ClassificationSchemeQueryType.class,
    ExternalIdentifierQueryType.class,
    ExternalLinkQueryType.class,
    ExtrinsicObjectQueryType.class,
    OrganizationQueryType.class,
    RegistryPackageQueryType.class,
    ServiceQueryType.class,
    ServiceBindingQueryType.class,
    SpecificationLinkQueryType.class,
    PersonQueryType.class,
    RegistryQueryType.class,
    FederationQueryType.class,
    AdhocQueryQueryType.class,
    NotificationQueryType.class,
    SubscriptionQueryType.class
})
public class RegistryObjectQueryType
    extends FilterQueryType
{

    @XmlElement(name = "SlotBranch")
    protected List<SlotBranchType> slotBranch;
    @XmlElement(name = "NameBranch")
    protected InternationalStringBranchType nameBranch;
    @XmlElement(name = "DescriptionBranch")
    protected InternationalStringBranchType descriptionBranch;
    @XmlElement(name = "VersionInfoFilter")
    protected FilterType versionInfoFilter;
    @XmlElement(name = "ClassificationQuery")
    protected List<ClassificationQueryType> classificationQuery;
    @XmlElement(name = "ExternalIdentifierQuery")
    protected List<ExternalIdentifierQueryType> externalIdentifierQuery;
    @XmlElement(name = "ObjectTypeQuery")
    protected ClassificationNodeQueryType objectTypeQuery;
    @XmlElement(name = "StatusQuery")
    protected ClassificationNodeQueryType statusQuery;
    @XmlElement(name = "SourceAssociationQuery")
    protected List<AssociationQueryType> sourceAssociationQuery;
    @XmlElement(name = "TargetAssociationQuery")
    protected List<AssociationQueryType> targetAssociationQuery;

    /**
     * Gets the value of the slotBranch property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the slotBranch property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSlotBranch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SlotBranchType }
     * </p>
     * 
     * 
     * @return
     *     The value of the slotBranch property.
     */
    public List<SlotBranchType> getSlotBranch() {
        if (slotBranch == null) {
            slotBranch = new ArrayList<>();
        }
        return this.slotBranch;
    }

    /**
     * Gets the value of the nameBranch property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalStringBranchType }
     *     
     */
    public InternationalStringBranchType getNameBranch() {
        return nameBranch;
    }

    /**
     * Sets the value of the nameBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalStringBranchType }
     *     
     */
    public void setNameBranch(InternationalStringBranchType value) {
        this.nameBranch = value;
    }

    /**
     * Gets the value of the descriptionBranch property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalStringBranchType }
     *     
     */
    public InternationalStringBranchType getDescriptionBranch() {
        return descriptionBranch;
    }

    /**
     * Sets the value of the descriptionBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalStringBranchType }
     *     
     */
    public void setDescriptionBranch(InternationalStringBranchType value) {
        this.descriptionBranch = value;
    }

    /**
     * Gets the value of the versionInfoFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getVersionInfoFilter() {
        return versionInfoFilter;
    }

    /**
     * Sets the value of the versionInfoFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setVersionInfoFilter(FilterType value) {
        this.versionInfoFilter = value;
    }

    /**
     * Gets the value of the classificationQuery property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the classificationQuery property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getClassificationQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationQueryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the classificationQuery property.
     */
    public List<ClassificationQueryType> getClassificationQuery() {
        if (classificationQuery == null) {
            classificationQuery = new ArrayList<>();
        }
        return this.classificationQuery;
    }

    /**
     * Gets the value of the externalIdentifierQuery property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the externalIdentifierQuery property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExternalIdentifierQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalIdentifierQueryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the externalIdentifierQuery property.
     */
    public List<ExternalIdentifierQueryType> getExternalIdentifierQuery() {
        if (externalIdentifierQuery == null) {
            externalIdentifierQuery = new ArrayList<>();
        }
        return this.externalIdentifierQuery;
    }

    /**
     * Gets the value of the objectTypeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public ClassificationNodeQueryType getObjectTypeQuery() {
        return objectTypeQuery;
    }

    /**
     * Sets the value of the objectTypeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public void setObjectTypeQuery(ClassificationNodeQueryType value) {
        this.objectTypeQuery = value;
    }

    /**
     * Gets the value of the statusQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public ClassificationNodeQueryType getStatusQuery() {
        return statusQuery;
    }

    /**
     * Sets the value of the statusQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public void setStatusQuery(ClassificationNodeQueryType value) {
        this.statusQuery = value;
    }

    /**
     * Gets the value of the sourceAssociationQuery property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sourceAssociationQuery property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSourceAssociationQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationQueryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the sourceAssociationQuery property.
     */
    public List<AssociationQueryType> getSourceAssociationQuery() {
        if (sourceAssociationQuery == null) {
            sourceAssociationQuery = new ArrayList<>();
        }
        return this.sourceAssociationQuery;
    }

    /**
     * Gets the value of the targetAssociationQuery property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the targetAssociationQuery property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTargetAssociationQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationQueryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the targetAssociationQuery property.
     */
    public List<AssociationQueryType> getTargetAssociationQuery() {
        if (targetAssociationQuery == null) {
            targetAssociationQuery = new ArrayList<>();
        }
        return this.targetAssociationQuery;
    }

}
