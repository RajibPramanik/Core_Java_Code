public class AssignmentOperator{
    public static void main(String[] args){
		int a = 5;
		
		// Arithmatic Operator
		a += 5;
		a -= 3;
		a *= 2;
		a /= 2;
		a %= 2;
		System.out.println(a); // 1
		
		// Bitwise operator
		a &= 2; 
		a |= 3;
		a ^= 1;
		System.out.println(a); // 2
		
		// Shift Operator
		a <<= 1;
		a >>= 1;
		a >>>= 1;
		System.out.println(a); // 1
	}
}
