package assignment3b;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception{
		Pane mainPane = (Pane) FXMLLoader.load(Main.class.getResource("TargetHeartRateCalculatorGUI.fxml"));
		
		primaryStage.show();
	}
}
