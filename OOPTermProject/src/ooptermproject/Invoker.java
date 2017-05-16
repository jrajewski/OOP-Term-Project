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
public class Invoker {
    private Aggregator agg;
  
    public Invoker(Aggregator agg){
        this.agg = agg;
    }
    
    public User login(boolean isCustomer, boolean isAdmin){
        CMDLogin login = new CMDLogin(agg, isCustomer, isAdmin);
        User user = login.execute();
        return user;
    }
    
    //I think this return statement is okay, because this execute method
    //returns a cart, but verify later
    public ShoppingCart addCart(Item item){
        CMDAddToCart addCart = new CMDAddToCart(agg, item);
        return addCart.execute();
    }
    
    //returns to the caller the item with the index that was passed here
    public Item getItemByIndex(int index){
        CMDGetItemByIndex getItem = new CMDGetItemByIndex(agg, index);
        return getItem.execute();
    }
}
