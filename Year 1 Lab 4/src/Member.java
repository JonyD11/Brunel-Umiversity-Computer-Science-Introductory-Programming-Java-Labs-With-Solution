
public class Member {

	private String name; // modifier = private, type = String,int, name = name, age
	private int age;


	public Member(String a, int b) //Constructor = Member, parameters = String a, int b
	{
		name = a;
		age = b;
	}

	// List of getter: modifier = public, return type = String, name = name
	private String getName() // getters return fields
	{
		return name;
	}
	// setter set fields
	private void setName(String newname) // List of setter: modifier = public, return type = void, name = newname
	{
		name = newname;
	}

	private int getAge() // List of getter: modifier = public, return type = int, name = age
	{
		return age;
	}

	private void setAge(int newage)// List of setter: modifier = public, return type = void, name = newage
	{
		age = newage;
	}

	public void printInfo() //List of method: modifier = public, return type = void, name = printInfo
	{
		System.out.println("name " + getName());
		System.out.println("age " + getAge());
		System.out.println("**********************************");
	}
	
}
