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
    public CatalogIteratorInterface getMinPriceIterator(){
        
    }
    
    public CatalogIteratorInterface getMaxPriceIterator(){
        
    }
    
    public CatalogIteratorInterface getWholeCatalogIterator(){
        
    }
    
    public CatalogIteratorInterface getDepartmentIterator(){
        
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
