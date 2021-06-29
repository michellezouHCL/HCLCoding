package com.michelle;

public class InvoiceTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice invoice = new Invoice(null, null, 0, 0);
		invoice.setPartNumber("1");
		invoice.setPartDescription("Food");
		invoice.setQuantity(4);
		invoice.setPrice(2.00);
		//Prints partNumber, partDescription, Quantity x Price = InvoiceAmount
		System.out.printf("%s\t%s :%d x %.2f =",invoice.getPartNumber(), invoice.getPartDescription(), invoice.quantity, invoice.price);
		System.out.printf("%.2f\n",invoice.getInvoiceAmount(invoice.quantity, invoice.price));
	}

}
