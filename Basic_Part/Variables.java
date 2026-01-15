public class Variables {
    int a = 20;       // Instance variable
    static int b = 30;  // Static variable

    public static void main(String[] args) {
        int c = 10;       // Local variable
        Variables obj = new Variables();

        System.out.println("Local variable: " + c);
        System.out.println("Instance variable: " + obj.a);
        System.out.println("Static variable: " + Variables.b);
    }
}
