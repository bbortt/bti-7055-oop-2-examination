package io.github.bbortt.oop2.examination;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

	public static void start() {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String javaVersion = System.getProperty("java.version");
		String javafxVersion = System.getProperty("javafx.version");
		Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
		Scene scene = new Scene(new StackPane(l), 640, 480);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
