
package au.net.electronichealth.ns.pcehr.xsd.interfaces.getview._1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.pcehr.xsd.interfaces.getview._1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.pcehr.xsd.interfaces.getview._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetViewResponse }
     * 
     */
    public GetViewResponse createGetViewResponse() {
        return new GetViewResponse();
    }

    /**
     * Create an instance of {@link GetViewResponse.View }
     * 
     */
    public GetViewResponse.View createGetViewResponseView() {
        return new GetViewResponse.View();
    }

    /**
     * Create an instance of {@link GetView }
     * 
     */
    public GetView createGetView() {
        return new GetView();
    }

}
