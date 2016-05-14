package com.womenadda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.womenadda.dao.CartItemDAO;
import com.womenadda.model.CartItem;
import com.womenadda.model.ShoppingCart;

@Service
public class CartItemServiceImpl implements CartItemService {

	
   private CartItemDAO cartItemDAO;
	
	/**
	 * @param cartItemDAO the cartItemDAO to set
	 */
	public void setCartItemDAO(CartItemDAO cartItemDAO) {
		this.cartItemDAO = cartItemDAO;
	}
	@Transactional
	public void addCartItem(CartItem cartItem) {
		cartItemDAO.addCartItem(cartItem);

	}
	@Transactional
	public void removeCartItem(CartItem cartItem) {
	cartItemDAO.removeCartItem(cartItem);

	}
	@Transactional
	public void removeAllCartItems(ShoppingCart cart) {
		cartItemDAO.removeAllCartItems(cart);

	}
	@Transactional
	public CartItem getCartItemByProductId(int productId) {
	   return cartItemDAO.getCartItemByProductId(productId);
		
	}

}
