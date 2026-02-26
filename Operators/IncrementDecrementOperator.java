class IncrementDecrementOperator{
	public static void main(String[] args){
		// Pre-increment part
		int x = 5;
		int y = ++x;
		System.out.println(x+" "+y);
		
		// Post-increment part
		int a = 10;
		int b = a++;
		System.out.println(a+" "+b);
		
		// Pre-decrement part
		int c = 10;
		int d = --c;
		System.out.println(c+" "+d);
		
		// Post-decrement part
		int u = 10;
		int v = u--;
		System.out.println(u+" "+v);
	}
}
