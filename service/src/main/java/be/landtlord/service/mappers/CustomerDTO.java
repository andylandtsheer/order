package be.landtlord.service.mappers;

import java.util.UUID;

public class CustomerDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String adress;
    private String phoneNumber;

    public CustomerDTO withId(UUID id) {
        this.id = id.toString();
        return this;
    }

    public CustomerDTO withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerDTO withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerDTO withAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public CustomerDTO withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
