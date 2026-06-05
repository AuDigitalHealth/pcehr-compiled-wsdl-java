
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ServiceBindingQueryType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ServiceBindingQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ServiceQuery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}SpecificationLinkQuery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TargetBindingQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ServiceBindingQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBindingQueryType", propOrder = {
    "serviceQuery",
    "specificationLinkQueries",
    "targetBindingQuery"
})
@XmlRootElement(name = "ServiceBindingQuery")
public class ServiceBindingQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ServiceQuery")
    protected ServiceQuery serviceQuery;
    @XmlElement(name = "SpecificationLinkQuery")
    protected List<SpecificationLinkQuery> specificationLinkQueries;
    @XmlElement(name = "TargetBindingQuery")
    protected ServiceBindingQuery targetBindingQuery;

    /**
     * Gets the value of the serviceQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQuery }
     *     
     */
    public ServiceQuery getServiceQuery() {
        return serviceQuery;
    }

    /**
     * Sets the value of the serviceQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQuery }
     *     
     */
    public void setServiceQuery(ServiceQuery value) {
        this.serviceQuery = value;
    }

    /**
     * Gets the value of the specificationLinkQueries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificationLinkQueries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificationLinkQueries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificationLinkQuery }
     * 
     * 
     */
    public List<SpecificationLinkQuery> getSpecificationLinkQueries() {
        if (specificationLinkQueries == null) {
            specificationLinkQueries = new ArrayList<SpecificationLinkQuery>();
        }
        return this.specificationLinkQueries;
    }

    /**
     * Gets the value of the targetBindingQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBindingQuery }
     *     
     */
    public ServiceBindingQuery getTargetBindingQuery() {
        return targetBindingQuery;
    }

    /**
     * Sets the value of the targetBindingQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBindingQuery }
     *     
     */
    public void setTargetBindingQuery(ServiceBindingQuery value) {
        this.targetBindingQuery = value;
    }

}
