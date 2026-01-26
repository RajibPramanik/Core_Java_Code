public class LogicalOperator {
    public static void main(String[] args) {

        int a = 8;
        final int LOWER = 5;
        final int UPPER = 10;

        boolean isBetween = a > LOWER && a < UPPER;
        boolean isLessThanFiveOrTen = a < LOWER || a < UPPER;
        boolean isNotGreaterThanFive = !(a > LOWER);

        System.out.println("a is between 5 and 10: " + isBetween);
        System.out.println("a is less than 5 or less than 10: " + isLessThanFiveOrTen);
        System.out.println("a is NOT greater than 5: " + isNotGreaterThanFive);
    }
}
