/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domains.farmer;

import framework.ui.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author pfahn
 */
public class FarmerGUI extends Application{
    
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new ProblemGUI(new FarmerProblem(), 650, 550));
        stage.setTitle("FWGC GUI");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
