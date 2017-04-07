package com.priyabrat.cleanmvp.demo;

import java.util.Date;

/**
 * Created by PriyabratP on 05-04-2017.
 */

public class Person {

    private String name;
    private Date dateOfBirth;

    public Person(){}

    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        if(dateOfBirth == null) return 0;
        Date date = new Date();
        return date.getYear() - dateOfBirth.getYear()+1;
    }
}
