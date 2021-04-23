import java.util.ArrayList;
import java.util.Scanner;

public class AddContact {
	
	ArrayList <AddressBook> contactDetails =new ArrayList <AddressBook>();
	
	public void add() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many contacts you want add ? ");
		int contactInput = scanner.nextInt();
	
		for(int i =0;i<contactInput ; i++) {
		
			System.out.println("Enter your First Name : ");
			String firstName = scanner.nextLine();
		
			System.out.println("Enter your Last Name : ");
			String lastName=scanner.nextLine();
		
			System.out.println("Enter your Address : ");
			String address=scanner.nextLine();
		
			System.out.println("Enter your City Name : ");
			String city=scanner.nextLine();
		
			System.out.println("Enter your State Name : ");
			String state=scanner.nextLine();
		
			System.out.println("Enter your Phone number : ");
			String phoneNumber=scanner.nextLine();
		
			System.out.println("Enter your Email : ");
			String email=scanner.nextLine();
		
			System.out.println("Enter your Zip code : ");
			int zip=scanner.nextInt();
		
			contactDetails.add(new AddressBook(firstName, lastName, address, city,
				                             state, phoneNumber, email, zip));
	}
	
	ShowContact.show(contactDetails);
	}
	
	public ArrayList<AddressBook> getContact(){
		return contactDetails;
		}
}
