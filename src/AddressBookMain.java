import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook addressBook =new AddressBook();
			
			System.out.println("Enter your First Name : ");
			String firstName = sc.nextLine();
			addressBook.setFirstName(firstName);
			
			System.out.println("Enter your Last Name : ");
			String lastName=sc.nextLine();
			addressBook.setLastName(lastName);
			
			System.out.println("Enter your Address : ");
			String address=sc.nextLine();
			addressBook.setAddress(address);
			
			System.out.println("Enter your City Name : ");
			String city=sc.nextLine();
			addressBook.setCity(city);
			
			System.out.println("Enter your State Name : ");
			String state=sc.nextLine();
			addressBook.setState(state);
			
			System.out.println("Enter your Phone number : ");
			String phoneNumber=sc.nextLine();
			addressBook.setPhoneNumber(phoneNumber);
			
			System.out.println("Enter your Email : ");
			String email=sc.nextLine();
			addressBook.setEmail(email);	
			
			System.out.println("Enter your Zip code : ");
			int zip=sc.nextInt();
			addressBook.setZip(zip);
			
			System.out.println("First name is : " +addressBook.getFirstName());
			System.out.println("Last name is : " +addressBook.getLastName());
			System.out.println("Address is : " +addressBook.getAddress());
			System.out.println("City is : " +addressBook.getCity());
			System.out.println("State is : " +addressBook.getState());
			System.out.println("Zip is : " +addressBook.getZip());
			System.out.println("Phone number is : " +addressBook.getPhoneNumber());
			System.out.println("Email is : " +addressBook.getEmail());
		}
}
