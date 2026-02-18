public class InstanceVariable {
    // Both are instance variables.
    String name;
    int age;

    void show(){
        System.out.println("Your name is: "+name +"\nAnd Your age is: "+age);
    }
    public static void main(String[] args){
        InstanceVariable IV = new InstanceVariable();
        InstanceVariable IV2 = new InstanceVariable();
        IV.name = "Rajib";
        IV.age = 22;

        IV2.name = "Sonu";
        IV2.age = 24;

        IV.show();
        IV2.show();
    }
}
