package be.landtlord.domain.databases;

import be.landtlord.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDB {
    private List<Customer> customers;
}
