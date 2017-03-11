package timeAndDatePicker;

import java.net.URL;
import java.time.LocalTime;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXDatePicker;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable{
	   @FXML
	    private JFXDatePicker dateSelect;

	    @FXML
	    private JFXDatePicker timeSelect;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		timeSelect.setTime(LocalTime.of(6, 00));
		
	}

}
