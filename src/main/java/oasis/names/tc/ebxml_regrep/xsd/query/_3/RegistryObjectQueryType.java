
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
    "slotBranches",
    "nameBranch",
    "descriptionBranch",
    "versionInfoFilter",
    "classificationQueries",
    "externalIdentifierQueries",
    "objectTypeQuery",
    "statusQuery",
    "sourceAssociationQueries",
    "targetAssociationQueries"
})
@XmlSeeAlso({
    SubscriptionQuery.class,
    AssociationQuery.class,
    NotificationQuery.class,
    FederationQuery.class,
    OrganizationQuery.class,
    AdhocQueryQuery.class,
    RegistryQuery.class,
    RegistryPackageQuery.class,
    ExtrinsicObjectQuery.class,
    AuditableEventQuery.class,
    ServiceQuery.class,
    ServiceBindingQuery.class,
    SpecificationLinkQuery.class,
    ExternalLinkQuery.class,
    PersonQueryType.class,
    ExternalIdentifierQuery.class,
    ClassificationNodeQuery.class,
    ClassificationSchemeQuery.class,
    ClassificationQuery.class
})
public class RegistryObjectQueryType
    extends FilterQueryType
{

    @XmlElement(name = "SlotBranch")
    protected List<SlotBranchType> slotBranches;
    @XmlElement(name = "NameBranch")
    protected InternationalStringBranchType nameBranch;
    @XmlElement(name = "DescriptionBranch")
    protected InternationalStringBranchType descriptionBranch;
    @XmlElement(name = "VersionInfoFilter")
    protected FilterType versionInfoFilter;
    @XmlElement(name = "ClassificationQuery")
    protected List<ClassificationQuery> classificationQueries;
    @XmlElement(name = "ExternalIdentifierQuery")
    protected List<ExternalIdentifierQuery> externalIdentifierQueries;
    @XmlElement(name = "ObjectTypeQuery")
    protected ClassificationNodeQuery objectTypeQuery;
    @XmlElement(name = "StatusQuery")
    protected ClassificationNodeQuery statusQuery;
    @XmlElement(name = "SourceAssociationQuery")
    protected List<AssociationQuery> sourceAssociationQueries;
    @XmlElement(name = "TargetAssociationQuery")
    protected List<AssociationQuery> targetAssociationQueries;

    /**
     * Gets the value of the slotBranches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slotBranches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlotBranches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SlotBranchType }
     * 
     * 
     */
    public List<SlotBranchType> getSlotBranches() {
        if (slotBranches == null) {
            slotBranches = new ArrayList<SlotBranchType>();
        }
        return this.slotBranches;
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
     * Gets the value of the classificationQueries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationQueries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassificationQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationQuery }
     * 
     * 
     */
    public List<ClassificationQuery> getClassificationQueries() {
        if (classificationQueries == null) {
            classificationQueries = new ArrayList<ClassificationQuery>();
        }
        return this.classificationQueries;
    }

    /**
     * Gets the value of the externalIdentifierQueries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalIdentifierQueries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalIdentifierQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalIdentifierQuery }
     * 
     * 
     */
    public List<ExternalIdentifierQuery> getExternalIdentifierQueries() {
        if (externalIdentifierQueries == null) {
            externalIdentifierQueries = new ArrayList<ExternalIdentifierQuery>();
        }
        return this.externalIdentifierQueries;
    }

    /**
     * Gets the value of the objectTypeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public ClassificationNodeQuery getObjectTypeQuery() {
        return objectTypeQuery;
    }

    /**
     * Sets the value of the objectTypeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public void setObjectTypeQuery(ClassificationNodeQuery value) {
        this.objectTypeQuery = value;
    }

    /**
     * Gets the value of the statusQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public ClassificationNodeQuery getStatusQuery() {
        return statusQuery;
    }

    /**
     * Sets the value of the statusQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public void setStatusQuery(ClassificationNodeQuery value) {
        this.statusQuery = value;
    }

    /**
     * Gets the value of the sourceAssociationQueries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceAssociationQueries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceAssociationQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationQuery }
     * 
     * 
     */
    public List<AssociationQuery> getSourceAssociationQueries() {
        if (sourceAssociationQueries == null) {
            sourceAssociationQueries = new ArrayList<AssociationQuery>();
        }
        return this.sourceAssociationQueries;
    }

    /**
     * Gets the value of the targetAssociationQueries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetAssociationQueries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetAssociationQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationQuery }
     * 
     * 
     */
    public List<AssociationQuery> getTargetAssociationQueries() {
        if (targetAssociationQueries == null) {
            targetAssociationQueries = new ArrayList<AssociationQuery>();
        }
        return this.targetAssociationQueries;
    }

}
