package be.landtlord.service.mappers;

import be.landtlord.domain.Customer;

public class CustomerMapper {
    public static Customer DTOtoCustomer(CustomerDTO customerToCreate) {
        return new Customer(customerToCreate.getFirstName(),
                customerToCreate.getLastName(),
                customerToCreate.getEmail(),
                customerToCreate.getAdress(),
                customerToCreate.getPhoneNumber());
    }

    public static CustomerDTO CustomerToDTO(Customer customer) {
        return  new CustomerDTO().withId(customer.getId())
                .withFirstName(customer.getFirstName())
                .withLastName(customer.getLastName())
                .withAdress(customer.getAdress())
                .withEmail(customer.getEmail())
                .withPhoneNumber(customer.getPhoneNumber());
    }
}
