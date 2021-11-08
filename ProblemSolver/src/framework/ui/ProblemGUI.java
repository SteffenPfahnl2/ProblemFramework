/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.ui;

import framework.problem.*;
import framework.solution.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

/**
 *
 * @author pfahn
 */
public class ProblemGUI extends VBox {
    
    public ProblemGUI(Problem problem, double width, double height) {
        this.problem = problem;
        this.width = width;
        this.height = height;
        solver = new SolvingAssistant(problem);
        this.setPrefSize(width, height);
        this.setAlignment(Pos.CENTER);
        
        introduction = new Label(problem.getIntroduction());
        introduction.setWrapText(true);
        introduction.setFont(Font.font("Verdana", FontPosture.REGULAR, 13));
        
        
        welcome = new Label("Welcome to the: " + problem.getName() + " problem.");
        welcome.setWrapText(true);
        welcome.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 17));
        
        resetBox = new VBox(20);
        resetBox.setAlignment(Pos.CENTER);
        Label error = new Label("");
        error.setVisible(false);
        Button reset = new Button("Reset");
        reset.setPrefSize(100, 32.5);
        reset.setOnAction((e -> {
            
                currentState.setText(problem.getInitialState().toString());
                solver.reset();
                error.setVisible(false);
                error.setText("");
                buttonHeader.setText("Moves(0 so far)");
            }));
        
        
        
        
        resetBox.getChildren().addAll(error, reset);
        
        
        currentState = new Label(problem.getCurrentState().toString());
        currentState.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        currentState.setPadding(new Insets(15, 25, 15, 25));
        currentState.setFont(new Font("Monospaced Bold", 15));
        
        
        goalState = new Label(problem.getFinalState().toString());
        goalState.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        goalState.setPadding(new Insets(15, 25, 15, 25));
        goalState.setFont(new Font("Monospaced Bold", 15));
        
        buttons = new VBox(5);
        
        
        
        for(int i = 0; i < problem.getMover().getMoveNames().size(); i++) {
         
            String names = problem.getMover().getMoveNames().get(i);
            
            Button b = new Button(problem.getMover().getMoveNames().get(i));
            b.setPrefSize(175, 32.5);
            b.setOnAction((e -> {
            
                error.setVisible(false);
                error.setText("");
                solver.tryMove(names);
                
                if(!solver.isMoveLegal()) {
                    error.setVisible(true);
                    error.setText("Illegal Move. Try again");
                    error.setTextFill(Color.RED);
                } else if(problem.getCurrentState().equals(problem.getFinalState())) {
                    error.setVisible(true);
                    error.setText("You solved the problem. Congratulations.");
                    error.setTextFill(Color.RED);
                }
                
                buttonHeader.setText("Moves(" + solver.getMoveCount() + " so far)");
                currentState.setText(problem.getCurrentState().toString());
            
            }));
           
            buttons.getChildren().add(b);
            
        }
        
        currentHeader = new Label("Current State:");
        currentHeader.setFont(new Font("Monospaced Bold", 15));
        goalHeader = new Label("Final State:");
        goalHeader.setFont(new Font("Monospaced Bold", 15));
        buttonHeader = new Label("Moves(0 so far)");
        buttonHeader.setFont(new Font("Monospaced Bold", 15));
        
        
        VBox currentBox = new VBox(10);
        currentBox.getChildren().addAll(currentHeader, currentState);
        VBox finalBox = new VBox(10);
        finalBox.getChildren().addAll(goalHeader, goalState);
        VBox buttonBox = new VBox(10);
        buttonBox.getChildren().addAll(buttonHeader, buttons);
        
        boxH = new HBox(25);
        boxH.getChildren().addAll(currentBox, buttonBox, finalBox);
        boxH.setAlignment(Pos.CENTER);
        
        
        
        
        super.getChildren().addAll(welcome, introduction, boxH, resetBox);
        
        
    }
    
    private final Problem problem;
    private final SolvingAssistant solver;
    private double width, height;
    private Label welcome;
    private Label introduction;
    private Label currentState;
    private Label goalState;
    private VBox buttons;
    private HBox boxH;
    private Label currentHeader;
    private Label goalHeader;
    private Label buttonHeader;
    private VBox resetBox;
    
}
