package com.xlh.sharding.jdbc.demo.dao;

import com.xlh.sharding.jdbc.demo.model.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderDao {

    @Insert("insert into t_order(order_time,customer_id) values(#{orderTime},#{customerId})")
//        @Insert("insert into t_order(order_id,order_time,customer_id) values(#{orderId},#{orderTime},#{customerId})")
    void addOrder(Order o);

    @Select("select order_id,order_time,customer_id from t_order where order_id=#{id}")
    Order get(@Param("id") Long orderId);
}
