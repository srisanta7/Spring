package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Chai {
    private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Chai(double price) {
		super();
		this.price = price;
	}

	public Chai() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Chai [price=" + price + "]";
	}
	@PostConstruct
    public void init() {
    	System.out.println("in init chai");
    }
	@PreDestroy
    public void destroy() {
    	System.out.println("in destroy chai");
    }
}
