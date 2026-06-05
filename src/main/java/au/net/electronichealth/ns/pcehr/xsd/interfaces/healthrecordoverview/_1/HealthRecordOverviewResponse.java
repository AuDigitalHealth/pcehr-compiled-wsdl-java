
package au.net.electronichealth.ns.pcehr.xsd.interfaces.healthrecordoverview._1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.IndividualTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.AddressTypeDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.CodedType;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.ContactDetailsDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.DocumentDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.InformationAvailableDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.NameTypeDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.TimeStampDT;


/**
 * &lt;p&gt;Java class for healthRecordOverviewResponse complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="healthRecordOverviewResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="viewMetadata"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="individualProfile"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/&gt;
 *                             &lt;element name="individual" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"/&gt;
 *                             &lt;element name="indigenousStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="veteranAndADFStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="viewParameters"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="clinicalSynopsisLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="viewVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="newDocuments"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="document" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}documentDT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sharedHealthSummary"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="sharedHealthSummaryAtomicData" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="cdaDocumentTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="shsAuthorName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}nameTypeDT"/&gt;
 *                             &lt;element name="shsAuthorId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="shsAuthorDesignation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *                             &lt;element name="shsAuthorOrgName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="shsAuthorOrgId"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="16"/&gt;
 *                                   &lt;maxLength value="16"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="shsAuthorOrgAddress" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}addressTypeDT" minOccurs="0"/&gt;
 *                             &lt;element name="shsAuthorOrgContactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}contactDetailsDT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="shsAuthorAddress" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}addressTypeDT" minOccurs="0"/&gt;
 *                             &lt;element name="shsAuthorContactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}contactDetailsDT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="shsEntitlements" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="entitlement" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="entitlementNumberId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="entitlementType" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *                                                 &lt;element name="entitlementEffectiveTime" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="shsAuthorQualifications" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
 *                             &lt;element name="medicinesList"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
 *                                       &lt;element name="medicine" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="medicineTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *                                                 &lt;element name="medicineDose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="medicineDesc" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="indication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="advReactionsList"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
 *                                       &lt;element name="advReaction" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="advReactionCause" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *                                                 &lt;element name="advReactionManifestation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                                 &lt;element name="advReactionType" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="immunisationList"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
 *                                       &lt;element name="immunisation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="immunisationDate" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT"/&gt;
 *                                                 &lt;element name="immunisationTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *                                                 &lt;element name="immunisationSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="medHistoryList"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT" maxOccurs="3" minOccurs="3"/&gt;
 *                                       &lt;element name="problemAndDiagnosis" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *                                                 &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
 *                                                 &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
 *                                                 &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="procedure" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *                                                 &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
 *                                                 &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
 *                                                 &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="otherMedicalHistory" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *                                                 &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
 *                                                 &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
 *                                                 &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="otherLinks"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="link" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="linkName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="linkTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="linkTarget" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *                             &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="linkType"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="Document"/&gt;
 *                                   &lt;enumeration value="View"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="recentDocuments"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="document" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}documentDT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "healthRecordOverviewResponse", propOrder = {
    "viewMetadata",
    "newDocuments",
    "sharedHealthSummary",
    "otherLinks",
    "recentDocuments"
})
@XmlRootElement(name = "healthRecordOverviewResponse")
public class HealthRecordOverviewResponse {

    @XmlElement(required = true)
    protected HealthRecordOverviewResponse.ViewMetadata viewMetadata;
    @XmlElement(required = true)
    protected HealthRecordOverviewResponse.NewDocuments newDocuments;
    @XmlElement(required = true)
    protected HealthRecordOverviewResponse.SharedHealthSummary sharedHealthSummary;
    @XmlElement(required = true)
    protected HealthRecordOverviewResponse.OtherLinks otherLinks;
    @XmlElement(required = true)
    protected HealthRecordOverviewResponse.RecentDocuments recentDocuments;

    /**
     * Gets the value of the viewMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link HealthRecordOverviewResponse.ViewMetadata }
     *     
     */
    public HealthRecordOverviewResponse.ViewMetadata getViewMetadata() {
        return viewMetadata;
    }

    /**
     * Sets the value of the viewMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthRecordOverviewResponse.ViewMetadata }
     *     
     */
    public void setViewMetadata(HealthRecordOverviewResponse.ViewMetadata value) {
        this.viewMetadata = value;
    }

    /**
     * Gets the value of the newDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link HealthRecordOverviewResponse.NewDocuments }
     *     
     */
    public HealthRecordOverviewResponse.NewDocuments getNewDocuments() {
        return newDocuments;
    }

    /**
     * Sets the value of the newDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthRecordOverviewResponse.NewDocuments }
     *     
     */
    public void setNewDocuments(HealthRecordOverviewResponse.NewDocuments value) {
        this.newDocuments = value;
    }

    /**
     * Gets the value of the sharedHealthSummary property.
     * 
     * @return
     *     possible object is
     *     {@link HealthRecordOverviewResponse.SharedHealthSummary }
     *     
     */
    public HealthRecordOverviewResponse.SharedHealthSummary getSharedHealthSummary() {
        return sharedHealthSummary;
    }

    /**
     * Sets the value of the sharedHealthSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthRecordOverviewResponse.SharedHealthSummary }
     *     
     */
    public void setSharedHealthSummary(HealthRecordOverviewResponse.SharedHealthSummary value) {
        this.sharedHealthSummary = value;
    }

    /**
     * Gets the value of the otherLinks property.
     * 
     * @return
     *     possible object is
     *     {@link HealthRecordOverviewResponse.OtherLinks }
     *     
     */
    public HealthRecordOverviewResponse.OtherLinks getOtherLinks() {
        return otherLinks;
    }

    /**
     * Sets the value of the otherLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthRecordOverviewResponse.OtherLinks }
     *     
     */
    public void setOtherLinks(HealthRecordOverviewResponse.OtherLinks value) {
        this.otherLinks = value;
    }

    /**
     * Gets the value of the recentDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link HealthRecordOverviewResponse.RecentDocuments }
     *     
     */
    public HealthRecordOverviewResponse.RecentDocuments getRecentDocuments() {
        return recentDocuments;
    }

    /**
     * Sets the value of the recentDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthRecordOverviewResponse.RecentDocuments }
     *     
     */
    public void setRecentDocuments(HealthRecordOverviewResponse.RecentDocuments value) {
        this.recentDocuments = value;
    }


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
     *         &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="document" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}documentDT" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "informationAvailable",
        "documents"
    })
    public static class NewDocuments {

        protected boolean informationAvailable;
        @XmlElement(name = "document")
        protected List<DocumentDT> documents;

        /**
         * Gets the value of the informationAvailable property.
         * 
         */
        public boolean isInformationAvailable() {
            return informationAvailable;
        }

        /**
         * Sets the value of the informationAvailable property.
         * 
         */
        public void setInformationAvailable(boolean value) {
            this.informationAvailable = value;
        }

        /**
         * Gets the value of the documents property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documents property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocuments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentDT }
         * 
         * 
         */
        public List<DocumentDT> getDocuments() {
            if (documents == null) {
                documents = new ArrayList<DocumentDT>();
            }
            return this.documents;
        }

    }


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
     *         &lt;element name="link" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="linkName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="linkTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="linkTarget" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
     *                   &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="linkType"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="Document"/&gt;
     *                         &lt;enumeration value="View"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
        "links"
    })
    public static class OtherLinks {

        @XmlElement(name = "link", required = true)
        protected List<HealthRecordOverviewResponse.OtherLinks.Link> links;

        /**
         * Gets the value of the links property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the links property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinks().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HealthRecordOverviewResponse.OtherLinks.Link }
         * 
         * 
         */
        public List<HealthRecordOverviewResponse.OtherLinks.Link> getLinks() {
            if (links == null) {
                links = new ArrayList<HealthRecordOverviewResponse.OtherLinks.Link>();
            }
            return this.links;
        }


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
         *         &lt;element name="linkName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="linkTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="linkTarget" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
         *         &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="linkType"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="Document"/&gt;
         *               &lt;enumeration value="View"/&gt;
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
            "linkName",
            "linkTitle",
            "linkTarget",
            "informationAvailable",
            "linkType"
        })
        public static class Link {

            @XmlElement(required = true)
            protected String linkName;
            @XmlElement(required = true)
            protected String linkTitle;
            @XmlSchemaType(name = "anyURI")
            protected String linkTarget;
            protected boolean informationAvailable;
            @XmlElement(required = true)
            protected String linkType;

            /**
             * Gets the value of the linkName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLinkName() {
                return linkName;
            }

            /**
             * Sets the value of the linkName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLinkName(String value) {
                this.linkName = value;
            }

            /**
             * Gets the value of the linkTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLinkTitle() {
                return linkTitle;
            }

            /**
             * Sets the value of the linkTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLinkTitle(String value) {
                this.linkTitle = value;
            }

            /**
             * Gets the value of the linkTarget property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLinkTarget() {
                return linkTarget;
            }

            /**
             * Sets the value of the linkTarget property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLinkTarget(String value) {
                this.linkTarget = value;
            }

            /**
             * Gets the value of the informationAvailable property.
             * 
             */
            public boolean isInformationAvailable() {
                return informationAvailable;
            }

            /**
             * Sets the value of the informationAvailable property.
             * 
             */
            public void setInformationAvailable(boolean value) {
                this.informationAvailable = value;
            }

            /**
             * Gets the value of the linkType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLinkType() {
                return linkType;
            }

            /**
             * Sets the value of the linkType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLinkType(String value) {
                this.linkType = value;
            }

        }

    }


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
     *         &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="document" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}documentDT" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "informationAvailable",
        "documents"
    })
    public static class RecentDocuments {

        protected boolean informationAvailable;
        @XmlElement(name = "document")
        protected List<DocumentDT> documents;

        /**
         * Gets the value of the informationAvailable property.
         * 
         */
        public boolean isInformationAvailable() {
            return informationAvailable;
        }

        /**
         * Sets the value of the informationAvailable property.
         * 
         */
        public void setInformationAvailable(boolean value) {
            this.informationAvailable = value;
        }

        /**
         * Gets the value of the documents property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documents property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocuments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentDT }
         * 
         * 
         */
        public List<DocumentDT> getDocuments() {
            if (documents == null) {
                documents = new ArrayList<DocumentDT>();
            }
            return this.documents;
        }

    }


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
     *         &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="sharedHealthSummaryAtomicData" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="cdaDocumentTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="shsAuthorName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}nameTypeDT"/&gt;
     *                   &lt;element name="shsAuthorId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="shsAuthorDesignation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
     *                   &lt;element name="shsAuthorOrgName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="shsAuthorOrgId"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="16"/&gt;
     *                         &lt;maxLength value="16"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="shsAuthorOrgAddress" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}addressTypeDT" minOccurs="0"/&gt;
     *                   &lt;element name="shsAuthorOrgContactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}contactDetailsDT" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="shsAuthorAddress" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}addressTypeDT" minOccurs="0"/&gt;
     *                   &lt;element name="shsAuthorContactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}contactDetailsDT" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="shsEntitlements" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="entitlement" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="entitlementNumberId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="entitlementType" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
     *                                       &lt;element name="entitlementEffectiveTime" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="shsAuthorQualifications" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
     *                   &lt;element name="medicinesList"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
     *                             &lt;element name="medicine" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="medicineTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
     *                                       &lt;element name="medicineDose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="medicineDesc" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="indication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="advReactionsList"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
     *                             &lt;element name="advReaction" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="advReactionCause" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
     *                                       &lt;element name="advReactionManifestation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                                       &lt;element name="advReactionType" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="immunisationList"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
     *                             &lt;element name="immunisation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="immunisationDate" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT"/&gt;
     *                                       &lt;element name="immunisationTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
     *                                       &lt;element name="immunisationSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="medHistoryList"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT" maxOccurs="3" minOccurs="3"/&gt;
     *                             &lt;element name="problemAndDiagnosis" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
     *                                       &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
     *                                       &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
     *                                       &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="procedure" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
     *                                       &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
     *                                       &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
     *                                       &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="otherMedicalHistory" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
     *                                       &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
     *                                       &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
     *                                       &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
        "informationAvailable",
        "sharedHealthSummaryAtomicData"
    })
    public static class SharedHealthSummary {

        protected boolean informationAvailable;
        protected HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData sharedHealthSummaryAtomicData;

        /**
         * Gets the value of the informationAvailable property.
         * 
         */
        public boolean isInformationAvailable() {
            return informationAvailable;
        }

        /**
         * Sets the value of the informationAvailable property.
         * 
         */
        public void setInformationAvailable(boolean value) {
            this.informationAvailable = value;
        }

        /**
         * Gets the value of the sharedHealthSummaryAtomicData property.
         * 
         * @return
         *     possible object is
         *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData }
         *     
         */
        public HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData getSharedHealthSummaryAtomicData() {
            return sharedHealthSummaryAtomicData;
        }

        /**
         * Sets the value of the sharedHealthSummaryAtomicData property.
         * 
         * @param value
         *     allowed object is
         *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData }
         *     
         */
        public void setSharedHealthSummaryAtomicData(HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData value) {
            this.sharedHealthSummaryAtomicData = value;
        }


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
         *         &lt;element name="documentDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="cdaDocumentTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="shsAuthorName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}nameTypeDT"/&gt;
         *         &lt;element name="shsAuthorId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="shsAuthorDesignation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
         *         &lt;element name="shsAuthorOrgName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="shsAuthorOrgId"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="16"/&gt;
         *               &lt;maxLength value="16"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="shsAuthorOrgAddress" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}addressTypeDT" minOccurs="0"/&gt;
         *         &lt;element name="shsAuthorOrgContactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}contactDetailsDT" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="shsAuthorAddress" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}addressTypeDT" minOccurs="0"/&gt;
         *         &lt;element name="shsAuthorContactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}contactDetailsDT" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="shsEntitlements" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="entitlement" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="entitlementNumberId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="entitlementType" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
         *                             &lt;element name="entitlementEffectiveTime" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="shsAuthorQualifications" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
         *         &lt;element name="medicinesList"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
         *                   &lt;element name="medicine" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="medicineTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
         *                             &lt;element name="medicineDose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="medicineDesc" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="indication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="advReactionsList"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
         *                   &lt;element name="advReaction" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="advReactionCause" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
         *                             &lt;element name="advReactionManifestation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                             &lt;element name="advReactionType" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="immunisationList"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
         *                   &lt;element name="immunisation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="immunisationDate" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT"/&gt;
         *                             &lt;element name="immunisationTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
         *                             &lt;element name="immunisationSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="medHistoryList"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT" maxOccurs="3" minOccurs="3"/&gt;
         *                   &lt;element name="problemAndDiagnosis" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
         *                             &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
         *                             &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
         *                             &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="procedure" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
         *                             &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
         *                             &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
         *                             &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="otherMedicalHistory" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
         *                             &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
         *                             &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
         *                             &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
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
            "documentDate",
            "cdaDocumentTitle",
            "shsAuthorName",
            "shsAuthorId",
            "shsAuthorDesignation",
            "shsAuthorOrgName",
            "shsAuthorOrgId",
            "shsAuthorOrgAddress",
            "shsAuthorOrgContactDetails",
            "shsAuthorAddress",
            "shsAuthorContactDetails",
            "shsEntitlements",
            "shsAuthorQualifications",
            "medicinesList",
            "advReactionsList",
            "immunisationList",
            "medHistoryList"
        })
        public static class SharedHealthSummaryAtomicData {

            @XmlElement(required = true)
            protected String documentDate;
            @XmlElement(required = true)
            protected String cdaDocumentTitle;
            @XmlElement(required = true)
            protected NameTypeDT shsAuthorName;
            @XmlElement(required = true)
            protected String shsAuthorId;
            @XmlElement(required = true)
            protected CodedType shsAuthorDesignation;
            @XmlElement(required = true)
            protected String shsAuthorOrgName;
            @XmlElement(required = true)
            protected String shsAuthorOrgId;
            protected AddressTypeDT shsAuthorOrgAddress;
            protected List<ContactDetailsDT> shsAuthorOrgContactDetails;
            protected AddressTypeDT shsAuthorAddress;
            protected List<ContactDetailsDT> shsAuthorContactDetails;
            protected HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements shsEntitlements;
            protected CodedType shsAuthorQualifications;
            @XmlElement(required = true)
            protected HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList medicinesList;
            @XmlElement(required = true)
            protected HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList advReactionsList;
            @XmlElement(required = true)
            protected HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList immunisationList;
            @XmlElement(required = true)
            protected HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList medHistoryList;

            /**
             * Gets the value of the documentDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentDate() {
                return documentDate;
            }

            /**
             * Sets the value of the documentDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentDate(String value) {
                this.documentDate = value;
            }

            /**
             * Gets the value of the cdaDocumentTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdaDocumentTitle() {
                return cdaDocumentTitle;
            }

            /**
             * Sets the value of the cdaDocumentTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdaDocumentTitle(String value) {
                this.cdaDocumentTitle = value;
            }

            /**
             * Gets the value of the shsAuthorName property.
             * 
             * @return
             *     possible object is
             *     {@link NameTypeDT }
             *     
             */
            public NameTypeDT getShsAuthorName() {
                return shsAuthorName;
            }

            /**
             * Sets the value of the shsAuthorName property.
             * 
             * @param value
             *     allowed object is
             *     {@link NameTypeDT }
             *     
             */
            public void setShsAuthorName(NameTypeDT value) {
                this.shsAuthorName = value;
            }

            /**
             * Gets the value of the shsAuthorId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShsAuthorId() {
                return shsAuthorId;
            }

            /**
             * Sets the value of the shsAuthorId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShsAuthorId(String value) {
                this.shsAuthorId = value;
            }

            /**
             * Gets the value of the shsAuthorDesignation property.
             * 
             * @return
             *     possible object is
             *     {@link CodedType }
             *     
             */
            public CodedType getShsAuthorDesignation() {
                return shsAuthorDesignation;
            }

            /**
             * Sets the value of the shsAuthorDesignation property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedType }
             *     
             */
            public void setShsAuthorDesignation(CodedType value) {
                this.shsAuthorDesignation = value;
            }

            /**
             * Gets the value of the shsAuthorOrgName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShsAuthorOrgName() {
                return shsAuthorOrgName;
            }

            /**
             * Sets the value of the shsAuthorOrgName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShsAuthorOrgName(String value) {
                this.shsAuthorOrgName = value;
            }

            /**
             * Gets the value of the shsAuthorOrgId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShsAuthorOrgId() {
                return shsAuthorOrgId;
            }

            /**
             * Sets the value of the shsAuthorOrgId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShsAuthorOrgId(String value) {
                this.shsAuthorOrgId = value;
            }

            /**
             * Gets the value of the shsAuthorOrgAddress property.
             * 
             * @return
             *     possible object is
             *     {@link AddressTypeDT }
             *     
             */
            public AddressTypeDT getShsAuthorOrgAddress() {
                return shsAuthorOrgAddress;
            }

            /**
             * Sets the value of the shsAuthorOrgAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressTypeDT }
             *     
             */
            public void setShsAuthorOrgAddress(AddressTypeDT value) {
                this.shsAuthorOrgAddress = value;
            }

            /**
             * Gets the value of the shsAuthorOrgContactDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the shsAuthorOrgContactDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getShsAuthorOrgContactDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ContactDetailsDT }
             * 
             * 
             */
            public List<ContactDetailsDT> getShsAuthorOrgContactDetails() {
                if (shsAuthorOrgContactDetails == null) {
                    shsAuthorOrgContactDetails = new ArrayList<ContactDetailsDT>();
                }
                return this.shsAuthorOrgContactDetails;
            }

            /**
             * Gets the value of the shsAuthorAddress property.
             * 
             * @return
             *     possible object is
             *     {@link AddressTypeDT }
             *     
             */
            public AddressTypeDT getShsAuthorAddress() {
                return shsAuthorAddress;
            }

            /**
             * Sets the value of the shsAuthorAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressTypeDT }
             *     
             */
            public void setShsAuthorAddress(AddressTypeDT value) {
                this.shsAuthorAddress = value;
            }

            /**
             * Gets the value of the shsAuthorContactDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the shsAuthorContactDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getShsAuthorContactDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ContactDetailsDT }
             * 
             * 
             */
            public List<ContactDetailsDT> getShsAuthorContactDetails() {
                if (shsAuthorContactDetails == null) {
                    shsAuthorContactDetails = new ArrayList<ContactDetailsDT>();
                }
                return this.shsAuthorContactDetails;
            }

            /**
             * Gets the value of the shsEntitlements property.
             * 
             * @return
             *     possible object is
             *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements }
             *     
             */
            public HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements getShsEntitlements() {
                return shsEntitlements;
            }

            /**
             * Sets the value of the shsEntitlements property.
             * 
             * @param value
             *     allowed object is
             *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements }
             *     
             */
            public void setShsEntitlements(HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements value) {
                this.shsEntitlements = value;
            }

            /**
             * Gets the value of the shsAuthorQualifications property.
             * 
             * @return
             *     possible object is
             *     {@link CodedType }
             *     
             */
            public CodedType getShsAuthorQualifications() {
                return shsAuthorQualifications;
            }

            /**
             * Sets the value of the shsAuthorQualifications property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedType }
             *     
             */
            public void setShsAuthorQualifications(CodedType value) {
                this.shsAuthorQualifications = value;
            }

            /**
             * Gets the value of the medicinesList property.
             * 
             * @return
             *     possible object is
             *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList }
             *     
             */
            public HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList getMedicinesList() {
                return medicinesList;
            }

            /**
             * Sets the value of the medicinesList property.
             * 
             * @param value
             *     allowed object is
             *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList }
             *     
             */
            public void setMedicinesList(HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList value) {
                this.medicinesList = value;
            }

            /**
             * Gets the value of the advReactionsList property.
             * 
             * @return
             *     possible object is
             *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList }
             *     
             */
            public HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList getAdvReactionsList() {
                return advReactionsList;
            }

            /**
             * Sets the value of the advReactionsList property.
             * 
             * @param value
             *     allowed object is
             *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList }
             *     
             */
            public void setAdvReactionsList(HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList value) {
                this.advReactionsList = value;
            }

            /**
             * Gets the value of the immunisationList property.
             * 
             * @return
             *     possible object is
             *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList }
             *     
             */
            public HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList getImmunisationList() {
                return immunisationList;
            }

            /**
             * Sets the value of the immunisationList property.
             * 
             * @param value
             *     allowed object is
             *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList }
             *     
             */
            public void setImmunisationList(HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList value) {
                this.immunisationList = value;
            }

            /**
             * Gets the value of the medHistoryList property.
             * 
             * @return
             *     possible object is
             *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList }
             *     
             */
            public HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList getMedHistoryList() {
                return medHistoryList;
            }

            /**
             * Sets the value of the medHistoryList property.
             * 
             * @param value
             *     allowed object is
             *     {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList }
             *     
             */
            public void setMedHistoryList(HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList value) {
                this.medHistoryList = value;
            }


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
             *         &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
             *         &lt;element name="advReaction" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="advReactionCause" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
             *                   &lt;element name="advReactionManifestation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *                   &lt;element name="advReactionType" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
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
                "informationAvailable",
                "advReactions"
            })
            public static class AdvReactionsList {

                @XmlElement(required = true)
                protected InformationAvailableDT informationAvailable;
                @XmlElement(name = "advReaction")
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList.AdvReaction> advReactions;

                /**
                 * Gets the value of the informationAvailable property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InformationAvailableDT }
                 *     
                 */
                public InformationAvailableDT getInformationAvailable() {
                    return informationAvailable;
                }

                /**
                 * Sets the value of the informationAvailable property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InformationAvailableDT }
                 *     
                 */
                public void setInformationAvailable(InformationAvailableDT value) {
                    this.informationAvailable = value;
                }

                /**
                 * Gets the value of the advReactions property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the advReactions property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAdvReactions().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList.AdvReaction }
                 * 
                 * 
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList.AdvReaction> getAdvReactions() {
                    if (advReactions == null) {
                        advReactions = new ArrayList<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList.AdvReaction>();
                    }
                    return this.advReactions;
                }


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
                 *         &lt;element name="advReactionCause" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
                 *         &lt;element name="advReactionManifestation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" maxOccurs="unbounded" minOccurs="0"/&gt;
                 *         &lt;element name="advReactionType" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
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
                    "advReactionCause",
                    "advReactionManifestations",
                    "advReactionType"
                })
                public static class AdvReaction {

                    @XmlElement(required = true)
                    protected CodedType advReactionCause;
                    @XmlElement(name = "advReactionManifestation")
                    protected List<CodedType> advReactionManifestations;
                    protected CodedType advReactionType;

                    /**
                     * Gets the value of the advReactionCause property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodedType }
                     *     
                     */
                    public CodedType getAdvReactionCause() {
                        return advReactionCause;
                    }

                    /**
                     * Sets the value of the advReactionCause property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodedType }
                     *     
                     */
                    public void setAdvReactionCause(CodedType value) {
                        this.advReactionCause = value;
                    }

                    /**
                     * Gets the value of the advReactionManifestations property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the advReactionManifestations property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAdvReactionManifestations().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link CodedType }
                     * 
                     * 
                     */
                    public List<CodedType> getAdvReactionManifestations() {
                        if (advReactionManifestations == null) {
                            advReactionManifestations = new ArrayList<CodedType>();
                        }
                        return this.advReactionManifestations;
                    }

                    /**
                     * Gets the value of the advReactionType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodedType }
                     *     
                     */
                    public CodedType getAdvReactionType() {
                        return advReactionType;
                    }

                    /**
                     * Sets the value of the advReactionType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodedType }
                     *     
                     */
                    public void setAdvReactionType(CodedType value) {
                        this.advReactionType = value;
                    }

                }

            }


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
             *         &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
             *         &lt;element name="immunisation" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="immunisationDate" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT"/&gt;
             *                   &lt;element name="immunisationTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
             *                   &lt;element name="immunisationSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
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
                "informationAvailable",
                "immunisations"
            })
            public static class ImmunisationList {

                @XmlElement(required = true)
                protected InformationAvailableDT informationAvailable;
                @XmlElement(name = "immunisation")
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList.Immunisation> immunisations;

                /**
                 * Gets the value of the informationAvailable property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InformationAvailableDT }
                 *     
                 */
                public InformationAvailableDT getInformationAvailable() {
                    return informationAvailable;
                }

                /**
                 * Sets the value of the informationAvailable property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InformationAvailableDT }
                 *     
                 */
                public void setInformationAvailable(InformationAvailableDT value) {
                    this.informationAvailable = value;
                }

                /**
                 * Gets the value of the immunisations property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the immunisations property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getImmunisations().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList.Immunisation }
                 * 
                 * 
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList.Immunisation> getImmunisations() {
                    if (immunisations == null) {
                        immunisations = new ArrayList<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList.Immunisation>();
                    }
                    return this.immunisations;
                }


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
                 *         &lt;element name="immunisationDate" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT"/&gt;
                 *         &lt;element name="immunisationTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
                 *         &lt;element name="immunisationSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
                    "immunisationDate",
                    "immunisationTitle",
                    "immunisationSequenceNumber"
                })
                public static class Immunisation {

                    @XmlElement(required = true)
                    protected TimeStampDT immunisationDate;
                    @XmlElement(required = true)
                    protected CodedType immunisationTitle;
                    protected Integer immunisationSequenceNumber;

                    /**
                     * Gets the value of the immunisationDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public TimeStampDT getImmunisationDate() {
                        return immunisationDate;
                    }

                    /**
                     * Sets the value of the immunisationDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public void setImmunisationDate(TimeStampDT value) {
                        this.immunisationDate = value;
                    }

                    /**
                     * Gets the value of the immunisationTitle property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodedType }
                     *     
                     */
                    public CodedType getImmunisationTitle() {
                        return immunisationTitle;
                    }

                    /**
                     * Sets the value of the immunisationTitle property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodedType }
                     *     
                     */
                    public void setImmunisationTitle(CodedType value) {
                        this.immunisationTitle = value;
                    }

                    /**
                     * Gets the value of the immunisationSequenceNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getImmunisationSequenceNumber() {
                        return immunisationSequenceNumber;
                    }

                    /**
                     * Sets the value of the immunisationSequenceNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setImmunisationSequenceNumber(Integer value) {
                        this.immunisationSequenceNumber = value;
                    }

                }

            }


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
             *         &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT" maxOccurs="3" minOccurs="3"/&gt;
             *         &lt;element name="problemAndDiagnosis" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
             *                   &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
             *                   &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
             *                   &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="procedure" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
             *                   &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
             *                   &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
             *                   &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="otherMedicalHistory" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
             *                   &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
             *                   &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
             *                   &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
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
                "informationAvailables",
                "problemAndDiagnosises",
                "procedures",
                "otherMedicalHistories"
            })
            public static class MedHistoryList {

                @XmlElement(name = "informationAvailable", required = true)
                protected List<InformationAvailableDT> informationAvailables;
                @XmlElement(name = "problemAndDiagnosis")
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.ProblemAndDiagnosis> problemAndDiagnosises;
                @XmlElement(name = "procedure")
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.Procedure> procedures;
                @XmlElement(name = "otherMedicalHistory")
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.OtherMedicalHistory> otherMedicalHistories;

                /**
                 * Gets the value of the informationAvailables property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the informationAvailables property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInformationAvailables().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InformationAvailableDT }
                 * 
                 * 
                 */
                public List<InformationAvailableDT> getInformationAvailables() {
                    if (informationAvailables == null) {
                        informationAvailables = new ArrayList<InformationAvailableDT>();
                    }
                    return this.informationAvailables;
                }

                /**
                 * Gets the value of the problemAndDiagnosises property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the problemAndDiagnosises property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProblemAndDiagnosises().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.ProblemAndDiagnosis }
                 * 
                 * 
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.ProblemAndDiagnosis> getProblemAndDiagnosises() {
                    if (problemAndDiagnosises == null) {
                        problemAndDiagnosises = new ArrayList<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.ProblemAndDiagnosis>();
                    }
                    return this.problemAndDiagnosises;
                }

                /**
                 * Gets the value of the procedures property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the procedures property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcedures().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.Procedure }
                 * 
                 * 
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.Procedure> getProcedures() {
                    if (procedures == null) {
                        procedures = new ArrayList<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.Procedure>();
                    }
                    return this.procedures;
                }

                /**
                 * Gets the value of the otherMedicalHistories property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the otherMedicalHistories property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOtherMedicalHistories().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.OtherMedicalHistory }
                 * 
                 * 
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.OtherMedicalHistory> getOtherMedicalHistories() {
                    if (otherMedicalHistories == null) {
                        otherMedicalHistories = new ArrayList<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.OtherMedicalHistory>();
                    }
                    return this.otherMedicalHistories;
                }


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
                 *         &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
                 *         &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
                 *         &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
                 *         &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "medTitle",
                    "medDateO",
                    "medDateR",
                    "medComment"
                })
                public static class OtherMedicalHistory {

                    @XmlElement(required = true)
                    protected CodedType medTitle;
                    protected TimeStampDT medDateO;
                    protected TimeStampDT medDateR;
                    protected String medComment;

                    /**
                     * Gets the value of the medTitle property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodedType }
                     *     
                     */
                    public CodedType getMedTitle() {
                        return medTitle;
                    }

                    /**
                     * Sets the value of the medTitle property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodedType }
                     *     
                     */
                    public void setMedTitle(CodedType value) {
                        this.medTitle = value;
                    }

                    /**
                     * Gets the value of the medDateO property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public TimeStampDT getMedDateO() {
                        return medDateO;
                    }

                    /**
                     * Sets the value of the medDateO property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public void setMedDateO(TimeStampDT value) {
                        this.medDateO = value;
                    }

                    /**
                     * Gets the value of the medDateR property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public TimeStampDT getMedDateR() {
                        return medDateR;
                    }

                    /**
                     * Sets the value of the medDateR property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public void setMedDateR(TimeStampDT value) {
                        this.medDateR = value;
                    }

                    /**
                     * Gets the value of the medComment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMedComment() {
                        return medComment;
                    }

                    /**
                     * Sets the value of the medComment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMedComment(String value) {
                        this.medComment = value;
                    }

                }


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
                 *         &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
                 *         &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
                 *         &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
                 *         &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "medTitle",
                    "medDateO",
                    "medDateR",
                    "medComment"
                })
                public static class ProblemAndDiagnosis {

                    @XmlElement(required = true)
                    protected CodedType medTitle;
                    protected TimeStampDT medDateO;
                    protected TimeStampDT medDateR;
                    protected String medComment;

                    /**
                     * Gets the value of the medTitle property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodedType }
                     *     
                     */
                    public CodedType getMedTitle() {
                        return medTitle;
                    }

                    /**
                     * Sets the value of the medTitle property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodedType }
                     *     
                     */
                    public void setMedTitle(CodedType value) {
                        this.medTitle = value;
                    }

                    /**
                     * Gets the value of the medDateO property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public TimeStampDT getMedDateO() {
                        return medDateO;
                    }

                    /**
                     * Sets the value of the medDateO property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public void setMedDateO(TimeStampDT value) {
                        this.medDateO = value;
                    }

                    /**
                     * Gets the value of the medDateR property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public TimeStampDT getMedDateR() {
                        return medDateR;
                    }

                    /**
                     * Sets the value of the medDateR property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public void setMedDateR(TimeStampDT value) {
                        this.medDateR = value;
                    }

                    /**
                     * Gets the value of the medComment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMedComment() {
                        return medComment;
                    }

                    /**
                     * Sets the value of the medComment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMedComment(String value) {
                        this.medComment = value;
                    }

                }


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
                 *         &lt;element name="medTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
                 *         &lt;element name="medDateO" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
                 *         &lt;element name="medDateR" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
                 *         &lt;element name="medComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    "medTitle",
                    "medDateO",
                    "medDateR",
                    "medComment"
                })
                public static class Procedure {

                    @XmlElement(required = true)
                    protected CodedType medTitle;
                    protected TimeStampDT medDateO;
                    protected TimeStampDT medDateR;
                    protected String medComment;

                    /**
                     * Gets the value of the medTitle property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodedType }
                     *     
                     */
                    public CodedType getMedTitle() {
                        return medTitle;
                    }

                    /**
                     * Sets the value of the medTitle property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodedType }
                     *     
                     */
                    public void setMedTitle(CodedType value) {
                        this.medTitle = value;
                    }

                    /**
                     * Gets the value of the medDateO property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public TimeStampDT getMedDateO() {
                        return medDateO;
                    }

                    /**
                     * Sets the value of the medDateO property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public void setMedDateO(TimeStampDT value) {
                        this.medDateO = value;
                    }

                    /**
                     * Gets the value of the medDateR property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public TimeStampDT getMedDateR() {
                        return medDateR;
                    }

                    /**
                     * Sets the value of the medDateR property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public void setMedDateR(TimeStampDT value) {
                        this.medDateR = value;
                    }

                    /**
                     * Gets the value of the medComment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMedComment() {
                        return medComment;
                    }

                    /**
                     * Sets the value of the medComment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMedComment(String value) {
                        this.medComment = value;
                    }

                }

            }


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
             *         &lt;element name="informationAvailable" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}informationAvailableDT"/&gt;
             *         &lt;element name="medicine" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="medicineTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
             *                   &lt;element name="medicineDose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="medicineDesc" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="indication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
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
                "informationAvailable",
                "medicines"
            })
            public static class MedicinesList {

                @XmlElement(required = true)
                protected InformationAvailableDT informationAvailable;
                @XmlElement(name = "medicine")
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine> medicines;

                /**
                 * Gets the value of the informationAvailable property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InformationAvailableDT }
                 *     
                 */
                public InformationAvailableDT getInformationAvailable() {
                    return informationAvailable;
                }

                /**
                 * Sets the value of the informationAvailable property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InformationAvailableDT }
                 *     
                 */
                public void setInformationAvailable(InformationAvailableDT value) {
                    this.informationAvailable = value;
                }

                /**
                 * Gets the value of the medicines property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the medicines property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMedicines().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine }
                 * 
                 * 
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine> getMedicines() {
                    if (medicines == null) {
                        medicines = new ArrayList<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine>();
                    }
                    return this.medicines;
                }


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
                 *         &lt;element name="medicineTitle" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
                 *         &lt;element name="medicineDose" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="medicineDesc" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="indication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
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
                    "medicineTitle",
                    "medicineDose",
                    "medicineDescs"
                })
                public static class Medicine {

                    @XmlElement(required = true)
                    protected CodedType medicineTitle;
                    @XmlElement(required = true)
                    protected String medicineDose;
                    @XmlElement(name = "medicineDesc")
                    protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine.MedicineDesc> medicineDescs;

                    /**
                     * Gets the value of the medicineTitle property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodedType }
                     *     
                     */
                    public CodedType getMedicineTitle() {
                        return medicineTitle;
                    }

                    /**
                     * Sets the value of the medicineTitle property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodedType }
                     *     
                     */
                    public void setMedicineTitle(CodedType value) {
                        this.medicineTitle = value;
                    }

                    /**
                     * Gets the value of the medicineDose property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMedicineDose() {
                        return medicineDose;
                    }

                    /**
                     * Sets the value of the medicineDose property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMedicineDose(String value) {
                        this.medicineDose = value;
                    }

                    /**
                     * Gets the value of the medicineDescs property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the medicineDescs property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMedicineDescs().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine.MedicineDesc }
                     * 
                     * 
                     */
                    public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine.MedicineDesc> getMedicineDescs() {
                        if (medicineDescs == null) {
                            medicineDescs = new ArrayList<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine.MedicineDesc>();
                        }
                        return this.medicineDescs;
                    }


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
                     *         &lt;element name="indication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                        "indication",
                        "comment"
                    })
                    public static class MedicineDesc {

                        protected String indication;
                        protected String comment;

                        /**
                         * Gets the value of the indication property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIndication() {
                            return indication;
                        }

                        /**
                         * Sets the value of the indication property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIndication(String value) {
                            this.indication = value;
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

                }

            }


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
             *         &lt;element name="entitlement" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="entitlementNumberId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="entitlementType" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
             *                   &lt;element name="entitlementEffectiveTime" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
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
                "entitlements"
            })
            public static class ShsEntitlements {

                @XmlElement(name = "entitlement")
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements.Entitlement> entitlements;

                /**
                 * Gets the value of the entitlements property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the entitlements property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEntitlements().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements.Entitlement }
                 * 
                 * 
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements.Entitlement> getEntitlements() {
                    if (entitlements == null) {
                        entitlements = new ArrayList<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements.Entitlement>();
                    }
                    return this.entitlements;
                }


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
                 *         &lt;element name="entitlementNumberId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="entitlementType" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
                 *         &lt;element name="entitlementEffectiveTime" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}timeStampDT" minOccurs="0"/&gt;
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
                    "entitlementNumberId",
                    "entitlementType",
                    "entitlementEffectiveTime"
                })
                public static class Entitlement {

                    @XmlElement(required = true)
                    protected String entitlementNumberId;
                    @XmlElement(required = true)
                    protected CodedType entitlementType;
                    protected TimeStampDT entitlementEffectiveTime;

                    /**
                     * Gets the value of the entitlementNumberId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEntitlementNumberId() {
                        return entitlementNumberId;
                    }

                    /**
                     * Sets the value of the entitlementNumberId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEntitlementNumberId(String value) {
                        this.entitlementNumberId = value;
                    }

                    /**
                     * Gets the value of the entitlementType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodedType }
                     *     
                     */
                    public CodedType getEntitlementType() {
                        return entitlementType;
                    }

                    /**
                     * Sets the value of the entitlementType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodedType }
                     *     
                     */
                    public void setEntitlementType(CodedType value) {
                        this.entitlementType = value;
                    }

                    /**
                     * Gets the value of the entitlementEffectiveTime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public TimeStampDT getEntitlementEffectiveTime() {
                        return entitlementEffectiveTime;
                    }

                    /**
                     * Sets the value of the entitlementEffectiveTime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TimeStampDT }
                     *     
                     */
                    public void setEntitlementEffectiveTime(TimeStampDT value) {
                        this.entitlementEffectiveTime = value;
                    }

                }

            }

        }

    }


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
     *         &lt;element name="individualProfile"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/&gt;
     *                   &lt;element name="individual" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"/&gt;
     *                   &lt;element name="indigenousStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="veteranAndADFStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="viewParameters"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="clinicalSynopsisLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="viewVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
        "individualProfile",
        "viewParameters"
    })
    public static class ViewMetadata {

        @XmlElement(required = true)
        protected HealthRecordOverviewResponse.ViewMetadata.IndividualProfile individualProfile;
        @XmlElement(required = true)
        protected HealthRecordOverviewResponse.ViewMetadata.ViewParameters viewParameters;

        /**
         * Gets the value of the individualProfile property.
         * 
         * @return
         *     possible object is
         *     {@link HealthRecordOverviewResponse.ViewMetadata.IndividualProfile }
         *     
         */
        public HealthRecordOverviewResponse.ViewMetadata.IndividualProfile getIndividualProfile() {
            return individualProfile;
        }

        /**
         * Sets the value of the individualProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link HealthRecordOverviewResponse.ViewMetadata.IndividualProfile }
         *     
         */
        public void setIndividualProfile(HealthRecordOverviewResponse.ViewMetadata.IndividualProfile value) {
            this.individualProfile = value;
        }

        /**
         * Gets the value of the viewParameters property.
         * 
         * @return
         *     possible object is
         *     {@link HealthRecordOverviewResponse.ViewMetadata.ViewParameters }
         *     
         */
        public HealthRecordOverviewResponse.ViewMetadata.ViewParameters getViewParameters() {
            return viewParameters;
        }

        /**
         * Sets the value of the viewParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link HealthRecordOverviewResponse.ViewMetadata.ViewParameters }
         *     
         */
        public void setViewParameters(HealthRecordOverviewResponse.ViewMetadata.ViewParameters value) {
            this.viewParameters = value;
        }


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
         *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/&gt;
         *         &lt;element name="individual" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"/&gt;
         *         &lt;element name="indigenousStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="veteranAndADFStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "ihiNumber",
            "individual",
            "indigenousStatus",
            "veteranAndADFStatus"
        })
        public static class IndividualProfile {

            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", required = true)
            protected String ihiNumber;
            @XmlElement(required = true)
            protected IndividualTypeSupp individual;
            protected String indigenousStatus;
            protected String veteranAndADFStatus;

            /**
             * Gets the value of the ihiNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIhiNumber() {
                return ihiNumber;
            }

            /**
             * Sets the value of the ihiNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIhiNumber(String value) {
                this.ihiNumber = value;
            }

            /**
             * Gets the value of the individual property.
             * 
             * @return
             *     possible object is
             *     {@link IndividualTypeSupp }
             *     
             */
            public IndividualTypeSupp getIndividual() {
                return individual;
            }

            /**
             * Sets the value of the individual property.
             * 
             * @param value
             *     allowed object is
             *     {@link IndividualTypeSupp }
             *     
             */
            public void setIndividual(IndividualTypeSupp value) {
                this.individual = value;
            }

            /**
             * Gets the value of the indigenousStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndigenousStatus() {
                return indigenousStatus;
            }

            /**
             * Sets the value of the indigenousStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndigenousStatus(String value) {
                this.indigenousStatus = value;
            }

            /**
             * Gets the value of the veteranAndADFStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVeteranAndADFStatus() {
                return veteranAndADFStatus;
            }

            /**
             * Sets the value of the veteranAndADFStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVeteranAndADFStatus(String value) {
                this.veteranAndADFStatus = value;
            }

        }


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
         *         &lt;element name="clinicalSynopsisLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="viewVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "clinicalSynopsisLength",
            "viewVersionNumber"
        })
        public static class ViewParameters {

            protected int clinicalSynopsisLength;
            @XmlElement(required = true)
            protected String viewVersionNumber;

            /**
             * Gets the value of the clinicalSynopsisLength property.
             * 
             */
            public int getClinicalSynopsisLength() {
                return clinicalSynopsisLength;
            }

            /**
             * Sets the value of the clinicalSynopsisLength property.
             * 
             */
            public void setClinicalSynopsisLength(int value) {
                this.clinicalSynopsisLength = value;
            }

            /**
             * Gets the value of the viewVersionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getViewVersionNumber() {
                return viewVersionNumber;
            }

            /**
             * Sets the value of the viewVersionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setViewVersionNumber(String value) {
                this.viewVersionNumber = value;
            }

        }

    }

}
