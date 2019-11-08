package be.landtlord.service;

import be.landtlord.domain.Customer;
import be.landtlord.domain.databases.CustomerDB;
import be.landtlord.service.mappers.CustomerDTO;
import be.landtlord.service.mappers.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostumerService {
    private final CustomerDB customerDB;

    @Autowired
    public CostumerService(CustomerDB customerDB) {
        this.customerDB = customerDB;
    }

    public CustomerDTO createCustomer(CustomerDTO customerToCreate) {
        Customer customer = CustomerMapper.DTOtoCustomer(customerToCreate);
        customerDB.add(customer);
        CustomerDTO customerDTO = CustomerMapper.CustomerToDTO(customer);
        return customerDTO;
    }
}
