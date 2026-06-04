
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for OrganizationQueryType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="OrganizationQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TelephoneNumberFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddressFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ParentQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}OrganizationQueryType" minOccurs="0"/&gt;
 *         &lt;element name="ChildOrganizationQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}OrganizationQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryContactQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}PersonQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationQueryType", propOrder = {
    "addressFilters",
    "telephoneNumberFilters",
    "emailAddressFilters",
    "parentQuery",
    "childOrganizationQueries",
    "primaryContactQuery"
})
@XmlRootElement(name = "OrganizationQuery")
public class OrganizationQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "AddressFilter")
    protected List<FilterType> addressFilters;
    @XmlElement(name = "TelephoneNumberFilter")
    protected List<FilterType> telephoneNumberFilters;
    @XmlElement(name = "EmailAddressFilter")
    protected List<FilterType> emailAddressFilters;
    @XmlElement(name = "ParentQuery")
    protected OrganizationQuery parentQuery;
    @XmlElement(name = "ChildOrganizationQuery")
    protected List<OrganizationQuery> childOrganizationQueries;
    @XmlElement(name = "PrimaryContactQuery")
    protected PersonQueryType primaryContactQuery;

    /**
     * Gets the value of the addressFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getAddressFilters() {
        if (addressFilters == null) {
            addressFilters = new ArrayList<FilterType>();
        }
        return this.addressFilters;
    }

    /**
     * Gets the value of the telephoneNumberFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNumberFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNumberFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getTelephoneNumberFilters() {
        if (telephoneNumberFilters == null) {
            telephoneNumberFilters = new ArrayList<FilterType>();
        }
        return this.telephoneNumberFilters;
    }

    /**
     * Gets the value of the emailAddressFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddressFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddressFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * 
     * 
     */
    public List<FilterType> getEmailAddressFilters() {
        if (emailAddressFilters == null) {
            emailAddressFilters = new ArrayList<FilterType>();
        }
        return this.emailAddressFilters;
    }

    /**
     * Gets the value of the parentQuery property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationQuery }
     *     
     */
    public OrganizationQuery getParentQuery() {
        return parentQuery;
    }

    /**
     * Sets the value of the parentQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationQuery }
     *     
     */
    public void setParentQuery(OrganizationQuery value) {
        this.parentQuery = value;
    }

    /**
     * Gets the value of the childOrganizationQueries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childOrganizationQueries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildOrganizationQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationQuery }
     * 
     * 
     */
    public List<OrganizationQuery> getChildOrganizationQueries() {
        if (childOrganizationQueries == null) {
            childOrganizationQueries = new ArrayList<OrganizationQuery>();
        }
        return this.childOrganizationQueries;
    }

    /**
     * Gets the value of the primaryContactQuery property.
     * 
     * @return
     *     possible object is
     *     {@link PersonQueryType }
     *     
     */
    public PersonQueryType getPrimaryContactQuery() {
        return primaryContactQuery;
    }

    /**
     * Sets the value of the primaryContactQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonQueryType }
     *     
     */
    public void setPrimaryContactQuery(PersonQueryType value) {
        this.primaryContactQuery = value;
    }

}
