package com.klef.jfsd.exam.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders") // Rename the table to "orders"
public class Order {

    @Id
    private Long orderId; // Manually provided, no auto-generation

    @Column(nullable = false, unique = true)
    private String productName;

    private int quantity;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    private String customerName;

    // Getters and Setters
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
