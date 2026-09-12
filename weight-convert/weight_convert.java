import java.util.Scanner; // importing the Scanner library to create a Scanner Object 

public class weight_convert {
    public static void main(String[] args){

        // Weight Conversion

        Scanner scanner = new Scanner(System.in);

        // Declare variables 

        double weight;
        double new_weight;
        int choice;

        // weclome message 

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        //prompt fot the user choice 

        System.out.print("Choose and option: ");
        choice = scanner.nextInt();

        //option 1 convert lbs to kgs 
        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            new_weight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", new_weight);
        }

        // option 2 convert kgs to lbs 
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            new_weight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", new_weight);
        }

        // else print not a valid choice 
        else {
            System.out.println("That was not a valid choide");
        }
        
        scanner.close();
    }
}
