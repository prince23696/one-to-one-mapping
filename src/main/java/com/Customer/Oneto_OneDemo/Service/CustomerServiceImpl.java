package com.Customer.Oneto_OneDemo.Service;

import com.Customer.Oneto_OneDemo.Entity.Address;
import com.Customer.Oneto_OneDemo.Entity.Customer;
import com.Customer.Oneto_OneDemo.Repository.AddressRepository;
import com.Customer.Oneto_OneDemo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(int id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public String addCustomer(Customer customer) {
        customerRepository.save(customer);
        return "customer added";
    }

    @Override
    public Customer updateCustomer(int id, Customer customer) {
        Customer customer1 = customerRepository.findById(id).get();
        customer1.setFname(customer.getFname());
        customer1.setLname(customer.getLname());
        customer1.setAddress(customer.getAddress());
        customerRepository.save(customer1);
        return customer1;
    }

    @Override
    public String deleteCustomer(int id) {
        customerRepository.deleteById(id);
        return "Customer Deleted";
    }
}
