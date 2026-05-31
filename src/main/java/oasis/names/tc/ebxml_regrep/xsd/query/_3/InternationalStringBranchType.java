
package oasis.names.tc.ebxml_regrep.xsd.query._3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for InternationalStringBranchType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="InternationalStringBranchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}BranchType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocalizedStringFilter" type="{urn:oasis:names:tc:ebxml-regrep:xsd:query:3.0}FilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalStringBranchType", propOrder = {
    "localizedStringFilter"
})
public class InternationalStringBranchType
    extends BranchType
{

    @XmlElement(name = "LocalizedStringFilter")
    protected List<FilterType> localizedStringFilter;

    /**
     * Gets the value of the localizedStringFilter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the localizedStringFilter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLocalizedStringFilter().add(newItem);
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
     *     The value of the localizedStringFilter property.
     */
    public List<FilterType> getLocalizedStringFilter() {
        if (localizedStringFilter == null) {
            localizedStringFilter = new ArrayList<>();
        }
        return this.localizedStringFilter;
    }

}
