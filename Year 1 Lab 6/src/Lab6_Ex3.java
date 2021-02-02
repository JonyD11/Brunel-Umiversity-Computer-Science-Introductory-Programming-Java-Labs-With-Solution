
public class Lab6_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2000;
		if(year>1581)
			System.out.println(CheckYear(year)? "Leap Year" : "Not a Leap Year");
		else
			System.out.println("Please Type Positive Year as well as it should be greater than 1581");
	}

	public static boolean CheckYear(int year)
	{	
		return (year % 4 == 0 || year % 400 == 0 && year % 100 == 0);
	}
}
