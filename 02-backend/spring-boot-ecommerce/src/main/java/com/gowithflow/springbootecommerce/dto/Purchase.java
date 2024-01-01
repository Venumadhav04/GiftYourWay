package com.gowithflow.springbootecommerce.dto;

import com.gowithflow.springbootecommerce.entity.Address;
import com.gowithflow.springbootecommerce.entity.Customer;
import com.gowithflow.springbootecommerce.entity.Order;
import com.gowithflow.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
