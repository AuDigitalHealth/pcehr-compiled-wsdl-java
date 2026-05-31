
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ClassificationSchemeQueryType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ClassificationSchemeQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}RegistryObjectQueryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChildrenQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NodeTypeQuery" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}ClassificationNodeQueryType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationSchemeQueryType", propOrder = {
    "childrenQuery",
    "nodeTypeQuery"
})
public class ClassificationSchemeQueryType
    extends RegistryObjectQueryType
{

    @XmlElement(name = "ChildrenQuery")
    protected List<ClassificationNodeQueryType> childrenQuery;
    @XmlElement(name = "NodeTypeQuery")
    protected ClassificationNodeQueryType nodeTypeQuery;

    /**
     * Gets the value of the childrenQuery property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the childrenQuery property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChildrenQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationNodeQueryType }
     * </p>
     * 
     * 
     * @return
     *     The value of the childrenQuery property.
     */
    public List<ClassificationNodeQueryType> getChildrenQuery() {
        if (childrenQuery == null) {
            childrenQuery = new ArrayList<>();
        }
        return this.childrenQuery;
    }

    /**
     * Gets the value of the nodeTypeQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public ClassificationNodeQueryType getNodeTypeQuery() {
        return nodeTypeQuery;
    }

    /**
     * Sets the value of the nodeTypeQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationNodeQueryType }
     *     
     */
    public void setNodeTypeQuery(ClassificationNodeQueryType value) {
        this.nodeTypeQuery = value;
    }

}
