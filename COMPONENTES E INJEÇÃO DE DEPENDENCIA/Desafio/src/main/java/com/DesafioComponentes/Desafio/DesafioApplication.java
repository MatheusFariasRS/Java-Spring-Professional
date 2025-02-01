package com.DesafioComponentes.Desafio;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.DesafioComponentes.Desafio.entities.Order;
import com.DesafioComponentes.Desafio.entities.OrderService;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner{

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o código do pedido: ");
		int code = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o valor básico: ");
		double basic = sc.nextDouble();
		
		System.out.print("Digite a porcentagem de desconto: ");
		double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		
		System.out.println("Código do pedido: " + order.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));
		
		sc.close();
		
	}

}
