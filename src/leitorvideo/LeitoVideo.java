/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leitovideo;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author doroteia
 */
public class LeitoVideo extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("/View/Leitor.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
       // stage.getIcons().add(new Image(Path.icon ));
        stage.centerOnScreen();
           stage.setOnHidden((WindowEvent e)->{
            System.exit(0);
        
        });
          
        stage.show();
        
        
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
