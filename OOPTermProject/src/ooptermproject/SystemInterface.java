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
public class SystemInterface {
    //use system interface to configure what to give back to UI
    private static Invoker invoker;
    
    public Invoker setInvoker(Invoker invoker){
      SystemInterface.invoker = invoker;
      return invoker;
    }
    
    public static boolean login(String uName, String password){
        //Valid user ID's stored here
        
        User user = invoker.login();
        
    }
    
    public static boolean isAdmin(String uName, String password){
        return uName.equals("admin") && password.equals("password");     
    }
    
    public static boolean isCustomer(String uName, String password){
        return uName.equals("jrajew1") && password.equals("password");     
    }
}
