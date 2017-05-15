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
    private static Invoker invoker;
    
    public Invoker setInvoker(Invoker invoker){
      SystemInterface.invoker = invoker;
      return invoker;
    }
    
    public static boolean login(String uName, String password){
        boolean isAdmin = isAdmin(uName, password);
        if(isAdmin)
            
    }
    
    public static boolean isAdmin(String uName, String password){
        return uName.equals("admin") && password.equals("password");     
    }
    
    public static boolean isCustomer(String uName, String password){
        return uName.equals("jrajew1") && password.equals("password");     
    }
}
