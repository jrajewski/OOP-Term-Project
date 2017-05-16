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
import java.util.ArrayList;

public class Catalog {
    private ArrayList<Item> catalog = new ArrayList<Item>();
    
    public ArrayList<Item> getCatalogList(){
        return catalog;
    }
    
    //Iterator getters
    //need to update these after iterators are implemented
    public CatalogIteratorInterface getMinPriceIterator(){
        return new MinPriceIterator();
    }
    
    public CatalogIteratorInterface getMaxPriceIterator(){
        return new MaxPriceIterator();
    }
    
    public CatalogIteratorInterface getWholeCatalogIterator(){
        return new WholeCatalogIterator();
    }
    
    public CatalogIteratorInterface getDepartmentIterator(){
        return new DepartmentIterator();
    }
    
    
    
    
    //inner Iterator classes
    public class MinPriceIterator implements CatalogIteratorInterface{
        
    }
    
    public class MaxPriceIterator implements CatalogIteratorInterface{
        
    }
    
    public class WholeCatalogIterator implements CatalogIteratorInterface{
        
    }
    
    public class DepartmentIterator implements CatalogIteratorInterface{
        
    }
}
