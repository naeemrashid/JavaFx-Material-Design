package charts;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Education", 200),
				new PieChart.Data("Health", 130),
				new PieChart.Data("Defense", 200),
				new PieChart.Data("Agriculture", 200)
			
				);
		PieChart budget = new PieChart(pieChartData);
		budget.setTitle("Economy Divison");
		FlowPane root = new FlowPane();
		root.getChildren().add(budget);
		Scene scene =  new Scene(root,500,500);
		stage.setTitle("Pie Chart Demo");
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	public static void main (String[] args){
		launch(args);
	}

}
