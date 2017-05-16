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
public class CMDAddToCart implements CMDInterface{
    Aggregator agg;
    Item item;
    
    public CMDAddToCart(Aggregator agg, Item item){
        this.agg = agg;
        this.item = item;
    }
    
    //adds item to shopping cart in aggregator
    //and returns updated shopping cart
    public ShoppingCart execute(){
        ShoppingCart cmdCart = agg.myCart.addItemToCart(item);
        return cmdCart;
    }
}
