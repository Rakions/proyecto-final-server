package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;



@Entity
@Table(name = "carts")
public class carts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    @JsonProperty("cart_id")
    private int cart_id;

    @Column(name = "user_id")
    @JsonProperty("user_id")
    private int user_id;

    @Column(name = "total_price")
    @JsonProperty("total_price")
    private float total_price;

    
    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public carts(int cart_id, int user_id, float total_price) {
        this.cart_id = cart_id;
        this.user_id = user_id;
        this.total_price = total_price;
    }

    public carts() {
    } 
    
}
