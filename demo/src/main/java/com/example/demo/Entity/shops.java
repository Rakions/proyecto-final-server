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
@Table(name = "shops")
public class shops {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "shop_id")
  @JsonProperty("shop_id")
  private int shop_id;

  @Column(name = "shop_name")
  @JsonProperty("shop_name")
  private int shop_name;

  @Column(name = "location")
  @JsonProperty("location")
  private int location;

  @Column(name = "address")
  @JsonProperty("address")
  private int address;

  @Column(name = "phone")
  @JsonProperty("phone")
  private int phone;

  @Column(name = "email")
  @JsonProperty("email")
  private int email;

  public int getShop_id() {
    return shop_id;
  }

  public void setShop_id(int shop_id) {
    this.shop_id = shop_id;
  }

  public int getShop_name() {
    return shop_name;
  }

  public void setShop_name(int shop_name) {
    this.shop_name = shop_name;
  }

  public int getLocation() {
    return location;
  }

  public void setLocation(int location) {
    this.location = location;
  }

  public int getAddress() {
    return address;
  }

  public void setAddress(int address) {
    this.address = address;
  }

  public int getPhone() {
    return phone;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  public int getEmail() {
    return email;
  }

  public void setEmail(int email) {
    this.email = email;
  }

  public shops(int shop_id, int shop_name, int location, int address, int phone, int email) {
    this.shop_id = shop_id;
    this.shop_name = shop_name;
    this.location = location;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  public shops() {
  }

  
}
