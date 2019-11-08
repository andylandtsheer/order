package be.landtlord.service.mappers;

public class CostumerDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String adress;
    private String phoneNumber;

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

    public String getEMail() {
        return eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
