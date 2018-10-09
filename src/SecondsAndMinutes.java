
public class SecondsAndMinutes
{
	  
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";
	
	public static String getDurationString(int minutes, int seconds)
	{
		  String result = INVALID_VALUE_MESSAGE;
		  if ((minutes >= 0) && (seconds >= 0) && (seconds <= 59))
		  {
			  int hours = minutes / 60;
			  String hoursString = hours + "";
			  if(hours < 10)
			  {hoursString =  "0" + hoursString;}
			  
			  int remainingMinutes = minutes % 60;
			  String minutesString = remainingMinutes + "";
			  if(remainingMinutes < 10)
			  {minutesString =  "0" + minutesString;}
			  
			  String secondsString = seconds + "";
			  if(seconds < 10)
			  {secondsString =  "0" + secondsString;}
			  
			  result = hoursString + " Hour " + minutesString + " Minutes " + secondsString + " Seconds.";
		  }
		  return result;
	}
	
	
	
	public static String getDurationString(int seconds)
	{
		String result = "Invalid Value";
		if (seconds >= 0)
		{
			int minutes = seconds / 60;
			int remainingSeconds = seconds % 60;
			return getDurationString(minutes, remainingSeconds);
		}
		return result;
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println(getDurationString(99, 6));
		System.out.println(getDurationString(366, 6));
		System.out.println(getDurationString(62458));
		System.out.println(getDurationString(-1));
	}
}
