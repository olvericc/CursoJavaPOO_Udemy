package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	// simpleDateFormat
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	//class attributes
	private Date moment;
	private OrderStatus status;
	
	// object of type Client
	private Client client;
	
	// list
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	// pattern builder
	public Order() {}

	// constructor
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	// getters and setters
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	// addItem
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	// removeItem
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	// total
	public double total() {
		double sum = 0.0;
		
		for (OrderItem it : items) {
			sum += it.subTotal();
		}
		
		return sum;
	}
	
	// toString
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status  + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		
		sb.append("Order items:\n");
		
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
	}
	
	
	
	
	
}
