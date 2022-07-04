package com.solid_principles.dependency_inversion.solution;

import java.util.HashMap;

public class Main {

	private static CustomerService customerService;

	public static void main(String[] args) {
		HashMap<Integer, Customer> customers = new HashMap<>();
		customers.put(1, new Customer(1, "John"));
	    customers.put(2, new Customer(2, "Susan"));
	    customerService = new CustomerService(new SimpleCustomerDao(customers));
	    System.out.println(customerService.findById(1));
	}

}
