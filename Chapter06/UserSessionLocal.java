
package com.pronetbeans.examples;

import javax.ejb.Local;


/**
 * This is the business interface for UserSession enterprise bean.
 */
@Local
public interface UserSessionLocal {
    boolean isValidUser(String sUsername);

    boolean isValidAdmin(String sUsername);

    void sendForgotPassword(String sUsername);


}