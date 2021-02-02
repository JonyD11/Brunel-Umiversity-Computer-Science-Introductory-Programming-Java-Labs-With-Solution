
public class Lab6_Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       String wort = "an na";
	        char[] warray = wort.toCharArray(); 
	        System.out.println(palindrom(warray));       
	    }

	    public static boolean palindrom(char[] wort){
	        boolean palindrom = false;
	        if(wort.length % 2 == 0)
	        {
	            for(int i = 0; i < wort.length/2-1; i++)
	            {
	                if(wort[i] != wort[wort.length-i-1])
	                {
	                    return false;
	                }else{
	                    palindrom = true;
	                }
	            }
	        }
	        else
	        {
	            for(int i = 0; i < (wort.length-1)/2-1; i++)
	            {
	                if(wort[i] != wort[wort.length-i-1])
	                {
	                    return false;
	                }
	                else
	                {
	                    palindrom = true;
	                }
	            }
	        }
	        return palindrom;
	    }

}
