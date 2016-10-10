
package pnbcustomerclientapp;

import com.pronetbeans.examples.client.Customer;
import com.pronetbeans.examples.client.CustomerInfo;
import com.pronetbeans.examples.client.CustomerInfoService;


public class Main {

    /** Creates a new instance of Main */
    public Main() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            CustomerInfoService service = new CustomerInfoService();
            CustomerInfo port = service.getCustomerInfoPort();

            long lngCustomerId = 1234567890;

            Customer result = port.getCustomerById(lngCustomerId);

            System.out.println(" Cust Id = " + result.getId());
            System.out.println(" First   = " + result.getFirstName());
            System.out.println(" Last    = " + result.getLastName());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
