import java.util.Scanner; // helps us read user input

public class UserProfileChecker {
    public static void main(String[] args) {

       // if statements = peforms a block of code if its condiiton is true 

       Scanner scanner = new Scanner(System.in);

       String name;
       int age;
       boolean is_student;

       System.out.println("Enter your name: ");
       name = scanner.nextLine();

       System.out.print("Enter your age: ");
       age = scanner.nextInt();

       System.out.println("Are you a student (true/false)? ");
       is_student = scanner.nextBoolean();

       // GROUP 1 - Checks if you entered your name

       if (name.isEmpty()) {
        System.out.println("You didnt enter your name!");
       } 
       else {
        System.out.println("Hello " + name + "!");
       }

       // GROUP 2 - Checks for your age
       if (age >= 65) {
        System.out.println("You are a senior");
       }
       else if(age >= 18) {
        System.out.println("You are an adult");
       }
       else if(age < 0){
        System.out.println("You have not been born yet!");
       }
       else if (age == 0) { // use double to compare and one to assign
        System.out.println("You are a baby!");
       }
       else {
        System.out.println("You are a child!");
       }

       // GROUP 3 - Checks if you are a student

       if(is_student) {
        System.out.println("You are a student");
       }
       else {
        System.out.println("You are not a student!");
       }

       scanner.close();
    }
}
