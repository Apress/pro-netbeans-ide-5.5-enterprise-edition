

package com.pronetbeans.examples.ejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.BytesMessage;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.StreamMessage;
import javax.jms.TextMessage;
import javax.sql.DataSource;

/**
 * Entity class OrderMessage
 *
 * @author Adam Myatt
 */
@MessageDriven(mappedName = "jms/OrderMessage", activationConfig =  {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class OrderMessage implements MessageListener {

    @Resource(name = "jdbc/PNBDataSource")
    private DataSource jdbcPNBDataSource;

    /** Creates a new instance of OrderMessage */
    public OrderMessage() {
    }

    public void onMessage(Message message) {

    Connection conn = null;
    PreparedStatement pstmt = null;
    String sSql = "INSERT INTO MESSAGES VALUES(?)";

        if(message instanceof TextMessage) {
            try {

                TextMessage txtmsg = (TextMessage)message;
                System.out.println("Message is = " + txtmsg.getText());

                conn = jdbcPNBDataSource.getConnection();
                pstmt = conn.prepareStatement(sSql);
                pstmt.setString(1,txtmsg.getText());
            pstmt.execute();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if(conn!=null && !conn.isClosed())  {
                        conn.close();
                    }
                } catch(SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (message instanceof ObjectMessage) {
            // do something
        } else if (message instanceof StreamMessage) {
            // do something
        } else if (message instanceof MapMessage) {
            // do something
        } else if (message instanceof BytesMessage) {
            // do something
        } else {
            // unknown type
        }
    }
}
