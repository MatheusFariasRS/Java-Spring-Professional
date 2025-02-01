package com.DesafioComponentes.Desafio.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired
	private ShippingService shippingService;
	
	
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}



	public Double total(Order order) {
		return order.getBasic() 
				- (order.getBasic() / 100 *order.getDiscount())
				+ shippingService.shipment(order);
	}

}
