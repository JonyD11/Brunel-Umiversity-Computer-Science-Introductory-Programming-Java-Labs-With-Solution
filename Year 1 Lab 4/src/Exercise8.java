import javax.swing.JOptionPane;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myarray[][] = new int [3][10];
		
		for (int i = 0; i < myarray.length; i++)
		{ 
			for (int j = 0; j < myarray[i].length; j++) 
			{
				myarray[i][j] = 25 + (25 * j); 
			} 
		}
		
		for(int i=1;i<myarray.length;i++)
		{
			for(int j=0;j<myarray[i].length;j++)
			{
				myarray[i][j] = 25 + (25 * j);
				
			}
		}
		
		
		for(int i=2;i<myarray.length;i++)
		{
			for(int j=0;j<myarray[i].length;j++)
			{
				myarray[i][j] = 5000;
			}
		}
		PrintArray(myarray);
	}
	
	private static void PrintArray(int[][] array) 
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				
			
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

	

}
