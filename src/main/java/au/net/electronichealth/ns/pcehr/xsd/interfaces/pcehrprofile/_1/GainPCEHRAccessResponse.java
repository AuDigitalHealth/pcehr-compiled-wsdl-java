
package au.net.electronichealth.ns.pcehr.xsd.interfaces.pcehrprofile._1;

import java.util.Calendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.gov.nehta.schema.DateAdapter;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.DateAccuracyIndicatorType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.NameType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.RecordStatusType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ResponseStatusType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.Sex;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.StatusType;


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
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/&gt;
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/&gt;
 *                   &lt;element name="ihiRecordStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}recordStatusType"/&gt;
 *                   &lt;element name="ihiStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}statusType"/&gt;
 *                   &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dateAccuracyIndicatorType"/&gt;
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}sex"/&gt;
 *                   &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameType"/&gt;
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
    "responseStatus",
    "individual"
})
@XmlRootElement(name = "gainPCEHRAccessResponse")
public class GainPCEHRAccessResponse {

    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    protected GainPCEHRAccessResponse.Individual individual;

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
     *     {@link GainPCEHRAccessResponse.Individual }
     *     
     */
    public GainPCEHRAccessResponse.Individual getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link GainPCEHRAccessResponse.Individual }
     *     
     */
    public void setIndividual(GainPCEHRAccessResponse.Individual value) {
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/&gt;
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareCardNumber" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}medicareIRN" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dvaFileNumber" minOccurs="0"/&gt;
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}militaryHealthNumber" minOccurs="0"/&gt;
     *         &lt;element name="ihiRecordStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}recordStatusType"/&gt;
     *         &lt;element name="ihiStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}statusType"/&gt;
     *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}dateAccuracyIndicatorType"/&gt;
     *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}sex"/&gt;
     *         &lt;element name="name" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}nameType"/&gt;
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
        "medicareCardNumber",
        "medicareIRN",
        "dvaFileNumber",
        "militaryHealthNumber",
        "ihiRecordStatus",
        "ihiStatus",
        "dateOfBirth",
        "dateAccuracyIndicatorType",
        "sex",
        "name"
    })
    public static class Individual {

        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", required = true)
        protected String ihiNumber;
        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String medicareCardNumber;
        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
        protected Integer medicareIRN;
        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String dvaFileNumber;
        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0")
        protected String militaryHealthNumber;
        @XmlElement(required = true)
        protected RecordStatusType ihiRecordStatus;
        @XmlElement(required = true)
        protected StatusType ihiStatus;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(DateAdapter.class)
        @XmlSchemaType(name = "date")
        protected Calendar dateOfBirth;
        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", required = true)
        protected DateAccuracyIndicatorType dateAccuracyIndicatorType;
        @XmlElement(namespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", required = true)
        protected Sex sex;
        @XmlElement(required = true)
        protected NameType name;

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
         * Gets the value of the medicareCardNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMedicareCardNumber() {
            return medicareCardNumber;
        }

        /**
         * Sets the value of the medicareCardNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMedicareCardNumber(String value) {
            this.medicareCardNumber = value;
        }

        /**
         * Gets the value of the medicareIRN property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMedicareIRN() {
            return medicareIRN;
        }

        /**
         * Sets the value of the medicareIRN property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMedicareIRN(Integer value) {
            this.medicareIRN = value;
        }

        /**
         * Gets the value of the dvaFileNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDvaFileNumber() {
            return dvaFileNumber;
        }

        /**
         * Sets the value of the dvaFileNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDvaFileNumber(String value) {
            this.dvaFileNumber = value;
        }

        /**
         * Gets the value of the militaryHealthNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMilitaryHealthNumber() {
            return militaryHealthNumber;
        }

        /**
         * Sets the value of the militaryHealthNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMilitaryHealthNumber(String value) {
            this.militaryHealthNumber = value;
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
         * Gets the value of the dateOfBirth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * Sets the value of the dateOfBirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateOfBirth(Calendar value) {
            this.dateOfBirth = value;
        }

        /**
         * Gets the value of the dateAccuracyIndicatorType property.
         * 
         * @return
         *     possible object is
         *     {@link DateAccuracyIndicatorType }
         *     
         */
        public DateAccuracyIndicatorType getDateAccuracyIndicatorType() {
            return dateAccuracyIndicatorType;
        }

        /**
         * Sets the value of the dateAccuracyIndicatorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateAccuracyIndicatorType }
         *     
         */
        public void setDateAccuracyIndicatorType(DateAccuracyIndicatorType value) {
            this.dateAccuracyIndicatorType = value;
        }

        /**
         * Gets the value of the sex property.
         * 
         * @return
         *     possible object is
         *     {@link Sex }
         *     
         */
        public Sex getSex() {
            return sex;
        }

        /**
         * Sets the value of the sex property.
         * 
         * @param value
         *     allowed object is
         *     {@link Sex }
         *     
         */
        public void setSex(Sex value) {
            this.sex = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link NameType }
         *     
         */
        public NameType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link NameType }
         *     
         */
        public void setName(NameType value) {
            this.name = value;
        }

    }

}
