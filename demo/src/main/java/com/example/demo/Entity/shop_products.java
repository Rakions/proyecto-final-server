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
@Table(name = "shop_products")
public class shop_products {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "shop_id")
  @JsonProperty("shop_id")
  private int shop_id;

  @Column(name = "product_id")
  @JsonProperty("product_id")
  private int product_id;

  public int getShop_id() {
    return shop_id;
  }

  public void setShop_id(int shop_id) {
    this.shop_id = shop_id;
  }

  public int getProduct_id() {
    return product_id;
  }

  public void setProduct_id(int product_id) {
    this.product_id = product_id;
  }

  public shop_products(int shop_id, int product_id) {
    this.shop_id = shop_id;
    this.product_id = product_id;
  }

  public shop_products() {
  }

  
}
