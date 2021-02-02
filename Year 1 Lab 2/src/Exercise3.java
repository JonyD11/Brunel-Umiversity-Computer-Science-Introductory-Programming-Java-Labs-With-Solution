

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
        int b = -10;
        int c = 3;

        if (a < b & a < c)
            System.out.print(a + "<" + b + "<" + c);

        if (b < c & b < a)
            System.out.print(b + "<" + c + "<" + a);

        if (c < a & c < b)
            System.out.print(c + "<" + b + "<" + a);
	}
}
