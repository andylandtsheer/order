package be.landtlord.domain.databases;

import be.landtlord.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class CustomerDB {
    private final Map<UUID, Customer> customers;

    public CustomerDB() {
        this.customers = new HashMap<UUID, Customer>();
    }

    public void add(Customer customer) {
        customers.put(customer.getId(),customer);
    }
}
