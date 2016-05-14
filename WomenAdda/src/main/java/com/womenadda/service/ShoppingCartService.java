package com.womenadda.service;

import com.womenadda.model.ShoppingCart;

public interface ShoppingCartService {

	
	ShoppingCart getCartById(int cartId);

	  void update(ShoppingCart cart);

}
