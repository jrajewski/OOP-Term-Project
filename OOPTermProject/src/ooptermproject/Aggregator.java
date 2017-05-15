/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptermproject;

/**
 *
 * @author ringo
 */
public class Aggregator {
    public static ShoppingCart myCart;
    public static Catalog catalog;
    
    public ShoppingCart setShoppingCart(ShoppingCart cart){
        myCart = cart;
        return myCart;
    }
}
