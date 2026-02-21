class ConditionalOperator {
    public static void main(String[] args) {

        int a = 10; 
        int b = 20; 

        int max = (a > b) ? a : b;  
        System.out.println("Maximum: " + max);  

        int result = (a < b) ? (a + b) : (a - b);
        System.out.println("Result: " + result);  
 
        int min = (a < b) ? ((a < 5) ? a : 5) : ((b < 5) ? b : 5);
        System.out.println("Minimum using nested ternary: " + min);

    }
}
