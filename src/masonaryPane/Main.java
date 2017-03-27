package masonaryPane;

import java.util.Random;

import com.jfoenix.controls.JFXMasonryPane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage stage) throws Exception {
//		Parent root = FXMLLoader.load(getClass().getResource("MasonaryPane.fxml"));	
		JFXMasonryPane root = new JFXMasonryPane();
		Scene scene = new Scene(root,300,250);
		Random r = new Random();
		for (int i=0; i<100; i++){
			Label label = new Label();
			label.setPrefSize(r.nextInt(200),r.nextInt(300));
			label.setStyle("-fx-background-color : rgb("+r.nextInt(255)+","+r.nextInt(255)+","+r.nextInt(255)+")");
			root.getChildren().add(label);
			
		}
		
		stage.setTitle("Masonary Pane");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args){
		launch(args);
	}

}
