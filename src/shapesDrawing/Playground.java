package shapesDrawing;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Playground extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Line seeSaw = new Line (60,340,340,140);
		seeSaw.setStroke(Color.BLACK);
		seeSaw.setStrokeWidth(15);
		Circle circle = new Circle(70,280,40);
		circle.setStroke(Color.GREENYELLOW);
		circle.setFill(Color.ORANGE);
		circle.setStrokeWidth(5);
		
		Rectangle rect = new Rectangle(240,90,80,70);
		rect.setStroke(Color.MEDIUMPURPLE);
		rect.setStrokeWidth(5);
		rect.setFill(Color.MEDIUMPURPLE);
		
		Line left = new Line (200,240,160,340);
		left.setStrokeWidth(5);
		Line right = new Line(200,240,240,340);
		right.setStrokeWidth(5);
		
		root.getChildren().addAll(seeSaw,rect,circle,left,right);
		
		
		
		Scene scene = new Scene(root, 400, 400,Color.WHITE);
		primaryStage.setTitle("SeeSaw");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	
	public static void main(String[] args){
		launch(args);
	}

}
