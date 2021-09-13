package com.Customer.Oneto_OneDemo.Service;

import com.Customer.Oneto_OneDemo.Entity.Address;
import com.Customer.Oneto_OneDemo.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<Address> getAll() {
        return (List<Address>) addressRepository.findAll();
    }

    @Override
    public Address getAddress(int id) {
        return addressRepository.findById(id).get();
    }

    @Override
    public String addAddress(Address address) {
        addressRepository.save(address);
        return "Address Saved Successfully";
    }

    @Override
    public Address updatAddress(int id, Address address) {
        Address address1 = addressRepository.findById(id).get();
        address1.setStreet(address.getStreet());
        address1.setCity(address.getCity());
        address1.setState(address.getState());
        address1.setCustomer(address.getCustomer());
        return address1;
    }

    @Override
    public String deleteAddress(int id) {
        addressRepository.deleteById(id);
        return "Address deleted id=" + id;
    }
}
