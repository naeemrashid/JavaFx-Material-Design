package treeTableView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("tree.fxml"));
		Scene scene = new Scene(root);
//		scene.getStylesheets().add(getClass().getResource("/stylesheet.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args){
		launch(args);
	}

}

