
public class IfThenElse 
{
	static boolean gameOver = true;
	
	public static void main(String [] args) 
	{

		if (gameOver) 
		{
			printScore(800, 5, 100);
			printScore(10000, 8, 200);
		}
		
		
		displayHighScorePosition("Carl", 1500);
		displayHighScorePosition("Denice", 900);
		displayHighScorePosition("Chuck", 400);
		displayHighScorePosition("Wilbur", 50);



	}
	
	public static void printScore( int score, int levelCompleted, int bonus)
	{
		int finalScore = score + (levelCompleted * bonus);
		System.out.println("Your final score was " + finalScore);
	}

	public static void displayHighScorePosition (String playerName, int playerPosition)
	{
		System.out.println(playerName +" managed to get "
				+ calculateHighScorePosition(playerPosition) + " on the high score table.");
	}
	
	public static int calculateHighScorePosition (int playerScore)
	{
		int result = 4;
		if(playerScore >= 1000)
		{
			result = 1;
		}
		else if(playerScore >= 500)
		{
			result = 2;
		}
		else if(playerScore >= 100)
		{
			result = 3;
		}
		return result;
	}
}
