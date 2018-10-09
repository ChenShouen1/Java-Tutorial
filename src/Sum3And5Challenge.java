
public class Sum3And5Challenge
{
    public static void main(String [] args)
    {
    	int count = 0;
    	int sum = 0;
    	for (int i = 1; i < 1001; i++)
    	{
    		if(i % 5 == 0 && i % 3 == 0)
    		{
    			count++;
    			sum += i;
    			System.out.println(i);
    		}
			if(count == 5)
			{
				break;
			}
    	}
    	System.out.println(sum);
    }
}
