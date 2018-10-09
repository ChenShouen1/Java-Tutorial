
public class Section6CodingExercise
{
    
    //Exercise 11 Number In Word
    public static void printNumberInWord(int number)
    {
    	switch(number)
    	{
    	case 0:
			System.out.println("ZERO");
			break;
    	case 1:
			System.out.println("ONE");
			break;
    	case 2:
			System.out.println("TWO");
			break;
    	case 3:
			System.out.println("THREE");
			break;
    	case 4:
			System.out.println("FOUR");
			break;
    	case 5:
			System.out.println("FIVE");
			break;
    	case 6:
			System.out.println("SIX");
			break;
    	case 7:
			System.out.println("SEVEN");
			break;
    	case 8:
			System.out.println("EIGHT");
			break;
    	case 9:
			System.out.println("NINE");
			break;
    	default:
			System.out.println("OTHER");
			break;

    	}
    }
    
    //Exercise 12 Number of Days in Month
    public static boolean isLeapYear(int year)
    {
    	boolean result = false;
    	if(year >= 1 && year <= 9999)
    	{
    		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
    		{result = true;}
    	}
    	return result;
    }
    
    public static int getDaysInMonth(int month, int year)
    {
    	int result = -1;
    	if(year >= 1 && year <= 9999)
    	switch(month)
    	{
    	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			result = 31;
			break;
    	case 2:
    		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
    		{result = 29;}
    		else 
    		{result = 28;}
			break;
    	case 4: case 6: case 9: case 11:
			result = 30;
			break;
		default:
			result = -1;
			break;

    	}
    	return result;
    }
    
    
    
    
    
    //Exercise 13 Sum Odd
    public static boolean isOdd(int number)
    {
    boolean result = false;
    if(number > 0 && number % 2 != 0)
    {
    	result = true;
    }
    return result;
    }
    
    
    
    public static int sumOdd (int start, int end)
    {
    	int result = -1;
    	int sum = 0;
    	if(start > 0 && end > 0)
    	{
	    	for(int i = start; i <= end; i++)
	    	{
	    		if(isOdd(i) == true)
	    		{
	    			sum += i;
	    		}
				result = sum;
	    		
	    	}
    	}
    	return result;
    }
    
    
    
    //Exercise 14 Number Palindrome
    public static boolean isPalindrome(int number)
    {
    	boolean result = false;
    	int reverse = 0;
    	number = Math.abs(number);
    	int tempNumber = number;
    	
    	while( tempNumber > 0)
    	{
    		int lastDigit = tempNumber % 10;
    		reverse = (reverse * 10) + lastDigit;
    		tempNumber = tempNumber / 10;
    	}
    	
    	if(number == reverse)
    	{
    		result = true;
    	}
    	return result;
    }
    
    
    
    
    //Exercise 15 First and Last Digit Sum
    public static int sumFirstAndLastDigit(int number)
    {
    	int result = -1;
    	
    	if(number > -1)
    	{
    		result = number % 10;
    		while(number > 9)
    		{number = number / 10;}
    		result += number;
    	}
    	
    	return result;
    }
    
    
    
    //Exercise 16 Even Digit Sum
    public static int getEvenDigitSum(int number)
    {
    	int result = -1;
    	
    	if(number > -1)
    	{
    		result = 0;
    		while(number > 0)
    		{
    			if(number % 2 == 0)
    			{result += (number % 10);}
    			number = number / 10;
    			}
    	}
    	return result;
    }
    
    
    
    //Exercise 17 Shared Digit
    public static boolean hasSharedDigit (int first, int second)
    {
    	boolean result = false;
    	if((10 <= first  && first <= 99) && (10 <= second  && second <= 99))
    	{
    		int fDiv = first / 10;
    		int fMod = first % 10;
    		int sDiv = second / 10;
    		int sMod = second % 10;
    		
    		if((fDiv == sDiv) || (fDiv == sMod) || (fMod == sDiv) || (fMod == sMod))
    		{
    			result = true;
    		}
    	}
    	
    	return result;
    }
    
    
    
    //Exercise 18 Last Digit checker
    public static boolean hasSameLastDigit (int first, int second, int third)
    {
    	boolean result = false;
    	if((10 <= first  && first <= 1000)  && (10 <= second  && second <= 1000) && (10 <= third  && third <= 1000))
    	{
    		int fMod = first % 10;
    		int sMod = second % 10;
    		int tMod = third % 10;
    		
    		if((fMod == sMod) || (fMod == tMod)  || (sMod == tMod))
    		{
    			return true;
    		}
    	}
    	
    	return result;
    }
    
    
    
    //Exercise 19 Greatest Common Divisor
    public static int getGreatestCommonDivisor(int first, int second)
    {
    	int result = -1;
    	if(first > 9 && second > 9)
    	{
    		result = 0;
    		while(first != 0 && second != 0)
    		{
    			int greatestDivisor = second;
    			second = first % second;
    			System.out.println(greatestDivisor + " " + first);
    			first = greatestDivisor;
    			System.out.println(greatestDivisor + " " + first);

    			result = first;
    			
    		}
    	}
    	return result;
    }
    
    
    
    //Exercise 20 All Factors
    public static void printFactors (int number)
    {
    	String result = "Invalid Value";
    	
    	if(number > 0)
    	{
    		result = "";
    		for (int i = 1; i <= number; i++)
    		{
    			if(number % i == 0)
    			{result += i + " ";}
    		}
    	}
    	System.out.println(result);
    	 	
    }
    
    
    
