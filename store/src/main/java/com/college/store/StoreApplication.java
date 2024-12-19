package com.college.store;

import javax.swing.SwingUtilities;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.college.store.controller.LoginController;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = createApplicationContext(args);

		SwingUtilities.invokeLater(() -> {
			LoginController loginController = context.getBean(LoginController.class);
			loginController.prepareAndOpenFrame();
		});
	}

	public static ConfigurableApplicationContext createApplicationContext(String... args) {
		return new SpringApplicationBuilder()
					.headless(false)
					.sources(StoreApplication.class)
					.run(args);
	}
}
