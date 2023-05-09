package com.example.demo.Entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders_employees")

public class orders_employees {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "employee_id")
  @JsonProperty("employee_id")
  private int employee_id;

  @Column(name = "orders_id")
  @JsonProperty("orders_id")
  private int orders_id;

  public int getEmployee_id() {
    return employee_id;
  }

  public void setEmployee_id(int employee_id) {
    this.employee_id = employee_id;
  }

  public int getOrders_id() {
    return orders_id;
  }

  public void setOrders_id(int orders_id) {
    this.orders_id = orders_id;
  }

  public orders_employees(int employee_id, int orders_id) {
    this.employee_id = employee_id;
    this.orders_id = orders_id;
  }

  public orders_employees() {
  }

  
}
