package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;



@Entity
@Table(name = "cart_details")
public class cart_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_details_id")
    @JsonProperty("cart_details_id")
    private int cart_details_id;

    @Column(name = "carts_id")
    @JsonProperty("carts_id")
    private int carts_id;

    @Column(name = "product_id")
    @JsonProperty("product_id")
    private int product_id;

    @Column(name = "quantity")
    @JsonProperty("quantity")
    private int quantity;

    public int getCarts_id() {
        return carts_id;
    }

    public void setCarts_id(int carts_id) {
        this.carts_id = carts_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public cart_details(int carts_id, int product_id, int quantity) {
        this.carts_id = carts_id;
        this.product_id = product_id;
        this.quantity = quantity;
    }

    public cart_details() {
    }
}
