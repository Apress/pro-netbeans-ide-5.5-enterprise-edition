package com.pronetbeans.examples.services;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService()
@HandlerChain(name = "CustomerInfo_handlerChain", file = "CustomerInfo_handler.xml")
public class CustomerInfo {
    /**
     * Web service operation
     */
    @WebMethod
    public Customer getCustomerById(@WebParam(name = "lngCustomerId") long lngCustomerId) {

        Customer newCust = new Customer();
        newCust.setId(1234567890);
        newCust.setFirstName("Adam");
        newCust.setLastName("Myatt");

        if(lngCustomerId == 1234567890) {
            return newCust;
        } else {
            return null;
        }
    }

}
