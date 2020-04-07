package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;

public class PresentationModel {
	private SimpleStringProperty title;
	private SimpleStringProperty buttonText;

	public PresentationModel() {
		this.title = new SimpleStringProperty("My Title");
		this.buttonText = new SimpleStringProperty("Hello World");
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

	public String getButtonText() {
		return buttonText.get();
	}

	public SimpleStringProperty buttonTextProperty() {
		return buttonText;
	}

	public void setButtonText(String buttonText) {
		this.buttonText.set(buttonText);
	}
}
