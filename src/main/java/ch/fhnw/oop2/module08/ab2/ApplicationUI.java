package ch.fhnw.oop2.module08.ab2;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;


public class ApplicationUI extends FlowPane {
	private Button button;
	private PresentationModel presentationModel;

	public ApplicationUI(PresentationModel presentationModel) {
		this.presentationModel = presentationModel;
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		button = new Button();
		button.textProperty().bind(presentationModel.buttonStateProperty().asString());
		button.setOnMouseClicked(event -> presentationModel.toggleButton());
	}


	private void layoutControls() {
		setPadding(new Insets(20));
		getChildren().add(button);
	}
}
