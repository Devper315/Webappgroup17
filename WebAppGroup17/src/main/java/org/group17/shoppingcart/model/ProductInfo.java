package org.group17.shoppingcart.model;

import org.group17.shoppingcart.entity.Product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductInfo {
	private String code;
	private String name;
	private long price;

	public ProductInfo(Product product) {
		this.code = product.getCode();
		this.name = product.getName();
		this.price = product.getPrice();
	}

	// Sử dụng trong JPA/Hibernate query
	public ProductInfo(String code, String name, long price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}

}