/**
* @author Aaron Smith
*/
package sectionSeven;

public class Main 
{

	public static void main(String[] args)
	{
//		Dimensions dimensions = new Dimensions(20, 20, 5);
//		Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//		Monitor theMonitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));
//
//		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//		PC thePC = new PC(theCase, theMonitor, theMotherboard);
//		thePC.powerUp();
//	
//
//	Wall wall1 = new Wall("West");
//	Wall wall2 = new Wall("East");
//	Wall wall3 = new Wall("South");
//	Wall wall4 = new Wall("North");
//
//	Celing celing = new Celing(12, 55);
//
//	Bed bed = new Bed("Modern", 4, 3, 2, 1);
//
//	Lamp lamp = new Lamp("classic", false, 75);
//
//	Bedroom bedRoom=new Bedroom("Aaron",wall1,wall2,
//	wall3, wall4, celing, bed, lamp);
//	
//	bedRoom.makeBed();
//	
//	bedRoom.getLamp().turnOn();
//	
//	
//	Player player = new Player();
//	player.name = "tim";
//	player.health = 20;
//	player.weapon = "sword";
//	
//	int damage = 10;
//	player.loseHealth(damage);
//	System.out.println("Remaining health = " + player.healthRemaining());
//	
//	damage = 10;
//	player.loseHealth(damage);
//	System.out.println("Remaining health = " + player.healthRemaining());
//	
//		
//		
//		EnhancedPlayer player = new EnhancedPlayer("Aaron", 50, "Sword");
//		System.out.println("Initial health is " + player.getHealth());
//		int damage = 10;
//		player.loseHealth(damage);
//		System.out.println("Current health after damage is " + player.getHealth());
		
		
		Printer printer = new Printer("Canon", 82, false);
		printer.statCheck();
		printer.printingPage(37);
		printer.printingPage(77);
		printer.reloadToner();
		
		System.out.println("_______________________________________________");

		Printer printer2 = new Printer("Canon", 82, true);
		printer2.statCheck();
		printer2.printingPage(37);
		printer2.printingPage(77);
		printer2.reloadToner();
		
	}
	

}
