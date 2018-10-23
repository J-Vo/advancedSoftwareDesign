package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class mainController implements Initializable {

    @FXML
    private Button runButton;

    @FXML
    private Button closeButton;

    @FXML
    private TextField testFrequency;

    @FXML
    private Circle statusLight;

    @FXML
    private Label statusLabel;

    @FXML
    private Button stopButton;

    @FXML
    private CategoryAxis DateAxis;
    
    @FXML
    private NumberAxis numberAxis;
    
    @FXML
    private LineChart lineChart;

    @FXML
    void onCloseClick(ActionEvent event) {
        
    	Stage stage = (Stage) closeButton.getScene().getWindow();
       
    	stage.close();
    }

    @FXML
    void onRunClick(ActionEvent event) throws IOException, InterruptedException, URISyntaxException {
    	

    	file_handler fil = new file_handler();
    	
    	changeStatusRunning();
    		
    	fil.executeBat();
    
    	changeStatusStopped();
    	
    	updateExistingData();
    	
    	loadData();

    }

    @FXML
    void onStopClick(ActionEvent event) {
    	
    	lineChart.getData().clear();
    	
		statusLabel.setText("Stopped");
    	
		statusLight.setFill(Color.RED);
    	
    }
    
    @FXML
    public void changeStatusRunning( ){
    	
		statusLabel.setText("Running");
		
		statusLight.setFill(Color.GREEN);
		
    	}
    @FXML
    void changeStatusStopped( ){
    
		statusLabel.setText("Stopped");
    	
		statusLight.setFill(Color.RED);
    	
    }
	private void updateExistingData() {
    	
    	lineChart.getData().clear();
    	
    }
    
    private void loadData() throws FileNotFoundException, URISyntaxException {
    	
    	try {
    		
    		File file = new File("C:\\Users\\Jordan\\eclipse-workspace\\speedTest\\src\\application\\speedTest.txt");

    		Scanner s = new Scanner(file);
    	
    		List<String> reader = new ArrayList<String>();
    		List<String> Date = new ArrayList<String>();
            List<Double> uploadSpeed = new ArrayList<Double>();
            List<Double> downloadSpeed = new ArrayList<Double>();
            List<Double> ping = new ArrayList<Double>();
            
            while(s.hasNext()) {
            	reader.add(s.nextLine());
            }
            
            for(int i = 0; i < reader.size(); i += 4) {  	
            	Date.add(reader.get(i));
            }
            for(int i = 1; i < reader.size(); i += 4) {  	
            	uploadSpeed.add(Double.parseDouble(reader.get(i)));
            }
            for(int i = 2; i < reader.size(); i += 4) {  	
            	downloadSpeed.add(Double.parseDouble(reader.get(i)));
            }
            for(int i = 3; i < reader.size(); i += 4) {  	
            	ping.add(Double.parseDouble(reader.get(i)));
            }
            
       
           
    	XYChart.Series<Object, Object> seriesDownload = new XYChart.Series<>();
    	seriesDownload.setName("Download Speed");
    	for(int i = 0; i < downloadSpeed.size(); i++){
    	seriesDownload.getData().add(new XYChart.Data<>(Date.get(i), downloadSpeed.get(i)));
    	}
    	lineChart.getData().add(seriesDownload);
    	
    	XYChart.Series<Object, Object> seriesUpload = new XYChart.Series<>();
    	seriesUpload.setName("Upload Speed");
    	for(int i = 0; i < uploadSpeed.size(); i++){
    	seriesUpload.getData().add(new XYChart.Data<>(Date.get(i), uploadSpeed.get(i)));
    	}
    	lineChart.getData().add(seriesUpload);
    	
    	s.close();
    	}
    	catch(FileNotFoundException e){
    		
    	}
    	
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		try {
			loadData();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
    
  }

