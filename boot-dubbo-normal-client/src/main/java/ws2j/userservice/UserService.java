package ws2j.userservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2015-10-12T15:39:23.140+08:00
 * Generated source version: 3.1.2
 * 
 */
@WebServiceClient(name = "UserService", 
                  wsdlLocation = "http://192.168.100.220:9091/boot.dubbo.api.UserService?wsdl",
                  targetNamespace = "http://api.dubbo.boot/") 
public class UserService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://api.dubbo.boot/", "UserService");
    public final static QName UserServicePort = new QName("http://api.dubbo.boot/", "UserServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.100.220:9091/boot.dubbo.api.UserService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UserService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.100.220:9091/boot.dubbo.api.UserService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UserService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UserService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public UserService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UserService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UserService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UserServicePortType
     */
    @WebEndpoint(name = "UserServicePort")
    public UserServicePortType getUserServicePort() {
        return super.getPort(UserServicePort, UserServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserServicePortType
     */
    @WebEndpoint(name = "UserServicePort")
    public UserServicePortType getUserServicePort(WebServiceFeature... features) {
        return super.getPort(UserServicePort, UserServicePortType.class, features);
    }

}
