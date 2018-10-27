/**
* @author Aaron Smith
*/
package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal animal = new Animal("Animal", 1, 1, 5, 5);
//		
//		Dog dog = new Dog("Yorkie", 8, 20, 2, 4,1, 20, "long silkey");
//		dog.eat();
//		dog.walk();
//		dog.run();
		
		Jeep jeep = new Jeep(36);
		jeep.steer(45);
		jeep.accelerate(30);
		jeep.accelerate(20);
		jeep.accelerate(-50);
	}

}
