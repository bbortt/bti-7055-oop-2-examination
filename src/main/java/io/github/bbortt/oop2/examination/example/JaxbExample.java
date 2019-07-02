package io.github.bbortt.oop2.examination.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import io.github.bbortt.oop2.examination.domain.Customer;

public class JaxbExample {

	private JaxbExample() {
		// Static example class
	}

	public static void saveCustomer() {
		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("mkyong");
		customer.setAge(29);

		try {
			File file = new File("./customer.xml");
			// Note: JAXBContext is thread save and (in a real world example) should be created only once!
			JAXBContext.newInstance(Customer.class).createMarshaller().marshal(customer, file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
