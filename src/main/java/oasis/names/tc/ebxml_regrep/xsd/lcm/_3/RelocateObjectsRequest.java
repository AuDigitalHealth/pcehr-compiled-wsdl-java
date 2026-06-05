
package oasis.names.tc.ebxml_regrep.xsd.lcm._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.AdhocQueryType;
import oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectRefType;
import oasis.names.tc.ebxml_regrep.xsd.rs._3.RegistryRequestType;


/**
 * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:ebxml-regrep:xsd:rs:3.0}RegistryRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}AdhocQuery"/&gt;
 *         &lt;element name="SourceRegistry" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
 *         &lt;element name="DestinationRegistry" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
 *         &lt;element name="OwnerAtSource" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
 *         &lt;element name="OwnerAtDestination" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}ObjectRefType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adhocQuery",
    "sourceRegistry",
    "destinationRegistry",
    "ownerAtSource",
    "ownerAtDestination"
})
@XmlRootElement(name = "RelocateObjectsRequest")
public class RelocateObjectsRequest
    extends RegistryRequestType
{

    @XmlElement(name = "AdhocQuery", namespace = "urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0", required = true)
    protected AdhocQueryType adhocQuery;
    @XmlElement(name = "SourceRegistry", required = true)
    protected ObjectRefType sourceRegistry;
    @XmlElement(name = "DestinationRegistry", required = true)
    protected ObjectRefType destinationRegistry;
    @XmlElement(name = "OwnerAtSource", required = true)
    protected ObjectRefType ownerAtSource;
    @XmlElement(name = "OwnerAtDestination", required = true)
    protected ObjectRefType ownerAtDestination;

    /**
     * Gets the value of the adhocQuery property.
     * 
     * @return
     *     possible object is
     *     {@link AdhocQueryType }
     *     
     */
    public AdhocQueryType getAdhocQuery() {
        return adhocQuery;
    }

    /**
     * Sets the value of the adhocQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdhocQueryType }
     *     
     */
    public void setAdhocQuery(AdhocQueryType value) {
        this.adhocQuery = value;
    }

    /**
     * Gets the value of the sourceRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getSourceRegistry() {
        return sourceRegistry;
    }

    /**
     * Sets the value of the sourceRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setSourceRegistry(ObjectRefType value) {
        this.sourceRegistry = value;
    }

    /**
     * Gets the value of the destinationRegistry property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getDestinationRegistry() {
        return destinationRegistry;
    }

    /**
     * Sets the value of the destinationRegistry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setDestinationRegistry(ObjectRefType value) {
        this.destinationRegistry = value;
    }

    /**
     * Gets the value of the ownerAtSource property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getOwnerAtSource() {
        return ownerAtSource;
    }

    /**
     * Sets the value of the ownerAtSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setOwnerAtSource(ObjectRefType value) {
        this.ownerAtSource = value;
    }

    /**
     * Gets the value of the ownerAtDestination property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRefType }
     *     
     */
    public ObjectRefType getOwnerAtDestination() {
        return ownerAtDestination;
    }

    /**
     * Sets the value of the ownerAtDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRefType }
     *     
     */
    public void setOwnerAtDestination(ObjectRefType value) {
        this.ownerAtDestination = value;
    }

}
