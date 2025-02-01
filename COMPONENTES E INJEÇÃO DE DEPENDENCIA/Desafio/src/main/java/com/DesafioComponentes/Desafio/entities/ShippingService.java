package com.DesafioComponentes.Desafio.entities;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

	public Double shipment(Order order) {
		if(order.getBasic() < 100) {
			return order.getBasic() - order.getBasic() + 20;
		}
		else if(order.getBasic() < 200) {
			return order.getBasic() - order.getBasic() + 12;
		}
		else {
			return order.getBasic() - order.getBasic();
		}
	}
}
