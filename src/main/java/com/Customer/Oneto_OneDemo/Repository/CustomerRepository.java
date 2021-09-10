package com.Customer.Oneto_OneDemo.Repository;

import com.Customer.Oneto_OneDemo.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends CrudRepository<Customer,Integer> {
}
