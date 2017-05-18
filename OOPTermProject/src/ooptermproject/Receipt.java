import java.io*;

public class Receipt extends ShoppingCart{
    
    interface Decorators{
    void addDiscount(double shoppingCartList);
    void addTax(double shoppingCartList);
    }
    
    static class printReciept implements Decorators{
        Scanner input = new Scanner(System.in);  // Reading from System.in
        public void addDiscount(shoppingCart){
            double discount = 0;
            double total = 0;
            double tax = 0;
            double mdTax = 0.06;
            double vaTax = 0.053;
            double paTax = 0.06;
            
            // ADDING DISCOUNTS
            
            System.out.println("What would do have to add?");
            System.out.println("Press 1 for Coupon");
            System.out.println("Press 2 for Gift Card");
            System.out.println("Press 3 for Percentage Discount");
            System.out.println("Press 4 for no Discount");
            
            switch(option){
                case 1: System.out.println("How much is the coupon: ");
                        coupon = input.nextDouble();
                        shoppingCartPrice - discount = shoppingCartPrice;
                        break;
                case 2: System.out.println("How much is the gift card: ");
                        discount = input.nextDouble();
                        shoppingCartPrice - discount = shoppingCartPrice;
                        break;
                case 3: System.out.println("How much is the discount: ");
                        discount = input.nextDouble();
                        shoppingCartPrice - discount = shoppingCartPrice;
                        break;
                case 4: System.out.println("No discount has been added");
                        break;
                default: System.out.println("Invalid input");
                        break;
            }
            
            //  ADDING TAX
            
            System.out.println("What state are you from?");
            System.out.println("Press 1 for MD");
            System.out.println("Press 2 for PA");
            System.out.println("Press 3 for VA");
            
            switch(option){
                case 1: shoppingCartPrice * mdTax = tax;
                        shoppingCartPrice + tax = shoppingCartPrice;
                        break;
                case 2: shoppingCartPrice * paTax = tax;
                        shoppingCartPrice + tax = shoppingCartPrice;
                        break;
                case 3: shoppingCartPrice * vaTax = tax;
                        shoppingCartPrice + tax = shoppingCartPrice;
                        break;
                default: System.out.println("Invalid input");
                        break;
            }
            
            // PRINTING RECIEPT
            
                System.out.println("The total for your receipt is $" + shoppingCartPrice);
        }
    }
}
