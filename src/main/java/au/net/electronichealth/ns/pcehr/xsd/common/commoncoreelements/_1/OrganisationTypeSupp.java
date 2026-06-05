
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for organisationTypeSupp complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="organisationTypeSupp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hpioNumber" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}hpioNumber"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="organisationService" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}organisationServiceType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="participatingOrganisation" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="hpioNumber" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}hpioNumber"/&gt;
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
@XmlType(name = "organisationTypeSupp", propOrder = {
    "hpioNumber",
    "names",
    "organisationServices",
    "participatingOrganisations"
})
public class OrganisationTypeSupp {

    @XmlElement(required = true)
    protected String hpioNumber;
    @XmlElement(name = "name", required = true)
    protected List<String> names;
    @XmlElement(name = "organisationService", required = true)
    protected List<OrganisationServiceType> organisationServices;
    @XmlElement(name = "participatingOrganisation")
    protected List<OrganisationTypeSupp.ParticipatingOrganisation> participatingOrganisations;

    /**
     * Gets the value of the hpioNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpioNumber() {
        return hpioNumber;
    }

    /**
     * Sets the value of the hpioNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpioNumber(String value) {
        this.hpioNumber = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNames() {
        if (names == null) {
            names = new ArrayList<String>();
        }
        return this.names;
    }

    /**
     * Gets the value of the organisationServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationServiceType }
     * 
     * 
     */
    public List<OrganisationServiceType> getOrganisationServices() {
        if (organisationServices == null) {
            organisationServices = new ArrayList<OrganisationServiceType>();
        }
        return this.organisationServices;
    }

    /**
     * Gets the value of the participatingOrganisations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participatingOrganisations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipatingOrganisations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationTypeSupp.ParticipatingOrganisation }
     * 
     * 
     */
    public List<OrganisationTypeSupp.ParticipatingOrganisation> getParticipatingOrganisations() {
        if (participatingOrganisations == null) {
            participatingOrganisations = new ArrayList<OrganisationTypeSupp.ParticipatingOrganisation>();
        }
        return this.participatingOrganisations;
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
     *         &lt;element name="hpioNumber" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}hpioNumber"/&gt;
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
        "hpioNumber",
        "names",
        "organisationServices"
    })
    public static class ParticipatingOrganisation {

        @XmlElement(required = true)
        protected String hpioNumber;
        @XmlElement(name = "name", required = true)
        protected List<String> names;
        @XmlElement(name = "organisationService", required = true)
        protected List<OrganisationServiceType> organisationServices;

        /**
         * Gets the value of the hpioNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHpioNumber() {
            return hpioNumber;
        }

        /**
         * Sets the value of the hpioNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHpioNumber(String value) {
            this.hpioNumber = value;
        }

        /**
         * Gets the value of the names property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the names property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNames().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNames() {
            if (names == null) {
                names = new ArrayList<String>();
            }
            return this.names;
        }

        /**
         * Gets the value of the organisationServices property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organisationServices property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganisationServices().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganisationServiceType }
         * 
         * 
         */
        public List<OrganisationServiceType> getOrganisationServices() {
            if (organisationServices == null) {
                organisationServices = new ArrayList<OrganisationServiceType>();
            }
            return this.organisationServices;
        }

    }

}
