package com.example.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController 
{
	@GetMapping
	public Order getOrder()
	{
		Order order = new Order();
		
		return order;
	}
}
