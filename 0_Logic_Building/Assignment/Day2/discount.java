import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the total purchase amount (Rs): ");
        double totalAmount = scanner.nextDouble();
        
        double discountPercentage;
        
        int discountCategory;
        if (totalAmount >= 1000) {
            discountCategory = 3;
        } else if (totalAmount >= 500) {
            discountCategory = 2;
        } else {
            discountCategory = 1;
        }
        
        switch (discountCategory) {
            case 3:
                discountPercentage = 20.0;
                break;
            case 2:
                discountPercentage = 10.0;
                break;
            case 1:
            default:
                discountPercentage = 5.0;
                break;
        }
        
        double discountAmount = (discountPercentage / 100) * totalAmount;
        double finalAmount = totalAmount - discountAmount;
        
        System.out.println("Original amount: Rs. " + totalAmount);
        System.out.println("Discount percentage: " + discountPercentage + "%");
        System.out.println("Discount amount: Rs. " + discountAmount);
        System.out.println("Final amount after discount: Rs. " + finalAmount);
        
        scanner.close();
    }
}
