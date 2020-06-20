package guru.springframework.mssc.brewery.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.mssc.brewery.web.module.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomer(UUID customerId) {	
		return CustomerDto.builder().
				customerId(UUID.randomUUID()).
				customerName("Shiva").
				customerType("premium").
				build();
	}

	@Override
	public CustomerDto createCustomer(CustomerDto customerDto) {
		return CustomerDto.builder().
				customerId(UUID.randomUUID()).
				customerName("Rama").
				customerType("speacial").
				build();
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		CustomerDto.builder().
		customerId(UUID.randomUUID()).
		customerName("Shiva krishna").
		customerType("premium").
		build();

	}

	@Override
	public void deleteCustomer(UUID customerId) {
		CustomerDto.builder().
		customerId(UUID.randomUUID()).
		customerName("").
		customerType("").
		build();

	}

}
