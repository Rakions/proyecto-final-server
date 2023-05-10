package com.example.demo.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "employees")
public class employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    @JsonProperty("employee_id")
    private int employee_id;

    @Column(name = "employee_name")
    @JsonProperty("employee_name")
    private String employee_name;

    @Column(name = "employee_surname")
    @JsonProperty("employee_surname")
    private String employee_surname;

    @Column(name = "email")
    @JsonProperty("email")
    private String email;

    @Column(name = "password")
    @JsonProperty("password")
    private String password;

    @Column(name = "phone")
    @JsonProperty("phone")
    private String phone;

    @Column(name = "salary")
    @JsonProperty("salary")
    private int salary;

    @Column(name = "position")
    @JsonProperty("position")
    private String position;

    @Column(name = "hire_date")
    @JsonProperty("hire_date")
    private Date hire_date;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_surname() {
        return employee_surname;
    }

    public void setEmployee_surname(String employee_surname) {
        this.employee_surname = employee_surname;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public employees(int employee_id, String employee_name, String employee_surname, String email, String password,
            String phone, int salary, String position, Date hire_date) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_surname = employee_surname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.salary = salary;
        this.position = position;
        this.hire_date = hire_date;
    }

    public employees() {
    }

    

    
}
