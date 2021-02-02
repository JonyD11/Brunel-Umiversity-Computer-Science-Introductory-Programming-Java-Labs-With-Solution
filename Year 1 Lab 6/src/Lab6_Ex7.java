
public class Lab6_Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long x = 40;
		long factorial = multiplyNumbers(x);
		System.out.println("Factorial of " + x + " = " + factorial);
	}
	
	public static long multiplyNumbers(long x){
		if (x >=1)
			return x * multiplyNumbers(x - 1);
		else
			return 1;
	}
	
}
