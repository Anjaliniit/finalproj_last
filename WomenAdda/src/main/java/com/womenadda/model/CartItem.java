package com.womenadda.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CartItem implements Serializable {

	@Id
	@GeneratedValue()
	private int itemId;
	@OneToOne
	@JoinColumn(name="id",insertable=false)
	private Product p;
	int quantity;
	@ManyToOne
	@JoinColumn(name="cartId",insertable=false)
	ShoppingCart cart;
	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the p
	 */
	public Product getP() {
		return p;
	}
	/**
	 * @param p the p to set
	 */
	public void setP(Product p) {
		this.p = p;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the cart
	 */
	public ShoppingCart getCart() {
		return cart;
	}
	/**
	 * @param cart the cart to set
	 */
	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}
	
	
	
}
