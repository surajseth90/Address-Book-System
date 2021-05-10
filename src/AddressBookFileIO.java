import java.nio.file.Files;
import java.util.ArrayList;

public class AddressBookFileIO {

	public static String ADDRESSBOOK_FILE_NAME = "addressbook_file.txt";
	
	public void writeData(ArrayList<AddressBook> contactDetails) {
		StringBuffer contactbuffer = new StringBuffer();
		contactDetails.forEach(contact-> {
			String contactDataString = contact.toString().concat("\n");
			contactbuffer.append(contactDataString);
		});
		try {
		Files.write("addressbook_file.txt",contactbuffer.toString().getBytes());
		}catch (IO)
		
	}
}

