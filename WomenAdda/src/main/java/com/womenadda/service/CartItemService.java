package com.womenadda.service;

import com.womenadda.model.CartItem;
import com.womenadda.model.ShoppingCart;

public interface CartItemService {

	

	   void addCartItem(CartItem cartItem);

	    void removeCartItem(CartItem cartItem);

	    void removeAllCartItems(ShoppingCart cart);

	    CartItem getCartItemByProductId(int productId);

}
