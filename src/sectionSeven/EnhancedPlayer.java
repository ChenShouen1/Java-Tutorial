/**
* @author Aaron Smith
*/
package sectionSeven;

public class EnhancedPlayer
{
	private String name;
	private int health = 100;
	private String weapon;
	
	
	public EnhancedPlayer(String name, int health, String weapon) {
		this.name = name;
		if(health > 0 && health <= 100)
		{
			this.health = health;
		}
		this.health = health;
		this.weapon = weapon;
	}
	
	public void loseHealth(int damage)
	{
		this.health = this.health - damage;
		if(health <= 0)
		{
			System.out.println("Player has died");
			//reduce lives.
		}
	}

	public int getHealth() {
		return health;
	}
	
	
}
