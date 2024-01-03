package com.jkngil.PosAppApiSales.shared;

import java.io.Serializable;

public class SaleItemDto implements Serializable {

	private static final long serialVersionUID = -2587862635229155352L;
	private long id;
	private long product_id;
	private int amount;
	private double discount;
	private double retailPrice;
	private String note;
	private SaleDto sale;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public SaleDto getSale() {
		return sale;
	}

	public void setSale(SaleDto sale) {
		this.sale = sale;
	}

}
