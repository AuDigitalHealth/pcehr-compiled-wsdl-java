
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for FilterQueryType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="FilterQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterQueryType", propOrder = {
    "primaryFilter"
})
@XmlSeeAlso({
    BranchType.class,
    RegistryObjectQueryType.class
})
public abstract class FilterQueryType {

    @XmlElement(name = "PrimaryFilter")
    protected FilterType primaryFilter;

    /**
     * Gets the value of the primaryFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getPrimaryFilter() {
        return primaryFilter;
    }

    /**
     * Sets the value of the primaryFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setPrimaryFilter(FilterType value) {
        this.primaryFilter = value;
    }

}
