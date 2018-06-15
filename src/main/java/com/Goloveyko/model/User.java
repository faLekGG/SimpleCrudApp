package com.Goloveyko.model;

import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private Date date;
    private int id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                " id=" + id + "firstName=" + firstName + ", lastName=" + lastName +
                ", email=" + email + ", date=" + date + " }";
    }
}
