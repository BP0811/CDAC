import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the day number
        System.out.print("Enter a number (1 for Monday, 2 for Tuesday, etc.): ");
        int day = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Outer switch statement to determine the day of the week
        switch (day) {
            
            case 1,2,3,4,5:
                // Nested switch to determine if it's a weekday
                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                }
                System.out.println("It's a weekday.");
                break;
            case 6,7:
                // Nested switch to determine if it's a weekend
                switch (day) {
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                }
                System.out.println("It's the weekend.");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }
    }
}