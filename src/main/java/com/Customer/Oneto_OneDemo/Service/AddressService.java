package com.Customer.Oneto_OneDemo.Service;

import com.Customer.Oneto_OneDemo.Entity.Address;

import java.util.List;

public interface AddressService {
    public List<Address> getAll();

    public Address getAddress(int id);

    public String addAddress(Address address);

    public Address updatAddress(int id, Address address);

    public String deleteAddress(int id);

}
