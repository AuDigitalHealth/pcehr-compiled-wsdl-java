
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
    "addressFilter",
    "telephoneNumberFilter",
    "emailAddressFilter",
    "parentQuery",
    "childOrganizationQuery",
    "primaryContactQuery"
})
public class OrganizationQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "AddressFilter")
    protected List<FilterType> addressFilter;
    @XmlElement(name = "TelephoneNumberFilter")
    protected List<FilterType> telephoneNumberFilter;
    @XmlElement(name = "EmailAddressFilter")
    protected List<FilterType> emailAddressFilter;
    @XmlElement(name = "ParentQuery")
    protected OrganizationQueryType parentQuery;
    @XmlElement(name = "ChildOrganizationQuery")
    protected List<OrganizationQueryType> childOrganizationQuery;
    @XmlElement(name = "PrimaryContactQuery")
    protected PersonQueryType primaryContactQuery;

    /**
     * Gets the value of the addressFilter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addressFilter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddressFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * </p>
     * 
     * 
     * @return
     *     The value of the addressFilter property.
     */
    public List<FilterType> getAddressFilter() {
        if (addressFilter == null) {
            addressFilter = new ArrayList<>();
        }
        return this.addressFilter;
    }

    /**
     * Gets the value of the telephoneNumberFilter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the telephoneNumberFilter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTelephoneNumberFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * </p>
     * 
     * 
     * @return
     *     The value of the telephoneNumberFilter property.
     */
    public List<FilterType> getTelephoneNumberFilter() {
        if (telephoneNumberFilter == null) {
            telephoneNumberFilter = new ArrayList<>();
        }
        return this.telephoneNumberFilter;
    }

    /**
     * Gets the value of the emailAddressFilter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the emailAddressFilter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEmailAddressFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterType }
     * </p>
     * 
     * 
     * @return
     *     The value of the emailAddressFilter property.
     */
    public List<FilterType> getEmailAddressFilter() {
        if (emailAddressFilter == null) {
            emailAddressFilter = new ArrayList<>();
        }
        return this.emailAddressFilter;
    }

    /**
     * Gets the value of the parentQuery property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationQueryType }
     *     
     */
    public OrganizationQueryType getParentQuery() {
        return parentQuery;
    }

    /**
     * Sets the value of the parentQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationQueryType }
     *     
     */
    public void setParentQuery(OrganizationQueryType value) {
        this.parentQuery = value;
    }

    /**
     * Gets the value of the childOrganizationQuery property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the childOrganizationQuery property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChildOrganizationQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationQueryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the childOrganizationQuery property.
     */
    public List<OrganizationQueryType> getChildOrganizationQuery() {
        if (childOrganizationQuery == null) {
            childOrganizationQuery = new ArrayList<>();
        }
        return this.childOrganizationQuery;
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
