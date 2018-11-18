/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidataproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;


public class FXMLDocumentController {
    
    //Database variables
    public Connection conn = null; 
    final String dbName="jdbc:mysql://localhost/sakila";
    final String userName="root";
    final String password="e5hb9o2is";
    final String selectQuery = 
        "SELECT first_name, last_name, email, address_id FROM sakila.customer";
    
    //First name Column
    @FXML
    TableColumn First;
    
    @FXML
    TableColumn Last;
   
    @FXML
    TableColumn Email;
    
    @FXML
    TableColumn Region;
    
    //Connect Button event handle
    @FXML
    public void connect(ActionEvent connect){
        
        try (
        //Connect to the database specified in the variables 
        Connection conn = DriverManager.getConnection(
            dbName,userName,password);
        Statement statement = conn.createStatement();
        
        ResultSet resultSet = statement.executeQuery(selectQuery)){
                resultSet.next();
                First.setText(resultSet.getString(3));
                Last.setText(resultSet.getString(4));
                Email.setText(resultSet.getString(5));
                Region.setText(resultSet.getString(6));
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } 

        
    }
}
    
    
