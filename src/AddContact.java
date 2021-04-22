import java.util.ArrayList;
import java.util.Scanner;

public class AddContact {
	
	ArrayList <AddressBook> contactDetails =new ArrayList <AddressBook>();

	public void add() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("How many contacts you want add ? ");
	int contactInput = sc.nextInt();
	
	for(int i =0;i<contactInput ; i++) {
		
		System.out.println("Enter your First Name : ");
		String firstName = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter your Last Name : ");
		String lastName=sc.nextLine();
		
		System.out.println("Enter your Address : ");
		String address=sc.nextLine();
		
		System.out.println("Enter your City Name : ");
		String city=sc.nextLine();
		
		System.out.println("Enter your State Name : ");
		String state=sc.nextLine();
		
		System.out.println("Enter your Phone number : ");
		String phoneNumber=sc.nextLine();
		
		System.out.println("Enter your Email : ");
		String email=sc.nextLine();
		
		System.out.println("Enter your Zip code : ");
		int zip=sc.nextInt();
		
		contactDetails.add(new AddressBook(firstName, lastName, address, city,
				                             state, phoneNumber, email, zip));
	}
	
	ShowContact.show(contactDetails);
	}	
	public ArrayList<AddressBook> getContact(){
		return contactDetails;
		}
}
