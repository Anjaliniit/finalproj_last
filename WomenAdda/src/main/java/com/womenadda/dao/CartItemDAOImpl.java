package com.womenadda.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.womenadda.model.CartItem;
import com.womenadda.model.ShoppingCart;



@Repository
public class CartItemDAOImpl implements CartItemDAO {

	
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sf)
    {
    	this.sessionFactory=sf; 	
    }

	public void addCartItem(CartItem cartItem) {
	Session session=sessionFactory.getCurrentSession();
	session.saveOrUpdate(cartItem);		
	}

	public void removeCartItem(CartItem cartItem) {
			    Session session = sessionFactory.getCurrentSession();
	            session.delete(cartItem);
		
	}

	public void removeAllCartItems(ShoppingCart cart) {
		  List<CartItem> cartItems = cart.getCartItems();
		  for (CartItem item : cartItems)
		  {
		  removeCartItem(item);
		  }
     }

	public CartItem getCartItemByProductId(int productId) {
		  	Session session = sessionFactory.getCurrentSession();
	        Query query = session.createQuery("from CartItem where id = ?");
	        query.setInteger(0, productId);
	        session.flush();
	        return (CartItem) query.uniqueResult();
	}

	
	
}
