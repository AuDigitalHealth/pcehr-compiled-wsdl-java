
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getindividualdetailsview._2;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ContactDetailsType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ContactPersonTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.IndividualTypeSupp;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.RecordStatusType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ResponseStatusType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.StatusType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="responseStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType"/&gt;
 *         &lt;element name="individual" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dateAccuracyIndicatorType" minOccurs="0"/&gt;
 *                   &lt;element name="ihiRecordStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}recordStatusType" minOccurs="0"/&gt;
 *                   &lt;element name="ihiStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}statusType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/&gt;
 *                   &lt;element name="contactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactDetailsType" minOccurs="0"/&gt;
 *                   &lt;element name="contactPersons" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="contactPerson" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactPersonTypeSupp" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="indigenousStatus"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                         &lt;enumeration value="3"/&gt;
 *                         &lt;enumeration value="4"/&gt;
 *                         &lt;enumeration value="9"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
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
    "responseStatus",
    "individual"
})
@XmlRootElement(name = "getIndividualDetailsViewResponse")
public class GetIndividualDetailsViewResponse {

    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    protected GetIndividualDetailsViewResponse.Individual individual;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusType }
     *     
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusType }
     *     
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link GetIndividualDetailsViewResponse.Individual }
     *     
     */
    public GetIndividualDetailsViewResponse.Individual getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIndividualDetailsViewResponse.Individual }
     *     
     */
    public void setIndividual(GetIndividualDetailsViewResponse.Individual value) {
        this.individual = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}individualTypeSupp"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dateAccuracyIndicatorType" minOccurs="0"/&gt;
     *         &lt;element name="ihiRecordStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}recordStatusType" minOccurs="0"/&gt;
     *         &lt;element name="ihiStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}statusType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/&gt;
     *         &lt;element name="contactDetails" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactDetailsType" minOccurs="0"/&gt;
     *         &lt;element name="contactPersons" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="contactPerson" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactPersonTypeSupp" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="indigenousStatus"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *               &lt;enumeration value="3"/&gt;
     *               &lt;enumeration value="4"/&gt;
     *               &lt;enumeration value="9"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dateAccuracyIndicatorType",
        "ihiRecordStatus",
        "ihiStatus",
        "ihiNumber",
        "contactDetails",
        "contactPersons",
        "indigenousStatus"
    })
    public static class Individual
        extends IndividualTypeSupp
    {

        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
        protected String dateAccuracyIndicatorType;
        @XmlSchemaType(name = "string")
        protected RecordStatusType ihiRecordStatus;
        @XmlSchemaType(name = "string")
        protected StatusType ihiStatus;
        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", required = true)
        protected String ihiNumber;
        protected ContactDetailsType contactDetails;
        protected GetIndividualDetailsViewResponse.Individual.ContactPersons contactPersons;
        @XmlElement(required = true)
        protected String indigenousStatus;

        /**
         * Gets the value of the dateAccuracyIndicatorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateAccuracyIndicatorType() {
            return dateAccuracyIndicatorType;
        }

        /**
         * Sets the value of the dateAccuracyIndicatorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateAccuracyIndicatorType(String value) {
            this.dateAccuracyIndicatorType = value;
        }

        /**
         * Gets the value of the ihiRecordStatus property.
         * 
         * @return
         *     possible object is
         *     {@link RecordStatusType }
         *     
         */
        public RecordStatusType getIhiRecordStatus() {
            return ihiRecordStatus;
        }

        /**
         * Sets the value of the ihiRecordStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link RecordStatusType }
         *     
         */
        public void setIhiRecordStatus(RecordStatusType value) {
            this.ihiRecordStatus = value;
        }

        /**
         * Gets the value of the ihiStatus property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getIhiStatus() {
            return ihiStatus;
        }

        /**
         * Sets the value of the ihiStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         */
        public void setIhiStatus(StatusType value) {
            this.ihiStatus = value;
        }

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
         * Gets the value of the contactDetails property.
         * 
         * @return
         *     possible object is
         *     {@link ContactDetailsType }
         *     
         */
        public ContactDetailsType getContactDetails() {
            return contactDetails;
        }

        /**
         * Sets the value of the contactDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactDetailsType }
         *     
         */
        public void setContactDetails(ContactDetailsType value) {
            this.contactDetails = value;
        }

        /**
         * Gets the value of the contactPersons property.
         * 
         * @return
         *     possible object is
         *     {@link GetIndividualDetailsViewResponse.Individual.ContactPersons }
         *     
         */
        public GetIndividualDetailsViewResponse.Individual.ContactPersons getContactPersons() {
            return contactPersons;
        }

        /**
         * Sets the value of the contactPersons property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetIndividualDetailsViewResponse.Individual.ContactPersons }
         *     
         */
        public void setContactPersons(GetIndividualDetailsViewResponse.Individual.ContactPersons value) {
            this.contactPersons = value;
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
         * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
         * 
         * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
         * 
         * &lt;pre&gt;{&#064;code
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="contactPerson" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}contactPersonTypeSupp" maxOccurs="unbounded"/&gt;
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
            "contactPerson"
        })
        public static class ContactPersons {

            @XmlElement(required = true)
            protected List<ContactPersonTypeSupp> contactPerson;

            /**
             * Gets the value of the contactPerson property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the Jakarta XML Binding object.
             * This is why there is not a {@code set} method for the contactPerson property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getContactPerson().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ContactPersonTypeSupp }
             * </p>
             * 
             * 
             * @return
             *     The value of the contactPerson property.
             */
            public List<ContactPersonTypeSupp> getContactPerson() {
                if (contactPerson == null) {
                    contactPerson = new ArrayList<>();
                }
                return this.contactPerson;
            }

        }

    }

}
