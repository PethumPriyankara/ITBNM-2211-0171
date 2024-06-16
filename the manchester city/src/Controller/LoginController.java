/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DbConnection;
import Model.DbSearch;
import View.UserLogin;
import View.Menu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pethum priyankara
 */
public class LoginController {
    public static void login(String uID, String pass) {
        try {
 
            String UserID = null; // initial value of the Society ID
            String password = null; // initial value of the password
 
            ResultSet rs = new DbSearch().searchLogin(uID);
//Process the Query
        while (rs.next()) {
            UserID = rs.getString("UserID"); //assign database login ID to the variable
            password = rs.getString("Password"); //assign database password to the variable
        }
 
            if (UserID != null && password != null) {
                if (password.equals(pass)) {
 
                    System.out.println("Login Successfull");//Display Successfull Message
          
                    //Login Menu Frame
                    Menu m1 = new Menu();
                    m1.setVisible(true);

                    //close Frame
                    UserLogin.getFrames()[0].dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please check the password ", "Error", JOptionPane.ERROR_MESSAGE); //Display Error Message
                }
            }
            else {
            JOptionPane.showMessageDialog(null, "Please check the ID ", "Error", JOptionPane.ERROR_MESSAGE); // Display Error Message
            }
    
            DbConnection.closeCon();
        } catch (SQLException ex) 
    { 
        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
    }
 }

      
}
