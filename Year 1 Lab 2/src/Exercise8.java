import java.util.*;
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c;
	    System.out.println("Input an integer: ");
	    Scanner in = new Scanner(System.in);
	    c = in.nextInt();
	   
	   // if (c%2 == 0)
	     // System.out.println("Even");
	    //else
	      //System.out.println("Odd");
	   
	    
	    // Another method
	    switch (c%2){
	    	case 0:
	    		System.out.println(c+" is an Even number");
	    		break;
	    	case 1:
	    		System.out.println(c+" is a Odd number");
	    }
	}

}
