package com.womenadda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.womenadda.model.UserRegister;
import com.womenadda.service.CartItemService;
import com.womenadda.service.ShoppingCartService;
import com.womenadda.service.UserService;

@Controller
public class CartController {

	@Autowired(required=true)
	  private ShoppingCartService cartService;

	@Autowired(required=true)  
	private CartItemService cartItemService;
	   
	@Autowired(required=true)
	private UserService userService;
      /**
	 * @param cartService the cartService to set
	 */
	@Qualifier(value="cartService")
	public void setCartService(ShoppingCartService cartService) {
		this.cartService = cartService;
	}

	/**
	 * @param cartItemService the cartItemService to set
	 */
	@Qualifier(value="cartItemService")
	public void setCartItemService(CartItemService cartItemService) {
		this.cartItemService = cartItemService;
	}

	/**
	 * @param userService the userService to set
	 */
	@Qualifier(value="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
      @RequestMapping()
	    public String getCart(int userId){
	        UserRegister user = userService.getUserById(userId);
	        int cartId = user.getCart().getCartId();

	        return "redirect:/customer/cart/" + cartId;
	    }

	    @RequestMapping("/{cartId}")
	    public String getCartRedirect(@PathVariable (value = "cartId") int cartId, Model model){
	        model.addAttribute("cartId", cartId);

	        return "cart";
	    }
	
}

