
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for usage&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="usage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "usage")
@XmlEnum
public enum Usage {

    M,
    N,
    O,
    B,
    L,
    R;

    public String value() {
        return name();
    }

    public static Usage fromValue(String v) {
        return valueOf(v);
    }

}