    //Exercise 21 Perfect Number
    
    public static boolean isPerfectNumber (int number)
    {
    boolean result = false;
	int newNumber = 0;
    if(number > 0)
    {
    	for(int i = 1; i < number; i++)
    	{
    		if(number % i == 0)
    		{
    			newNumber += i;
    			if(newNumber == number)
    			{
    				result = true;
    			}
    		}
    	}
    }
    return result;
    }
    
    
    
    //Exercise 22 Number To Words
    public static void numberToWords(int number)
    {
    	String result = "Invalid Value";
    	
    	if(number > -1)
    	{
    		result = "";
    		int reverseNumber = reverse (number);
    		int startNumberLength = getDigitCount (number);
    		
    		while(startNumberLength > 0)
    		{
    			int currentNumber = reverseNumber % 10;
    			
    	    	switch(currentNumber)
    	    	{
    	    	case 0:
    				System.out.println("Zero");
    				break;
    	    	case 1:
    				System.out.println("One");
    				break;
    	    	case 2:
    				System.out.println("Two");
    				break;
    	    	case 3:
    				System.out.println("Three");
    				break;
    	    	case 4:
    				System.out.println("Four");
    				break;
    	    	case 5:
    				System.out.println("Five");
    				break;
    	    	case 6:
    				System.out.println("Six");
    				break;
    	    	case 7:
    				System.out.println("Seven");
    				break;
    	    	case 8:
    				System.out.println("Eight");
    				break;
    	    	case 9:
    				System.out.println("Nine");
    				break;
    	    	default:
    				System.out.println("OTHER");
    				break;

    	    	}
    	    	
    	    	reverseNumber /= 10;
    	    	startNumberLength --;
    		}

    	}
    	else
    	{
    		System.out.println(result);
    	}
    }
    
    
    
    public static int reverse (int reverseNumber)
    {
    	int reverse = 0;
    	int tempNumber = reverseNumber;
    	boolean negative = false;
    	
    	if(reverseNumber < 0)
    	{
    		negative = true;
    		tempNumber = Math.abs(tempNumber);
    	}
    	
    	while( tempNumber > 0)
    	{
    		int lastDigit = tempNumber % 10;
    		reverse = (reverse * 10) + lastDigit;
    		tempNumber = tempNumber / 10;
    	}
    	
    	if(negative)
    	{
    		reverse = 0 - reverse;
    	}
    	
    	return reverse;
    }
    
    
    
    public static int getDigitCount (int number)
    {
    	int length = -1;
    	if(number > -1)
    	{
    		length = (number + "").length();
    	}
    	return length;
    }
   
    
    
    
    
    //Exercise 23 Flour Pack Problem.
    
    public static boolean canPack (int bigCount, int smallCount, int goal)
    {
    	boolean result = false;
    	if(goal >= 0 && bigCount >= 0 && smallCount >= 0)
    	{
    		if((5 > goal) & smallCount < goal)
    		{
    			result = false;
    		}
    		else 
    		{
    			int bP = goal / 5;
    			int rP = goal - (bP * 5);
    			if((bigCount >= bP && smallCount >= rP) 
    					|| (goal - (bigCount * 5) <= smallCount))
    			{
    				result = true;
    			}
    		}
    		
    	}
    	System.out.print(result);
    	return result;
    }
    
    
    //Aaron's Dumb version (works btw)
    public static boolean canPack2 (int bigCount, int smallCount, int goal)
    {
    	boolean result = false;
    	int bagFilling = 0;
    	//to remove negative numbers.
    	if(goal >= 0 && bigCount >= 0 && smallCount >= 0)
    	{
    		if((5 > goal) && smallCount < goal)
    		{result = false;}
    		else
    		{
    			while(bagFilling <= goal  && bagFilling <= bigCount * 5)
    			{bagFilling += 5;}
    			//Once bagFilled is 1-5 bigger than goal.
    			bagFilling -= 5;
    			if(bagFilling + smallCount >= goal)
    			{result = true;}
    		}
    		
    	}
    	System.out.print(result);
    	return result;
    }
    
    
    
    
    //Exercise 24 Largest Prime Number
    public static int getLargestPrime (int number)
    {
     int result = -1;
     int i;
     int numberCopy = number;
     if(number > 1)
     {
    	 for(i = 2; i <= numberCopy; i++)
    	 {
    		 if(numberCopy % i == 0)
    		 {
    			 numberCopy /= i;
    			 i--;
    		 }
    	 }
		 result = i;
     }
     return result;
    }
    
    
    

    //Exercise 25 Diagonal Star
    public static void printSquareStar(int number)
    {
    	if(number <5)
    	{System.out.println("invalid Value");}
    	else
    	{
    		for(int row = 0; row < number; row++)
    		{
    			for(int col = 0; col < number; col++)
    			{
    				String character = " ";
    				if(row == 0 || row == number - 1 ||
    						col == 0 || col == number - 1 ||
    						row == col ||
    						col == (number - row - 1))
    				{
    					character = "*";
    				}
    				System.out.print(character);
    			}
    			System.out.println("");
    		}
    	}
    	
    }
    
    
    
    
    public static void main(String [] args)
    {

    	printSquareStar(8);
    	//Use this to test your methods, Aaron.
    	//System.out.println(isPalindrome(11));
    	//System.out.println(isPalindrome(1));
    }
    
}
