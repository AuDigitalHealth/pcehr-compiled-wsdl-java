
package au.net.electronichealth.ns.pcehr.svc.getchangehistoryview._1;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "getChangeHistoryViewService", targetNamespace = "http://ns.electronichealth.net.au/pcehr/svc/getChangeHistoryView/1.1", wsdlLocation = "wsdl/B2B_GetChangeHistoryView.wsdl")
public class GetChangeHistoryViewService
    extends Service
{

    private final static URL GETCHANGEHISTORYVIEWSERVICE_WSDL_LOCATION;
    private final static WebServiceException GETCHANGEHISTORYVIEWSERVICE_EXCEPTION;
    private final static QName GETCHANGEHISTORYVIEWSERVICE_QNAME = new QName("http://ns.electronichealth.net.au/pcehr/svc/getChangeHistoryView/1.1", "getChangeHistoryViewService");

    static {
        GETCHANGEHISTORYVIEWSERVICE_WSDL_LOCATION = au.net.electronichealth.ns.pcehr.svc.getchangehistoryview._1.GetChangeHistoryViewService.class.getResource("wsdl/B2B_GetChangeHistoryView.wsdl");
        WebServiceException e = null;
        if (GETCHANGEHISTORYVIEWSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'wsdl/B2B_GetChangeHistoryView.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        GETCHANGEHISTORYVIEWSERVICE_EXCEPTION = e;
    }

    public GetChangeHistoryViewService() {
        super(__getWsdlLocation(), GETCHANGEHISTORYVIEWSERVICE_QNAME);
    }

    public GetChangeHistoryViewService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETCHANGEHISTORYVIEWSERVICE_QNAME, features);
    }

    public GetChangeHistoryViewService(URL wsdlLocation) {
        super(wsdlLocation, GETCHANGEHISTORYVIEWSERVICE_QNAME);
    }

    public GetChangeHistoryViewService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETCHANGEHISTORYVIEWSERVICE_QNAME, features);
    }

    public GetChangeHistoryViewService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetChangeHistoryViewService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetChangeHistoryViewPortType
     */
    @WebEndpoint(name = "getChangeHistoryViewSOAP12Port")
    public GetChangeHistoryViewPortType getGetChangeHistoryViewSOAP12Port() {
        return super.getPort(new QName("http://ns.electronichealth.net.au/pcehr/svc/getChangeHistoryView/1.1", "getChangeHistoryViewSOAP12Port"), GetChangeHistoryViewPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetChangeHistoryViewPortType
     */
    @WebEndpoint(name = "getChangeHistoryViewSOAP12Port")
    public GetChangeHistoryViewPortType getGetChangeHistoryViewSOAP12Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ns.electronichealth.net.au/pcehr/svc/getChangeHistoryView/1.1", "getChangeHistoryViewSOAP12Port"), GetChangeHistoryViewPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETCHANGEHISTORYVIEWSERVICE_EXCEPTION!= null) {
            throw GETCHANGEHISTORYVIEWSERVICE_EXCEPTION;
        }
        return GETCHANGEHISTORYVIEWSERVICE_WSDL_LOCATION;
    }

}