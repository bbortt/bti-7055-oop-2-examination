package io.github.bbortt.oop2.examination.example;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bbortt.oop2.examination.domain.Customer;

public class JacksonExample {

	private JacksonExample() {
		// Static example class
	}

	public static void saveCustomer() {
		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("mkyong");
		customer.setAge(29);

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.writeValue(new File("./customer.json"), customer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
