
public class Lab6_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverse("desserts"));
	}
	
	public static String reverse(String a){
		
		if(a.equals(""))
			return "String is Empty, Please Enter a Valid String to Reverse it ";
		
		String f = "";
		for (int i = a.length()-1 ; i >= 0 ; i--)
		{
			char d = a.charAt(i);
			f += d;
		}
		return f;
	}

}
