package com.bs.test;

import com.bs.bean.Order;
import com.bs.dao.IOrderDAO;
import com.bs.dao.impl.OrderDAOImpl;
import org.junit.Test;
import java.util.Date;

public class OrderDAOImplTest {
    IOrderDAO orderDAO = new OrderDAOImpl();

    @Test
    public void saveOrder(){
        System.out.println(orderDAO.saveOrder(new Order("123464", new java.sql.Date(new Date().getTime()),
                100.00, Order.SHIPPED, 1)));
    }

    @Test
    public void queryAllOrders() {
        System.out.println(orderDAO.queryAllOrders());
    }

    @Test
    public void changeOrderStatus() {
        orderDAO.changeOrderStatus("123461", Order.SIGNED);
        System.out.println(orderDAO.queryAllOrders());
    }

    @Test
    public void queryOrderByUserId() {
        System.out.println(orderDAO.queryOrderByUserId(1));
    }
}