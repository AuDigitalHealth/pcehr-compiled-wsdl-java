
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getauditview._1;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.pcehr.xsd.interfaces.getauditview._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.pcehr.xsd.interfaces.getauditview._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAuditViewResponse }
     * 
     */
    public GetAuditViewResponse createGetAuditViewResponse() {
        return new GetAuditViewResponse();
    }

    /**
     * Create an instance of {@link GetAuditViewResponse.AuditView }
     * 
     */
    public GetAuditViewResponse.AuditView createGetAuditViewResponseAuditView() {
        return new GetAuditViewResponse.AuditView();
    }

    /**
     * Create an instance of {@link GetAuditViewResponse.AuditView.EventTrail }
     * 
     */
    public GetAuditViewResponse.AuditView.EventTrail createGetAuditViewResponseAuditViewEventTrail() {
        return new GetAuditViewResponse.AuditView.EventTrail();
    }

    /**
     * Create an instance of {@link GetAuditViewResponse.AuditView.EventTrail.LogEvent }
     * 
     */
    public GetAuditViewResponse.AuditView.EventTrail.LogEvent createGetAuditViewResponseAuditViewEventTrailLogEvent() {
        return new GetAuditViewResponse.AuditView.EventTrail.LogEvent();
    }

    /**
     * Create an instance of {@link GetAuditView }
     * 
     */
    public GetAuditView createGetAuditView() {
        return new GetAuditView();
    }

    /**
     * Create an instance of {@link GetAuditViewResponse.AuditView.EventTrail.AuditEvent }
     * 
     */
    public GetAuditViewResponse.AuditView.EventTrail.AuditEvent createGetAuditViewResponseAuditViewEventTrailAuditEvent() {
        return new GetAuditViewResponse.AuditView.EventTrail.AuditEvent();
    }

}
