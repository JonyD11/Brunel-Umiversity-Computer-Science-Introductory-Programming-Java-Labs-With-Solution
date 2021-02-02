
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 300, b = 250; // Tested on no. a = 300, b = 250 for a is not less than b and Tested again on no. a = 150, b = 500 for a is less than b.
		
		if (a<b)
		{
			System.out.println("1. "+ "a is less than b");
		}
		else 
		{
			System.out.println("1. "+ "a is NOT less than b");
		}
		
		a = 150; b = 500; // Tested on no. a = 300, b = 250 for a is not less than b and Tested again on no. a = 150, b = 500 for a is less than b.
		
		if (a<b)
		{
			System.out.println("2. "+ "a is less than b");
		}
		else 
		{
			System.out.println("2. "+ "a is NOT less than b");
		}
		
		a = 100; b = 60; // Tested on no. a = 100, b = 60 for a is greater than b and Tested  again on no. a = 30, b = 50 for a is not greater than b.
		if (a>b)
		{
			System.out.println("3. "+ "a is greater than b");
		}
		else
		{
			System.out.println("3. "+ "a is not greater than b");
		}
		
		a = 30; b = 50; // Tested on no. a = 100, b = 60 for a is greater than b and Tested  again on no. a = 30, b = 50 for a is not greater than b.
		if (a>b)
		{
			System.out.println("4. "+ "a is greater than b");
		}
		else
		{
			System.out.println("4. "+ "a is not greater than b");
		}
	}

}
