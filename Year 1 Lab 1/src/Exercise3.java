
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a; a = 100;
	    double b; b = 2.3;
	    double c; c = -52.2;
	    boolean d; d = true;
	    String e; e = "I am";
	    String f; f = " a student";
	    byte g; g = 0;
	    char h; h = '!';
	    double y;
	    double z1;
	    String z;
	    final double pi = 3.142; 
	    final String name = " Tanveer"; 
	    long x;
	    
	    
	    //Answers:
	    //(1)
	    y=a+b;
	    System.out.println("1. " +y);
	    
	    /*(2)
	    y=a+d;
	    System.out.println(a+d); This statement can't be exist because it is using int and boolean which is not possible */
	    
	    //(3)
	    z=e+f;
	    System.out.println("3. " +e+f);
	    
	    //(4)
	    y=b*c;
	    System.out.println("4. " +y);
	    
	    /*(5)
	    pi=22/7; 
	    System.out.println("5. " +pi); Invalid because we cannot change the constant variable.*/
	    
	    /*(6)
	    z=name/g;
	    System.out.println(name/g); It contains both String and byte and this is the reason it can't exist */
	    
	    //(7)
	    z1=c/g;
	    System.out.println("7. " +z1);
	    
	    //(8)
	    x= 10;
	    System.out.println("8. " +Math.pow(x, 3));
	    
	    //(9)
	    z="Tanveer "+"is"+f+h;
	    System.out.println(("9. " +z));
	    
	    /*(10)
	    y=(name+10)/(name+h)
	    System.out.println(y); This statement can't be exist because it contains String, int and char*/
	    
	    /*(11)
	    x=(a+b)/(d+c)
	    System.out.println((a+b)/(d+c)); It contains both Boolean and double and this is the reason it doesn't exist*/
	    
	    //(12)
	    y=100.3;
	    y=(y/(a+b))-c;
	    System.out.println("12. " +((y/(a+b))-c));
	    
	    /*(13)
	    x*x = y*y + z*z;
	    x= Math.sqrt((Math.pow(y, 2) +(Math.pow(z, 2)); 
	    System.out.println("13. " +x*x); This will not work because it uses both String and double*/
	    
	    /*(14)
	    name="is"+f-h;
	    System.out.println(name); operator is undefined because of String and char*/
	    
		//(15)
	    y=(((pi+1)/(pi+2))/pi+3);   //**************************************
	    System.out.println("15. " +y);
	    
	    //(16)
	    y=-2;
	    y=Math.cbrt((Math.pow(y, 2)/b));
	    System.out.println("16. " +y);
	    
	    //(17)
	    y=b/g;
	    System.out.println("17.1. " +y);
	    z=y+" Tanveer";
	    System.out.println("17.2. " +z);
	    
	    //(18)
	    z = " Tanveer";
	    System.out.println("18. " +(b/g)+z);
	    
	    //(19)
	    y=-2.3;
	    y=(a*Math.pow(y, 2))+(b*y)+c;
	    System.out.println("19. " +y);
	    
	    /*(20)
	    y=y-Math.pow(a-b, Math.pow(b-c, c-d));
	    System.out.println(y); This statement can't be true because it uses both double and boolean*/
	    
	}

}
