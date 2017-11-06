package com.sda.spring.javapoz4.model;

public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;


    public User() {
    }


    public User(long id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

// 1. Klasa user: id(long), first name, last name, phonenumber
// 2. Nowa klasa: UserService - getExampleUser (metoda ktora zwaraca obiekt typu user z przykladowymi danymi
// 3. Dorzucamy ja do kontekstu Springa
// 4. UsersController getUser -> "/users/example    (mapping na geta)

