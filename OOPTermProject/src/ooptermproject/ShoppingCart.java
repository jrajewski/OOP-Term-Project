/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptermproject;
import java.util.ArrayList;
/**
 *
 * @author Joseph Rajewski
 */
public class ShoppingCart {
    private ArrayList myCart;
    
    public ShoppingCart(){
        myCart = new ArrayList<Item>();
    }
    
    //adds item and returns updated shopping cart
    public ShoppingCart addItemToCart(Item item){
        myCart.add(item);
        return this;
    }
}
