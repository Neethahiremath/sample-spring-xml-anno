package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository("CustomerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

  private List<Customer> customerList = new ArrayList<Customer>();

  public List<Customer> findAll() {
    Customer customer = new Customer();
    customer.setFirstName("neetha");
    customer.setLastName("hiremath");

    customerList.add(customer);
    return customerList;
  }
}
