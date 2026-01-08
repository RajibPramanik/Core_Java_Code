import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        // Read user's name from standard input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Display the entered name
        System.out.println("Your name is: " + name);

        sc.close();
    }
}
