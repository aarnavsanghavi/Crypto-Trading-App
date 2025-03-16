package com.SEProject.service;

import com.SEProject.domain.OrderType;
import com.SEProject.model.Coin;
import com.SEProject.model.Order;
import com.SEProject.model.OrderItem;
import com.SEProject.model.User;

import java.util.List;

public interface OrderService {
    Order createOrder(User user, OrderItem orderItem, OrderType orderType);
    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType, String assetSymbol);

    void cancelOrder(Long orderId);

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

}
