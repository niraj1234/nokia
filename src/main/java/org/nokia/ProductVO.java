package org.nokia;

public class ProductVO {

	private int pkIdProduct;
	private String productName;
	private int price;

	public ProductVO() {
		super();
	}

	public ProductVO(int pkIdProduct, String productName, int price) {
		super();
		this.pkIdProduct = pkIdProduct;
		this.productName = productName;
		this.price = price;
	}

	public int getPkIdProduct() {
		return pkIdProduct;
	}
	public void setPkIdProduct(int pkIdProduct) {
		this.pkIdProduct = pkIdProduct;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductVO [pkIdProduct=" + pkIdProduct + ", productName=" + productName + ", price=" + price + "]";
	}
}
