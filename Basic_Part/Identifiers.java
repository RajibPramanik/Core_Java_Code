public class Identifiers{
    public static void main(String[] args){
        int a = 10;
        int _b = 20;
        int $c = 30;
        
        // int 1d = 40; // ❌ invalid: cannot start with digit
        // int for = 50;     // ❌ invalid: cannot use keyword

        System.out.println(a+" "+_b+" "+$c);
    }
}