
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
@XmlRootElement(name = "ClassificationQuery")
public class ClassificationQuery
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ClassificationSchemeQuery")
    protected ClassificationSchemeQuery classificationSchemeQuery;
    @XmlElement(name = "ClassifiedObjectQuery")
    protected RegistryObjectQueryType classifiedObjectQuery;
    @XmlElement(name = "ClassificationNodeQuery")
    protected ClassificationNodeQuery classificationNodeQuery;

    /**
     * Gets the value of the classificationSchemeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSchemeQuery }
     *     
     */
    public ClassificationSchemeQuery getClassificationSchemeQuery() {
        return classificationSchemeQuery;
    }

    /**
     * Sets the value of the classificationSchemeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSchemeQuery }
     *     
     */
    public void setClassificationSchemeQuery(ClassificationSchemeQuery value) {
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
     *     {@link ClassificationNodeQuery }
     *     
     */
    public ClassificationNodeQuery getClassificationNodeQuery() {
        return classificationNodeQuery;
    }

    /**
     * Sets the value of the classificationNodeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQuery }
     *     
     */
    public void setClassificationNodeQuery(ClassificationNodeQuery value) {
        this.classificationNodeQuery = value;
    }

}
