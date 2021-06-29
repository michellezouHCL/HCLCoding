package com.michelle;

public class Invoice {
	
	String partNumber;
	String partDescription;
	int quantity;
	double price;

	private Invoice(String partNumber, String partDescription, int quantity, double price) {
		super();
		this.partNumber = partNumber;
		this.partDescription=partDescription;
		this.quantity=quantity;
		this.price=price;
		partNumber = "";

		partDescription = "";

		quantity = 0;

		price = 0.0;
	}
	
	public String getPartNumber() {
		return this.partNumber;
	}
	
	public String getPartDescription() {
		return this.partDescription;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public static double getInvoiceAmount(int quantity, double price) {
		double totalPrice;
		if(quantity<0|| price<0) {
			totalPrice=0;
		}
		else {
			totalPrice=quantity * price;
		}

		return totalPrice;
	}
	
	
}
