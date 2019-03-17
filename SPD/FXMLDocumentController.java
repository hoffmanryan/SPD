/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stt;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 *
 * @author ryanhoffman
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleClose(MouseEvent event) {
        System.exit(0);
    }
    
    //This method will change the scene from the stt main page to the 
    //password recovery scene
    @FXML
    public void forgotPassword(ActionEvent event) throws IOException
    {
        Parent passwordParent = FXMLLoader.load(getClass().getResource("password.fxml"));
        Scene passwordScene = new Scene(passwordParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(passwordScene);
        window.show();
    }
    
    
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
