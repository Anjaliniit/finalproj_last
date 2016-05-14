package com.womenadda.dao;

import com.womenadda.model.CartItem;
import com.womenadda.model.ShoppingCart;

public interface CartItemDAO {

	
	   void addCartItem(CartItem cartItem);

	    void removeCartItem(CartItem cartItem);

	    void removeAllCartItems(ShoppingCart cart);

	    CartItem getCartItemByProductId(int productId);

}
