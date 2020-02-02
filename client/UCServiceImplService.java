
package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UCServiceImplService", targetNamespace = "http://service/", wsdlLocation = "http://localhost:1234/Service?wsdl")
public class UCServiceImplService
    extends Service
{

    private final static URL UCSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException UCSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName UCSERVICEIMPLSERVICE_QNAME = new QName("http://service/", "UCServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1234/Service?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UCSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        UCSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public UCServiceImplService() {
        super(__getWsdlLocation(), UCSERVICEIMPLSERVICE_QNAME);
    }

    public UCServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UCSERVICEIMPLSERVICE_QNAME, features);
    }

    public UCServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, UCSERVICEIMPLSERVICE_QNAME);
    }

    public UCServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UCSERVICEIMPLSERVICE_QNAME, features);
    }

    public UCServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UCServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UC
     */
    @WebEndpoint(name = "UCServiceImplPort")
    public UC getUCServiceImplPort() {
        return super.getPort(new QName("http://service/", "UCServiceImplPort"), UC.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UC
     */
    @WebEndpoint(name = "UCServiceImplPort")
    public UC getUCServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "UCServiceImplPort"), UC.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UCSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw UCSERVICEIMPLSERVICE_EXCEPTION;
        }
        return UCSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
