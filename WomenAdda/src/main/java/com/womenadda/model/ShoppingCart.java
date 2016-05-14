/**
 * 
 */
package com.womenadda.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author hardik
 *
 */

@Entity
public class ShoppingCart implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int cartId;

@OneToOne
@JoinColumn(name="userId")
private UserRegister  user;

@OneToMany(mappedBy="cart",cascade=CascadeType.ALL)
private List<CartItem> cartItems;


/**
 * @return the cartId
 */
public int getCartId() {
	return cartId;
}

/**
 * @param cartId the cartId to set
 */
public void setCartId(int cartId) {
	this.cartId = cartId;
}

/**
 * @return the user
 */
public UserRegister getUser() {
	return user;
}

/**
 * @param user the user to set
 */
public void setUser(UserRegister user) {
	this.user = user;
}

/**
 * @return the cartItems
 */
public List<CartItem> getCartItems() {
	return cartItems;
}

/**
 * @param cartItems the cartItems to set
 */
public void setCartItems(List<CartItem> cartItems) {
	this.cartItems = cartItems;
}	
}
