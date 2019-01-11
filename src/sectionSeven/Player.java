/**
* @author Aaron Smith
*/
package sectionSeven;

public class Player {
	
	public String name;
	public int health;
	public String weapon;
	 
	public void loseHealth(int damage)
	{
		this.health = this.health - damage;
		if(health <= 0)
		{
			System.out.println("Player has died");
			//reduce lives.
		}
	}
	
	
	public int healthRemaining()
	{
		return this.health;
	}
}
