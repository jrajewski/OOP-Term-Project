import java.io*;

public class Receipt extends ShoppingCart{
    
    interface Decorators{
    void addDiscount(double shoppingCartList);
    void addTax(double shoppingCartList);
    }
    
    static class printReciept implements Decorators{
        public void addDiscount(shoppingCart){
            double discount = 0;
            System.out.println("What would do have to add?");
            System.out.println("Press 1 for Coupon");
            System.out.println("Press 2 for Gift Card ");
            System.out.println("Press 3 for Percentage Discount");
            System.out.println("Press 4 for no Discount");
            switch(option){
                case 1: 
            }
        }
    }
}
