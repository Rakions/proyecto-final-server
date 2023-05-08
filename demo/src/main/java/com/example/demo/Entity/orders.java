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
    private Date address;

    @Column(name = "total_price")
    @JsonProperty("total_price")
    private int total_price;

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

    public Date getAddress() {
        return address;
    }

    public void setAddress(Date address) {
        this.address = address;
    }

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public orders(int orders_id, int user_id, int shop_id, Date order_date, Date address, int total_price) {
        this.orders_id = orders_id;
        this.user_id = user_id;
        this.shop_id = shop_id;
        this.order_date = order_date;
        this.address = address;
        this.total_price = total_price;
    }

    public orders() {
    }

    
}
