public class ExplicitTypecasting{
    public static void main(String[] args){
        double x = 10.0;
        int number = (int)x; // double-> int (manual conversion)
        System.out.println("Double value is: "+x);
        System.out.println("After explicit casting to int: "+number);
    }
}