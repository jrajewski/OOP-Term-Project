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
public class Invoker {
    private Aggregator aggregator;
  
    public Invoker(Aggregator aggregator){
        this.aggregator = aggregator;
    }
    
    //design concern- return type may not be same across all commands
    public String[] login(){
        CMDLogin login = new CMDLogin(aggregator);
        String[] items = login.execute();
        return items;
  }
}
