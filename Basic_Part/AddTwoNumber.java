import java.util.Scanner;
public class AddTwoNumber {
    public static void main(String[] args) {
        // Read numbers from standard input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Add the two numbers
        int sum = num1 + num2;
        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close();
    }
}
