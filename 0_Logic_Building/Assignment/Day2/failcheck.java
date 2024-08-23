import java.util.Scanner;

public class StudentPassFailStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int grade1 = scanner.nextInt();
        int grade2 = scanner.nextInt();
        int grade3 = scanner.nextInt();
        
        int failedSubjects = 0;

        int status1;
        if (grade1 >= 40) {
            status1 = 1;
        } else {
            status1 = 0;
            failedSubjects++;
        }

        int status2;
        if (grade2 >= 40) {
            status2 = 1;
        } else {
            status2 = 0;
            failedSubjects++;
        }

        int status3;
        if (grade3 >= 40) {
            status3 = 1;
        } else {
            status3 = 0;
            failedSubjects++;
        }

        switch (failedSubjects) {
            case 0:
                System.out.println("The student passes.");
                break;
            default:
                System.out.println("The student fails in " + failedSubjects + " subject(s).");
                break;
        }
        
        scanner.close();
    }
}
