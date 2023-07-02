package org.group17.shoppingcart.form;

import org.group17.shoppingcart.entity.Product;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductForm {
	private String code;
	private String name;
	private long price;

	private boolean newProduct = false;

	// Upload file.
	private MultipartFile fileData;

	public ProductForm(Product product) {
		this.code = product.getCode();
		this.name = product.getName();
		this.price = product.getPrice();
	}

	public boolean isNewProduct() {
		return newProduct;
	}

}