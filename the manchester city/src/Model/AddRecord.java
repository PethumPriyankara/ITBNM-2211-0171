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
public class AddRecord {
    Statement stmt;
    
     
     
     public void AddPlayer(String name, String Id, String age, String position) {
        try {
            stmt = DbConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO playerdetails VALUES('"+name+"', '"+Id+"', '"+age+"','"+position+"')");
        }
       
        catch(Exception e){
           e.printStackTrace();
       }
    }

     public void CreatenewUser(String name, String Id, String pass) {
        try {
            stmt = DbConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO userdetails VALUES('"+name+"', '"+Id+"', '"+pass+"')");
        }
       
        catch(SQLException e){
       }
    }
     
     
}
