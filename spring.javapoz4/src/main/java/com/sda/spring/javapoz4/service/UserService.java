package com.sda.spring.javapoz4.service;


import com.sda.spring.javapoz4.model.User;
import com.sda.spring.javapoz4.service.generator.FirstNameGenerator;
import com.sda.spring.javapoz4.service.generator.LastNameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    private List<User> users;

    @Autowired
    private FirstNameGenerator firstNameGenerator;

    @Autowired
    private LastNameGenerator lastNameGenerator;

    public UserService(){
        this.users = new ArrayList<>();

    }

    @PostConstruct
    public void init(){
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());
        this.users.add(getExampleUser());

        users.forEach(user -> System.out.println(user));
    }

    public User getUser(int id){
        return id >= users.size() ? null : users.get(id);
    }

    public User getExampleUser (){
        User user = new User();
        user.setId(1);
        user.setFirstName(firstNameGenerator.getRandomFirstName());
        user.setLastName(lastNameGenerator.getRandomLastName());
        user.setPhoneNumber("964926486");
        return user;
    }

}
// 2. Nowa klasa: UserService - getExampleUser (metoda ktora zwaraca obiekt typu user z przykladowymi danymi
// 3. Dorzucamy ja do kontekstu Springa
// 4. UsersController getUser -> "/users/example    (mapping na geta)