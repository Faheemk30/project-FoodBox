package com.foodbox.dto;

import lombok.Data;

import java.util.Set;

import com.foodbox.entity.Address;
import com.foodbox.entity.Customer;
import com.foodbox.entity.Order;
import com.foodbox.entity.OrderItem;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
