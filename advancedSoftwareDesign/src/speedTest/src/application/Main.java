package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			SplitPane mainPane = (SplitPane) FXMLLoader.load(Main.class.getResource("SpeedTestGUI.fxml"));
			
			Scene scene = new Scene(mainPane,1000,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	           
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
