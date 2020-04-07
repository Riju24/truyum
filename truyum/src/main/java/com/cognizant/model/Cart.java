package com.cognizant.model;

public class Cart {
	int itemId;
	int CustomerId;
	

	public Cart() {
		super();
	}
	public Cart(int itemId, int customerId) {
		super();
		this.itemId = itemId;
		CustomerId = customerId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	@Override
	public String toString() {
		return "Cart [itemId=" + itemId + ", CustomerId=" + CustomerId + "]";
	}

}
