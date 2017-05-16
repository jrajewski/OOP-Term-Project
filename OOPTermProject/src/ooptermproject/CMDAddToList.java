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
public class CMDAddToList implements CMDInterface{
    private Aggregator agg;
    private Item item;;
    
    public CMDAddToList(Aggregator agg, Item item){
        this.agg = agg;
        this.item = item;
    }
    
    
    public ShoppingList execute(){
        ShoppingList cmdList = agg.myList.addItemToShopList(item);
        return cmdList;
    }
}
