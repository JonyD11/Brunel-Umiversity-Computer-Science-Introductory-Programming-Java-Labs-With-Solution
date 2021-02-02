
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1
		int i;
		String l = "";
		System.out.print("1. ");
		for(i=4;i<=11;i++)
		{
			System.out.print(l + i);
			l = ",";
		}
		
		System.out.println();
		
		// 2
		int a;
		String q="";
		System.out.print("2. ");
		for(a=10;a<=19;a = a + 3)
		{
			System.out.print(q + a);
			q = ",";
		}
		
		System.out.println();
		
		// 3
		int b;
		String m = "";
		System.out.print("3. ");
		for(b=1;b<=16;b = b + 3)
		{
			System.out.print(m + b);
			m = ",";
		}
		
		System.out.println();
		
		// 4
		int j;
		String v="";
		System.out.print("4. ");
		for(j=2;j<=12;j++)
		{
			if(j%2==0)
			{
				System.out.print(v + j);
				v = ",";
			}
		}
		
		System.out.println();
		
		// 5
		int c;
		String t="";
		System.out.print("5. ");
		for(c=1;c<=10;c++)
		{
			System.out.print(t + c*c);
			t = ",";
		}
		
		System.out.println();
				
		// 6
		int d;
		String f="";
		System.out.print("6. ");
		for(d=-10;d<=10;d = d + 2)
		{
			System.out.print(f + d );
			f = ",";
		}
		
		System.out.println();
		
		// 7
		int e;
		String g="";
		System.out.print("7. ");
		for(e=-20;e<=20;e = e + 5)
		{
			if(e!=0)
			{
				System.out.print(g + e);
				g = ",";
				
			}
		}
		

	}

}
