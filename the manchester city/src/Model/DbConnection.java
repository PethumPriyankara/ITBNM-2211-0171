/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pethum priyankara
 */
public class DbConnection {
    static Connection conn;
    static Statement stat=null;
    
    public static Statement getStatementConnection() {
        try{
            String url="jdbc:mysql://localhost:3306/sportsociety";
            conn= DriverManager.getConnection(url, "root" , "");
            
                stat=conn.createStatement();
        }
        
        catch (Exception e){
            e.printStackTrace();
        }
            return stat;
    }
public static void closeCon() throws SQLException{
    conn.close();
}

    public static Connection Connect(){
        
        Connection Con = null;
        
        try{
         Class.forName("Con.mysql.jdbc.Driver");
         
         Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/memberdb","root","");
        
        
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }

        return Con;
    
    }
    
}
