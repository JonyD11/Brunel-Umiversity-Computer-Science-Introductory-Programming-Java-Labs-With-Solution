
public class exercise3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("1. ");
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.print("+");
		}
		System.out.println();
		System.out.print("2. ");
		int j;
		for(j=0;j<=10;j++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.print("3. ");
		int k;
		for(k=0;k<=5;k++)
		{
			System.out.print("+-");
		}
		System.out.println();
		System.out.print("4. ");
		int l;
		for(l=0;l<=11;l++)
		{
			if(l==0 || l==3 || l==6 || l==9)
			{
				System.out.print("*");
			}
			if (l==1 || l==4 || l==7 || l==10)
			{
				System.out.print("+");
			}
			if(l==2 || l==5 || l==8 || l==11)
			{
				System.out.print("-");
			}
		}
		System.out.println();
		System.out.print("5. ");
		int a;
		for(a=0;a<=9;a++)
		{
			if(a==0 || a==3 || a==6 || a==9)
			{
				System.out.print("*");
			}
			if(a==1 || a==4 || a==7)
			{
				System.out.print("+");
			}
			if(a==2 || a==5 || a==8)
			{
				System.out.print("-");
			}
		}
		System.out.println();
		System.out.print("6. ");
		int b;
		for(b=0;b<=5;b++)
		{
			if(b==0 || b==2 || b==4)
			{
			System.out.print("**");
			}
			if(b==1 || b==3 || b==5)
			{
				System.out.print("++");
			}
		}
		System.out.println();
		System.out.print("7. ");

		for(int z=0;z<=17;z++)
		{
			if(z==0 || z==1 || z==2 || z==9 || z==10 || z==11)
			{
				System.out.print("*");	
			}
			if(z==3 || z==4 || z==5 || z==12 || z==13 || z==14)
			{
				System.out.print("+");
			}
			if(z==6 || z==7 || z==8 || z==15 || z==16 || z==17)
			{
				System.out.print("-");
			}
		}
		System.out.println();
		System.out.print("8. ");
		
		int d;
		for(d=0;d<=17;d++)
		{
			if(d==0 || d==1 || d==2 || d==15 || d==16 || d==17)
			{
				System.out.print("*");
			}
			if(d==3 || d==4 || d==5 || d==12 || d==13 || d==14)
			{
				System.out.print("+");
			}
			if(d==6 || d==7 || d==8 || d==9 || d==10 || d==11)
			{
				System.out.print("-");
			}
			
		}
	}

}
