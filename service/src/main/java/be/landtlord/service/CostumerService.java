package be.landtlord.service;

import be.landtlord.domain.databases.CustomerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostumerService {
    private final CustomerDB customerDB;

    @Autowired
    public CostumerService(CustomerDB customerDB) {
        this.customerDB = customerDB;
    }
}
