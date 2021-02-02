

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 18;

		  if ((a % 2 == 0) && (a % 3 == 0))
		       {
		           System.out.println("1. "+ a  + " is divisible by 2 and 3");
		       }
		   else
		       {
		           System.out.println("1. " + a + " Not divisible by 2 and 3");
		       }
		       
		    if ((a % 7 == 0) || (a % 9 == 0))
		       {
		           System.out.println("2. " + a + " is divisible by 7 or 9");
		       }
		    else
		       {
		           System.out.println("2. " + a + " Not divisible by 7 and 9");
		       }
		     
		    if ((a % 2 == 0) && (a % 3 == 0) && (a % 5 != 0))
		       {
		           System.out.println("3. " + a + " is divisible by 2 and 3 but not 5");
		       }
		    else if ((a %2==0) && (a % 3 == 0) && (a%5 == 0))
		       {
		           System.out.println("3. " + a + " divisible by 2, 3 and 5");
		       }
		    else
		    {
		    System.out.println("3. " + a + " not divisible by 2,3 and 5");
		    }
		   
		    }
	}

