package be.landtlord.domain;

import java.util.UUID;

public class Customer {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String eMail;
    private final String adress;
    private final String phoneNumber;


    public Customer(String firstName, String lastName, String eMail, String adress, String phoneNumber) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }
}
