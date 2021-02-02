
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RoundingTest(10.2);
	}
	
	private static void RoundingTest(double x) 
	{
		x = 10.200000;
		
		String s = String.format("%,.6f", Math.floor(x));
		String t = String.format("%,.6f", Math.ceil(x/100)*10);
		String q = String.format("%.2g%n", (x));
		System.out.println("a) "+s+" \n   "+t+"\n   "+q);
	}

}
