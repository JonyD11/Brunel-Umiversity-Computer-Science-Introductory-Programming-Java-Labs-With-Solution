
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//1.
		System.out.print("1. ");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print(i);
			}
		}
		

		System.out.println();
		

		//2.
		System.out.print("2. ");
		for(int i=2;i<=6;i++)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print(i);
			}
		}
		

		System.out.println();

		//3.
		System.out.print("3. ");
		for(int i=1;i<=5;i=i+2)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print(i);
			}
		}
		

		System.out.println();

		//4.
		System.out.print("4. ");
		for(int i=1;i<=7;i=i+2)
		{
			for(int j=1;j<i+1;j=j+2)
			{
				System.out.print(i);
			}
		}
	

		System.out.println();

		//5.
		System.out.print("5. ");
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print(i);
			}
		}
		

		System.out.println();
		

		//6.
		System.out.print("6. ");
		for(int i=5;i>0;i--)
		{
			for(int j=7;j>i+1;j--)
			{
				System.out.print(i);
			}
		}
		

		System.out.println();

		//7.
		System.out.print("7. ");
		for(int i=0;i<=14;i++)
		{
			if(i==0 || i==3 || i==4 || i==5 || i==10 || i==11 || i==12 || i==13 || i==14)
			{
				System.out.print("+");
			}
			if(i==1 || i==2 || i==6 || i==7 || i==8 || i==9)
				System.out.print("*");
		}

		System.out.println();
		

		//8.
		System.out.print("8. ");
		for(int i=0;i<=26;i++)
		{
			if(i==0 || i==1 || i==9 || i==10 || i==11 || i==12 || i==13)
			{
				System.out.print("-");
			}
			if(i==2 || i==3 || i==4 || i==14 || i==15 || i==16 || i==17 || i==18 || i==19)
			{
				System.out.print("*");
			}
			if(i==5 || i==6 || i==7 || i==8 || i==20 || i==21 || i==22 || i==23 || i==24 || i==25 || i==26)
			{
				System.out.print("+");
			}
		}
	}

}
