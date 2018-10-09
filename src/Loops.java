public class Loops
{
	public static void main(String[] args)
	{
		//basic
 		for (int i = 0; i < 5; i++)
		{
			System.out.println("Loop " + i + " Hello!");
		}
		//forwards
		for (int i = 2; i<9; i++)
		{
			System.out.println("10,000 at " + i + "% interest = " +String.format("%.2f",calculateInterest(10000.0, i)));
		}
		//backwards
		for (int i = 8; i>1; i--)
		{
			System.out.println("10,000 at " + i + "% interest = " +String.format("%.2f",calculateInterest(10000.0, i)));
		}
		
		//prime number thing.
		int count = 0;
		for (int i =10; i<100; i++)
		{
			if(isPrime(i))
			{
				count++;
				System.out.println("Number " + i + " is a prime number");
				if(count == 10)
					{
					System.out.print("Exiting the loop");
					break;
					}
			}
		}
	}
	
	public static double calculateInterest(double amount, double interestRate)
	{
		return(amount *(interestRate/100));
	}
	
	
	
	
	public static boolean isPrime(int n)
	{
		if(n == 1)
		{return false;}
		
		for(int i =2; i <= (long) Math.sqrt(n); i++)
		{
			if(n%i == 0)
			{return false;}
		}
		return true;
	}
}
