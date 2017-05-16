/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptermproject;

import java.util.ArrayList;

/**
 *
 * @author ringo
 */
public class ShoppingList {
    private ArrayList<Item> myList;
    
    public ShoppingList(){
        myList = new ArrayList<Item>();
    }
    
    //adds item and returns updated shopping cart
    public ShoppingList addItemToShopList(Item item){
        myList.add(item);
        return this;
    }
    
    //returns the ArrayList of the items in the cart
    public ArrayList<Item> getShopList(){
        return this.myList;
    }
}
