package com.qinchy.springbootdemo.service.impl;

import com.qinchy.springbootdemo.dao.OrderMapper;
import com.qinchy.springbootdemo.model.Order;
import com.qinchy.springbootdemo.model.OrderExample;
import com.qinchy.springbootdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public String add() {
		for (int i = 0; i < 10; i++) {
			Order order = new Order();
			order.setUserId(i);
			order.setOrderId(i);
			orderMapper.insert(order);
		}
		for (int i = 10; i < 20; i++) {
			Order order = new Order();
			order.setUserId(i + 1);
			order.setOrderId(i);
			orderMapper.insert(order);
		}
		return "success";
	}

	@Override
	public List<Order> selectByExample(OrderExample orderExample) {
		return orderMapper.selectByExample(orderExample);
	}
}