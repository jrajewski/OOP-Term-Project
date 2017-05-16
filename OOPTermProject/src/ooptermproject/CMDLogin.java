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
public class CMDLogin implements CMDInterface{
    Aggregator agg;
    //user should only be of type customer or admin
    boolean customer, admin;
    
    public CMDLogin(Aggregator agg, boolean customer, boolean admin){
        this.agg = agg;
        this.customer = customer;
    }
    
    //return some type of data here
    public User execute(){
        if(customer)
            return new Customer();
        else if(admin)
            return new Administrator();
        return null;
    }
}
