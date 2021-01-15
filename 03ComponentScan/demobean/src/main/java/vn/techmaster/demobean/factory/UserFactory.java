package vn.techmaster.demobean.factory;

import org.apache.catalina.User;

import vn.techmaster.demobean.component.Admin;
import vn.techmaster.demobean.component.Member;

public class UserFactory {
    public User createUser(String typeUser){
        if("Amin".equals(typeUser)){
            return new Admin();
        }else if("Member".equals(typeUser)){
            return new Member();
        }else{
            throw new UnsupportedOperationException("Unsupported register mode"); 
        }
    }
    public User createAdmin(){
        return new Admin();
    }
    
}
