wsimport tool to generate client-support - wsdl will be parsed

       navigate to wsdl output directory - "client" package name of our WS Cilent
       wsimport -keep -p client http://localhost:1234/Service?wsdl


The -keep option causes wsimport to save the source code for these class files as well,

Call ws implementation from server

        URL url = new URL("http://localhost:1234C?wsdl");
        QName qName = new QName("http://service/", "UCServiceImplService");
        Service service = Service.create(url, qName);
        //portType describes a Web service interface via its operations.
        qName = new QName("http://service/", "UCServiceImplPort");
        UC uc = service.getPort(qName, UC.class);
        System.out.println("now we call methods from server " + uc.c2F(37));
        
Use wsdl generated classes

        UCServiceImplService ucServiceImplService = new UCServiceImplService();
        UC uc = ucServiceImplService.getUCServiceImplPort();
        System.out.println(uc.c2F(37));
        
        
WS Server implementation can be found: 

https://github.com/IneedDev/ws-server-client