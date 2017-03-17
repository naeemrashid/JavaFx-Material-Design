package navigationDrawer;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable{

	@FXML
    private AnchorPane anchorPane;

    @FXML
    private JFXHamburger hamBurger;

    @FXML
    private JFXDrawer drawer;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

}
