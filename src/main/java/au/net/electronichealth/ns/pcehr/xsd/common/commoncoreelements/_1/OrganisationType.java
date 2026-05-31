
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for organisationType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="organisationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="organisationService" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}organisationServiceType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="participatingOrganisation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}ihiNumber"/&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="organisationService" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}organisationServiceType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "organisationType", propOrder = {
    "ihiNumber",
    "name",
    "organisationService",
    "participatingOrganisation"
})
public class OrganisationType {

    @XmlElement(required = true)
    protected String ihiNumber;
    @XmlElement(required = true)
    protected List<String> name;
    @XmlElement(required = true)
    protected List<OrganisationServiceType> organisationService;
    protected List<OrganisationType.ParticipatingOrganisation> participatingOrganisation;

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
     * Gets the value of the name property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the name property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the name property.
     */
    public List<String> getName() {
        if (name == null) {
            name = new ArrayList<>();
        }
        return this.name;
    }

    /**
     * Gets the value of the organisationService property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the organisationService property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganisationService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationServiceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the organisationService property.
     */
    public List<OrganisationServiceType> getOrganisationService() {
        if (organisationService == null) {
            organisationService = new ArrayList<>();
        }
        return this.organisationService;
    }

    /**
     * Gets the value of the participatingOrganisation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the participatingOrganisation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getParticipatingOrganisation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationType.ParticipatingOrganisation }
     * </p>
     * 
     * 
     * @return
     *     The value of the participatingOrganisation property.
     */
    public List<OrganisationType.ParticipatingOrganisation> getParticipatingOrganisation() {
        if (participatingOrganisation == null) {
            participatingOrganisation = new ArrayList<>();
        }
        return this.participatingOrganisation;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *         &lt;element name="organisationService" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}organisationServiceType" maxOccurs="unbounded"/&gt;
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
        "name",
        "organisationService"
    })
    public static class ParticipatingOrganisation {

        @XmlElement(required = true)
        protected String ihiNumber;
        @XmlElement(required = true)
        protected List<String> name;
        @XmlElement(required = true)
        protected List<OrganisationServiceType> organisationService;

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
         * Gets the value of the name property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the name property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * </p>
         * 
         * 
         * @return
         *     The value of the name property.
         */
        public List<String> getName() {
            if (name == null) {
                name = new ArrayList<>();
            }
            return this.name;
        }

        /**
         * Gets the value of the organisationService property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the organisationService property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getOrganisationService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganisationServiceType }
         * </p>
         * 
         * 
         * @return
         *     The value of the organisationService property.
         */
        public List<OrganisationServiceType> getOrganisationService() {
            if (organisationService == null) {
                organisationService = new ArrayList<>();
            }
            return this.organisationService;
        }

    }

}
