
package au.net.electronichealth.ns.pcehr.svc.getchangehistoryview._1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.Holder;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.PCEHRHeader;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.Signature;
import au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.Timestamp;
import au.net.electronichealth.ns.pcehr.xsd.interfaces.getchangehistoryview._1.GetChangeHistoryView;
import au.net.electronichealth.ns.pcehr.xsd.interfaces.getchangehistoryview._1.GetChangeHistoryViewResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetChangeHistoryViewPortType", targetNamespace = "http://ns.electronichealth.net.au/pcehr/svc/getChangeHistoryView/1.1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ObjectFactory.class,
    au.net.electronichealth.ns.pcehr.xsd.interfaces.getchangehistoryview._1.ObjectFactory.class,
    au.net.electronichealth.ns.wsp.xsd.standarderror._2010.ObjectFactory.class,
    oasis.names.tc.ebxml_regrep.xsd.rim._3.ObjectFactory.class,
    oasis.names.tc.ebxml_regrep.xsd.rs._3.ObjectFactory.class,
    pcehr_override.org.w3.ObjectFactory.class
})
public interface GetChangeHistoryViewPortType {


    /**
     * 
     * @param pcehrHeader
     * @param parameters0
     * @param timestampHeader
     * @param parameters
     * @param signatureHeader
     * @throws StandardErrorMsg
     */
    @WebMethod
    @Action(input = "http://ns.electronichealth.net.au/pcehr/svc/GetChangeHistoryView/1.1/GetChangeHistoryViewPortType/getChangeHistoryViewRequest", output = "http://ns.electronichealth.net.au/pcehr/svc/GetChangeHistoryView/1.1/GetChangeHistoryViewPortType/getChangeHistoryViewResponse", fault = {
        @FaultAction(className = StandardErrorMsg.class, value = "http://ns.electronichealth.net.au/pcehr/svc/GetChangeHistoryView/1.1/GetChangeHistoryViewPortType/Fault/standardError")
    })
    public void getChangeHistoryView(
        @WebParam(name = "getChangeHistoryView", targetNamespace = "http://ns.electronichealth.net.au/pcehr/xsd/interfaces/GetChangeHistoryView/1.0", partName = "parameters")
        GetChangeHistoryView parameters,
        @WebParam(name = "getChangeHistoryViewResponse", targetNamespace = "http://ns.electronichealth.net.au/pcehr/xsd/interfaces/GetChangeHistoryView/1.0", mode = WebParam.Mode.OUT, partName = "parameters")
        Holder<GetChangeHistoryViewResponse> parameters0,
        @WebParam(name = "timestamp", targetNamespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", header = true, partName = "timestampHeader")
        Timestamp timestampHeader,
        @WebParam(name = "signature", targetNamespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", header = true, mode = WebParam.Mode.INOUT, partName = "signatureHeader")
        Holder<Signature> signatureHeader,
        @WebParam(name = "PCEHRHeader", targetNamespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", header = true, partName = "PCEHRHeader")
        PCEHRHeader pcehrHeader)
        throws StandardErrorMsg
    ;

}
