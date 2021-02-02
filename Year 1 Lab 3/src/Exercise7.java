
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1
				System.out.print("1. "); 
				String y="";
				for (int i = 1; i <=10; i++)
				{
		            for (int j = 1; j <=10; j++)
		            {
		                System.out.print(y + i + " " + j);
						y = ",";
		            }
				}
				
				System.out.println(); 
				System.out.println(); 

				// 2
				System.out.print("2. "); 
				String g="";
				for (int i=1;i<11;i++)
				{
					for (int j=2;j<11;j++)
					if (i<j)
					{
						System.out.print(g + i + " " + j);
						g = ",";
					}
				}
				
				System.out.println(); 
				System.out.println(); 
				
				// 3
				System.out.print("3. ");
				String z="";
				for (int i = 1; i <=4; i++)
				{
		            for (int j = 4; j <=8; j++)
		            {
		                System.out.print(z + i + " " + j);
						z = ",";
		            }

				} 
	}

}
