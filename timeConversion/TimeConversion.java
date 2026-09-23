/*
 * Name: Ordi Bimvy 
 * Project: Lab2 Variables and Expressions
 * Date: 09/14/2026
 * 
 * This program takes in a number in seconds and then converts it to hrs:min:sec
 * and then prints out the results. 
 */

package lab2;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		
		// create scanner object
		Scanner scanner = new Scanner(System.in);
		
		int total_num_s;
		
		// Ask user for a input in int
		System.out.print("Enter a total number of seconds: ");
		total_num_s = scanner.nextInt(); // store it in a variable
		
		// create conversion
		int hours = total_num_s / 3600;
		int rem_hrs = total_num_s % 3600;
		int minutes = rem_hrs / 60;
		int sec = rem_hrs % 60;
		
		// print out conversion
		System.out.printf("The time is %s hours %s minutes %s seconds.", hours, minutes, sec);
		
		scanner.close();
	}

}
