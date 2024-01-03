package com.jkngil.PosAppApiSales.shared;

import java.io.Serializable;
import java.util.List;

public class SaleDto implements Serializable {

	private static final long serialVersionUID = -7107187005377194239L;
	private long id;
	private List<SaleItemDto> items;
	private double taxRate;
	private double discount;
	private double totalPrice;
	private String status;
	private String note;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<SaleItemDto> getItems() {
		return items;
	}

	public void setItems(List<SaleItemDto> items) {
		this.items = items;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
