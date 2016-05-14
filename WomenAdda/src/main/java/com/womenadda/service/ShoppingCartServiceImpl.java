package com.womenadda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.womenadda.dao.CartDAO;
import com.womenadda.model.ShoppingCart;

@Service

public class ShoppingCartServiceImpl implements CartDAO {
    
	private CartDAO cartDAO;
    
    
    /**
	 * @param cartDAO the cartDAO to set
	 */
	public void setCartDAO(CartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}
	@Transactional
	public ShoppingCart getCartById(int cartId) {
		
		return cartDAO.getCartById(cartId);
	}
	@Transactional
	public void update(ShoppingCart cart) {
      cartDAO.update(cart);

	}

}
