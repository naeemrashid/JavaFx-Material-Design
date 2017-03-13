package colorPicker;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXColorPicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 * @author Naeem Rashid
 *
 */
public class Controller implements Initializable{

    @FXML
    private JFXCheckBox flag;
	@FXML
    private AnchorPane anchorPane;
    @FXML
    private Pane pane;
	  @FXML
	    private JFXColorPicker colorPicker;

	    @FXML
	    void changeColor(ActionEvent event) {
	    	if(flag.isSelected()){
	    		Color selectedColor = colorPicker.getValue();
		    	anchorPane.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY)));

	    	}
	    	
	    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}
