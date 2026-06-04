
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import au.gov.nehta.schema.DateAdapter;


/**
 * &lt;p&gt;Java class for organisationServiceType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="organisationServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organisationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="organisationServiceType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="organisationServiceUnit" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="serviceComments" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complexDate" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="type"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="StartDate"/&gt;
 *                         &lt;enumeration value="EndDate"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="accuracyIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "organisationServiceType", propOrder = {
    "organisationType",
    "organisationServiceType",
    "organisationServiceUnit",
    "serviceComments",
    "complexDates"
})
public class OrganisationServiceType {

    @XmlElement(required = true)
    protected String organisationType;
    @XmlElement(required = true)
    protected String organisationServiceType;
    protected String organisationServiceUnit;
    protected String serviceComments;
    @XmlElement(name = "complexDate", required = true)
    protected List<OrganisationServiceType.ComplexDate> complexDates;

    /**
     * Gets the value of the organisationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationType() {
        return organisationType;
    }

    /**
     * Sets the value of the organisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationType(String value) {
        this.organisationType = value;
    }

    /**
     * Gets the value of the organisationServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationServiceType() {
        return organisationServiceType;
    }

    /**
     * Sets the value of the organisationServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationServiceType(String value) {
        this.organisationServiceType = value;
    }

    /**
     * Gets the value of the organisationServiceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationServiceUnit() {
        return organisationServiceUnit;
    }

    /**
     * Sets the value of the organisationServiceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationServiceUnit(String value) {
        this.organisationServiceUnit = value;
    }

    /**
     * Gets the value of the serviceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceComments() {
        return serviceComments;
    }

    /**
     * Sets the value of the serviceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceComments(String value) {
        this.serviceComments = value;
    }

    /**
     * Gets the value of the complexDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complexDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplexDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationServiceType.ComplexDate }
     * 
     * 
     */
    public List<OrganisationServiceType.ComplexDate> getComplexDates() {
        if (complexDates == null) {
            complexDates = new ArrayList<OrganisationServiceType.ComplexDate>();
        }
        return this.complexDates;
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
     *         &lt;element name="type"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="StartDate"/&gt;
     *               &lt;enumeration value="EndDate"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="accuracyIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "type",
        "date",
        "accuracyIndicator"
    })
    public static class ComplexDate {

        @XmlElement(required = true)
        protected OrganisationServiceType.ComplexDate.Type type;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(DateAdapter.class)
        @XmlSchemaType(name = "date")
        protected Calendar date;
        @XmlElement(required = true)
        protected String accuracyIndicator;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link OrganisationServiceType.ComplexDate.Type }
         *     
         */
        public OrganisationServiceType.ComplexDate.Type getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganisationServiceType.ComplexDate.Type }
         *     
         */
        public void setType(OrganisationServiceType.ComplexDate.Type value) {
            this.type = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public Calendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(Calendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the accuracyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccuracyIndicator() {
            return accuracyIndicator;
        }

        /**
         * Sets the value of the accuracyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccuracyIndicator(String value) {
            this.accuracyIndicator = value;
        }


        /**
         * &lt;p&gt;Java class for null&lt;/p&gt;.
         * 
         * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
         * &lt;pre&gt;{&#064;code
         * &lt;simpleType&gt;
         *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *     &lt;enumeration value="StartDate"/&gt;
         *     &lt;enumeration value="EndDate"/&gt;
         *   &lt;/restriction&gt;
         * &lt;/simpleType&gt;
         * }&lt;/pre&gt;
         * 
         */
        @XmlType(name = "")
        @XmlEnum
        public enum Type {

            @XmlEnumValue("StartDate")
            START_DATE("StartDate"),
            @XmlEnumValue("EndDate")
            END_DATE("EndDate");
            private final String value;

            Type(String v) {
                value = v;
            }

            public String value() {
                return value;
            }

            public static OrganisationServiceType.ComplexDate.Type fromValue(String v) {
                for (OrganisationServiceType.ComplexDate.Type c: OrganisationServiceType.ComplexDate.Type.values()) {
                    if (c.value.equals(v)) {
                        return c;
                    }
                }
                throw new IllegalArgumentException(v);
            }

        }

    }

}
