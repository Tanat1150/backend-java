package com.example.demo.mobel;
import javax.swing.Spring;

public class Product {
	
	private Integer productId;
	private String productname;
	private double productprice; // Updated data type to double
	private Integer productamount;
	private String productdetail; // Updated data type to String

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	public Integer getProductamount() {
		return productamount;
	}

	public void setProductamount(Integer productamount) {
		this.productamount = productamount;
	}

	public String getProductdetail() {
		return productdetail;
	}

	public void setProductdetail(String productdetail) {
		this.productdetail = productdetail;
	}
}