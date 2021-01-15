package vn.techmaster.demobean.component;

enum Gender {
    M,F;
}

abstract class User{
    public String id;
    public String name;
    public String email;
    public int age;
    public Gender gender;

    public abstract void createUser();
}