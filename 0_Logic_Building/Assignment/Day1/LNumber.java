public class LNumber {
    public static void main(String[] args) {
        int num1 = 10; // predefined numbers
        int num2 = 15;
        int num3 = 5;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
    }
}
