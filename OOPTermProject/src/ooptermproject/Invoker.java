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
    
    public ShoppingCart addCart(Item item){
        CMDAddToCart addCart = new CMDAddToCart(agg, item);
        ShoppingCart myCart = 
                addItemCart = addCart.execute();
        return addItemCart;
    }
    
    public Item getItemByIndex(int index){
        
    }
}
