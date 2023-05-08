package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.sql.Date;


@Entity
@Table(name = "cafe_users")
public class usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    @JsonProperty("user_id")
    private int user_id;

    @Column(name = "user_name")
    @JsonProperty("user_name")
    private String user_name;

    @Column(name = "surname")
    @JsonProperty("surname")
    private String surname;

    @Column(name = "email")
    @JsonProperty("email")
    private String email;

    @Column(name = "password")
    @JsonProperty("password")
    private String password;

    @Column(name = "username")
    @JsonProperty("username")
    private String username;

    @Column(name = "phone")
    @JsonProperty("phone")
    private int phone;

    @Column(name = "last_connection")
    @JsonProperty("last_connection")
    private Date last_connection;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getLast_connection() {
        return last_connection;
    }

    public void setLast_connection(Date last_connection) {
        this.last_connection = last_connection;
    }

    public usuarios(int user_id, String user_name, String surname, String email, String password, String username, int phone, Date last_connection) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.username = username;
        this.phone = phone;
        this.last_connection = last_connection;
    }

    public usuarios() {
    }
}