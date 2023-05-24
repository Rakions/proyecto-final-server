package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;



@Entity
@Table(name = "order_details")
public class order_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_details_id")
    @JsonProperty("order_details_id")
    private int order_details_id;

    @Column(name = "orders_id")
    @JsonProperty("orders_id")
    private int orders_id;

    @Column(name = "product_id")
    @JsonProperty("product_id")
    private int product_id;

    @Column(name = "quantity")
    @JsonProperty("quantity")
    private int quantity;

    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
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

    public order_details(int orders_id, int product_id, int quantity) {
        this.orders_id = orders_id;
        this.product_id = product_id;
        this.quantity = quantity;
    }

    public order_details() {
    }
}
