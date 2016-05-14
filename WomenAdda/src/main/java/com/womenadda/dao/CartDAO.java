package com.womenadda.dao;

import com.womenadda.model.ShoppingCart;

public interface CartDAO {

    ShoppingCart getCartById(int cartId);

	  void update(ShoppingCart cart);

	
	
	
}
