/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DbSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pethum priyankara
 */
public class UpdateController {
    
    public static void UpdatePlayer(String ID,String Name,String Age,String Position){
        int age = Integer.parseInt(Age);
        new Model.UpdateRecord().UpdatePlayer(ID, Name, age, Position);
        
        JOptionPane.showMessageDialog(null, "Player Details has been updated ", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
    
        public static void Fpassword(String UId, String Npass, String Cpass){
       
        String name = null;
        ResultSet rs = new DbSearch().searchLogin(UId);
        
        try {
            while (rs.next()) {
                name = rs.getString("UserName");
            }
            
            if(name==null){
                JOptionPane.showMessageDialog(null, "User ID not found ", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else{
                if(Npass.equals(Cpass)){
                    String pass = Cpass;
                    new Model.UpdateRecord().Fpassword(UId, pass);
                    JOptionPane.showMessageDialog(null, "New password has been created", "Successfull", JOptionPane.INFORMATION_MESSAGE);
                }   
                else {
                    JOptionPane.showMessageDialog(null, "Password doesn't match", "ERROR", JOptionPane.ERROR_MESSAGE);               
                }
            }
   
            
        }catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    
}
