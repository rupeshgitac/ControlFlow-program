package kodewala.com;

public class DiscountService {

    public double calculateDiscount(String customerType, double purchaseAmount) {

        double discountPercentage = 0;

        if (purchaseAmount > 1000) {

            if (customerType.equalsIgnoreCase("Gold")) {
                discountPercentage = 20;
            } 
            
            
        }

        return 0;
    }
}