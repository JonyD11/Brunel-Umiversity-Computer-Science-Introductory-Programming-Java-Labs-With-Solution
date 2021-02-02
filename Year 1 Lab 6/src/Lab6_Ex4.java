
public class Lab6_Ex4 {
	
	public static void main(String[] args)
	{

		System.out.print(monthYear(2012, 10));
	}
	
	public static String monthYear(int x, int y)
	{
		String month=" ";
		if(x>0)
		{
				switch(y)
			{
		
			case 1:
				month="January "+x+" has 31 days";
				break;

			case 2:
				if(x%4==0)
				{
					month="February "+x+" has 29 days";
				}
				else 
				{
					month="February "+x+" has 28 days";
				}
				break;

			case 3:
				month="March "+x+" has 31 days";
				break;

			case 4:
				month="April "+x+" has 30 days";
				break;

			case 5:
				month="May "+x+" has 31 days";
				break;
	
			case 6:
				month="June "+x+" has 30 days";
				break;

			case 7:
				month="July "+x+" has 31 days";
				break;

			case 8:
				month="August "+x+" has 31 days";
				break;

			case 9:
				month="September "+x+" has 30 days";
				break;

			case 10:
				month="October "+x+" has 31 days";
				break;

			case 11:
				month="November "+x+" has 30 days";
				break;

			case 12:
			month="December "+x+" has 31 days";
		break;
		
		default: return "Please Enter Valid Number of Month ";
		}

		return month;

		}
		else return "Enter Valid Month or Year";
	}

	
}

