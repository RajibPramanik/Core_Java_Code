class nestedIfelse {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 20;

        if (a > b) {
            if (a > c) {
                System.out.println("Maximum number is: " + a);
            } else {
                System.out.println("Maximum number is: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Maximum number is: " + b);
            } else {
                System.out.println("Maximum number is: " + c);
            }
        }
    }
}
