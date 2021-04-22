import java.util.ArrayList;
import java.util.Scanner;

public class Search {

	public static void searchContact(ArrayList <AddressBook> contactDetails ,String name)
	{
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<contactDetails.size();i++)
		{
		String na=contactDetails.get(i).getFirstName();
		if(na.equals(name)){
			contactDetails.remove(contactDetails.get(i));
                 System.out.println("Enter your first Name to be changed: ");
		         String lastName=sc.nextLine();
		
		         System.out.println("Enter new Address : ");
		         String address=sc.nextLine();
		
		         System.out.println("Enter new City Name : ");
		         String city=sc.nextLine();
		
		         System.out.println("Enter  State Name : ");
		         String state=sc.nextLine();
		
		         System.out.println("Enter new Phone number : ");
		         String phoneNumber=sc.nextLine();
		
		         System.out.println("Enter Email : ");
		         String email=sc.nextLine();
		
		         System.out.println("Enter Zip code : ");
		         int zip=sc.nextInt();
		
		contactDetails.add(new AddressBook(name, lastName, address, city,
				                             state, phoneNumber, email, zip));
                       System.out.println("Contact updated");
			break;
		}
	}
}
}