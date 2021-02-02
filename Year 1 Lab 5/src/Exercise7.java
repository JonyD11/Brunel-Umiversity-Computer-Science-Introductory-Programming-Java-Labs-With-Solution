import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7 {

	static ArrayList<String> longest_Words(ArrayList<String> list2){
		ArrayList<String> list = new ArrayList<String>();

		int longest_length = 0;
		for(String str : list2 )
		{
			int length = str.length();
			if(length> longest_length)
			{
				longest_length = length;
				list.clear();
			}
			if (length == longest_length)
			{
				list.add(str);
			}
		}
		return list;
		}
	
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Please Enter Words to get Longest Word, And Type done if you want to finish : ");
		String ans;
		do
		{
			ans = input.nextLine();
			if(!ans.equalsIgnoreCase("done"))
			{
				list.add(ans);
			}
		}
		while(!ans.equalsIgnoreCase("done"));
		
		System.out.println("Longest words of the above WordsList : " +longest_Words(list));
		}


}
