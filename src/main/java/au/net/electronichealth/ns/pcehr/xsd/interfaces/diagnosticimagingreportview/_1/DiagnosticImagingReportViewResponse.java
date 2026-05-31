
package au.net.electronichealth.ns.pcehr.xsd.interfaces.diagnosticimagingreportview._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.IndividualTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.CodedType;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.DiagnosticReportInformationDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.ProviderInformationDT;
import au.net.electronichealth.ns.pcehr.xsd.view.viewcommontype._1.RequesterInformationDT;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for diagnosticImagingReportViewResponse complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="diagnosticImagingReportViewResponse"&gt;
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
 *                             &lt;element name="dateFromFilter" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="dateToFilter" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="viewVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="diagnosticImagingReport" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dateAvailableToConsumer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="reportInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}diagnosticReportInformationDT"/&gt;
 *                   &lt;element name="clinicalDocumentAuthor" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}providerInformationDT"/&gt;
 *                   &lt;element name="reportingRadiologistInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}providerInformationDT"/&gt;
 *                   &lt;element name="imagingRequesterInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}requesterInformationDT"/&gt;
 *                   &lt;element name="imagingExaminationResult" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="imagingServiceDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="examinationResultName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *                             &lt;element name="modality" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *                             &lt;element name="anatomicalSiteDetails" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="anatomicalRegion" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
 *                                       &lt;element name="anatomicalLocation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="anatomicalLocationName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
 *                                                 &lt;element name="laterality" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
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
 *                             &lt;element name="overallTestResultStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
 *                             &lt;element name="imageLocationInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "diagnosticImagingReportViewResponse", propOrder = {
    "viewMetadata",
    "diagnosticImagingReport"
})
public class DiagnosticImagingReportViewResponse {

    @XmlElement(required = true)
    protected DiagnosticImagingReportViewResponse.ViewMetadata viewMetadata;
    protected List<DiagnosticImagingReportViewResponse.DiagnosticImagingReport> diagnosticImagingReport;

    /**
     * Gets the value of the viewMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticImagingReportViewResponse.ViewMetadata }
     *     
     */
    public DiagnosticImagingReportViewResponse.ViewMetadata getViewMetadata() {
        return viewMetadata;
    }

    /**
     * Sets the value of the viewMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticImagingReportViewResponse.ViewMetadata }
     *     
     */
    public void setViewMetadata(DiagnosticImagingReportViewResponse.ViewMetadata value) {
        this.viewMetadata = value;
    }

