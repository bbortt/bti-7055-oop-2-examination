package io.github.bbortt.oop2.examination;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import javafx.application.Application;

public class JavaFXApplicationUnitTest {

	@Test
	public void extendsApplication() {
		assertThat(Application.class).isAssignableFrom(JavaFXApplication.class);
	}
}
