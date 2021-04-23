import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AddContact addContact =new AddContact();
	
		System.out.println("Do you Want to Excecute : y/n ");
		String next = scanner.nextLine();
		
		while(next.equalsIgnoreCase("y")) {
		System.out.println("What you want to perform : ");
		System.out.println("1. Add Address Book ");
		System.out.println("2. Edit Contact");
		System.out.println("3. Remove Contact");
		int input = scanner.nextInt();
		
		switch (input)
		{
		case 1:
		{	
			MultipleAddressBook.multipleAddressBook();
			break;
		}
		case 2:
		{	
			String name = scanner.nextLine();
			ArrayList<AddressBook>contactDetails=addContact.getContact();
			UpdateContact.searchContact(contactDetails, name);
			break;
		}
		case 3:
		{
			ArrayList<AddressBook>contactDetails=addContact.getContact();
			System.out.println("Enter First name of contact to be removed");
			String name =scanner.nextLine();
			DeleteContact.deleteContact(contactDetails ,name);
			break;
		}
		}
		System.out.println("if you want to continue , press 'y'");
		next = scanner.nextLine();
		}
}
}