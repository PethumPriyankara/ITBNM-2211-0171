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
public class DeleteRecord {
    
    Statement stmt;
    
    public void DeletePlayer(String ID){
        try{
            stmt = DbConnection.getStatementConnection();

            stmt.executeUpdate("DELETE FROM playerdetails WHERE IDNumber='"+ID+"' ");
        }
       catch(SQLException e){
       }
    }
    
}
