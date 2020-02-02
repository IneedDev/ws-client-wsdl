
package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UC", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UC {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "c2f")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "c2f", targetNamespace = "http://service/", className = "client.C2F")
    @ResponseWrapper(localName = "c2fResponse", targetNamespace = "http://service/", className = "client.C2FResponse")
    @Action(input = "http://service/UC/c2fRequest", output = "http://service/UC/c2fResponse")
    public double c2F(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "cm2in")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cm2in", targetNamespace = "http://service/", className = "client.Cm2In")
    @ResponseWrapper(localName = "cm2inResponse", targetNamespace = "http://service/", className = "client.Cm2InResponse")
    @Action(input = "http://service/UC/cm2inRequest", output = "http://service/UC/cm2inResponse")
    public double cm2In(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "f2c")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "f2c", targetNamespace = "http://service/", className = "client.F2C")
    @ResponseWrapper(localName = "f2cResponse", targetNamespace = "http://service/", className = "client.F2CResponse")
    @Action(input = "http://service/UC/f2cRequest", output = "http://service/UC/f2cResponse")
    public double f2C(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "in2cm")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "in2cm", targetNamespace = "http://service/", className = "client.In2Cm")
    @ResponseWrapper(localName = "in2cmResponse", targetNamespace = "http://service/", className = "client.In2CmResponse")
    @Action(input = "http://service/UC/in2cmRequest", output = "http://service/UC/in2cmResponse")
    public double in2Cm(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

}
