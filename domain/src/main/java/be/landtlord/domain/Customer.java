package be.landtlord.domain;

import java.util.UUID;

public class Customer {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String adress;
    private final String phoneNumber;


    public Customer(String firstName, String lastName, String email, String adress, String phoneNumber) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
