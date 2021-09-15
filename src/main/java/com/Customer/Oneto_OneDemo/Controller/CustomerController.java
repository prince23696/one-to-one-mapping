package com.Customer.Oneto_OneDemo.Controller;

import com.Customer.Oneto_OneDemo.Entity.Customer;
import com.Customer.Oneto_OneDemo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("getCustomer/{id}")
    public Customer getCustomer(@PathVariable int id) {
        Customer customer = customerService.getCustomer(id);
        return customer;
    }

    @GetMapping("/getCustomers")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @PostMapping("/save")
    public Customer addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);

        return customer;
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public String deleteItem(@PathVariable int id) {
        customerService.deleteCustomer(id);
        return "item deleted form database id-" + id;
    }

    @PutMapping("/update/{id}")
    public Customer updateItem(@PathVariable int id, @RequestBody Customer customer) {
        customerService.updateCustomer(id, customer);
        return customer;
    }
}
