package test.solid_principles.dependency_inversion;

import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.solid_principles.dependency_inversion.solution.Customer;
import com.solid_principles.dependency_inversion.solution.CustomerService;
import com.solid_principles.dependency_inversion.solution.SimpleCustomerDao;

class CustomerServiceUnitTest {

	private CustomerService customerService;

	@BeforeEach
	public void setUpCustomerServiceInstance() {
		HashMap<Integer, Customer> customers = new HashMap<>();
		customers.put(1, new Customer(1, "John"));
	    customers.put(2, new Customer(2, "Susan"));
	    this.customerService = new CustomerService(new SimpleCustomerDao(customers));
	}

	@Test
	void findByIdTest() {
		assertThat( this.customerService.findById(1), isA(Optional.class));
	}

	@Test
	public void givenCustomerServiceInstance_whenCalledFindAll_thenCorrect() {
	    assertThat(customerService.findAll(), isA(List.class));
	}

}
