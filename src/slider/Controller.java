package slider;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXSlider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 * @author Naeem Rashid
 *
 */
public class Controller implements Initializable,ChangeListener{
	
	@FXML
    private AnchorPane anchorPane;

    @FXML
    private Pane pane;

    @FXML
    private JFXSlider slider1;

    @FXML
    private JFXSlider slider2;

    @FXML
    private JFXSlider slider3;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		slider1.valueProperty().addListener(this);
		slider2.valueProperty().addListener(this);
		slider3.valueProperty().addListener(this);
			
	}

	@Override
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		double red = slider1.getValue();
		double green = slider2.getValue();
		double blue = slider3.getValue();
		Color color = Color.rgb((int)red,(int)green,(int)blue);
		pane.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	
}
