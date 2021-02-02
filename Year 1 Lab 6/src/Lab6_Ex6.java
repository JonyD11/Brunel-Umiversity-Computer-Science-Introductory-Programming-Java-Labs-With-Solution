
public class Lab6_Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(charcount("abracadabra", 'a'));
	}

	public static int charcount(String ipx, char c){
		
		int count = 0;
		for(int i = 0; i<ipx.length(); i++){
			if(ipx.charAt(i) == c){
				count++;
			}
		}
		System.out.println("The number of letter a is ");
		return count;
	}
}
