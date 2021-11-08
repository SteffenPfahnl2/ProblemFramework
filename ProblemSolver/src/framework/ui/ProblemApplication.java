package framework.ui;

import domains.arithmetic.ArithmeticProblem;
import domains.dummy.DummyProblem;
import domains.farmer.FarmerProblem;
import domains.puzzle.PuzzleProblem;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 * This class presents problem solving domains in a tabbed pane.
 */
public class ProblemApplication extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TabPane tabPane = new TabPane();
        
	/* Add tabs using the following */

	Tab tab1 = new Tab();
        tab1.setText("FWGC");
        tab1.setContent(new ProblemGUI(new FarmerProblem(), 650, 550));
        
        Tab tab2 = new Tab();
        tab2.setText("8-Puzzle");
        tab2.setContent(new ProblemGUI(new PuzzleProblem(), 650, 550));
        
        
        Tab tab3 = new Tab();
        tab3.setText("Dummy");
        tab3.setContent(new ProblemGUI(new DummyProblem(), 650, 550));
        
        Tab tab4 = new Tab();
        tab4.setText("Arithmetic");
        tab4.setContent(new ProblemGUI(new ArithmeticProblem(), 650, 550));
        
        tabPane.getTabs().addAll(tab1, tab2, tab3, tab4);

	//... 
        
        Scene scene = new Scene(tabPane);
        primaryStage.setTitle("Problem Solver");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