    /**
     * Gets the value of the diagnosticImagingReport property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the diagnosticImagingReport property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDiagnosticImagingReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticImagingReportViewResponse.DiagnosticImagingReport }
     * </p>
     * 
     * 
     * @return
     *     The value of the diagnosticImagingReport property.
     */
    public List<DiagnosticImagingReportViewResponse.DiagnosticImagingReport> getDiagnosticImagingReport() {
        if (diagnosticImagingReport == null) {
            diagnosticImagingReport = new ArrayList<>();
        }
        return this.diagnosticImagingReport;
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
     *         &lt;element name="dateAvailableToConsumer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="reportInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}diagnosticReportInformationDT"/&gt;
     *         &lt;element name="clinicalDocumentAuthor" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}providerInformationDT"/&gt;
     *         &lt;element name="reportingRadiologistInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}providerInformationDT"/&gt;
     *         &lt;element name="imagingRequesterInformation" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}requesterInformationDT"/&gt;
     *         &lt;element name="imagingExaminationResult" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="imagingServiceDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="examinationResultName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
     *                   &lt;element name="modality" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
     *                   &lt;element name="anatomicalSiteDetails" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="anatomicalRegion" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
     *                             &lt;element name="anatomicalLocation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="anatomicalLocationName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
     *                                       &lt;element name="laterality" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
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
     *                   &lt;element name="overallTestResultStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
     *                   &lt;element name="imageLocationInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "dateAvailableToConsumer",
        "reportInformation",
        "clinicalDocumentAuthor",
        "reportingRadiologistInformation",
        "imagingRequesterInformation",
        "imagingExaminationResult"
    })
    public static class DiagnosticImagingReport {

        @XmlElement(required = true)
        protected String dateAvailableToConsumer;
        @XmlElement(required = true)
        protected DiagnosticReportInformationDT reportInformation;
        @XmlElement(required = true)
        protected ProviderInformationDT clinicalDocumentAuthor;
        @XmlElement(required = true)
        protected ProviderInformationDT reportingRadiologistInformation;
        @XmlElement(required = true)
        protected RequesterInformationDT imagingRequesterInformation;
        @XmlElement(required = true)
        protected List<DiagnosticImagingReportViewResponse.DiagnosticImagingReport.ImagingExaminationResult> imagingExaminationResult;

        /**
         * Gets the value of the dateAvailableToConsumer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateAvailableToConsumer() {
            return dateAvailableToConsumer;
        }

        /**
         * Sets the value of the dateAvailableToConsumer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateAvailableToConsumer(String value) {
            this.dateAvailableToConsumer = value;
        }

        /**
         * Gets the value of the reportInformation property.
         * 
         * @return
         *     possible object is
         *     {@link DiagnosticReportInformationDT }
         *     
         */
        public DiagnosticReportInformationDT getReportInformation() {
            return reportInformation;
        }

        /**
         * Sets the value of the reportInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiagnosticReportInformationDT }
         *     
         */
        public void setReportInformation(DiagnosticReportInformationDT value) {
            this.reportInformation = value;
        }

        /**
         * Gets the value of the clinicalDocumentAuthor property.
         * 
         * @return
         *     possible object is
         *     {@link ProviderInformationDT }
         *     
         */
        public ProviderInformationDT getClinicalDocumentAuthor() {
            return clinicalDocumentAuthor;
        }

        /**
         * Sets the value of the clinicalDocumentAuthor property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProviderInformationDT }
         *     
         */
        public void setClinicalDocumentAuthor(ProviderInformationDT value) {
            this.clinicalDocumentAuthor = value;
        }

        /**
         * Gets the value of the reportingRadiologistInformation property.
         * 
         * @return
         *     possible object is
         *     {@link ProviderInformationDT }
         *     
         */
        public ProviderInformationDT getReportingRadiologistInformation() {
            return reportingRadiologistInformation;
        }

        /**
         * Sets the value of the reportingRadiologistInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProviderInformationDT }
         *     
         */
        public void setReportingRadiologistInformation(ProviderInformationDT value) {
            this.reportingRadiologistInformation = value;
        }

        /**
         * Gets the value of the imagingRequesterInformation property.
         * 
         * @return
         *     possible object is
         *     {@link RequesterInformationDT }
         *     
         */
        public RequesterInformationDT getImagingRequesterInformation() {
            return imagingRequesterInformation;
        }

        /**
         * Sets the value of the imagingRequesterInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequesterInformationDT }
         *     
         */
        public void setImagingRequesterInformation(RequesterInformationDT value) {
            this.imagingRequesterInformation = value;
        }

        /**
         * Gets the value of the imagingExaminationResult property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the imagingExaminationResult property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getImagingExaminationResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiagnosticImagingReportViewResponse.DiagnosticImagingReport.ImagingExaminationResult }
         * </p>
         * 
         * 
         * @return
         *     The value of the imagingExaminationResult property.
         */
        public List<DiagnosticImagingReportViewResponse.DiagnosticImagingReport.ImagingExaminationResult> getImagingExaminationResult() {
            if (imagingExaminationResult == null) {
                imagingExaminationResult = new ArrayList<>();
            }
            return this.imagingExaminationResult;
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
         *         &lt;element name="imagingServiceDateTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="examinationResultName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
         *         &lt;element name="modality" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
         *         &lt;element name="anatomicalSiteDetails" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="anatomicalRegion" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
         *                   &lt;element name="anatomicalLocation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="anatomicalLocationName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
         *                             &lt;element name="laterality" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
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
         *         &lt;element name="overallTestResultStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
         *         &lt;element name="imageLocationInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "imagingServiceDateTime",
            "examinationResultName",
            "modality",
            "anatomicalSiteDetails",
            "overallTestResultStatus",
            "imageLocationInformation"
        })
        public static class ImagingExaminationResult {

            @XmlElement(required = true)
            protected String imagingServiceDateTime;
            @XmlElement(required = true)
            protected CodedType examinationResultName;
            @XmlElement(required = true)
            protected CodedType modality;
            protected List<DiagnosticImagingReportViewResponse.DiagnosticImagingReport.ImagingExaminationResult.AnatomicalSiteDetails> anatomicalSiteDetails;
            protected CodedType overallTestResultStatus;
            protected String imageLocationInformation;

            /**
             * Gets the value of the imagingServiceDateTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getImagingServiceDateTime() {
                return imagingServiceDateTime;
            }

            /**
             * Sets the value of the imagingServiceDateTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setImagingServiceDateTime(String value) {
                this.imagingServiceDateTime = value;
            }

            /**
             * Gets the value of the examinationResultName property.
             * 
             * @return
             *     possible object is
             *     {@link CodedType }
             *     
             */
            public CodedType getExaminationResultName() {
                return examinationResultName;
            }

            /**
             * Sets the value of the examinationResultName property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedType }
             *     
             */
            public void setExaminationResultName(CodedType value) {
                this.examinationResultName = value;
            }

            /**
             * Gets the value of the modality property.
             * 
             * @return
             *     possible object is
             *     {@link CodedType }
             *     
             */
            public CodedType getModality() {
                return modality;
            }

            /**
             * Sets the value of the modality property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedType }
             *     
             */
            public void setModality(CodedType value) {
                this.modality = value;
            }

            /**
             * Gets the value of the anatomicalSiteDetails property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the anatomicalSiteDetails property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAnatomicalSiteDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DiagnosticImagingReportViewResponse.DiagnosticImagingReport.ImagingExaminationResult.AnatomicalSiteDetails }
             * </p>
             * 
             * 
             * @return
             *     The value of the anatomicalSiteDetails property.
             */
            public List<DiagnosticImagingReportViewResponse.DiagnosticImagingReport.ImagingExaminationResult.AnatomicalSiteDetails> getAnatomicalSiteDetails() {
                if (anatomicalSiteDetails == null) {
                    anatomicalSiteDetails = new ArrayList<>();
                }
                return this.anatomicalSiteDetails;
            }

            /**
             * Gets the value of the overallTestResultStatus property.
             * 
             * @return
             *     possible object is
             *     {@link CodedType }
             *     
             */
            public CodedType getOverallTestResultStatus() {
                return overallTestResultStatus;
            }

            /**
             * Sets the value of the overallTestResultStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedType }
             *     
             */
            public void setOverallTestResultStatus(CodedType value) {
                this.overallTestResultStatus = value;
            }

            /**
             * Gets the value of the imageLocationInformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getImageLocationInformation() {
                return imageLocationInformation;
            }

            /**
             * Sets the value of the imageLocationInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setImageLocationInformation(String value) {
                this.imageLocationInformation = value;
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
             *         &lt;element name="anatomicalRegion" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
             *         &lt;element name="anatomicalLocation" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="anatomicalLocationName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
             *                   &lt;element name="laterality" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
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
                "anatomicalRegion",
                "anatomicalLocation"
            })
            public static class AnatomicalSiteDetails {

                protected CodedType anatomicalRegion;
                protected List<DiagnosticImagingReportViewResponse.DiagnosticImagingReport.ImagingExaminationResult.AnatomicalSiteDetails.AnatomicalLocation> anatomicalLocation;

                /**
                 * Gets the value of the anatomicalRegion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CodedType }
                 *     
                 */
                public CodedType getAnatomicalRegion() {
                    return anatomicalRegion;
                }

                /**
                 * Sets the value of the anatomicalRegion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CodedType }
                 *     
                 */
                public void setAnatomicalRegion(CodedType value) {
                    this.anatomicalRegion = value;
                }

                /**
                 * Gets the value of the anatomicalLocation property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the Jakarta XML Binding object.
                 * This is why there is not a {@code set} method for the anatomicalLocation property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getAnatomicalLocation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DiagnosticImagingReportViewResponse.DiagnosticImagingReport.ImagingExaminationResult.AnatomicalSiteDetails.AnatomicalLocation }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the anatomicalLocation property.
                 */
                public List<DiagnosticImagingReportViewResponse.DiagnosticImagingReport.ImagingExaminationResult.AnatomicalSiteDetails.AnatomicalLocation> getAnatomicalLocation() {
                    if (anatomicalLocation == null) {
                        anatomicalLocation = new ArrayList<>();
                    }
                    return this.anatomicalLocation;
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
                 *         &lt;element name="anatomicalLocationName" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType"/&gt;
                 *         &lt;element name="laterality" type="{http://ns.electronichealth.net.au/pcehr/xsd/view/ViewCommonType/1.0}CodedType" minOccurs="0"/&gt;
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
                    "anatomicalLocationName",
                    "laterality"
                })
                public static class AnatomicalLocation {

                    @XmlElement(required = true)
                    protected CodedType anatomicalLocationName;
                    protected CodedType laterality;

                    /**
                     * Gets the value of the anatomicalLocationName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodedType }
                     *     
                     */
                    public CodedType getAnatomicalLocationName() {
                        return anatomicalLocationName;
                    }

                    /**
                     * Sets the value of the anatomicalLocationName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodedType }
                     *     
                     */
                    public void setAnatomicalLocationName(CodedType value) {
                        this.anatomicalLocationName = value;
                    }

                    /**
                     * Gets the value of the laterality property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodedType }
                     *     
                     */
                    public CodedType getLaterality() {
                        return laterality;
                    }

                    /**
                     * Sets the value of the laterality property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodedType }
                     *     
                     */
                    public void setLaterality(CodedType value) {
                        this.laterality = value;
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
     *                   &lt;element name="dateFromFilter" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="dateToFilter" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="viewVersionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="informationAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "viewParameters",
        "informationAvailable"
    })
    public static class ViewMetadata {

        @XmlElement(required = true)
        protected DiagnosticImagingReportViewResponse.ViewMetadata.IndividualProfile individualProfile;
        @XmlElement(required = true)
        protected DiagnosticImagingReportViewResponse.ViewMetadata.ViewParameters viewParameters;
        protected boolean informationAvailable;

        /**
         * Gets the value of the individualProfile property.
         * 
         * @return
         *     possible object is
         *     {@link DiagnosticImagingReportViewResponse.ViewMetadata.IndividualProfile }
         *     
         */
        public DiagnosticImagingReportViewResponse.ViewMetadata.IndividualProfile getIndividualProfile() {
            return individualProfile;
        }

        /**
         * Sets the value of the individualProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiagnosticImagingReportViewResponse.ViewMetadata.IndividualProfile }
         *     
         */
        public void setIndividualProfile(DiagnosticImagingReportViewResponse.ViewMetadata.IndividualProfile value) {
            this.individualProfile = value;
        }

        /**
         * Gets the value of the viewParameters property.
         * 
         * @return
         *     possible object is
         *     {@link DiagnosticImagingReportViewResponse.ViewMetadata.ViewParameters }
         *     
         */
        public DiagnosticImagingReportViewResponse.ViewMetadata.ViewParameters getViewParameters() {
            return viewParameters;
        }

        /**
         * Sets the value of the viewParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiagnosticImagingReportViewResponse.ViewMetadata.ViewParameters }
         *     
         */
        public void setViewParameters(DiagnosticImagingReportViewResponse.ViewMetadata.ViewParameters value) {
            this.viewParameters = value;
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
            "individual"
        })
        public static class IndividualProfile {

            @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", required = true)
            protected String ihiNumber;
            @XmlElement(required = true)
            protected IndividualTypeSupp individual;

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
         *         &lt;element name="dateFromFilter" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="dateToFilter" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
            "dateFromFilter",
            "dateToFilter",
            "viewVersionNumber"
        })
        public static class ViewParameters {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateFromFilter;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateToFilter;
            @XmlElement(required = true)
            protected String viewVersionNumber;

            /**
             * Gets the value of the dateFromFilter property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateFromFilter() {
                return dateFromFilter;
            }

            /**
             * Sets the value of the dateFromFilter property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateFromFilter(XMLGregorianCalendar value) {
                this.dateFromFilter = value;
            }

            /**
             * Gets the value of the dateToFilter property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateToFilter() {
                return dateToFilter;
            }

            /**
             * Sets the value of the dateToFilter property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateToFilter(XMLGregorianCalendar value) {
                this.dateToFilter = value;
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
