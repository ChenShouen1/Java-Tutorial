/**
* @author Aaron Smith
*/
package sectionSeven;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp()
	{
		theCase.pressPowerButton();
		drawLogo();
	}
	private void drawLogo()
	{
		//fancy stuff
		monitor.drawPixelAt(1200, 50, "Yellow");
	}


	private Motherboard getMotherboard() {
		return motherboard;
	}
	
	
	
}
