
public class Lab6_Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(20));
	}
	
	public static int factorial(int x){
		
		int i,fact =1;
		for(i=1;i<=x;i++){
			fact = fact*i;
		}
		return fact;
	}

}
