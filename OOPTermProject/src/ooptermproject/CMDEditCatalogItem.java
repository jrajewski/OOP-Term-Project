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
public class CMDEditCatalogItem implements CMDInterface{
    private Aggregator agg;
    private int index;
    private String newName;
    private double newCost;
    private String newDepartment;
    
    public CMDEditCatalogItem(Aggregator agg, int index, String newName, double newCost, String newDepartment){
        this.agg = agg;
        this.index = index;
        this.newName = newName;
        this.newCost = newCost;
        this.newDepartment = newDepartment;
    }
    
    
    public Item execute(){
        
    }
}
