
package au.net.electronichealth.ns.tplt.svc.gettemplate._1;

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
import au.net.electronichealth.ns.tplt.xsd.interfaces.gettemplate._1.GetTemplate;
import au.net.electronichealth.ns.tplt.xsd.interfaces.gettemplate._1.GetTemplateResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "GetTemplatePortType", targetNamespace = "http://ns.electronichealth.net.au/tplt/svc/GetTemplate/1.1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    au.net.electronichealth.ns.pcehr.xsd.common.commoncoreelements._1.ObjectFactory.class,
    au.net.electronichealth.ns.tplt.xsd.interfaces.gettemplate._1.ObjectFactory.class,
    au.net.electronichealth.ns.tplt.xsd.common.templatescoreelements._1.ObjectFactory.class,
    au.net.electronichealth.ns.wsp.xsd.standarderror._2010.ObjectFactory.class,
    pcehr_override.org.w3.ObjectFactory.class
})
public interface GetTemplatePortType {


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
    @Action(input = "http://ns.electronichealth.net.au/tplt/svc/GetTemplate/1.1/GetTemplatePortType/getTemplateRequest", output = "http://ns.electronichealth.net.au/tplt/svc/GetTemplate/1.1/GetTemplatePortType/getTemplateResponse", fault = {
        @FaultAction(className = StandardErrorMsg.class, value = "http://ns.electronichealth.net.au/tplt/svc/GetTemplate/1.1/GetTemplatePortType/Fault/standardError")
    })
    public void getTemplate(
        @WebParam(name = "getTemplate", targetNamespace = "http://ns.electronichealth.net.au/tplt/xsd/interfaces/GetTemplate/1.0", partName = "parameters")
        GetTemplate parameters,
        @WebParam(name = "getTemplateResponse", targetNamespace = "http://ns.electronichealth.net.au/tplt/xsd/interfaces/GetTemplate/1.0", mode = WebParam.Mode.OUT, partName = "parameters")
        Holder<GetTemplateResponse> parameters0,
        @WebParam(name = "timestamp", targetNamespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", header = true, partName = "timestampHeader")
        Timestamp timestampHeader,
        @WebParam(name = "signature", targetNamespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", header = true, mode = WebParam.Mode.INOUT, partName = "signatureHeader")
        Holder<Signature> signatureHeader,
        @WebParam(name = "PCEHRHeader", targetNamespace = "http://ns.electronichealth.net.au/pcehr/xsd/common/CommonCoreElements/1.0", header = true, partName = "PCEHRHeader")
        PCEHRHeader pcehrHeader)
        throws StandardErrorMsg
    ;

}