
public class Switch
{
	public static void main(String[] args)
	{
		int switchValue = 5;
		
		switch(switchValue)
		{
			case 1:
				System.out.println("Value was 1");
				break;
			
			case 2:
				System.out.println("Value was 3");
				break;
				
			case 3: case 4: case 5:
				System.out.println("Value was a " + switchValue);
				break;
				
			default:
				System.out.println("Value was not 1 or 2");
				break;
		}
		
		
		char switchChar = 'f';
		
		switch(switchChar)
		{
			case 'A':
				System.out.println(switchChar);
				break;
			case 'B':
				System.out.println(switchChar);
				break;
			case 'C': case 'D': case 'E':
				System.out.println(switchChar);
				break;
			default:
				System.out.println("Not ABCDE");
				break;
		}
		
		String month = "JanuaryW";
		switch(month.toLowerCase())
		{
			case "january":
				System.out.println("Jan");
				break;
			case "february":
				System.out.println("Feb");
				break;
			default:
				System.out.println("Not Sure.");
				break;
		}
		
	}
}
