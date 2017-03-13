package hamBurger;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import com.jfoenix.transitions.hamburger.HamburgerNextArrowBasicTransition;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 * @author Naeem Rashid
 *
 */
public class Controller implements Initializable{
	 @FXML
	    private JFXHamburger hamBurger1;
	 @FXML
	    private JFXHamburger hamBurger4;

	    @FXML
	    private JFXHamburger hamBurger3;

	    @FXML
	    private JFXHamburger hamBurger2;

	/* (non-Javadoc)
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
			HamburgerSlideCloseTransition slideTransition = new HamburgerSlideCloseTransition(hamBurger1);
			HamburgerBasicCloseTransition basicTransition = new HamburgerBasicCloseTransition(hamBurger2);
			HamburgerBackArrowBasicTransition backTransition = new HamburgerBackArrowBasicTransition(hamBurger3);
			HamburgerNextArrowBasicTransition nextTransition = new HamburgerNextArrowBasicTransition(hamBurger4);
			backTransition.setRate(-1); //default look of hamburger.
			basicTransition.setRate(-1);
			slideTransition.setRate(-1);
			nextTransition.setRate(-1);
			hamBurger1.addEventHandler(MouseEvent.MOUSE_CLICKED,e ->{
				slideTransition.setRate(slideTransition.getRate()*-1);
				slideTransition.play();
				
			});
			hamBurger2.addEventHandler(MouseEvent.MOUSE_CLICKED,e ->{
				basicTransition.setRate(basicTransition.getRate()*-1);
				basicTransition.play();
				
			});
			hamBurger3.addEventHandler(MouseEvent.MOUSE_CLICKED,e ->{
				backTransition.setRate(backTransition.getRate()*-1);
				backTransition.play();
				
			});
			hamBurger4.addEventHandler(MouseEvent.MOUSE_CLICKED,e ->{
				nextTransition.setRate(nextTransition.getRate()*-1);
				nextTransition.play();
				
			});
	}

}
