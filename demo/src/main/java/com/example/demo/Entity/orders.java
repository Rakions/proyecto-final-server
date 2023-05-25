package com.example.demo.Entity;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "orders")
public class orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    @JsonProperty("orders_id")
    private int orders_id;

    @Column(name = "user_id")
    @JsonProperty("user_id")
    private int user_id;

    @Column(name = "shop_id")
    @JsonProperty("shop_id")
    private int shop_id;

    @Column(name = "order_date")
    @JsonProperty("order_date")
    private Date order_date;

    
    @Column(name = "address")
    @JsonProperty("address")
    private String address;

    @Column(name = "total_price")
    @JsonProperty("total_price")
    private int total_price;

    @Column(name = "order_state")
    @JsonProperty("order_state")
    private String order_state;

    @Column(name = "order_name")
    @JsonProperty("order_name")
    private String order_name;

    @Column(name = "order_surname")
    @JsonProperty("order_surname")
    private String order_surname;

    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public String getOrder_state() {
        return order_state;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
    }

    public String getOrder_name() {
        return order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public String getOrder_surname() {
        return order_surname;
    }

    public void setOrder_surname(String order_surname) {
        this.order_surname = order_surname;
    }

    public orders(int orders_id, int user_id, int shop_id, Date order_date, String address, int total_price,
            String order_state, String order_name, String order_surname) {
        this.orders_id = orders_id;
        this.user_id = user_id;
        this.shop_id = shop_id;
        this.order_date = order_date;
        this.address = address;
        this.total_price = total_price;
        this.order_state = order_state;
        this.order_name = order_name;
        this.order_surname = order_surname;
    }

    public orders() {
    }   
}
