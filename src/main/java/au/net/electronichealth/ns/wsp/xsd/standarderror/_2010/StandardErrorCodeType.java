
package au.net.electronichealth.ns.wsp.xsd.standarderror._2010;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for StandardErrorCodeType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="StandardErrorCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="servicePermanentUnavailable"/&gt;
 *     &lt;enumeration value="serviceTemporaryUnavailable"/&gt;
 *     &lt;enumeration value="certificateSkiMissing"/&gt;
 *     &lt;enumeration value="certificateKeyUsage"/&gt;
 *     &lt;enumeration value="invalidCredentials"/&gt;
 *     &lt;enumeration value="notAuthenticated"/&gt;
 *     &lt;enumeration value="notAuthorised"/&gt;
 *     &lt;enumeration value="badParam"/&gt;
 *     &lt;enumeration value="badlyFormedMsg"/&gt;
 *     &lt;enumeration value="badTimestamp"/&gt;
 *     &lt;enumeration value="badSignature"/&gt;
 *     &lt;enumeration value="badEncryption"/&gt;
 *     &lt;enumeration value="badSigEncOrder"/&gt;
 *     &lt;enumeration value="badCertificateTransmitted"/&gt;
 *     &lt;enumeration value="badWsaAction"/&gt;
 *     &lt;enumeration value="badWsaMessageId"/&gt;
 *     &lt;enumeration value="badWsaTo"/&gt;
 *     &lt;enumeration value="badAlgorithmDataEncryption"/&gt;
 *     &lt;enumeration value="badAlgorithmKeyEncryption"/&gt;
 *     &lt;enumeration value="badAlgorithmC14N"/&gt;
 *     &lt;enumeration value="badAlgorithmDigest"/&gt;
 *     &lt;enumeration value="badAlgorithmSignature"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "StandardErrorCodeType")
@XmlEnum
public enum StandardErrorCodeType {

    @XmlEnumValue("servicePermanentUnavailable")
    SERVICE_PERMANENT_UNAVAILABLE("servicePermanentUnavailable"),
    @XmlEnumValue("serviceTemporaryUnavailable")
    SERVICE_TEMPORARY_UNAVAILABLE("serviceTemporaryUnavailable"),
    @XmlEnumValue("certificateSkiMissing")
    CERTIFICATE_SKI_MISSING("certificateSkiMissing"),
    @XmlEnumValue("certificateKeyUsage")
    CERTIFICATE_KEY_USAGE("certificateKeyUsage"),
    @XmlEnumValue("invalidCredentials")
    INVALID_CREDENTIALS("invalidCredentials"),
    @XmlEnumValue("notAuthenticated")
    NOT_AUTHENTICATED("notAuthenticated"),
    @XmlEnumValue("notAuthorised")
    NOT_AUTHORISED("notAuthorised"),
    @XmlEnumValue("badParam")
    BAD_PARAM("badParam"),
    @XmlEnumValue("badlyFormedMsg")
    BADLY_FORMED_MSG("badlyFormedMsg"),
    @XmlEnumValue("badTimestamp")
    BAD_TIMESTAMP("badTimestamp"),
    @XmlEnumValue("badSignature")
    BAD_SIGNATURE("badSignature"),
    @XmlEnumValue("badEncryption")
    BAD_ENCRYPTION("badEncryption"),
    @XmlEnumValue("badSigEncOrder")
    BAD_SIG_ENC_ORDER("badSigEncOrder"),
    @XmlEnumValue("badCertificateTransmitted")
    BAD_CERTIFICATE_TRANSMITTED("badCertificateTransmitted"),
    @XmlEnumValue("badWsaAction")
    BAD_WSA_ACTION("badWsaAction"),
    @XmlEnumValue("badWsaMessageId")
    BAD_WSA_MESSAGE_ID("badWsaMessageId"),
    @XmlEnumValue("badWsaTo")
    BAD_WSA_TO("badWsaTo"),
    @XmlEnumValue("badAlgorithmDataEncryption")
    BAD_ALGORITHM_DATA_ENCRYPTION("badAlgorithmDataEncryption"),
    @XmlEnumValue("badAlgorithmKeyEncryption")
    BAD_ALGORITHM_KEY_ENCRYPTION("badAlgorithmKeyEncryption"),
    @XmlEnumValue("badAlgorithmC14N")
    BAD_ALGORITHM_C_14_N("badAlgorithmC14N"),
    @XmlEnumValue("badAlgorithmDigest")
    BAD_ALGORITHM_DIGEST("badAlgorithmDigest"),
    @XmlEnumValue("badAlgorithmSignature")
    BAD_ALGORITHM_SIGNATURE("badAlgorithmSignature");
    private final String value;

    StandardErrorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StandardErrorCodeType fromValue(String v) {
        for (StandardErrorCodeType c: StandardErrorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
