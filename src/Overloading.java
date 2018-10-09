
public class Overloading

{
	
	
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches)
	{
		double result = -1.0;
		
		if((feet > -1) && (0 < inches && inches < 13))
		{
			inches = inches + (feet * 12);
			double centimeters =  inches * 2.54;
			result = centimeters;
		}
		
		return result;
	}
	
	
	
	public static double calcFeetAndInchesToCentimeters(double inches)
	{
		if (inches < 0)
		{return -1;}
		
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);

	}
	
	
	
	
	  public static void main(String [] args)
	    {
	    	//Use this to test your methods, Aaron.
	    	System.out.println(" 2 feet and 6 inches = " + calcFeetAndInchesToCentimeters(2, 6) + " cm");
	    	System.out.println(" 64 inches = " + calcFeetAndInchesToCentimeters(64) + " cm");
	    }
}
