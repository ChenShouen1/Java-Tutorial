/**
* @author Aaron Smith
*/
package inheritance;

public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
		System.out.println(getSize());
		//System.out.println(super.getSize()cd);
		// TODO Auto-generated constructor stub
	}

	private void chew()
	{
		System.out.println("dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("dog.eat() called");
		chew();
		super.eat();
	}
	
	public void walk() 
	{
		System.out.println("Dog.run() called");
		move(5);
	}
	
	public void run()
	{
		System.out.println("Dog.run() called");
		move(10);

	}
	
	@Override
	public int getSize()
	{
		return 2;
	}
}
