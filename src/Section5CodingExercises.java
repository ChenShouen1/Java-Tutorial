/*
 * @author Ariana Fairbanks
 * @author Aaron Smith
 */

public class Section5CodingExercises
{
	
	//Megabytes and Kilobytes
	public static void printMegaBytesAndKiloBytes(int kiloBytes) 
	{
	    if(kiloBytes < 0)
	    {
	        System.out.println("Invalid Value");
	    }
	    else
	    {
	        int MB = kiloBytes / 1024;
	        int KB = kiloBytes % 1024;
	    	System.out.println(kiloBytes + " KB = " + MB + " MB and " + KB + " KB");
	    }
	}

	
	
	//Dog Bark
	public static boolean bark (boolean barking, int hourOfDay)
	{
	    boolean result = false;
		if(barking && (hourOfDay > -1 && hourOfDay < 8)||(hourOfDay > 22 && hourOfDay < 24))
		{
			result = true;
		}
		return result;
	}
	
	
	
	//Leap Year 
    public static boolean isLeapYear (int year)
    {
        boolean result = false;
        
        if(year >= 1 && year <= 9999)
        {
        	if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        	{
        		result = true;
        	}
        }
        
        return result;
    }
    
    
    
    //Compare Decimals
    public static boolean areEqualByThreeDecimalPlaces(double first, double second)
    {
    	boolean result = false;
    	first = truncate(first);
    	second = truncate(second);
    	
    	if(first == second)
    	{
    		result = true;
    	}
        
        return result;
    }
    
    private static double truncate(double number)
    {
        String numberString = Double.toString(number);
    	int decimal = numberString.indexOf('.');
    	
        if(decimal != -1)
        {
        	String beforeDecimal = numberString.substring(0, decimal);
        	String afterDecimal = numberString.substring(decimal + 1);
        	if(afterDecimal.length() > 3)
        	{
        		afterDecimal = afterDecimal.substring(0, 3);
        	}        	
        	numberString = beforeDecimal + "." + afterDecimal;
        }
		return Double.parseDouble(numberString);
    }
    
    
    
    //Equal Sum Checker
    public static boolean hasEqualSum(int first, int second, int third)
    {
    	boolean result = false;
    	
    	if(third == first + second)
    	{
    		result = true;
    	}
    	
    	return result;
    }
    
    
    
    //Teen Whatever
    public static boolean hasTeen(int first, int second, int third)
    {
    	boolean result = false;
    	
    	if((12 < first && first < 20) || (12 < second && second < 20) || (12 < third && third < 20))
    	{
    		return true;
    	}
    	
    	return result;
    }
    
    //Ari's Interesting Version of the Above
    public static boolean teen(int first, int second, int third)
    {
    	int[] numbers = {first, second, third};
    	for(int number : numbers)
    	{
    		if(12 < number && number < 20)
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    
    //Exercise 7 Area Calculator
    public static double area(double radius)
    {
    	double result = -1.0;
    	if(radius >= 0)
    	{
    		result = radius * radius * Math.PI;
    	}
    	return result;		
    }
    
    public static double area(double x, double y)
    {
    	double result = -1.0;
    	if ((x >= 0) && (y >= 0))
    	{
    		result = x * y;
    	}
    	return result;		
    }
    
    
    
    //Exercise 8 Minutes to Years and Days Calculator
    public static void printYearsAndDays(long minutes)
    {
    	long years = minutes / 525600;
    	long days = (minutes / 1440) % 365;
    	if(minutes < 0)
    	{
    		System.out.println("Invalid Value");
    	}
    	if(minutes >= 0)
    	{
		System.out.println(minutes + " min = " + years + " y and " + days + " d");
    	}
	
    }
    
    // DeMorgan's Law
    // !(a || b) == (!a && !b)
    // !(a && b) == (!a || !b)
    
    
    //Exercise 9 Equality Printer
    public static void printEqual (int first, int second, int third)
    {
    	if((first < 0) || (second < 0) || (third < 0))
    	{System.out.println("Invalid Value");}
    	
    	else if((first == second) && (first == third) && (second == third))
    	{System.out.println("All numbers are equal");}
    	
    	else if((first != second) && (first != third) && (second != third))
    	{System.out.println("All numbers are different");}
    	
    	else 
    	{System.out.println("Neither all are equal or different");}
    	
    }
    
    
    
    //Exercise 10 Playing Cat
    public static boolean isCatPlaying (boolean summer, int temperature)
    {
    	boolean result = false;
    	
    	if(summer == true && temperature >= 25 && temperature <= 45)
    	{result = true;}
    	
    	else if (summer == false && temperature >= 25 && temperature <= 35)
    	{result = true;}
    	
    	return result;
    }
    
    
    //Leave this at the bottom.
    public static void main(String [] args)
    {
    	//Use this to test your methods, Aaron.
    	
    }
    
    
}