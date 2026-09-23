/*
 * Name: Ordi Bimvy 
 * Project: Lab2 Variables and Expressions
 * Date: 09/14/2026
 * 
 * This program calculates how many slices each person will get attending the 
 * even and also return how many slices will be remaining after
 */

import java.util.Scanner; // Importing the Scanner Module

public class pizzaCount {

	public static void main(String[] args) {
		
		//create a scanner object 
		Scanner scanner = new Scanner(System.in);
		
		// Get inputs from the user 
		System.out.print("How many people will be attending the party?: ");
		int attendance_num = scanner.nextInt();
		
		System.out.print("Number of slice per pizza?: ");
		int pizza_slice_num = scanner.nextInt();
		
		System.out.print("Number of pizza's orderd?: ");
		int pizza_ordered = scanner.nextInt();
		
		// arithmetic operations 
		int total_slices = pizza_slice_num * pizza_ordered; // total number of pizza slices
		
		double shared_slices = total_slices / attendance_num; // how many slices each person gets 
		
		int rem_slices = attendance_num % total_slices; // total slices remaining 
		
		// print out the results found.
		System.out.println("The total number of Pizza Available: " + total_slices);
		System.out.println("The ammount of slices each person gets: " + shared_slices);
		System.out.println("Total amount of slices remaining: " + rem_slices);
				
		scanner.close();
			
	}

}
