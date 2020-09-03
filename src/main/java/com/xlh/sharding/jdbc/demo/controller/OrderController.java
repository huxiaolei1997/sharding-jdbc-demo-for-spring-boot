package com.xlh.sharding.jdbc.demo.controller;

import com.xlh.sharding.jdbc.demo.model.Order;
import com.xlh.sharding.jdbc.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("add")
    public Order addOrder(Order o) {

        this.orderService.addOrder(o);

        return o;
    }

    @RequestMapping("get")
    public Order getOrder(Long orderId) {
        return this.orderService.getOrder(orderId);
    }
}
