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
    //aggregator creates a static cart and list object when a object object is created (by logging in)
    //that way, for as long as the user is logged in, the shopping cart to reference
    //in aggregator belongs to the logged in user
    public static ShoppingCart myCart;
    public static ShoppingList myList;
    private Catalog catalog;
    private OrderDetails receipt;
    
    //using static fields in this class was not the way I imagined implementing 
    //this class; however, it suited the requirements of the program
    
    //if we took the time to create and store user accounts, I would have created
    //a reference to a shopping cart and shopping list for each unique user
    //in this implementation though, a "user" object serves moreso as a 
    //user session than an actual unique user (because a user is not being 
    //created every time someone logs in, although a user object is

    //because of that, I had the objects linked to a user stored here statically so that the
    //user object would not have to be passed around everywhere to access this
    //information- I thought that would put too much responsibility on the UserInterface class
    //since the user is logged in, it is "technically" still secure
    
    //NOTE: maybe make static user field in SystemInterface to avoid that
    
    public static ShoppingCart setShoppingCart(ShoppingCart cart){
        myCart = cart;
        return myCart;
    }
    
    public static ShoppingList setShoppingList(ShoppingList list){
        myList = list;
        return myList;
    }
    
    public Aggregator(){
        this.catalog =  new Catalog();
        //redundant, but here to help me visualize
        this.myCart = setShoppingCart(null);
        this.myList = setShoppingList(null);
    }
    
    public Catalog getCatalog(){
        return catalog;
    }
}
