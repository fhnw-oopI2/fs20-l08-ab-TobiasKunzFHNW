package ch.fhnw.oop2.module08.ab1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}


	@Override
	public void start(Stage primaryStage) {
		PresentationModel presentationModel = new PresentationModel();
		Parent rootPane = new ApplicationUI(presentationModel);
		Scene myScene = new Scene(rootPane);

		primaryStage.titleProperty().bind(presentationModel.titleProperty());
		primaryStage.setWidth(300);
		primaryStage.setHeight(200);
		primaryStage.setScene(myScene);
		primaryStage.show();
	}
}
