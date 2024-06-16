/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.UserLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author pathum priyankara
 */
public class InsertController {
    
     public static void CreateUser(String CName, String UID, String pw1,String pw2) {
         
        String pass = null;
        
        if(pw1.equals(pw2)){
             
             pass = pw2;
        new Model.AddRecord().CreatenewUser( CName, UID, pass);
            
        JOptionPane.showMessageDialog(null, "User account has been created", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        UserLogin log = new  UserLogin();
        log.setVisible(true);
        
             
         }
         else{
              JOptionPane.showMessageDialog(null, "Invalid Password","Error", JOptionPane.INFORMATION_MESSAGE);
         }
        
    }
     
  

    public static void AddPlayer(String name, String Id, String age,String position){
        
        new Model.AddRecord().AddPlayer(name, Id , age, position);
        JOptionPane.showMessageDialog(null, "Member Details has been Inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
        

   }
    
    
}
