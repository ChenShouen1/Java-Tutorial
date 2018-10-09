
public class TutorialMathVariables 
{

	public static void main(String [] args)
	{
		byte myBiteNumber = 42;
		short myShortNumber = 3000;
		int myIntNumber = 1234567;
		long myLongNumber = 50000l + (10l * (byte) myBiteNumber) + myShortNumber + myIntNumber;
		
		System.out.println(myLongNumber);
			
		
		double myPoundValue = 3;
		double myKilogramValue = myPoundValue * 0.45359237;
		
		System.out.println(myKilogramValue);
		
		
		double myDoubleOne = 20;
		double myDoubleTwo = 80;
		double myDoubleThree = ((myDoubleOne + myDoubleTwo) * 25);
		myDoubleThree = myDoubleThree % 40;
		
		if(myDoubleThree <= 20)
		{
			System.out.println("Total was over the limit.");
		}
	}
}
