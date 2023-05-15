package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "cafe_users")
public class cafe_users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    @JsonProperty("user_id")
    private int user_id;

    @Column(name = "user_name")
    @JsonProperty("user_name")
    private String user_name;

    @Column(name = "user_surname")
    @JsonProperty("user_surname")
    private String user_surname;

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
    private String phone;

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
        return user_surname;
    }

    public void setSurname(String user_surname) {
        this.user_surname = user_surname;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getLast_connection() {
        return last_connection;
    }

    public void setLast_connection(Date last_connection) {
        this.last_connection = last_connection;
    }

    public cafe_users(int user_id, String user_name, String user_surname, String email, String password, String username, String phone, Date last_connection) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_surname = user_surname;
        this.email = email;
        this.password = password;
        this.username = username;
        this.phone = phone;
        this.last_connection = last_connection;
    }

    public cafe_users() {
    }
}
