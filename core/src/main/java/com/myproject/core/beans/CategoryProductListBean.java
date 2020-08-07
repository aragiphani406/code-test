package com.myproject.core.beans;

import org.apache.commons.lang.StringUtils;

public class CategoryProductListBean {

	private String productName = StringUtils.EMPTY;
	private String productPrice = StringUtils.EMPTY;
	private String productImagePath = StringUtils.EMPTY;
	private String productDesc = StringUtils.EMPTY;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	
	public String getProductImagePath() {
		return productImagePath;
	}
	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}
	
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
}
