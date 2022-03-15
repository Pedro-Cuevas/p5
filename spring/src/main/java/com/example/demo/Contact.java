package com.example.demo;

public class Contact {
    private String name;
    private String surname;
    private String email;
    private String gender;
    private Boolean dataPolicyCheck;
    private String textProblem;
    
    public Contact(String name, String surname, String email, 
                        String gender, Boolean dataPolicyCheck, String textProblem){
        this.setName(name);
        this.setSurname(surname);
        this.setEmail(email);
        this.setEmail(email);
        this.setGender(gender);
        this.setDataPolicyCheck(dataPolicyCheck);
        this.setTextProblem(textProblem);
    }

    public String getTextProblem() {
        return textProblem;
    }

    public void setTextProblem(String textProblem) {
        this.textProblem = textProblem;
    }

    public Boolean getDataPolicyCheck() {
        return dataPolicyCheck;
    }

    public void setDataPolicyCheck(Boolean dataPolicyCheck) {
        this.dataPolicyCheck = dataPolicyCheck;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
}
