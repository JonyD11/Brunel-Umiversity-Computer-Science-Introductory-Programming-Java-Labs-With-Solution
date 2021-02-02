import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Part(a)
		System.out.println("a) Generate random integers between -100 and +100 (inclusive).");
		for(int i=0;i<10;++i)
		{
			int rand = -100 + new Random().nextInt(100+100);
			System.out.println("   "+rand);
		}
		
		
		// Part (c)
		Random rand1 = new Random();
		System.out.println("\nc) Generate random doubles between zero and one.");
		for(int j=0;j<10;j++)
		{
			double Value = 0 + (1-0)* rand1.nextDouble();
			System.out.println("   "+Value);
		}
		
		
		// Part (b)
		System.out.println("\nb) Generate random integers between limits (pre-specified) a and b.");
		
		System.out.print("   Enter Minimum Range : ");
		int min = input.nextInt();
		System.out.print("   Enter Maximum Range : ");
		int max = input.nextInt();
		
		if(min>= max)
		{
			System.out.print("   Maximum value must be greater than Minimum value");
		}
		else
		{
			int Random = (int)(Math.random() * (max - min)) + min;
			System.out.print("\n   Random Number is : "+ Random);
		}
		

		// Part (d)
		System.out.println("\n\nd) Generate random doubles between limits (pre-specified) a and b.");
		
		System.out.print("   Enter the Minimum range : ");
		double rangeMin = input.nextDouble();
		System.out.print("   Enter the Maximum range: ");
		double rangeMax = input.nextDouble();
		
		if(rangeMin >= rangeMax)
		{
			System.out.println("   Range of Maximum Value Must be Greater than Minimum Value");
		}
		else
		{
			Random t = new Random();
			double randomNumber = rangeMin + (rangeMax - rangeMin) * t.nextDouble();
			System.out.println("\n   Random double Number between pre-specified Limit : " + randomNumber);
		}
	}

}
