package com.caresoft.clinicapp;
public class User {


    protected Integer id;
    protected int pin;

    // a constructor that takes an ID
    public User(Integer id){
        this.id = id;
    }
    public void setPin(int pin){
        this.pin = pin;
    }
    public int getPin() {
        return pin;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
