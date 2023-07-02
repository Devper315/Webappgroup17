package org.group17.shoppingcart.model;

import org.group17.shoppingcart.form.CustomerForm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInfo {

	private String name;
	private String address;
	private String email;
	private String phone;

	private boolean valid;

	public CustomerInfo(CustomerForm customerForm) {
		this.name = customerForm.getName();
		this.address = customerForm.getAddress();
		this.email = customerForm.getEmail();
		this.phone = customerForm.getPhone();
		this.valid = customerForm.isValid();
	}

	public boolean isValid() {
		return valid;
	}
}