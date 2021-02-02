
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=88;
	   	int b=26;
	   	int t;
	   	while (b > 0)
	   	{
	   		t=b;
	   	    b=a%b;
	   	    a=t;
	   	}
		System.out.println("1.HCF(88,26)= "+a);
		

		a=54;
		b=87;
		while (a>0)
		{
			t=a;
			a=b%a;
			b=t;
		}
		System.out.println("2.HCF(54,87)= "+b);
		

		a=16;
		b=84;
		while(b>0)
		{
			t=b;
			b=a%b;
			a=t;
		}
		System.out.println("3.HCF(16,84)= "+a);
		

		a=55;
		b=25;
		while(a>0)
		{
			t=a;
			a=b%a;
			b=t;
		}
		System.out.println("4.HCF(55,25)= "+b);
		

		a=42;
		b=72;
		while(b>0)
		{
			t=b;
			b=a%b;
			a=t;
		}
		System.out.println("5.HCF(42,72)= "+a);
		

		a=77;
		b=28;
		while(a>0)
		{
			t=a;
			a=b%a;
			b=t;
		}
		System.out.println("6.HCF(77,28)= "+b);
		

		a=80;
		b=88;
		while(b>0)
		{
			t=b;
			b=a%b;
			a=t;
		}
		System.out.println("7.HCF(80,88)= "+a);
	}

}
