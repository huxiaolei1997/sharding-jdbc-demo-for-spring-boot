package com.xlh.sharding.jdbc.demo.service;

import com.xlh.sharding.jdbc.demo.dao.OrderDao;
import com.xlh.sharding.jdbc.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public void addOrder(Order o) {
        this.orderDao.addOrder(o);
    }

    public Order getOrder(Long orderId) {
        return this.orderDao.get(orderId);
    }
}
