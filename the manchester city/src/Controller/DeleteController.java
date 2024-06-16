/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author pethum priyankara
 */
public class DeleteController {

    
    public static void DeletePlayer(String ID ){
         
        new Model.DeleteRecord().DeletePlayer(ID);
        JOptionPane.showMessageDialog(null, "Player Details has been deleted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
               
    }
    
}
