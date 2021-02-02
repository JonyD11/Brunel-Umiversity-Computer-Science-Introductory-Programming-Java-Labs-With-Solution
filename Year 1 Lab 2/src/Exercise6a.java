
public class Exercise6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String animal="";
		int leg_num= 10;
		switch(leg_num)
		{
		case 1: case 2: case 4: case 6:
		leg_num= 4;
		System.out.println("1," + "2," + "4," + "6" + " has " + 4 + " legs ");
		break;
		case 3: case 7: case 11: case 12: case 14:
		leg_num= 0;
		System.out.println("3," + "7," + "11," + "12," + "14" + " has "  + 0 + " legs ");
		break;
		case 5:
		leg_num= 100;
		System.out.println("5" + " has " + 100 + " legs ");
		break;
		case 8:
		leg_num= 2;
		System.out.println("8" + " has " + 2 + " legs ");
		break;
		case 9: case 10:
		leg_num= 8;
		System.out.println("9," + "10" + " has " + 8 + " legs ");
		break;
		case 13:
		leg_num= 20;
		System.out.println("13" + " has " + 20 + " legs ");
		break;
		default: System.out.println("unknown");
		break;
		}


	}

}
