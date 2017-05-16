/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptermproject;

/**
 *
 * @author Joseph Rajewski
 */
public class Customer extends User{
    //Customer fields
    //added location for when it comes time to tax
    String name, location;
    
    //each user gets a shopping list and cart object
    ShoppingCart cart;
    ShoppingList shoppingList;
    
    public Customer(){
        cart = new ShoppingCart();
        Aggregator.
        shoppingList = new ShoppingList();
    }
}
