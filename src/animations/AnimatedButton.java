package animations;

import java.awt.Color;
import java.awt.event.ActionEvent;

import com.jfoenix.controls.JFXButton;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

	
public class AnimatedButton extends Application{
	double angle = 0.0;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Rotate rotate = new Rotate();
		JFXButton button = new JFXButton("Rotation");
		button.getTransforms().add(rotate);
		button.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
				angle += 10;
				rotate.setAngle(angle);
				rotate.setPivotX(button.getWidth()/2);
				rotate.setPivotY(button.getHeight()/2);
		});
		FlowPane root = new FlowPane();
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(25,25,25, angle));
		root.getChildren().add(button);
		Scene scene = new Scene(root,300,250);
		primaryStage.setTitle("Button Animation");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
