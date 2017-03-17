package PopUp;

import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller implements Initializable{

	 @FXML
	    private Button button;	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
			Notifications notify = Notifications.create().title("Downloading")
					.text("Download Started")
					.hideAfter(javafx.util.Duration.seconds(5))
					.position(Pos.BOTTOM_RIGHT);
			notify.darkStyle();
			notify.show();
		});
		
	}

}
