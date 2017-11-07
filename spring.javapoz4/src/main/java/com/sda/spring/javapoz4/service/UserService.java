package com.sda.spring.javapoz4.service;


import com.sda.spring.javapoz4.model.User;
import com.sda.spring.javapoz4.service.generator.FirstNameGenerator;
import com.sda.spring.javapoz4.service.generator.LastNameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserService {

    private List<User> users;

    @Autowired
    private FirstNameGenerator firstNameGenerator;

    @Autowired
    private LastNameGenerator lastNameGenerator;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());

        users.forEach(user -> System.out.println(user));
    }

    public User getUser(int id) {
        return id >= users.size() ? null : users.get(id);
    }

    //A2
    public User getExampleUser() {
        User user = new User();
        user.setId(1);
        user.setFirstName(firstNameGenerator.getRandomFirstName());
        user.setLastName(lastNameGenerator.getRandomLastName());
        user.setPhoneNumber("964926486");
        return user;
    }


// A2. Nowa klasa: UserService - getExampleUser (metoda ktora zwaraca obiekt typu user z przykladowymi danymi
// A3. Dorzucamy ja do kontekstu Springa
// A4. UsersController getUser -> "/users/example    (mapping na geta)


    public List<User> getUsersByFirstName (String firstName){
    return users.stream()
            .filter(user -> user.getFirstName().equals(firstName))
            .collect(Collectors.toList());
    }


    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}