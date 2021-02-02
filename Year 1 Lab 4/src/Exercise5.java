import java.util.ArrayList;

public class Exercise5 {

	public static class CS1002_Lab5
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating ArrayList called memberList
		ArrayList<Member> memberList = new ArrayList<Member>();

		//Creating objects
		Member member1 = new Member("Leonardo", 21);
		Member member2 = new Member("Michelangelo", 43);
		Member member3 = new Member("Rafaelo", 37);
		Member member4 = new Member("Donatelo", 58);

		//Adding objects to memberList
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		memberList.add(1, member4); //Adding member4 between Leonardo and Michelangelo
		
		//Printing memberList
		printMemberData(memberList); //It should be inside the main method because if we write in private modifier, it will not run. However, it should be inside the main method to run the code.



		}
	 }
		private static void printMemberData(ArrayList<Member> memberList)
		{
			for(int i=0;i<memberList.size();i++)
			{
				Member person=memberList.get(i);
				person.printInfo();
			}
		}

}
