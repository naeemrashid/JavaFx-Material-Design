package treeTableView;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableColumn.CellDataFeatures;
import javafx.util.Callback;

public class Controller implements Initializable{

	@FXML
    private JFXTreeTableView<User> treeView;
	@FXML
	private JFXTextField input;
	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		JFXTreeTableColumn<User, String> deptCol = new JFXTreeTableColumn<>("Department");
		deptCol.setPrefWidth(150);
		deptCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<User,String>, ObservableValue<String>>() {
			
			@Override
			public ObservableValue<String> call(CellDataFeatures<User, String> param) {
				return param.getValue().getValue().department	;
			}
		});
		JFXTreeTableColumn<User, String> userCol = new JFXTreeTableColumn<>("Name");
		userCol.setPrefWidth(150);
		userCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<User,String>, ObservableValue<String>>() {
			
			@Override
			public ObservableValue<String> call(CellDataFeatures<User, String> param) {
				return param.getValue().getValue().userName;
			}
		});
		JFXTreeTableColumn<User, String> ageCol = new JFXTreeTableColumn<>("age");
		ageCol.setPrefWidth(150);
		ageCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<User,String>, ObservableValue<String>>() {
			
			@Override
			public ObservableValue<String> call(CellDataFeatures<User, String> param) {
				return param.getValue().getValue().age;
			}
		});
		
		ObservableList<User> users = FXCollections.observableArrayList();
		users.add(new User("Computer Department","23","Naeem Ahmed"));
		users.add(new User("Computer Department","23","John Smith"));
		users.add(new User("Computer Department","23","Richard Wolf"));
		users.add(new User("Computer Department","23","Katiya"));
		final TreeItem<User> root = new RecursiveTreeItem<User>(users, RecursiveTreeObject::getChildren);
		treeView.getColumns().addAll(deptCol,userCol,ageCol);
		treeView.setRoot(root);
		treeView.setShowRoot(false);
		input.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				treeView.setPredicate(new Predicate<TreeItem<User>>() {
					
					@Override
					public boolean test(TreeItem<User> user) {
						Boolean flag = user.getValue().department.getValue().contains(newValue);
						return flag;
					}
				});
				
			}
		});
	}
	
	class User extends RecursiveTreeObject<User>{
		StringProperty userName;
		StringProperty age;
		StringProperty department;
		public User(String userName , String age,String department ){
			this.userName = new SimpleStringProperty(userName);
			this.age = new SimpleStringProperty(age);
			this.department = new SimpleStringProperty(department);
		}
	}

}
