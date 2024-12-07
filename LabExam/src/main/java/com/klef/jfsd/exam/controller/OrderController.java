package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.model.Order;
import com.klef.jfsd.exam.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }
}
