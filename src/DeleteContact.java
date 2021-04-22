import java.util.ArrayList;

public class DeleteContact {

	public static void deleteContact(ArrayList <AddressBook> contactDetails,String name)
	{
	
		for(int i =0;i<contactDetails.size();i++)
		{
		String na=contactDetails.get(i).getFirstName();
		if(na.equals(name)){
	      contactDetails.remove(contactDetails.get(i));
		} 
		
	      System.out.println("Address Book after deletion");
          for(int p=0;p<contactDetails.size();p++){
        	    System.out.println("First name is : "+contactDetails.get(p).getFirstName());
  				System.out.println("Last name is : " +contactDetails.get(p).getLastName());
  				System.out.println("Address is : " +contactDetails.get(p).getAddress());
  				System.out.println("City is : " +contactDetails.get(p).getCity());
  				System.out.println("State is : " +contactDetails.get(p).getState());
  				System.out.println("Zip is : " +contactDetails.get(p).getZip());
  				System.out.println("Phone number is : " +contactDetails.get(p).getPhoneNumber());
  				System.out.println("Email is : " +contactDetails.get(p).getEmail());
           
          }   
         break; 
		}
	}
}

