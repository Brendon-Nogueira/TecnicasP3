package br.edu.univas.controller;

import java.util.Scanner;

public class Customer implements PaymentMethod {
	
	private long id; 
	private String name;
	private String cpf; 
	private PaymentMethod PaymentMethod;
	
	Scanner scanner = new Scanner(System.in); 
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PaymentMethod getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		PaymentMethod = paymentMethod;
	}
	

	
	
	
	
	
	
}
