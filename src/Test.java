import project.wsdl.CustomerServiceService;
import project.wsdl.CustomerServiceWS;

/**
 * Created by Stephen on 2014/12/26.
 */


public class Test {

    public static void main(String[] args) {

        CustomerServiceWS csw = new CustomerServiceService().getCustomerServicePort();

        System.out.println(csw.checkLogin(1, "Test"));
    }
}
