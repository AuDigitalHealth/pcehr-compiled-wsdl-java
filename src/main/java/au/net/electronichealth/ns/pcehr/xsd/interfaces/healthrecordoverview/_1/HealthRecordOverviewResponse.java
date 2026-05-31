
package au.net.electronichealth.ns.pcehr.xsd.interfaces.healthrecordoverview._1;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.IndividualTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.AddressTypeDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.CodedType;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.ContactDetailsDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.DocumentDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.InformationAvailableDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.NameTypeDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.TimeStampDT;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
        "document"
    })
    public static class NewDocuments {

        protected boolean informationAvailable;
        protected List<DocumentDT> document;

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
         * {@link DocumentDT }
         * </p>
         * 
         * 
         * @return
         *     The value of the document property.
         */
        public List<DocumentDT> getDocument() {
            if (document == null) {
                document = new ArrayList<>();
            }
            return this.document;
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
        "link"
    })
    public static class OtherLinks {

        @XmlElement(required = true)
        protected List<HealthRecordOverviewResponse.OtherLinks.Link> link;

        /**
         * Gets the value of the link property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the link property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HealthRecordOverviewResponse.OtherLinks.Link }
         * </p>
         * 
         * 
         * @return
         *     The value of the link property.
         */
        public List<HealthRecordOverviewResponse.OtherLinks.Link> getLink() {
            if (link == null) {
                link = new ArrayList<>();
            }
            return this.link;
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
        "document"
    })
    public static class RecentDocuments {

        protected boolean informationAvailable;
        protected List<DocumentDT> document;

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
         * {@link DocumentDT }
         * </p>
         * 
         * 
         * @return
         *     The value of the document property.
         */
        public List<DocumentDT> getDocument() {
            if (document == null) {
                document = new ArrayList<>();
            }
            return this.document;
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
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the shsAuthorOrgContactDetails property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getShsAuthorOrgContactDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ContactDetailsDT }
             * </p>
             * 
             * 
             * @return
             *     The value of the shsAuthorOrgContactDetails property.
             */
            public List<ContactDetailsDT> getShsAuthorOrgContactDetails() {
                if (shsAuthorOrgContactDetails == null) {
                    shsAuthorOrgContactDetails = new ArrayList<>();
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
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the shsAuthorContactDetails property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getShsAuthorContactDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ContactDetailsDT }
             * </p>
             * 
             * 
             * @return
             *     The value of the shsAuthorContactDetails property.
             */
            public List<ContactDetailsDT> getShsAuthorContactDetails() {
                if (shsAuthorContactDetails == null) {
                    shsAuthorContactDetails = new ArrayList<>();
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
                "advReaction"
            })
            public static class AdvReactionsList {

                @XmlElement(required = true)
                protected InformationAvailableDT informationAvailable;
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList.AdvReaction> advReaction;

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
                 * Gets the value of the advReaction property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the advReaction property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getAdvReaction().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList.AdvReaction }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the advReaction property.
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.AdvReactionsList.AdvReaction> getAdvReaction() {
                    if (advReaction == null) {
                        advReaction = new ArrayList<>();
                    }
                    return this.advReaction;
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
                    "advReactionManifestation",
                    "advReactionType"
                })
                public static class AdvReaction {

                    @XmlElement(required = true)
                    protected CodedType advReactionCause;
                    protected List<CodedType> advReactionManifestation;
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
                     * Gets the value of the advReactionManifestation property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the Jakarta XML Binding object.
                     * This is why there is not a {@code set} method for the advReactionManifestation property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getAdvReactionManifestation().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link CodedType }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the advReactionManifestation property.
                     */
                    public List<CodedType> getAdvReactionManifestation() {
                        if (advReactionManifestation == null) {
                            advReactionManifestation = new ArrayList<>();
                        }
                        return this.advReactionManifestation;
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
                "immunisation"
            })
            public static class ImmunisationList {

                @XmlElement(required = true)
                protected InformationAvailableDT informationAvailable;
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList.Immunisation> immunisation;

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
                 * Gets the value of the immunisation property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the immunisation property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getImmunisation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList.Immunisation }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the immunisation property.
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ImmunisationList.Immunisation> getImmunisation() {
                    if (immunisation == null) {
                        immunisation = new ArrayList<>();
                    }
                    return this.immunisation;
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
                "informationAvailable",
                "problemAndDiagnosis",
                "procedure",
                "otherMedicalHistory"
            })
            public static class MedHistoryList {

                @XmlElement(required = true)
                protected List<InformationAvailableDT> informationAvailable;
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.ProblemAndDiagnosis> problemAndDiagnosis;
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.Procedure> procedure;
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.OtherMedicalHistory> otherMedicalHistory;

                /**
                 * Gets the value of the informationAvailable property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the informationAvailable property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getInformationAvailable().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InformationAvailableDT }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the informationAvailable property.
                 */
                public List<InformationAvailableDT> getInformationAvailable() {
                    if (informationAvailable == null) {
                        informationAvailable = new ArrayList<>();
                    }
                    return this.informationAvailable;
                }

                /**
                 * Gets the value of the problemAndDiagnosis property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the problemAndDiagnosis property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getProblemAndDiagnosis().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.ProblemAndDiagnosis }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the problemAndDiagnosis property.
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.ProblemAndDiagnosis> getProblemAndDiagnosis() {
                    if (problemAndDiagnosis == null) {
                        problemAndDiagnosis = new ArrayList<>();
                    }
                    return this.problemAndDiagnosis;
                }

                /**
                 * Gets the value of the procedure property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the procedure property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getProcedure().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.Procedure }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the procedure property.
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.Procedure> getProcedure() {
                    if (procedure == null) {
                        procedure = new ArrayList<>();
                    }
                    return this.procedure;
                }

                /**
                 * Gets the value of the otherMedicalHistory property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the otherMedicalHistory property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getOtherMedicalHistory().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.OtherMedicalHistory }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the otherMedicalHistory property.
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedHistoryList.OtherMedicalHistory> getOtherMedicalHistory() {
                    if (otherMedicalHistory == null) {
                        otherMedicalHistory = new ArrayList<>();
                    }
                    return this.otherMedicalHistory;
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
                "medicine"
            })
            public static class MedicinesList {

                @XmlElement(required = true)
                protected InformationAvailableDT informationAvailable;
                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine> medicine;

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
                 * Gets the value of the medicine property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the medicine property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getMedicine().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the medicine property.
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine> getMedicine() {
                    if (medicine == null) {
                        medicine = new ArrayList<>();
                    }
                    return this.medicine;
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
                    "medicineDesc"
                })
                public static class Medicine {

                    @XmlElement(required = true)
                    protected CodedType medicineTitle;
                    @XmlElement(required = true)
                    protected String medicineDose;
                    protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine.MedicineDesc> medicineDesc;

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
                     * Gets the value of the medicineDesc property.
                     * 
                     * <p>This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the Jakarta XML Binding object.
                     * This is why there is not a {@code set} method for the medicineDesc property.</p>
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * </p>
                     * <pre>
                     * getMedicineDesc().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine.MedicineDesc }
                     * </p>
                     * 
                     * 
                     * @return
                     *     The value of the medicineDesc property.
                     */
                    public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.MedicinesList.Medicine.MedicineDesc> getMedicineDesc() {
                        if (medicineDesc == null) {
                            medicineDesc = new ArrayList<>();
                        }
                        return this.medicineDesc;
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
                "entitlement"
            })
            public static class ShsEntitlements {

                protected List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements.Entitlement> entitlement;

                /**
                 * Gets the value of the entitlement property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the entitlement property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getEntitlement().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements.Entitlement }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the entitlement property.
                 */
                public List<HealthRecordOverviewResponse.SharedHealthSummary.SharedHealthSummaryAtomicData.ShsEntitlements.Entitlement> getEntitlement() {
                    if (entitlement == null) {
                        entitlement = new ArrayList<>();
                    }
                    return this.entitlement;
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
