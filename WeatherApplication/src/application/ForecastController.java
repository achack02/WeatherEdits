package application;

import javafx.event.ActionEvent;

import java.awt.Label;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ForecastController {
	@FXML
	private void goToForecast(ActionEvent event) {
	    try {
	        Parent forecastRoot = FXMLLoader.load(getClass().getResource("forecast.fxml"));
	        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	        Scene scene = new Scene(forecastRoot);
	        stage.setScene(scene);
	        stage.show();
	    } catch (IOException e) {
	        e.printStackTrace();
	 
	    }
	    
	}}



