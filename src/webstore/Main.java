package webstore;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CreatingConnection c=new CreatingConnection();

		SelectBuy select=new SelectBuy();
		JoinTable j=new JoinTable();
		BlackList b=new BlackList();
		Sum sum=new Sum();
		System.out.println("Regitration in the system:");
		System.out.println("Enter your Name:");
		  String name = in.nextLine();
		  System.out.println("Enter your Last name:");
		 String lastname =in.nextLine();
		 int num;
		
		c.Connection();
		 System.out.println("Select the number of the product you want to purchase:");
		boolean flag=true;
		 while(flag) {
			 System.out.println("Do you want somthing add (yes/no):");
			 String s=in.nextLine();
			 
			 if(s.equals("yes")) {
				 num=in.nextInt();
				 select.Connection(num);
				 
			 }
			 if(s.equals("no")) {
				 flag=false;
			 }
		 }
		 System.out.println("Your order:");
		 j.Connection();
		 System.out.println("Amount to be paid:");
		 sum.Connection();
		 System.out.println("Pay (yes/no):");
		 String pay=in.nextLine();
		 if(pay.equals("yes")) {
			 System.out.println("Payment has been made.Thank you for your purchase!");
			 System.exit(0);
			 
		 }
		 if(pay.equals("no")) {
			 System.out.println("You are blacklisted");
			 b.Connection(name, lastname);
		 }
		 
	}

}
