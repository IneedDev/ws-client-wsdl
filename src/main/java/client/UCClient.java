package client;

import client.UC;
import client.UCServiceImplService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class UCClient {

    public static void main(String[] args) throws Exception{


//        URL url = new URL("http://localhost:1234C?wsdl");
//        QName qName = new QName("http://service/", "UCServiceImplService");
//        Service service = Service.create(url, qName);
//        //portType describes a Web service interface via its operations.
//        qName = new QName("http://service/", "UCServiceImplPort");
//        UC uc = service.getPort(qName, UC.class);
//        System.out.println("now we call methods from server " + uc.c2F(37));

        UCServiceImplService ucServiceImplService = new UCServiceImplService();
        UC uc = ucServiceImplService.getUCServiceImplPort();
        System.out.println(uc.c2F(37));

    }
}
