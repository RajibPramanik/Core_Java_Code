// Import the Scanner class
import java.util.Scanner;
public class UserInput{
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Get String input
        System.out.print("Enter your name: ");
        // Read the user's name
        String name = scanner.nextLine(); 

        // Get integer input
        System.out.print("Enter your age: ");
        // Read the user's age
        int age = scanner.nextInt(); 

        // Print the user's information
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        // Close the scanner
        scanner.close();
    }
}
