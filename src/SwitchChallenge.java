
public class SwitchChallenge
{
	public static void main(String[] args)
	{
		printDayOfTheWeek(-1);
		printDayOfTheWeek(0);
		printDayOfTheWeek(1);
		printDayOfTheWeek(2);
		printDayOfTheWeek(3);
		printDayOfTheWeek(4);
		printDayOfTheWeek(5);
		printDayOfTheWeek(6);
	}
	
	private static void printDayOfTheWeek(int day)
	{
		switch(day)
		{
		case 0:
			System.out.println("It is Sunday");
			break;
		case 1:
			System.out.println("It is Monday");
			break;
		case 2:
			System.out.println("It is Tuesday");
			break;
		case 3:
			System.out.println("It is Wednesday");
			break;
		case 4:
			System.out.println("It is Thursday");
			break;
		case 5:
			System.out.println("It is Friday");
			break;
		case 6:
			System.out.println("It is Saturday");
			break;
		default:
			System.out.println("Invalid Day");
			break;
		}
	}
}
