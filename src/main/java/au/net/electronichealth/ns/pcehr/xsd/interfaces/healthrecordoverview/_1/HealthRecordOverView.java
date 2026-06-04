
package au.net.electronichealth.ns.pcehr.xsd.interfaces.healthrecordoverview._1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for healthRecordOverView complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="healthRecordOverView"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="clinicalSynopsisLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "healthRecordOverView", propOrder = {
    "versionNumber",
    "clinicalSynopsisLength"
})
@XmlRootElement(name = "healthRecordOverView")
public class HealthRecordOverView {

    @XmlElement(required = true)
    protected String versionNumber;
    protected int clinicalSynopsisLength;

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the clinicalSynopsisLength property.
     * 
     */
    public int getClinicalSynopsisLength() {
        return clinicalSynopsisLength;
    }

    /**
     * Sets the value of the clinicalSynopsisLength property.
     * 
     */
    public void setClinicalSynopsisLength(int value) {
        this.clinicalSynopsisLength = value;
    }

}
