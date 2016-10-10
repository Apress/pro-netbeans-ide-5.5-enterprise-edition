
package com.pronetbeans.examples.services;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;


public class PnbMessageHandler implements SOAPHandler<SOAPMessageContext> {

    public boolean handleMessage(SOAPMessageContext messageContext) {
        SOAPMessage msg = messageContext.getMessage();

        try {
            SOAPHeader spHead = msg.getSOAPHeader();
            Iterator iter = spHead.examineAllHeaderElements();

            while(iter.hasNext()) {
                Object obj = iter.next();
                System.out.println("obj.toString() = " + obj.toString());
            }


        } catch (SOAPException ex) {
            ex.printStackTrace();
        }

        return true;
    }

    public Set<QName> getHeaders() {
        return Collections.EMPTY_SET;
    }

    public boolean handleFault(SOAPMessageContext messageContext) {
        return true;
    }

    public void close(MessageContext context) {
    }
}
