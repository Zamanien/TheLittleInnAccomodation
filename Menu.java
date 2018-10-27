import java.util.*;
public class Menu
{
	public static void main(String[] args) 
	{
      //velkomst besked
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
		System.out.println("|______________________________|");

			//Konstruktør som kalder på klassen (RoomList)
		RoomList roomsList = new RoomList();
		CustomerList allCustomers = new CustomerList();
		boolean end = false; 
		String choice; 

		while(!end)
		{
         //Printer menuen
         printMenu();

			choice = Input.getString();
			//if-else metoder over valg
			if(choice.equals("1"))
			{
         
				System.out.println("\nMake a reservation");
				
				System.out.println("Choose a room\n");
				int roomNumber = Input.getInt();
				roomsList.reserveRoom(roomNumber, allCustomers);
			}
			//Listen fra klassen RoomList kaldes hvis "2" indtastes
			else if(choice.equals("2"))
			{
				System.out.println("\nRoom List: \n");
				roomsList.printRoomList();
			}

			else if(choice.equals("3"))
			{
				allCustomers.printCustomers();
			}

			else if(choice.equals("4"))
			{
				System.out.println("\nPlease enter the room number to check out\n");
				int roomNumber = Input.getInt();
				allCustomers.removeCustomer(roomNumber);
				roomsList.checkOut(roomNumber);
				System.out.println("\nCustomer has been checked out\n");
			}
			else if(choice.equals("5"))
			{
				System.out.println("\nPlease enter the room number to clean\n");
				int roomNumber = Input.getInt();
            	Cleaning.cleaning(roomNumber, roomsList);
				System.out.println("Room "+roomNumber+" has been cleaned\n"); 
			}
			else if(choice.equals("6"))
			{
				end = true;
			}
         else
         {
            System.out.println("Ups");
            end = true;
         }
		}
	}
   public static void printMenu()
   {
   		 //Liste over valg
			System.out.println("____________________________________________");
			System.out.println("|                                           |");
			System.out.println("| Menu:                                     |");
         System.out.println("|                                           |");
			System.out.println("| -Press '1' to make a reservation          |");
			System.out.println("| -Press '2' to view rooms                  |");
			System.out.println("| -Press '3' to view Customer List          |");
			System.out.println("| -Press '4' to checkout a Customer         |");
			System.out.println("| -Press '5' to clean a room                |");
			System.out.println("| -Press '6' to quit                        |");
			System.out.println("|___________________________________________|");
   }
}