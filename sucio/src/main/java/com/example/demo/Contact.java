package com.example.demo;

public class Contact {
    private String name;
    private String surname;
    private String age;
    
    
    public Contact(String name, String surname, String age){
        this.setName(name);
        this.setAge(age);
        this.setSurname(surname);
    }
    
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
