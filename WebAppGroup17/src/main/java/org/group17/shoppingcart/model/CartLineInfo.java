package org.group17.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class CartLineInfo {
 
    private ProductInfo productInfo;
    private int quantity;
 
    public CartLineInfo() {
        this.quantity = 0;
    }
    public double getAmount() {
        return this.productInfo.getPrice() * this.quantity;
    }
    
}