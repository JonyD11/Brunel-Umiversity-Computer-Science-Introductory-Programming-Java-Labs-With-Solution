import java.util.ArrayList;

public class Exercise7 {

	public static class CS1002_Lab5
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating ArrayList called mylistA
		ArrayList<Member> mylistA = new ArrayList<Member>();

		//Creating objects
		Member member1 = new Member("Leonardo", 21);
		Member member2 = new Member("Michelangelo", 43);
		Member member3 = new Member("Rafaelo", 37);


		//Adding objects to mylistA
		mylistA.add(member1);
		mylistA.add(member2);
		mylistA.add(member3);


		//Printing memberList
		printMemberData(mylistA);

		//Creating arrayList called mylistB
		ArrayList<Member> mylistB = new ArrayList<Member>();

		printMemberData(mylistA);
		System.out.println();
		mylistB = mylistA;
		printMemberData(mylistB);
		System.out.println();
		mylistA.remove(1);
		printMemberData(mylistB);



		//Creating arrayList called mylistC
		ArrayList<Member> mylistC = new ArrayList<Member>();

		//Creating objects
		Member member4 = new Member("Leonardo", 21);
		Member member5 = new Member("Michelangelo", 43);
		Member member6 = new Member("Rafaelo", 37);

		//Adding objects to mylistA
		mylistC.add(member4);
		mylistC.add(member5);
		mylistC.add(member6);


		//Creating arrayList called mylistD
		ArrayList<Member> mylistD = new ArrayList<Member>();

		System.out.println("*********************************");
		printMemberData(mylistC);
		System.out.println();
		mylistD = (ArrayList<Member>)mylistC.clone();
		mylistC.remove(1);
		printMemberData(mylistC);
		System.out.println();
		printMemberData(mylistD);
		System.out.println();


		}
	}
	
		private static void printMemberData(ArrayList<Member> mylistA)
		{
			for(int i=0;i<mylistA.size();i++)
			{
				Member person=mylistA.get(i);
				person.printInfo();
			}
		}

}
