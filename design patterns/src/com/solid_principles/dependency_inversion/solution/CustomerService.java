package com.solid_principles.dependency_inversion.solution;

import java.util.List;
import java.util.Optional;

public class CustomerService {

	private CustomerDao customerDao = null;

	public CustomerService(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

    public Optional<Customer> findById(int id) {
        return customerDao.findById(id);
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }

}
