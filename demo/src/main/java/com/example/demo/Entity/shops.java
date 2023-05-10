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
  private String shop_name;

  @Column(name = "location")
  @JsonProperty("location")
  private String location;

  @Column(name = "address")
  @JsonProperty("address")
  private String address;

  @Column(name = "phone")
  @JsonProperty("phone")
  private String phone;

  @Column(name = "email")
  @JsonProperty("email")
  private String email;

  public int getShop_id() {
    return shop_id;
  }

  public void setShop_id(int shop_id) {
    this.shop_id = shop_id;
  }

  public String getShop_name() {
    return shop_name;
  }

  public void setShop_name(String shop_name) {
    this.shop_name = shop_name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public shops(int shop_id, String shop_name, String location, String address, String phone, String email) {
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
