import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBookMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AddContact addContact = new AddContact();

		System.out.println("Do you Want to Excecute : y/n ");
		String next = scanner.nextLine();

		while (next.equalsIgnoreCase("y")) {
			System.out.println("What you want to perform : ");
			System.out.println("1. Add Address Book ");
			System.out.println("2. Edit Contact");
			System.out.println("3. Remove Contact");
			System.out.println("4. Search Contact");
			int input = scanner.nextInt();
			switch (input) {
			case 1: {
				MultipleAddressBook.multipleAddressBook();
				break;
			}
			case 2: {
				
				ArrayList<AddressBook> contactDetails = addContact.getContact();
				String name = scanner.nextLine();
				UpdateContact.searchContact(contactDetails, name);
				break;
			}
			case 3: {
				ArrayList<AddressBook> contactDetails = addContact.getContact();
				System.out.println("Enter First name of contact to be removed");
				String name = scanner.nextLine();
				DeleteContact.deleteContact(contactDetails, name);
				break;
			}
			case 4: {
				System.out.println("Want to search a person by: \n City  : press 1 \n State : press 2 ");
				ArrayList<AddressBook> contactDetails = addContact.getContact();
				int search = scanner.nextInt();
				scanner.nextLine();
				if (search == 1) {
					System.out.println("Enter the City name :");
					String cityName = scanner.nextLine();
					List<String> names = contactDetails.stream()
							.filter(person -> person.getCity().equalsIgnoreCase(cityName)).map(AddressBook::getName)
							.collect(Collectors.toList());
					System.out.println(names);
				} else {
					System.out.println("Enter the State name :");
					String stateName = scanner.nextLine();
					List<String> names = contactDetails.stream()
							.filter(person -> person.getState().equalsIgnoreCase(stateName)).map(AddressBook::getName)
							.collect(Collectors.toList());
					System.out.println(names);
				}
				break;
			}

			}

			System.out.println("if you want to continue , press 'y'");
			next = scanner.nextLine();
		}
	}
}