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
import java.util.*;
public class UserInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String userName, password;
        Scanner input = new Scanner(System.in);
        boolean customer;    
        
        Invoker invoker = new Invoker(new Aggregator());
        SystemInterface.setInvoker(invoker);
        
        System.out.println("Enter your username: ");
        userName = input.next();
        
        System.out.println("Enter your password: ");
        password = input.next();
        
        customer = SystemInterface.login(userName, password);
        
        //if the person who logged in is a customer, display these options
        //fix security issue later- if a person gives invalid creds, admin privilegs
        //are given by default
        if(customer){
            
        }
        //if not, display admin options
        else if(!customer){
            
        }
    }
    
}
