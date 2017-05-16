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
public class CMDGetItemByIndex {
    private Aggregator agg;
    private int index;
    
    public CMDGetItemByIndex(Aggregator agg, int index){
        this.agg = agg;
        this.index = index;
    }
    
    //returns the item associated with the given index
    //returns null if does not exist
    public Item execute(){
        Catalog catalog = agg.getCatalog();
        for(int i = 0; i < catalog.getCatalogList().size(); i++){
            if(catalog.getCatalogList().get(i).getIndex() == index)
                return catalog.getCatalogList().get(i);
        }
        return null; 
    }
}
