
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1 package. 
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

    private static final QName _Timestamp_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "timestamp");
    private static final QName _Signature_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "signature");
    private static final QName _MedicareCardNumber_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "medicareCardNumber");
    private static final QName _MedicareIRN_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "medicareIRN");
    private static final QName _DvaFileNumber_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "dvaFileNumber");
    private static final QName _IhiNumber_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "ihiNumber");
    private static final QName _Sex_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "sex");
    private static final QName _MilitaryHealthNumber_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "militaryHealthNumber");
    private static final QName _DateAccuracyIndicatorType_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", "dateAccuracyIndicatorType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PCEHRHeader }
     * 
     * @return
     *     the new instance of {@link PCEHRHeader }
     */
    public PCEHRHeader createPCEHRHeader() {
        return new PCEHRHeader();
    }

    /**
     * Create an instance of {@link OrganisationType }
     * 
     * @return
     *     the new instance of {@link OrganisationType }
     */
    public OrganisationType createOrganisationType() {
        return new OrganisationType();
    }

    /**
     * Create an instance of {@link OrganisationServiceType }
     * 
     * @return
     *     the new instance of {@link OrganisationServiceType }
     */
    public OrganisationServiceType createOrganisationServiceType() {
        return new OrganisationServiceType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     * @return
     *     the new instance of {@link AddressType }
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link TimestampType }
     * 
     * @return
     *     the new instance of {@link TimestampType }
     */
    public TimestampType createTimestampType() {
        return new TimestampType();
    }

    /**
     * Create an instance of {@link SignatureContainerType }
     * 
     * @return
     *     the new instance of {@link SignatureContainerType }
     */
    public SignatureContainerType createSignatureContainerType() {
        return new SignatureContainerType();
    }

    /**
     * Create an instance of {@link PCEHRHeader.User }
     * 
     * @return
     *     the new instance of {@link PCEHRHeader.User }
     */
    public PCEHRHeader.User createPCEHRHeaderUser() {
        return new PCEHRHeader.User();
    }

    /**
     * Create an instance of {@link PCEHRHeader.ProductType }
     * 
     * @return
     *     the new instance of {@link PCEHRHeader.ProductType }
     */
    public PCEHRHeader.ProductType createPCEHRHeaderProductType() {
        return new PCEHRHeader.ProductType();
    }

    /**
     * Create an instance of {@link PCEHRHeader.AccessingOrganisation }
     * 
     * @return
     *     the new instance of {@link PCEHRHeader.AccessingOrganisation }
     */
    public PCEHRHeader.AccessingOrganisation createPCEHRHeaderAccessingOrganisation() {
        return new PCEHRHeader.AccessingOrganisation();
    }

    /**
     * Create an instance of {@link PCEHRMobileHeader }
     * 
     * @return
     *     the new instance of {@link PCEHRMobileHeader }
     */
    public PCEHRMobileHeader createPCEHRMobileHeader() {
        return new PCEHRMobileHeader();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     * @return
     *     the new instance of {@link NameType }
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link ResponseStatusType }
     * 
     * @return
     *     the new instance of {@link ResponseStatusType }
     */
    public ResponseStatusType createResponseStatusType() {
        return new ResponseStatusType();
    }

    /**
     * Create an instance of {@link AccessConditionsType }
     * 
     * @return
     *     the new instance of {@link AccessConditionsType }
     */
    public AccessConditionsType createAccessConditionsType() {
        return new AccessConditionsType();
    }

    /**
     * Create an instance of {@link ParticipantDetailsType }
     * 
     * @return
     *     the new instance of {@link ParticipantDetailsType }
     */
    public ParticipantDetailsType createParticipantDetailsType() {
        return new ParticipantDetailsType();
    }

    /**
     * Create an instance of {@link AccessedEntityType }
     * 
     * @return
     *     the new instance of {@link AccessedEntityType }
     */
    public AccessedEntityType createAccessedEntityType() {
        return new AccessedEntityType();
    }

    /**
     * Create an instance of {@link ParticipantActionType }
     * 
     * @return
     *     the new instance of {@link ParticipantActionType }
     */
    public ParticipantActionType createParticipantActionType() {
        return new ParticipantActionType();
    }

    /**
     * Create an instance of {@link OrganisationType.ParticipatingOrganisation }
     * 
     * @return
     *     the new instance of {@link OrganisationType.ParticipatingOrganisation }
     */
    public OrganisationType.ParticipatingOrganisation createOrganisationTypeParticipatingOrganisation() {
        return new OrganisationType.ParticipatingOrganisation();
    }

    /**
     * Create an instance of {@link OrganisationServiceType.ComplexDate }
     * 
     * @return
     *     the new instance of {@link OrganisationServiceType.ComplexDate }
     */
    public OrganisationServiceType.ComplexDate createOrganisationServiceTypeComplexDate() {
        return new OrganisationServiceType.ComplexDate();
    }

    /**
     * Create an instance of {@link AddressType.PostalDeliveryGroup }
     * 
     * @return
     *     the new instance of {@link AddressType.PostalDeliveryGroup }
     */
    public AddressType.PostalDeliveryGroup createAddressTypePostalDeliveryGroup() {
        return new AddressType.PostalDeliveryGroup();
    }

    /**
     * Create an instance of {@link AddressType.UnitGroup }
     * 
     * @return
     *     the new instance of {@link AddressType.UnitGroup }
     */
    public AddressType.UnitGroup createAddressTypeUnitGroup() {
        return new AddressType.UnitGroup();
    }

    /**
     * Create an instance of {@link AddressType.LevelGroup }
     * 
     * @return
     *     the new instance of {@link AddressType.LevelGroup }
     */
    public AddressType.LevelGroup createAddressTypeLevelGroup() {
        return new AddressType.LevelGroup();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimestampType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimestampType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "timestamp")
    public JAXBElement<TimestampType> createTimestamp(TimestampType value) {
        return new JAXBElement<>(_Timestamp_QNAME, TimestampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureContainerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureContainerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "signature")
    public JAXBElement<SignatureContainerType> createSignature(SignatureContainerType value) {
        return new JAXBElement<>(_Signature_QNAME, SignatureContainerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "medicareCardNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMedicareCardNumber(String value) {
        return new JAXBElement<>(_MedicareCardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "medicareIRN")
    public JAXBElement<Integer> createMedicareIRN(Integer value) {
        return new JAXBElement<>(_MedicareIRN_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "dvaFileNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDvaFileNumber(String value) {
        return new JAXBElement<>(_DvaFileNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "ihiNumber")
    public JAXBElement<String> createIhiNumber(String value) {
        return new JAXBElement<>(_IhiNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "sex")
    public JAXBElement<String> createSex(String value) {
        return new JAXBElement<>(_Sex_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "militaryHealthNumber")
    public JAXBElement<String> createMilitaryHealthNumber(String value) {
        return new JAXBElement<>(_MilitaryHealthNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", name = "dateAccuracyIndicatorType")
    public JAXBElement<String> createDateAccuracyIndicatorType(String value) {
        return new JAXBElement<>(_DateAccuracyIndicatorType_QNAME, String.class, null, value);
    }

}
