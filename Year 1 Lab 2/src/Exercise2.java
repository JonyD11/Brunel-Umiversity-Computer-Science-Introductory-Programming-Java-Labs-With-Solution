
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100, y = 204, c = -204;
		double z = -23.1;
		boolean a = true, b = false;
		
		if (x<y)//1.
		{
			System.out.println("1. "+"True");
		}
		else
		{
			System.out.println("1. "+"False");
		}
		if ((x>z) && (a==b))//2.
		{
			System.out.println("2. "+"True");
		}
		else 
		{
			System.out.println("2. "+"False");
		}
		if (2*c>y)//3
		{
			System.out.println("3. "+"True");
		}
		else
		{
			System.out.println("3. "+"False");
		}
		/*if (x==b)//4. Invalid because the operator can't take both int and boolean.
		{
			System.out.println("4. "+"True");
		}
		else
		{
			System.out.println("4. "+"False");
		}*/
		if (c!=y || c==y)//5.
		{
			System.out.println("5. "+"True");
		}
		else
		{
			System.out.println("5. "+"False");
		}
		/*if(z!=y && c==a)//6. Invalid the operator couldn't run because of boolean and int are together.
		{
			System.out,println("6. "+"true");
		}
		else
		{
			System.out.println("6. "+"false");
		}*/
		/*if(y>=y && a+3!=2)//7. Invalid the operator couldn't run due to boolean and numbers are together.
		{
			System.out.println("7. "+"true");
		}
		else 
		{
			System.out.println("7. "+"false");
		}*/
		
	}

}
