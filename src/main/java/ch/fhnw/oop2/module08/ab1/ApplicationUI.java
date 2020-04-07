package ch.fhnw.oop2.module08.ab1;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;


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
		button.textProperty().bind(presentationModel.buttonTextProperty());
	}


	private void layoutControls() {
		setPadding(new Insets(20));
		getChildren().add(button);
	}
}
