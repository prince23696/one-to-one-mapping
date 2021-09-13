package com.Customer.Oneto_OneDemo.Repository;

import com.Customer.Oneto_OneDemo.Entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
}
