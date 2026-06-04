
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for AuditableEventQueryType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="AuditableEventQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AffectedObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EventTypeQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/&gt;
 *         &lt;element name="UserQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}UserQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditableEventQueryType", propOrder = {
    "affectedObjectQueries",
    "eventTypeQuery",
    "userQuery"
})
@XmlRootElement(name = "AuditableEventQuery")
public class AuditableEventQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "AffectedObjectQuery")
    protected List<RegistryObjectQueryType> affectedObjectQueries;
    @XmlElement(name = "EventTypeQuery")
    protected ClassificationNodeQuery eventTypeQuery;
    @XmlElement(name = "UserQuery")
    protected UserQuery userQuery;

    /**
     * Gets the value of the affectedObjectQueries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedObjectQueries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedObjectQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistryObjectQueryType }
     * 
     * 
     */
    public List<RegistryObjectQueryType> getAffectedObjectQueries() {
        if (affectedObjectQueries == null) {
            affectedObjectQueries = new ArrayList<RegistryObjectQueryType>();
        }
        return this.affectedObjectQueries;
    }

    /**
     * Gets the value of the eventTypeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public ClassificationNodeQuery getEventTypeQuery() {
        return eventTypeQuery;
    }

    /**
     * Sets the value of the eventTypeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public void setEventTypeQuery(ClassificationNodeQuery value) {
        this.eventTypeQuery = value;
    }

    /**
     * Gets the value of the userQuery property.
     * 
     * @return
     *     possible object is
     *     {@link UserQuery }
     *     
     */
    public UserQuery getUserQuery() {
        return userQuery;
    }

    /**
     * Sets the value of the userQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserQuery }
     *     
     */
    public void setUserQuery(UserQuery value) {
        this.userQuery = value;
    }

}
