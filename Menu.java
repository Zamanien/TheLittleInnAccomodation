import java.util.*;
public class Menu
{
	public static void main(String[] args) 
	{

		System.out.println("________________________________");
		System.out.println("|         Velkommen til        |");
		System.out.println("|        The Little Inn        |");
		System.out.println("|                              |");
		System.out.println("|        Guldbergvej 22        |");
		System.out.println("|           København          |");
		System.out.println("|            Danmark           |");
		System.out.println("|                              |");
		System.out.println("|        Tlf: 48275562         |");
		System.out.println("|      Email: Brown@TLN.dk     |");
		System.out.println("|                              |");
		System.out.println("|                              |");
		System.out.println("|             Menu:            |");
		System.out.println("|______________________________|");

			//Konstruktør som kalder på klassen (RoomList)
		RoomList roomsList = new RoomList();
		CustomerList allCustomers = new CustomerList();
		boolean end = false; 
		String choice; 

		while(!end)
		{
		 //Liste over valg
			System.out.println("____________________________________________");
			System.out.println("|                                           |");
			System.out.println("| Menu:                                     |");
			System.out.println("| -Press '1' to make a reservatin           |");
			System.out.println("| -Press '2' to view rooms                  |");
			System.out.println("| -Press '3' to view Customer List          |");
			System.out.println("| -Press '4' to checkout a Customer         |");
			System.out.println("| -Press '5' to clean a room                |");
			System.out.println("| -Press '6' to quit                        |");
			System.out.println("|___________________________________________|");


			choice = Input.getString();
			//if-else metoder over valg
			if(choice.equals("1"))
			{
				System.out.println("Make a reservation");
				
				System.out.println("Choose a room");
				int roomNumber = Input.getInt();
				roomsList.reserveRoom(roomNumber, allCustomers);
			}
			//Listen fra klassen RoomList kaldes hvis "2" indtastes
			else if(choice.equals("2"))
			{
				System.out.println("Room List: ");
				roomsList.printRoomList();
			}

			else if(choice.equals("3"))
			{
				allCustomers.printCustomers();
			}

			else if(choice.equals("4"))
			{
				System.out.println("Please enter the room number to check out");
				int roomNumber = Input.getInt();
				allCustomers.removeCustomer(roomNumber);
				roomsList.checkOut(roomNumber);
				System.out.println("Customer has been checked out");
			}
			else if(choice.equals("5"))
			{
				System.out.println("Please enter the room number to clean");
				int roomNumber = Input.getInt();
            	Cleaning.cleaning(roomNumber, roomsList);
				System.out.println("Room "+roomNumber+" has been cleaned"); 
			}
			else if(choice.equals("6"))
			{
				end = true;
			}
		}
	}
}