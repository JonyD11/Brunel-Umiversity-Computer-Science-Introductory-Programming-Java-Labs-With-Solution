
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("\n\nDivided by 2 & 3: ");
		for (int i=1; i<=100; i++)
		{
			if (i%2==0 && i%3==0)
				System.out.print(i+", ");
		}
		
		System.out.println("\n\nDivided by 7 or 9: ");
		for (int i=1; i<=100; i++)
		{
			if (i%7==0 || i%9==0)
				System.out.print(i+", ");
		}
		
		System.out.println("\n\nDivided by 2 & 3 but not 5: ");
		for (int i=1; i<=100; i++)
		{
			if (i%2==0 && i%3==0 && i%5!=0)
				System.out.print(i+", ");
		}
	}
		
}
