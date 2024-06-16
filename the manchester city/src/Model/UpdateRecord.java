/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author pethum priyankara
 */
public class UpdateRecord {
    
    Statement stmt;        
    
    public void UpdatePlayer(String ID, String Name,int Age,String Position){
        try {
            stmt = DbConnection.getStatementConnection();

            stmt.executeUpdate("UPDATE playerdetails SET Name='"+Name+"', Age='"+Age+"', Position='"+Position+"' WHERE IDNumber='"+ID+"' ");
        }
       
       catch(Exception e){
           e.printStackTrace();
       }
    }
    
         
     public void Fpassword(String Id, String pass){
        try {
            stmt = DbConnection.getStatementConnection();

            stmt.executeUpdate("UPDATE userdetails SET Password = '"+pass+"' WHERE UserID = '"+Id+"'" ); // update password

        }
       
       catch(SQLException e){
       }
    }
    
}
