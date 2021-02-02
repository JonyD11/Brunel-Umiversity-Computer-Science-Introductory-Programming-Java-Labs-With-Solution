import java.util.ArrayList;
import java.util.Collections;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating ArrayList called heightsList
		ArrayList<Double> heightsList = new ArrayList<Double>();

		//Adding values to heightList
		heightsList.add(new Double (5.1));
		heightsList.add(new Double (5.2));
		heightsList.add(new Double (5.3));
		heightsList.add(new Double (5.6));
		heightsList.add(new Double (5.7));
		heightsList.add(new Double (5.9));
		heightsList.add(new Double (5.4));
		heightsList.add(new Double (5.8));
		heightsList.add(new Double (6.1));
		heightsList.add(new Double (4.6));

		//Printing the ArrayList
		System.out.println("Heights : " + heightsList);

		//Removing the third element of the heightsList
		heightsList.remove(3);

		//Printing the remaining HeightsList
		System.out.println("\nHeights after removing 3rd element : " + heightsList);

		//Adding five more values to heightsList
		heightsList.add(new Double (6.2));
		heightsList.add(new Double (6.5));
		heightsList.add(new Double (4.5));
		heightsList.add(new Double (4.9));
		heightsList.add(new Double (4.8));

		//Again printing heightsList after adding 5 more values
		System.out.println("\nHeights after adding 5 more elements : " + heightsList);

		//Sorting heightsList in ascending order
		Collections.sort(heightsList);

		//Printing values after ascending order
		System.out.println("\nHeights in ascending order : " + heightsList);

		//Printing the length of heightsList
		System.out.println("\nLength of heightsList : " + heightsList.size()+"\n");

		//Printing all the values in the heightsList
		for(int i = 0; i<heightsList.size();i++)
		{
			System.out.println("Heights : "+ heightsList.get(i));
		}

		//Printing minimum height in the heightsList
		System.out.println("\nMinimum height is : " + Collections.min(heightsList));

		//Printing maximum height in the heightsList
		System.out.println("\nMaximum height is : " + Collections.max(heightsList));
	}

}
