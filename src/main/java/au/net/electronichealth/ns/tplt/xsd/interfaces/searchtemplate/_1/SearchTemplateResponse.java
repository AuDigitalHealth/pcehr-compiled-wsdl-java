
package au.net.electronichealth.ns.tplt.xsd.interfaces.searchtemplate._1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ResponseStatusType;
import au.net.electronichealth.ns.tplt.xsd.common.templatescoreelements._1.TemplateMetadataType;
import au.net.electronichealth.ns.tplt.xsd.common.templatescoreelements._1.TemplateUsageMetadataType;


/**
 * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseStatus" type="{http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0}responseStatusType"/&gt;
 *         &lt;element name="template" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="templateMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateMetadataType"/&gt;
 *                   &lt;element name="usageMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateUsageMetadataType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseStatus",
    "templates"
})
@XmlRootElement(name = "searchTemplateResponse")
public class SearchTemplateResponse {

    @XmlElement(required = true)
    protected ResponseStatusType responseStatus;
    @XmlElement(name = "template")
    protected List<SearchTemplateResponse.Template> templates;

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusType }
     *     
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusType }
     *     
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the templates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchTemplateResponse.Template }
     * 
     * 
     */
    public List<SearchTemplateResponse.Template> getTemplates() {
        if (templates == null) {
            templates = new ArrayList<SearchTemplateResponse.Template>();
        }
        return this.templates;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
     * 
     * &lt;pre&gt;{&#064;code
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="templateMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateMetadataType"/&gt;
     *         &lt;element name="usageMetadata" type="{http://ns.electronichealth.net.au/tplt/xsd/common/TemplatesCoreElements/1.0}templateUsageMetadataType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * }&lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "templateMetadata",
        "usageMetadata"
    })
    public static class Template {

        @XmlElement(required = true)
        protected TemplateMetadataType templateMetadata;
        protected TemplateUsageMetadataType usageMetadata;

        /**
         * Gets the value of the templateMetadata property.
         * 
         * @return
         *     possible object is
         *     {@link TemplateMetadataType }
         *     
         */
        public TemplateMetadataType getTemplateMetadata() {
            return templateMetadata;
        }

        /**
         * Sets the value of the templateMetadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateMetadataType }
         *     
         */
        public void setTemplateMetadata(TemplateMetadataType value) {
            this.templateMetadata = value;
        }

        /**
         * Gets the value of the usageMetadata property.
         * 
         * @return
         *     possible object is
         *     {@link TemplateUsageMetadataType }
         *     
         */
        public TemplateUsageMetadataType getUsageMetadata() {
            return usageMetadata;
        }

        /**
         * Sets the value of the usageMetadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateUsageMetadataType }
         *     
         */
        public void setUsageMetadata(TemplateUsageMetadataType value) {
            this.usageMetadata = value;
        }

    }

}
