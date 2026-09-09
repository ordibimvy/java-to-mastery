import java.util.Scanner; // import in our scanner object

public class Lecture3ClassAct {

	public static void main(String[] args) {
		
		// Basic Patient Information Collection
		
		// create our scanner object 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the MHIR Health Database.");
		
		// Get the user name and last name into the system
		System.out.print("Enter your name: ");
		String user_name = sc.nextLine();
		
		// Get the user birthdate
		System.out.print("What day are you born in?: ");
		int user_birth_day = sc.nextInt();
		
		System.out.print("What month are you born in?: ");
		String user_birth_month = sc.next();
		
		System.out.print("What year are you born in?: ");
		int user_birth_year = sc.nextInt();
		
		// get the user phone number
		System.out.print("What is your phone number (10 digits): ");
		int user_number = sc.nextInt();
		
		// get user email 
		System.out.print("What is your email address?: ");
		String user_email = sc.next();
		
		// spit out the results 
		
		System.out.println("Thank you, your information has been saved in our Database");
		System.out.println("Name: " + user_name);
		System.out.println("Date of Birth: " + user_birth_day + "/" +  user_birth_month + "/" + user_birth_year);
		System.out.println("Phone Number: " + user_number);
		System.out.println("Email Address: " + user_email);
		System.out.println("Thank you once again for trusting MHIR");
		
		sc.close();

	}

}
