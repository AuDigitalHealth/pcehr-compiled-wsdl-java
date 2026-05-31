
package oasis.names.tc.ebxml_regrep.xsd.rim._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for LocalizedStringType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="LocalizedStringType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang default="en-US""/&gt;
 *       &lt;attribute name="charset" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="UTF-8" /&gt;
 *       &lt;attribute name="value" use="required" type="{urn:oasis:names:tc:ebxml-regrep:xsd:rim:3.0}FreeFormText" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizedStringType")
public class LocalizedStringType {

    /**
     * Attempting to install the relevant ISO 2- and 3-letter codes as the
     *         enumerated possible values is probably never going to be a realistic possibility. See RFC
     *         3066 at http://www.ietf.org/rfc/rfc3066.txt and the IANA registry at
     *         http://www.iana.org/assignments/lang-tag-apps.htm for further information. The union allows
     *         for the 'un-declaration' of xml:lang with the empty string.
     * 
     */
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "charset")
    @XmlSchemaType(name = "anySimpleType")
    protected String charset;
    @XmlAttribute(name = "value", required = true)
    protected String value;

    /**
     * Attempting to install the relevant ISO 2- and 3-letter codes as the
     *         enumerated possible values is probably never going to be a realistic possibility. See RFC
     *         3066 at http://www.ietf.org/rfc/rfc3066.txt and the IANA registry at
     *         http://www.iana.org/assignments/lang-tag-apps.htm for further information. The union allows
     *         for the 'un-declaration' of xml:lang with the empty string.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        if (lang == null) {
            return "en-US";
        } else {
            return lang;
        }
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLang()
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the charset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharset() {
        if (charset == null) {
            return "UTF-8";
        } else {
            return charset;
        }
    }

    /**
     * Sets the value of the charset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharset(String value) {
        this.charset = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
