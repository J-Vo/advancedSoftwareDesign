package assignment3b;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class myController {

    @FXML
    private Label targetHeartRate;

    @FXML
    private Button calculateButton;

    @FXML
    private TextField age;

    
    public Label getTargetHeartRate() {
		return targetHeartRate;
	}

	public void setTargetHeartRate(Label targetHeartRate) {
		this.targetHeartRate = targetHeartRate;
	}

	public Button getCalculateButton() {
		return calculateButton;
	}

	public void setCalculateButton(Button calculateButton) {
		this.calculateButton = calculateButton;
	}

	public TextField getAge() {
		return age;
	}

	public void setAge(TextField age) {
		this.age = age;
	}
	public double ageToInt(TextField age){
		return Double.parseDouble(age.getAccessibleText());
	}

	public Label getMaxHeartRate() {
		return maxHeartRate;
	}

	public void setMaxHeartRate(Label maxHeartRate) {
		this.maxHeartRate = maxHeartRate;
	}

	@FXML
    private Label maxHeartRate;

    @FXML
    void onCalculateClick(ActionEvent event) {
    	
    	calculateTargetMax(this.getAge());
    }
    public void calculateTargetMax(TextField age){
    	double targetMax;
    	
    	targetMax = 220 - ageToInt(age);
    	
    	
    }

}