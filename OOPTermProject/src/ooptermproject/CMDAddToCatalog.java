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
public class CMDAddToCatalog implements CMDInterface{
    private Aggregator agg;
    private Item item;
    
    public CMDAddToCatalog(Aggregator agg, Item item){
        this.agg = agg;
        this.item = item;
    }
    
    //adds item to catalog and returns it
    public Item execute(){
        return agg.getCatalog().addItem(item);
    }
}
