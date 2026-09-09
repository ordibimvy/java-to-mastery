public class Main {
    public static void main(String[] args) {

      // This program gives a simple syntax understanding of how if else statements in nested loops work

        boolean is_student = true;
        boolean is_senior = true;
        double price = 9.99;

        if (is_student) {
            if (is_senior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9; // price = price * 0.9; 
            }  
        }
        else {
            if (is_senior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.8; // price = price * 0.8;
            }
            price *= 1;
        }

        System.out.printf("The price of a ticket is: $%.2f", price);
    }       
}
