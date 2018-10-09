public class DigitSumChallenge
{
	public static int sumDigits(int number)
	{
		int sum = -1;
		if (number >= 10)
		{
			sum = 0;
			while (number > 0)
			{
				int digit = number % 10;
				sum += digit;
				number /= 10;
			}
		}
		return sum;
	}

	public static void main(String[] args)
	{
		System.out.println(sumDigits(125));
	}
}
