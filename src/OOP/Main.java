package OOP;

//import java.util.Scanner;

public class Main {
	
//	Car Stuff
//	public static void main(String[] args)
//
//	{
//		Car porsche = new Car();
//		Car holden = new Car();
//
//		porsche.setModel("Carrera"); 
//		System.out.println("Model is " + porsche.getModel());
//	}

	public static void main(String[] args)
	{
		BankAccount bobsAccount = new BankAccount();
	//	BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob Brown", "bobsemail@email.com", "1-800-somenumber");
		bobsAccount.withdrawal(100.0);
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawal(100.0);
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(100.0);
		bobsAccount.withdrawal(3.5);

		
		BankAccount timAccount = new BankAccount("Tim", "tim@email.com", "12345");
		System.out.println(timAccount.getAccountNumber() + " name " + timAccount.getCustomerName());
		VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getName());
		
		VipCustomer person2 = new VipCustomer("Bob", 25000.00);
		System.out.println(person2.getName());
		
		VipCustomer person3 = new VipCustomer("Tim", 100.00, "Tim@email.com");
		System.out.println(person3.getName());
	}
}
