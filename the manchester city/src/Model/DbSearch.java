/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.DbConnection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author pethum priyankara
 */
public class DbSearch {
    Statement stmt;
    ResultSet rs;
    ResultSet rows;
    
    public ResultSet searchLogin(String SId){
      try{
         stmt= DbConnection.getStatementConnection();
         String id= SId;
         //Execute the Query
         rs= stmt.executeQuery("SELECT * FROM userdetails WHERE UserID='"+id+"'");
      }
      catch(Exception e){
          e.printStackTrace();
      }
      return rs;
    }
    
    public ResultSet SearchPlayer(String ID){
        try{
            stmt= DbConnection.getStatementConnection();
            String playerID= ID;
        //Execute the Query
        rs= stmt.executeQuery("SELECT * FROM playerdetails WHERE IDNumber='"+playerID+"'");
        }
        catch(Exception e){
            e.printStackTrace();
        }
      return rs;
    
    }
    
    public ResultSet SearchAll(){
        try{
            stmt= DbConnection.getStatementConnection();
            
            //Execute the Query   
             rs = stmt.executeQuery("SELECT * FROM playerdetails");
        }
        catch(Exception e){
            e.printStackTrace();
        }
      return rs;
    }
    
   
}

   
