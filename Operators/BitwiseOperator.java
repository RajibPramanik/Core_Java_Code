public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("a | b  = " + (a | b));
        System.out.println("a & b  = " + (a & b));
        System.out.println("a ^ b  = " + (a ^ b));
        System.out.println("~a     = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
        // Unsigned Right Shift
        System.out.println("a >>> 1 = " + (a >>> 1));
    }
}
