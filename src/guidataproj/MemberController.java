/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidataproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class MemberController {
    
    Connection connection = null;
    String dbName="Members";
    String userName="root";
    String password="";
    
    public Connection connectDB(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");                    
            connection = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);
            JOptionPane.showMessageDialog(null, "Connected to database");
            return connection;
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }


        
    }

    
    
}
