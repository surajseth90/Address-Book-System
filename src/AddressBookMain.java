import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddContact addContact =new AddContact();
		System.out.println("What you want to perform : ");
		System.out.println("1. Add Contact ");
		System.out.println("2. Edit Contact");
		int input = sc.nextInt();
		switch (input)
		{
		case 1:
		{	
			addContact.add();
		}
		case 2:
		{	
			String name = sc.nextLine();
			ArrayList<AddressBook>contactDetails=addContact.getContact();
			Search.searchContact(contactDetails, name);
			ShowContact.show(contactDetails);
		}
		
		}
}
}