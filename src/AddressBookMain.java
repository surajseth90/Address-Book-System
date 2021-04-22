import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddContact addContact =new AddContact();
		
		String next = sc.nextLine();
		while(next.equalsIgnoreCase("y")) {
		System.out.println("What you want to perform : ");
		System.out.println("1. Add Contact ");
		System.out.println("2. Edit Contact");
		System.out.println("3. Remove Contact");
		int input = sc.nextInt();
		switch (input)
		{
		case 1:
		{	
			addContact.add();
			break;
		}
		case 2:
		{	
			String name = sc.nextLine();
			ArrayList<AddressBook>contactDetails=addContact.getContact();
			Search.searchContact(contactDetails, name);
			break;
		}
		case 3:
		{
			ArrayList<AddressBook>contactDetails=addContact.getContact();
			System.out.println("Enter First name of contact to be removed");
			String name =sc.nextLine();
			DeleteContact.deleteContact(contactDetails ,name);
			break;
		}
		}
		System.out.println("if you want to continue , press 'y'");
		next = sc.nextLine();
		}
}
}