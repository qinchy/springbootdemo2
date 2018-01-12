/**
 * 
 */
package com.qinchy.springbootdemo.service;

import java.util.List;

import com.qinchy.springbootdemo.model.Order;
import com.qinchy.springbootdemo.model.OrderExample;

/**
 * @author Administrator
 *
 */
public interface OrderService {
    String add();
    List<Order> selectByExample(OrderExample orderExample);
}
