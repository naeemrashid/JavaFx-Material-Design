package textField;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * @author Naeem Rashid
 *
 */
public class Controller implements Initializable{
	@FXML
    private JFXTextField nameField;

    @FXML
    private JFXTextField jobField;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		RequiredFieldValidator validator = new RequiredFieldValidator();
		nameField.getValidators().add(validator);
		jobField.getValidators().add(validator);
		validator.setMessage("NO INPUT GIVEN.");
		nameField.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if(!newValue){
					nameField.validate();
				}
			}
		});
		jobField.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if(!newValue){
					jobField.validate();
				}
			}
		});
		
		try {
			Image icon = new Image(new FileInputStream("E:/workspace/JavaFxMaterialDesign/src/textField/cross.jpg"));
			validator.setIcon(new ImageView(icon));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
