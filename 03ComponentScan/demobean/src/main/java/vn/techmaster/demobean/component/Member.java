package vn.techmaster.demobean.component;

import org.springframework.stereotype.Component;

@Component
public class Member extends User {

    @Override
    public void createUser() {
        System.out.println("Resigter Member");
    }
}
