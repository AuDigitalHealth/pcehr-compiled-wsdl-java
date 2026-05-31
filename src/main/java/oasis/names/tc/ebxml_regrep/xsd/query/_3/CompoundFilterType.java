
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java class for CompoundFilterType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CompoundFilterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LeftFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType"/&gt;
 *         &lt;element name="RightFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="logicalOperator" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName"&gt;
 *             &lt;enumeration value="AND"/&gt;
 *             &lt;enumeration value="OR"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundFilterType", propOrder = {
    "leftFilter",
    "rightFilter"
})
public class CompoundFilterType
    extends FilterType
{

    @XmlElement(name = "LeftFilter", required = true)
    protected FilterType leftFilter;
    @XmlElement(name = "RightFilter", required = true)
    protected FilterType rightFilter;
    @XmlAttribute(name = "logicalOperator", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String logicalOperator;

    /**
     * Gets the value of the leftFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getLeftFilter() {
        return leftFilter;
    }

    /**
     * Sets the value of the leftFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setLeftFilter(FilterType value) {
        this.leftFilter = value;
    }

    /**
     * Gets the value of the rightFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterType }
     *     
     */
    public FilterType getRightFilter() {
        return rightFilter;
    }

    /**
     * Sets the value of the rightFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterType }
     *     
     */
    public void setRightFilter(FilterType value) {
        this.rightFilter = value;
    }

    /**
     * Gets the value of the logicalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * Sets the value of the logicalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalOperator(String value) {
        this.logicalOperator = value;
    }

}
