package vn.techmaster.demobean.component;

import org.springframework.stereotype.Component;

@Component
public class Admin extends User {

    @Override
    public void createUser() {
        System.out.println("Register Admin");
    }
}
