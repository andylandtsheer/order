package be.landtlord.service.mappers;

import be.landtlord.domain.Customer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;


class CustomerMapperTest {

    public static final int LENGTH_OF_AN_UUID_AS_STRING = 36;

    @Test
    void DTOtoCustomerTest() {
        Customer customer = CustomerMapper.DTOtoCustomer(new CustomerDTO().withFirstName("firstname")
            .withLastName("lastname")
            .withAdress("adress")
            .withEmail("test@email.com")
            .withPhoneNumber("012/345678"));

        Assertions.assertThat(customer.getFirstName()).isEqualTo("firstname");
        Assertions.assertThat(customer.getLastName()).isEqualTo("lastname");
        Assertions.assertThat(customer.getAdress()).isEqualTo("adress");
        Assertions.assertThat(customer.getEmail()).isEqualTo("test@email.com");
        Assertions.assertThat(customer.getPhoneNumber()).isEqualTo("012/345678");
        Assertions.assertThat(customer.getId()).isOfAnyClassIn(UUID.class);
    }

    @Test
    void customerToDTOTest() {
        Customer customer = new Customer("firstname","lastname","test@email.com","adress", "012/345678");
        CustomerDTO customerDTO = CustomerMapper.CustomerToDTO(customer);

        Assertions.assertThat(customerDTO.getFirstName()).isEqualTo("firstname");
        Assertions.assertThat(customerDTO.getLastName()).isEqualTo("lastname");
        Assertions.assertThat(customerDTO.getAdress()).isEqualTo("adress");
        Assertions.assertThat(customerDTO.getEmail()).isEqualTo("test@email.com");
        Assertions.assertThat(customerDTO.getPhoneNumber()).isEqualTo("012/345678");
        Assertions.assertThat(customerDTO.getId().length()).isEqualTo(LENGTH_OF_AN_UUID_AS_STRING);

    }
}