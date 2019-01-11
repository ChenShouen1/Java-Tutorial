/**
* @author Aaron Smith
*/
package sectionSeven;

public class Printer {
	private String brand;
	private int tonerLevel = 50;
	private int pagesPrinted;
	private boolean duplexPrinter;
	
	
	public Printer(String brand, int tonerLevel, boolean duplexPrinter)
	{
		this.brand = brand;
		if(tonerLevel > 0 && tonerLevel <= 100)
		{this.tonerLevel = tonerLevel;}
		this.duplexPrinter = duplexPrinter;
	}
	
	public void printingPage(int pages)
	{
		System.out.println("Printing request for " + pages + " pages recieved");
		tonerLevel = tonerLevel - pages;
		if(tonerLevel <=0)
			{
			System.out.println("toner ran out, reload toner");
			int remainingPages = Math.abs(tonerLevel);
			System.out.println("remaining pages are " + remainingPages);
			reloadToner();
			tonerLevel = tonerLevel - remainingPages;
			}
		if(duplexPrinter == true)
		{
			System.out.println("Printer is duplex pages required is halved");
			pages = (pages / 2) + (pages % 2);
		}
		this.pagesPrinted = this.pagesPrinted + pages;
		statCheck();
	}
	
	public void reloadToner()
	{
		tonerLevel = 100;
		System.out.println("Toner Reloading, resume printing.");
		statCheck();
	}
	
	public void statCheck()
	{
		System.out.println("Toner level is " + tonerLevel + "% Pages printed are " + pagesPrinted);
	}

	public int getTonerLevel() {
		return tonerLevel;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
	

	
}
