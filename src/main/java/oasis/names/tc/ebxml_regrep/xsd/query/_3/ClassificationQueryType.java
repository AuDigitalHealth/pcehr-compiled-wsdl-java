
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ClassificationQueryType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ClassificationQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationSchemeQuery" minOccurs="0"/&gt;
 *         &lt;element name="ClassifiedObjectQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQuery" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationQueryType", propOrder = {
    "classificationSchemeQuery",
    "classifiedObjectQuery",
    "classificationNodeQuery"
})
public class ClassificationQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ClassificationSchemeQuery")
    protected ClassificationSchemeQueryType classificationSchemeQuery;
    @XmlElement(name = "ClassifiedObjectQuery")
    protected RegistryObjectQueryType classifiedObjectQuery;
    @XmlElement(name = "ClassificationNodeQuery")
    protected ClassificationNodeQueryType classificationNodeQuery;

    /**
     * Gets the value of the classificationSchemeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSchemeQueryType }
     *     
     */
    public ClassificationSchemeQueryType getClassificationSchemeQuery() {
        return classificationSchemeQuery;
    }

    /**
     * Sets the value of the classificationSchemeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSchemeQueryType }
     *     
     */
    public void setClassificationSchemeQuery(ClassificationSchemeQueryType value) {
        this.classificationSchemeQuery = value;
    }

    /**
     * Gets the value of the classifiedObjectQuery property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public RegistryObjectQueryType getClassifiedObjectQuery() {
        return classifiedObjectQuery;
    }

    /**
     * Sets the value of the classifiedObjectQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryObjectQueryType }
     *     
     */
    public void setClassifiedObjectQuery(RegistryObjectQueryType value) {
        this.classifiedObjectQuery = value;
    }

    /**
     * Gets the value of the classificationNodeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public ClassificationNodeQueryType getClassificationNodeQuery() {
        return classificationNodeQuery;
    }

    /**
     * Sets the value of the classificationNodeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public void setClassificationNodeQuery(ClassificationNodeQueryType value) {
        this.classificationNodeQuery = value;
    }

}
