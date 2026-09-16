package lecture3;
import java.util.Scanner;

public class ClassActivity {

	public static void main(String[] args) {
		
		// create a Scanner Object 
		
		Scanner scanner = new Scanner(System.in);
		
		double num1, num2, num3, avg; // declare variables in the same line because its same data type
		
		System.out.println("Please enter your first number?: ");
		num1 = scanner.nextDouble();
		
		System.out.println("Please enter your second number?: ");
		num2 = scanner.nextDouble();
		
		System.out.println("Please enter your third number?: ");
		num3 = scanner.nextDouble();
		
		avg = (num1 + num2 + num3) / 3; // average arithmetic
		
		System.out.println("The average of the three is: " + avg);
		scanner.close();

	}

}
