package com.hilos.carrera.Carrera;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class CarreraController  {

    @FXML
    private ImageView c1;
    @FXML
    private ImageView c2;
    @FXML
    private ImageView c3;
    @FXML
    private ImageView c4;
    @FXML
    private Label barrera;
    
    @FXML
    private Button start;
    @FXML
    private Button pause;
    @FXML
    private Button playagain;
    @FXML
    private Button table;
    
    @SuppressWarnings("exports")
	public ImageView getC1() {
		return c1;
	}

	@SuppressWarnings("exports")
	public ImageView getC2() {
		return c2;
	}

	@SuppressWarnings("exports")
	public ImageView getC3() {
		return c3;
	}

	@SuppressWarnings("exports")
	public ImageView getC4() {
		return c4;
	}

	@SuppressWarnings("exports")
	public Label getBarrera() {
		return barrera;
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		pause.setDisable(true);
		playagain.setDisable(true);
	}
	
	Corredor corredor1;
	Corredor corredor2;
	Corredor corredor3;
	Corredor corredor4;
	
	@FXML
	public void startButton() {
		corredor1 = new Corredor(c1, this);
		corredor2 = new Corredor(c2, this);
		corredor3 = new Corredor(c3, this);
		corredor4 = new Corredor(c4, this);
		
		corredor1.start();
		corredor2.start();
		corredor3.start();
		corredor4.start();
    }
	
	@FXML
	public void playagainButton() {
		c1.setLayoutX(0);
		c2.setLayoutX(0);
		c3.setLayoutX(0);
		c4.setLayoutX(0);
	}
	
	
	@FXML
	public void pauseButton() {
		//corredor1.interrupt();
	}
	
}
