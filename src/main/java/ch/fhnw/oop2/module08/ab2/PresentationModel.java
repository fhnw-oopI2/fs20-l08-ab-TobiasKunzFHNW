package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class PresentationModel {
	enum ButtonState {ON, OFF,}

	private SimpleStringProperty title;
	private ObjectProperty<ButtonState> buttonState;

	public ButtonState getButtonState() {
		return buttonState.get();
	}

	public ObjectProperty<ButtonState> buttonStateProperty() {
		return buttonState;
	}

	public void setButtonState(ButtonState buttonState) {
		this.buttonState.set(buttonState);
	}

	public PresentationModel() {
		this.title = new SimpleStringProperty("My Title");
		this.buttonState = new SimpleObjectProperty<>(ButtonState.OFF);
	}

	public String getTitle() {
		return title.get();
	}

	public SimpleStringProperty titleProperty() {
		return title;
	}

	public void setTitle(String title) {
		this.title.set(title);
	}

	public void toggleButton() {
		buttonStateProperty().setValue(buttonStateProperty().get() == ButtonState.ON ? ButtonState.OFF : ButtonState.ON);
	}
}
