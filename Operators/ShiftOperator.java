public class ShiftOperator {
    public static void main(String[] args) {
        int a = 10;

        // Left Shift
        System.out.print("Left Shift:");
        System.out.print("a << 1 = " + (a << 1));

        // Right Shift
        System.out.print("\nRight Shift:");
        System.out.print("a >> 1 = " + (a >> 1));

        // Unsigned Right Shift
        System.out.print("\nUnsigned Right Shift:");
        System.out.print("a >>> 1 = " + (a >>> 1));
    }
}
