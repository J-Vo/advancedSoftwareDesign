package lab4;

import java.awt.event.ActionEvent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//public class JavaFX extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setTitle("Lab 4");
//        Label label = new Label("Total will display here.");
//        TextField textField1 = new TextField();
//        TextField textField2 = new TextField();
//        Button button = new Button("Calculate");
//        button.setText("Calculate");
//        Label label2 = new Label("Enter two numbers you wish to add.");
//        
//      
//        VBox vbox = new VBox(button, label, textField1, textField2, label2);
//        
//        button.setOnAction(action -> {
//        try {
//        int calculate = convertToInt(textField1) + convertToInt(textField2);
//        label.setText(String.valueOf(calculate));
//        }
//        catch(NumberFormatException e){
//            int calculate = 0 + 0;
//            label.setText(String.valueOf(calculate));
//        }
//
//        });
//        Scene scene = new Scene(vbox, 300, 200);    
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//    public static int convertToInt(TextField textField){
//		int userinput;
//		
//		userinput = Integer.parseInt(textField.getText());
//		
//    	return userinput;
//    }
//    
//    public static void main(String[] args) {
//    	Application.launch(args);
//    }
//
//}