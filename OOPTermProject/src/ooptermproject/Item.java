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
public class Item {
    private int index;
    private String name;
    private double cost;
    private String department;
    
    public Item(int index, String name, double cost, String department){
        this.name = name;
        this.index = index;
        this.cost = cost;
        this.department = department;
    }
    
    public int getIndex(){
        return this.index;
    }
    
    public String toString(){
        return "Index: " + index + "\n"
                + "Name: " + name + "\n"
                + "Cost: " + cost + "\n"
                + "Department: " + department + "\n\n";
                
    }
}
