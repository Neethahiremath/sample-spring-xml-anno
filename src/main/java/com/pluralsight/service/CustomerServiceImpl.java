package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {

  //using new keyword

  //private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

  // method level autowired

  /*  @Autowired
  private CustomerRepository customerRepository;*/

  private CustomerRepository customerRepository;

  public CustomerServiceImpl(CustomerRepository customerRepository) {
    System.out.print("we are using constructor injections");
    this.customerRepository = customerRepository;
  }

  public List<Customer> findAll() {
    return customerRepository.findAll();
  }

 /* @Autowired
  public void setCustomerRepository(CustomerRepository customerRepository) {
    System.out.print("we are using setter injections");
    this.customerRepository = customerRepository;
  }*/
}
