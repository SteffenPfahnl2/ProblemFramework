package domains.puzzle;

/**
 * This class sets up the console for ArithmeticConsole.
 * @author Steffen Pfahnl
 */

import framework.ui.ProblemConsole;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PuzzleConsole extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new ProblemConsole(new PuzzleProblem(), 450, 550));
        primaryStage.setTitle("Testing Puzzle Console");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}