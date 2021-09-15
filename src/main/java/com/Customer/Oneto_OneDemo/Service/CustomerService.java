package com.Customer.Oneto_OneDemo.Service;

import com.Customer.Oneto_OneDemo.Entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomer();

    public Customer getCustomer(int id);

    public String addCustomer(Customer customer);

    public Customer updateCustomer(int id, Customer customer);

    public String deleteCustomer(int id);
}
