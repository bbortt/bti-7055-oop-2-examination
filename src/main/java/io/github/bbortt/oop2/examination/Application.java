package io.github.bbortt.oop2.examination;

import io.github.bbortt.oop2.examination.example.JacksonExample;
import io.github.bbortt.oop2.examination.example.JaxbExample;

/**
 * Application entry point. Due to a bug in sun.launcher.LauncherHelper we do not start the {@link javafx.application.Application} here! {@link JavaFXApplication} will initialize
 * the UI.
 * 
 * @see <a href=
 *      "https://stackoverflow.com/questions/52653836/maven-shade-javafx-runtime-components-are-missing/52654791#52654791">maven-shade-javafx-runtime-components-are-missing</a>
 */
public class Application {

	private Application() {
		// Static application entry point
	}

	public static void main(String[] args) {
		JacksonExample.saveCustomer();
		JaxbExample.saveCustomer();

		JavaFXApplication.start();
	}
}
