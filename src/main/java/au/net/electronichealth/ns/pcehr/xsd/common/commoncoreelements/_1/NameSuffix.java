
package au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for nameSuffix&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="nameSuffix"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BM"/&gt;
 *     &lt;enumeration value="BEM"/&gt;
 *     &lt;enumeration value="COMDC"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="AC"/&gt;
 *     &lt;enumeration value="CV"/&gt;
 *     &lt;enumeration value="DCMG"/&gt;
 *     &lt;enumeration value="DCB"/&gt;
 *     &lt;enumeration value="DBE"/&gt;
 *     &lt;enumeration value="DCVO"/&gt;
 *     &lt;enumeration value="AD"/&gt;
 *     &lt;enumeration value="DFM"/&gt;
 *     &lt;enumeration value="DSC"/&gt;
 *     &lt;enumeration value="DSM"/&gt;
 *     &lt;enumeration value="VIII"/&gt;
 *     &lt;enumeration value="ESQ"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="IV"/&gt;
 *     &lt;enumeration value="GC"/&gt;
 *     &lt;enumeration value="JNR"/&gt;
 *     &lt;enumeration value="JP"/&gt;
 *     &lt;enumeration value="KB"/&gt;
 *     &lt;enumeration value="KCMG"/&gt;
 *     &lt;enumeration value="KCB"/&gt;
 *     &lt;enumeration value="KBE"/&gt;
 *     &lt;enumeration value="KCVO"/&gt;
 *     &lt;enumeration value="KG"/&gt;
 *     &lt;enumeration value="AK"/&gt;
 *     &lt;enumeration value="KT"/&gt;
 *     &lt;enumeration value="MD"/&gt;
 *     &lt;enumeration value="OAM"/&gt;
 *     &lt;enumeration value="MP"/&gt;
 *     &lt;enumeration value="MHA"/&gt;
 *     &lt;enumeration value="MHR"/&gt;
 *     &lt;enumeration value="MLA"/&gt;
 *     &lt;enumeration value="MLC"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="MBE"/&gt;
 *     &lt;enumeration value="MC"/&gt;
 *     &lt;enumeration value="IX"/&gt;
 *     &lt;enumeration value="OC"/&gt;
 *     &lt;enumeration value="AO"/&gt;
 *     &lt;enumeration value="OBE"/&gt;
 *     &lt;enumeration value="OM"/&gt;
 *     &lt;enumeration value="QC"/&gt;
 *     &lt;enumeration value="II"/&gt;
 *     &lt;enumeration value="SNR"/&gt;
 *     &lt;enumeration value="VII"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *     &lt;enumeration value="SC"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="III"/&gt;
 *     &lt;enumeration value="VC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "nameSuffix")
@XmlEnum
public enum NameSuffix {

    BM,
    BEM,
    COMDC,
    CH,
    AC,
    CV,
    DCMG,
    DCB,
    DBE,
    DCVO,
    AD,
    DFM,
    DSC,
    DSM,
    VIII,
    ESQ,
    V,
    I,
    IV,
    GC,
    JNR,
    JP,
    KB,
    KCMG,
    KCB,
    KBE,
    KCVO,
    KG,
    AK,
    KT,
    MD,
    OAM,
    MP,
    MHA,
    MHR,
    MLA,
    MLC,
    AM,
    MBE,
    MC,
    IX,
    OC,
    AO,
    OBE,
    OM,
    QC,
    II,
    SNR,
    VII,
    VI,
    SC,
    X,
    III,
    VC;

    public String value() {
        return name();
    }

    public static NameSuffix fromValue(String v) {
        return valueOf(v);
    }

}
