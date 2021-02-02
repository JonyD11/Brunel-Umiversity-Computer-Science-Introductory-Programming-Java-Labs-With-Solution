
public class Exercise3 {

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
		for(l=0;l<=3;l++)
		{
			System.out.print("*+-");
		}
		System.out.println();
		System.out.print("5. ");
		int a;
		for(a=0;a<4;a++)
		{
			if (a==3)
			{
				System.out.print("*");
			}
			else if (a<4)
			{
				System.out.print("*+-");
			}
		}
		System.out.println();
		System.out.print("6. ");
		int b;
		for(b=0;b<=2;b++)
		{
			System.out.print("**++");
		}
		System.out.println();
		System.out.print("7. ");

			for(int z=2;z<=5;z=z+3)
			{
				for(int x=3;x<=5;x=x+1)
				{
					System.out.print('*');
				}
					for(k=3;k<=5;k++)
					{
						System.out.print('+');
					}
						for(l=3;l<=5;l=l+1)
						{
							System.out.print('-');
						}
			}
		System.out.println();
		System.out.print("8. ");//***************
		
		int d;
		for(d=0;d<=17;d++)
		{
			if(d==0 || d==1 || d==2)
			{
				System.out.print("*");
			}
			if(d==3 || d==4 || d==5)
			{
				System.out.print("+");
			}
			if(d==6 || d==7 || d==8)
			{
				System.out.print("-");
			}
			if(d==9 || d==10 || d==11)
			{
				System.out.print("-");
			}
			if(d==12 || d==13 || d==14)
			{
				System.out.print("+");
			}
			if(d==15 || d==16 || d==17)
			{
				System.out.print("*");
			}
		}
		
	}

}
