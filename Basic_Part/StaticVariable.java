public class StaticVariable {
    // That is static variable
    static String nameof_college = "LPU Univercity"; 
    // That is instance varibale also.
    String nameof_student;

    void show(){
        System.out.println("Your collge name is: "+nameof_college+"\nand Your name is: "+nameof_student);
    }
    public static void main(String[] args){
        StaticVariable SV = new StaticVariable();
        StaticVariable SV2 = new StaticVariable();

        SV.nameof_student = "Rajib";
        SV2.nameof_student = "Sonu";

        SV.show();
        SV2.show();
    }
}
