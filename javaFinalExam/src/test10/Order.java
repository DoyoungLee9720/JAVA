package test10;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNo;
	private Customer customer;
	private List<Product> products;
	private int totlaPrice = 0;
	public Order(int orderNo, Customer customer) {
		this.orderNo = orderNo;
		this.customer = customer;
		this.products = new ArrayList<Product>();
	}
	public void addProduct(Product product) {
		totlaPrice += product.getPrice();
		products.add(product);
	}
	public int getOrderNo() {
		return orderNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public List<Product> getProducts() {
		return products;
	}
	public int getTotlaPrice() {
		return totlaPrice;
	}
	
}
