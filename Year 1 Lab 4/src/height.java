
public class height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] height = new double[10];
		double sum = 0.0;

		height[0] = 5.1;
		height[1] = 5.2;
		height[2] = 5.3;
		height[3] = 5.6;
		height[4] = 5.7;
		height[5] = 5.9;
		height[6] = 5.4;
		height[7] = 5.8;
		height[8] = 6.1;
		height[9] = 4.6;

		// calculating length
		System.out.println("Length of the array ");
		System.out.println(height.length);

		// printing all values in array
		System.out.println("\nAll values by using loop");
		for(int i=0; i<10; i++)
		{
			System.out.println(" height is: " + height[i]);
		}

		// calculating average Average height
		System.out.println("\nAverage height ");
		for (int i = 0; i< height.length; i++)
		{
			sum = sum + height[i];
		}
		double average = sum/height.length;
		System.out.println("Average value of arrays element " + average);

		// calculating minimum height
		double min = height[0];
		for(int i = 1; i < height.length; ++i)
		{
			double x = height[i];
			if (x<min)
				min = x;
		}
		System.out.println("\nThe minimum height is " + min);

		// calculating maximum height
		double max = height[0];
		for(int j = 1; j<height.length; ++j )
		{
			double x = height[j];
			if (x>max)
				max = x;
		}
		System.out.println("\nThe maximum heught is " + max);
	}

}
