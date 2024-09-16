package A6.A6_6;
import java.util.Scanner;
import java.util.Arrays;
//Write a program to find the missing number in an array of integers ranging from 1 to N.
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of array");
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array");
		
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			if(m<=n) {
				arr[i]=m;
			}
			else
			{
				System.out.println("Please enter a number between 1 and "+n);
				i--;
			}
		}
		
		Arrays.sort(arr);
		for(int i=1; i<=n; i++){
            int missing = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == i){
                    missing = 1;
                    break;
                }
            }
            if(missing == 0){
                System.out.println(i);
            }
        }
		sc.close();
	}
}



