package com.Customer.Oneto_OneDemo.Controller;

import com.Customer.Oneto_OneDemo.Entity.Address;
import com.Customer.Oneto_OneDemo.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("getAddress/{id}")
    public Address getAddress(@PathVariable int id) {
        Address address = addressService.getAddress(id);
        return address;
    }

    @GetMapping("/getAddress")
    public List<Address> getAll() {
        return addressService.getAll();
    }

    @PostMapping("/saveAddress")
    public Address addCustomer(@RequestBody Address address) {
        addressService.addAddress(address);
        return address;
    }

    @DeleteMapping("/deleteAddress/{id}")
    public String deleteItem(@PathVariable int id) {
        addressService.deleteAddress(id);
        return "item deleted form database id-" + id;
    }

    @PutMapping("/updateAddress/{id}")
    public Address updateAddress(@PathVariable int id, @RequestBody Address address) {
        addressService.updatAddress(id, address);
        return address;
    }
}
