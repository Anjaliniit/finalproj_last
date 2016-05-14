package com.womenadda.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.womenadda.model.ShoppingCart;
import com.womenadda.service.UserService;

@Repository
public class CartDAOImpl implements CartDAO {

		
	    private SessionFactory sessionFactory;
	  
	  
		public void setSessionFactory(SessionFactory sf)
	    {
	    	this.sessionFactory=sf; 	
	    }

	
	public ShoppingCart getCartById(int cartId) {
		Session session=this.sessionFactory.getCurrentSession();
		ShoppingCart cart=(ShoppingCart)session.get(ShoppingCart.class, new Integer(cartId));
		return cart;
	}

	public void update(ShoppingCart cart) {
		

	}

}
