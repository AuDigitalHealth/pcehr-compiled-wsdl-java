
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.tc.ebxml_regrep.xsd.query._3 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ResponseOption_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ResponseOption");
    private static final QName _RegistryObjectQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryObjectQuery");
    private static final QName _AssociationQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AssociationQuery");
    private static final QName _AuditableEventQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AuditableEventQuery");
    private static final QName _ClassificationQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationQuery");
    private static final QName _ClassificationNodeQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationNodeQuery");
    private static final QName _ClassificationSchemeQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ClassificationSchemeQuery");
    private static final QName _ExternalIdentifierQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ExternalIdentifierQuery");
    private static final QName _ExternalLinkQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ExternalLinkQuery");
    private static final QName _ExtrinsicObjectQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ExtrinsicObjectQuery");
    private static final QName _OrganizationQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "OrganizationQuery");
    private static final QName _RegistryPackageQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryPackageQuery");
    private static final QName _ServiceQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ServiceQuery");
    private static final QName _ServiceBindingQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "ServiceBindingQuery");
    private static final QName _SpecificationLinkQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SpecificationLinkQuery");
    private static final QName _PersonQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "PersonQuery");
    private static final QName _UserQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "UserQuery");
    private static final QName _RegistryQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "RegistryQuery");
    private static final QName _FederationQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FederationQuery");
    private static final QName _AdhocQueryQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "AdhocQueryQuery");
    private static final QName _NotificationQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "NotificationQuery");
    private static final QName _SubscriptionQuery_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "SubscriptionQuery");
    private static final QName _Filter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "Filter");
    private static final QName _CompoundFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "CompoundFilter");
    private static final QName _BooleanFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "BooleanFilter");
    private static final QName _IntegerFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "IntegerFilter");
    private static final QName _FloatFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "FloatFilter");
    private static final QName _DateTimeFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "DateTimeFilter");
    private static final QName _StringFilter_QNAME = new QName("urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", "StringFilter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.tc.ebxml_regrep.xsd.query._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseOptionType }
     * 
     * @return
     *     the new instance of {@link ResponseOptionType }
     */
    public ResponseOptionType createResponseOptionType() {
        return new ResponseOptionType();
    }

    /**
     * Create an instance of {@link AdhocQueryRequest }
     * 
     * @return
     *     the new instance of {@link AdhocQueryRequest }
     */
    public AdhocQueryRequest createAdhocQueryRequest() {
        return new AdhocQueryRequest();
    }

    /**
     * Create an instance of {@link AdhocQueryResponse }
     * 
     * @return
     *     the new instance of {@link AdhocQueryResponse }
     */
    public AdhocQueryResponse createAdhocQueryResponse() {
        return new AdhocQueryResponse();
    }

    /**
     * Create an instance of {@link RegistryObjectQueryType }
     * 
     * @return
     *     the new instance of {@link RegistryObjectQueryType }
     */
    public RegistryObjectQueryType createRegistryObjectQueryType() {
        return new RegistryObjectQueryType();
    }

    /**
     * Create an instance of {@link AssociationQueryType }
     * 
     * @return
     *     the new instance of {@link AssociationQueryType }
     */
    public AssociationQueryType createAssociationQueryType() {
        return new AssociationQueryType();
    }

    /**
     * Create an instance of {@link AuditableEventQueryType }
     * 
     * @return
     *     the new instance of {@link AuditableEventQueryType }
     */
    public AuditableEventQueryType createAuditableEventQueryType() {
        return new AuditableEventQueryType();
    }

    /**
     * Create an instance of {@link ClassificationQueryType }
     * 
     * @return
     *     the new instance of {@link ClassificationQueryType }
     */
    public ClassificationQueryType createClassificationQueryType() {
        return new ClassificationQueryType();
    }

    /**
     * Create an instance of {@link ClassificationNodeQueryType }
     * 
     * @return
     *     the new instance of {@link ClassificationNodeQueryType }
     */
    public ClassificationNodeQueryType createClassificationNodeQueryType() {
        return new ClassificationNodeQueryType();
    }

    /**
     * Create an instance of {@link ClassificationSchemeQueryType }
     * 
     * @return
     *     the new instance of {@link ClassificationSchemeQueryType }
     */
    public ClassificationSchemeQueryType createClassificationSchemeQueryType() {
        return new ClassificationSchemeQueryType();
    }

    /**
     * Create an instance of {@link ExternalIdentifierQueryType }
     * 
     * @return
     *     the new instance of {@link ExternalIdentifierQueryType }
     */
    public ExternalIdentifierQueryType createExternalIdentifierQueryType() {
        return new ExternalIdentifierQueryType();
    }

    /**
     * Create an instance of {@link ExternalLinkQueryType }
     * 
     * @return
     *     the new instance of {@link ExternalLinkQueryType }
     */
    public ExternalLinkQueryType createExternalLinkQueryType() {
        return new ExternalLinkQueryType();
    }

    /**
     * Create an instance of {@link ExtrinsicObjectQueryType }
     * 
     * @return
     *     the new instance of {@link ExtrinsicObjectQueryType }
     */
    public ExtrinsicObjectQueryType createExtrinsicObjectQueryType() {
        return new ExtrinsicObjectQueryType();
    }

    /**
     * Create an instance of {@link OrganizationQueryType }
     * 
     * @return
     *     the new instance of {@link OrganizationQueryType }
     */
    public OrganizationQueryType createOrganizationQueryType() {
        return new OrganizationQueryType();
    }

    /**
     * Create an instance of {@link RegistryPackageQueryType }
     * 
     * @return
     *     the new instance of {@link RegistryPackageQueryType }
     */
    public RegistryPackageQueryType createRegistryPackageQueryType() {
        return new RegistryPackageQueryType();
    }

    /**
     * Create an instance of {@link ServiceQueryType }
     * 
     * @return
     *     the new instance of {@link ServiceQueryType }
     */
    public ServiceQueryType createServiceQueryType() {
        return new ServiceQueryType();
    }

    /**
     * Create an instance of {@link ServiceBindingQueryType }
     * 
     * @return
     *     the new instance of {@link ServiceBindingQueryType }
     */
    public ServiceBindingQueryType createServiceBindingQueryType() {
        return new ServiceBindingQueryType();
    }

    /**
     * Create an instance of {@link SpecificationLinkQueryType }
     * 
     * @return
     *     the new instance of {@link SpecificationLinkQueryType }
     */
    public SpecificationLinkQueryType createSpecificationLinkQueryType() {
        return new SpecificationLinkQueryType();
    }

    /**
     * Create an instance of {@link PersonQueryType }
     * 
     * @return
     *     the new instance of {@link PersonQueryType }
     */
    public PersonQueryType createPersonQueryType() {
        return new PersonQueryType();
    }

    /**
     * Create an instance of {@link UserQueryType }
     * 
     * @return
     *     the new instance of {@link UserQueryType }
     */
    public UserQueryType createUserQueryType() {
        return new UserQueryType();
    }

    /**
     * Create an instance of {@link RegistryQueryType }
     * 
     * @return
     *     the new instance of {@link RegistryQueryType }
     */
    public RegistryQueryType createRegistryQueryType() {
        return new RegistryQueryType();
    }

    /**
     * Create an instance of {@link FederationQueryType }
     * 
     * @return
     *     the new instance of {@link FederationQueryType }
     */
    public FederationQueryType createFederationQueryType() {
        return new FederationQueryType();
    }

    /**
     * Create an instance of {@link AdhocQueryQueryType }
     * 
     * @return
     *     the new instance of {@link AdhocQueryQueryType }
     */
    public AdhocQueryQueryType createAdhocQueryQueryType() {
        return new AdhocQueryQueryType();
    }

    /**
     * Create an instance of {@link NotificationQueryType }
     * 
     * @return
     *     the new instance of {@link NotificationQueryType }
     */
    public NotificationQueryType createNotificationQueryType() {
        return new NotificationQueryType();
    }

    /**
     * Create an instance of {@link SubscriptionQueryType }
     * 
     * @return
     *     the new instance of {@link SubscriptionQueryType }
     */
    public SubscriptionQueryType createSubscriptionQueryType() {
        return new SubscriptionQueryType();
    }

    /**
     * Create an instance of {@link FilterType }
     * 
     * @return
     *     the new instance of {@link FilterType }
     */
    public FilterType createFilterType() {
        return new FilterType();
    }

    /**
     * Create an instance of {@link CompoundFilterType }
     * 
     * @return
     *     the new instance of {@link CompoundFilterType }
     */
    public CompoundFilterType createCompoundFilterType() {
        return new CompoundFilterType();
    }

    /**
     * Create an instance of {@link BooleanFilterType }
     * 
     * @return
     *     the new instance of {@link BooleanFilterType }
     */
    public BooleanFilterType createBooleanFilterType() {
        return new BooleanFilterType();
    }

    /**
     * Create an instance of {@link IntegerFilterType }
     * 
     * @return
     *     the new instance of {@link IntegerFilterType }
     */
    public IntegerFilterType createIntegerFilterType() {
        return new IntegerFilterType();
    }

    /**
     * Create an instance of {@link FloatFilterType }
     * 
     * @return
     *     the new instance of {@link FloatFilterType }
     */
    public FloatFilterType createFloatFilterType() {
        return new FloatFilterType();
    }

    /**
     * Create an instance of {@link DateTimeFilterType }
     * 
     * @return
     *     the new instance of {@link DateTimeFilterType }
     */
    public DateTimeFilterType createDateTimeFilterType() {
        return new DateTimeFilterType();
    }

    /**
     * Create an instance of {@link StringFilterType }
     * 
     * @return
     *     the new instance of {@link StringFilterType }
     */
    public StringFilterType createStringFilterType() {
        return new StringFilterType();
    }

    /**
     * Create an instance of {@link InternationalStringBranchType }
     * 
     * @return
     *     the new instance of {@link InternationalStringBranchType }
     */
    public InternationalStringBranchType createInternationalStringBranchType() {
        return new InternationalStringBranchType();
    }

    /**
     * Create an instance of {@link SlotBranchType }
     * 
     * @return
     *     the new instance of {@link SlotBranchType }
     */
    public SlotBranchType createSlotBranchType() {
        return new SlotBranchType();
    }

    /**
     * Create an instance of {@link QueryExpressionBranchType }
     * 
     * @return
     *     the new instance of {@link QueryExpressionBranchType }
     */
    public QueryExpressionBranchType createQueryExpressionBranchType() {
        return new QueryExpressionBranchType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseOptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseOptionType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "ResponseOption")
    public JAXBElement<ResponseOptionType> createResponseOption(ResponseOptionType value) {
        return new JAXBElement<>(_ResponseOption_QNAME, ResponseOptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryObjectQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistryObjectQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "RegistryObjectQuery")
    public JAXBElement<RegistryObjectQueryType> createRegistryObjectQuery(RegistryObjectQueryType value) {
        return new JAXBElement<>(_RegistryObjectQuery_QNAME, RegistryObjectQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssociationQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "AssociationQuery")
    public JAXBElement<AssociationQueryType> createAssociationQuery(AssociationQueryType value) {
        return new JAXBElement<>(_AssociationQuery_QNAME, AssociationQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuditableEventQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuditableEventQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "AuditableEventQuery")
    public JAXBElement<AuditableEventQueryType> createAuditableEventQuery(AuditableEventQueryType value) {
        return new JAXBElement<>(_AuditableEventQuery_QNAME, AuditableEventQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassificationQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "ClassificationQuery")
    public JAXBElement<ClassificationQueryType> createClassificationQuery(ClassificationQueryType value) {
        return new JAXBElement<>(_ClassificationQuery_QNAME, ClassificationQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationNodeQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassificationNodeQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "ClassificationNodeQuery")
    public JAXBElement<ClassificationNodeQueryType> createClassificationNodeQuery(ClassificationNodeQueryType value) {
        return new JAXBElement<>(_ClassificationNodeQuery_QNAME, ClassificationNodeQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationSchemeQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassificationSchemeQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "ClassificationSchemeQuery")
    public JAXBElement<ClassificationSchemeQueryType> createClassificationSchemeQuery(ClassificationSchemeQueryType value) {
        return new JAXBElement<>(_ClassificationSchemeQuery_QNAME, ClassificationSchemeQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalIdentifierQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExternalIdentifierQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "ExternalIdentifierQuery")
    public JAXBElement<ExternalIdentifierQueryType> createExternalIdentifierQuery(ExternalIdentifierQueryType value) {
        return new JAXBElement<>(_ExternalIdentifierQuery_QNAME, ExternalIdentifierQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalLinkQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExternalLinkQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "ExternalLinkQuery")
    public JAXBElement<ExternalLinkQueryType> createExternalLinkQuery(ExternalLinkQueryType value) {
        return new JAXBElement<>(_ExternalLinkQuery_QNAME, ExternalLinkQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtrinsicObjectQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtrinsicObjectQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "ExtrinsicObjectQuery")
    public JAXBElement<ExtrinsicObjectQueryType> createExtrinsicObjectQuery(ExtrinsicObjectQueryType value) {
        return new JAXBElement<>(_ExtrinsicObjectQuery_QNAME, ExtrinsicObjectQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganizationQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "OrganizationQuery")
    public JAXBElement<OrganizationQueryType> createOrganizationQuery(OrganizationQueryType value) {
        return new JAXBElement<>(_OrganizationQuery_QNAME, OrganizationQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryPackageQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistryPackageQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "RegistryPackageQuery")
    public JAXBElement<RegistryPackageQueryType> createRegistryPackageQuery(RegistryPackageQueryType value) {
        return new JAXBElement<>(_RegistryPackageQuery_QNAME, RegistryPackageQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "ServiceQuery")
    public JAXBElement<ServiceQueryType> createServiceQuery(ServiceQueryType value) {
        return new JAXBElement<>(_ServiceQuery_QNAME, ServiceQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceBindingQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceBindingQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "ServiceBindingQuery")
    public JAXBElement<ServiceBindingQueryType> createServiceBindingQuery(ServiceBindingQueryType value) {
        return new JAXBElement<>(_ServiceBindingQuery_QNAME, ServiceBindingQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecificationLinkQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecificationLinkQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "SpecificationLinkQuery")
    public JAXBElement<SpecificationLinkQueryType> createSpecificationLinkQuery(SpecificationLinkQueryType value) {
        return new JAXBElement<>(_SpecificationLinkQuery_QNAME, SpecificationLinkQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "PersonQuery")
    public JAXBElement<PersonQueryType> createPersonQuery(PersonQueryType value) {
        return new JAXBElement<>(_PersonQuery_QNAME, PersonQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "UserQuery")
    public JAXBElement<UserQueryType> createUserQuery(UserQueryType value) {
        return new JAXBElement<>(_UserQuery_QNAME, UserQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistryQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "RegistryQuery")
    public JAXBElement<RegistryQueryType> createRegistryQuery(RegistryQueryType value) {
        return new JAXBElement<>(_RegistryQuery_QNAME, RegistryQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FederationQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FederationQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "FederationQuery")
    public JAXBElement<FederationQueryType> createFederationQuery(FederationQueryType value) {
        return new JAXBElement<>(_FederationQuery_QNAME, FederationQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdhocQueryQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdhocQueryQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "AdhocQueryQuery")
    public JAXBElement<AdhocQueryQueryType> createAdhocQueryQuery(AdhocQueryQueryType value) {
        return new JAXBElement<>(_AdhocQueryQuery_QNAME, AdhocQueryQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotificationQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "NotificationQuery")
    public JAXBElement<NotificationQueryType> createNotificationQuery(NotificationQueryType value) {
        return new JAXBElement<>(_NotificationQuery_QNAME, NotificationQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubscriptionQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "SubscriptionQuery")
    public JAXBElement<SubscriptionQueryType> createSubscriptionQuery(SubscriptionQueryType value) {
        return new JAXBElement<>(_SubscriptionQuery_QNAME, SubscriptionQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "Filter")
    public JAXBElement<FilterType> createFilter(FilterType value) {
        return new JAXBElement<>(_Filter_QNAME, FilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompoundFilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompoundFilterType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "CompoundFilter")
    public JAXBElement<CompoundFilterType> createCompoundFilter(CompoundFilterType value) {
        return new JAXBElement<>(_CompoundFilter_QNAME, CompoundFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanFilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BooleanFilterType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "BooleanFilter")
    public JAXBElement<BooleanFilterType> createBooleanFilter(BooleanFilterType value) {
        return new JAXBElement<>(_BooleanFilter_QNAME, BooleanFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerFilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegerFilterType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "IntegerFilter")
    public JAXBElement<IntegerFilterType> createIntegerFilter(IntegerFilterType value) {
        return new JAXBElement<>(_IntegerFilter_QNAME, IntegerFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FloatFilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FloatFilterType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "FloatFilter")
    public JAXBElement<FloatFilterType> createFloatFilter(FloatFilterType value) {
        return new JAXBElement<>(_FloatFilter_QNAME, FloatFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeFilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateTimeFilterType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "DateTimeFilter")
    public JAXBElement<DateTimeFilterType> createDateTimeFilter(DateTimeFilterType value) {
        return new JAXBElement<>(_DateTimeFilter_QNAME, DateTimeFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringFilterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringFilterType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0", name = "StringFilter")
    public JAXBElement<StringFilterType> createStringFilter(StringFilterType value) {
        return new JAXBElement<>(_StringFilter_QNAME, StringFilterType.class, null, value);
    }

}
