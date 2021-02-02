import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Part (a)
		double y = 17/3f;
		
		DecimalFormat number_format = new DecimalFormat("#.###");
		String formatted_string = number_format.format(y);
		System.out.println("a) "+formatted_string);

		
		// Part (b)
		double x = 123.456; 
		String mad = Double.toString(x);
		String [] sad = mad.split("\\.");
		
		long n= (long) Double.parseDouble(sad[0]);
		long o= (long) Double.parseDouble(sad[1]);
		
		long count = 0, num = n;
		while(num!=0)
		{
			num/=10;
			count++;
		}
		
		System.out.println("\nb)(1)Number of digits before the Decimal point : " + count);
		
		long count1 = 0, num1 = o;
		while(num1!=0)
		{
			num1/=10;
			count1++;
		}
		System.out.println("     Number of digits after the decimal point : " + count1);
		
		double x1 = 17/3f;  
		String mad1 = Double.toString(x1);
		String [] sad1 = mad1.split("\\.");
		
		long n1= (long) Double.parseDouble(sad1[0]);
		long o1= (long) Double.parseDouble(sad1[1]);
		
		long count2 = 0, num2 = n1;
		while(num2!=0)
		{
			num2/=10;
			count2++;
		}
		
		System.out.println("\n(2)Number of digits before the Decimal point : " + count2);
		
		long count3 = 0, num3 = o1;
		while(num3!=0)
		{
			num3/=10;
			count3++;
		}
		System.out.println("   Number of digits after the decimal point : " + count3);
		
		double x2 = Math.sqrt(2); 
		String mad2 = Double.toString(x2);
		String [] sad2 = mad2.split("\\.");
		
		long n2= (long) Double.parseDouble(sad2[0]);
		long o2= (long) Double.parseDouble(sad2[1]);
		
		long count4 = 0, num4 = n2;
		while(num4!=0)
		{
			num4/=10;
			count4++;
		}
		
		System.out.println("\n(3)Number of digits before the Decimal point : " + count4);
		
		long count5 = 0, num5 = o2;
		while(num5!=0)
		{
			num5/=10;
			count5++;
		}
		System.out.println("   Number of digits after the decimal point : " + count5);
		
		// Part (c)
		String a = "Hello";
		String b = " World";
		String c = a + b;
		String f ="";
		for (int i = c.length()-1 ; i >= 0 ; i--)
		{
			char d = c.charAt(i);
			f = f + d;
		}
		System.out.println("\n"+"c) "+f);
		
		
		// Part (d)
		String replaced = c.replace("ll", "ppp");
		System.out.println("\n"+"d) "+replaced);
		
		
	}
}
