import java.util.Scanner; // used to read the user input

public class shopping-cart {
    public static void main(String[] args) {

       // SHOPPING CART PROGRAM 

       Scanner scanner = new Scanner(System.in);
      // set up some variables we will be using
       String item;
       double price;
       int quantity;
       char currency = '$';
       double total;

       System.out.print("What item would you like to buy?: ");
       item = scanner.nextLine();

       System.out.print("What is the price for each?: ");
       price = scanner.nextDouble();

       System.out.print("How many would you like? ");
       quantity = scanner.nextInt();

       total = price * quantity; // basic arithmetic for total

       System.out.println("\nYou have bought " + quantity + " " + item + "/s");
       System.out.println("Your total is " + currency + total);

       scanner.close(); // always close the scanner, or else we could get unexpecred errors 
    }
}
