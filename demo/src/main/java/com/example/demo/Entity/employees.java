package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "employees")
public class employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    @JsonProperty("employee_id")
    private int employee_id;

    @Column(name = "salary")
    @JsonProperty("salary")
    private int salary;

    @Column(name = "hire_date")
    @JsonProperty("hire_date")
    private Date hire_date;

    @Column(name = "email")
    @JsonProperty("email")
    private String email;

    @Column(name = "position")
    @JsonProperty("position")
    private String position;

    @Column(name = "user_id")
    @JsonProperty("user_id")
    private int user_id;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public employees(int employee_id, int salary, Date hire_date, String email, String position, int user_id) {
        this.employee_id = employee_id;
        this.salary = salary;
        this.hire_date = hire_date;
        this.email = email;
        this.position = position;
        this.user_id = user_id;
    }

    public employees() {
    }
}
