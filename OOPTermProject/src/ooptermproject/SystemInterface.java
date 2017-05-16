/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooptermproject;
import java.util.ArrayList;
/**
 *
 * @author Joseph Rajewski
 */
public class SystemInterface {
    //use system interface to configure what to give back to UI
    private static Invoker invoker;
    
    public static Invoker setInvoker(Invoker invoker){
      SystemInterface.invoker = invoker;
      return invoker;
    }
    
    //change this to return an ArrayList of String
    public static boolean login(String uName, String password){
        boolean isCustomer = false;
        boolean isAdmin = false;
        
        isCustomer = isCustomer(uName, password);
        isAdmin = isAdmin(uName, password);
        
        User user = invoker.login(isCustomer, isAdmin);
        if( user instanceof Customer)
            return true;
        else if(user instanceof Administrator)
            return false;
      
        //this needs to be changed
        //currently will give admin access if wrong credentials entered
        return false;
    }
    
    //login utility methods; stores credentials here
    public static boolean isAdmin(String uName, String password){
        return uName.equals("admin") && password.equals("password");     
    }
    
    public static boolean isCustomer(String uName, String password){
        return uName.equals("nusrat") && password.equals("admin");     
    }
    
    //this returns an ArrayList<string> of the indeces of the items in the shopList
    //an integer must be parsed from the string list that is returned to caller
    public static ArrayList<String> addCart(int index){
        //gets the item form the catalog based on index given to SI
        Item item = invoker.getItemByIndex(index);
        //adds this item to shopList, and gets the ArrayList field for the shopList
        ArrayList<Item> cart = invoker.addCart(item).getCartList();
        ArrayList<String> cartString = null;
        for(int i = 0; i < cart.size(); i++)
            cartString.add(Integer.toString(cart.get(i).getIndex()));
        return cartString;
    }
    
    public static ArrayList<String> addList(int index){
        //gets the item form the catalog based on index given to SI
        Item item = invoker.getItemByIndex(index);
        //adds this item to shopList, and gets the ArrayList field for the shopList
        ArrayList<Item> shopList = invoker.addCart(item).getCartList();
        ArrayList<String> shopListString = null;
        for(int i = 0; i < shopList.size(); i++)
            shopListString.add(Integer.toString(shopList.get(i).getIndex()));
        return shopListString;
    }
    
    
    
}
