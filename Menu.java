import java.util.*;
public class Menu
{
      public static void main(String[] args) 
      {
      
      //Konstruktør som kalder på klassen (RoomList)
      RoomList roomsList = new RoomList();
      CustomerList allCustomers = new CustomerList();
         boolean end = false; 
         String choice; 
            
             while(!end)
             {
             //Liste over valg
             System.out.println("Menu: \nPress '1' to make a reservation");
             System.out.println("Press '2' to view rooms");
             System.out.println("Press '3' to view Customer List");
             System.out.println("Press '4' to quit");
             choice = Input.getString();
            
             
             //if-else metoder over valg
               if(choice.equals("1"))
                  {
                     System.out.println("Make a reservation");
                     String CustomerName = allCustomers.createCustomer();
                     int roomNumber;
                     Input.println("Choose a room");
                     while(true)
                     {
                        //Tjekker om inputtet er et tal
                        Scanner sc = new Scanner (System.in);
                        if(sc.hasNextInt())
                        {
                           roomNumber = sc.nextInt();
                           break;
                        }
                        else{
                        Input.println("Not a number, please try again");
                        }
                     }
                     //Looper gennem alle værelser 
                     for(int i = 0; i < roomsList.roomList.size(); i++) {
                        
                        if(roomsList.roomList.get(i).getRumNo() == roomNumber)
                        {
                           roomsList.roomList.get(i).setOccupied(false);
                           Input.println("Reservation has been completed");
                           break;
                        };
                     }
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
                     end = true;
                  }
                else if(choice.equals("5"))
                {
                  allCustomers.printCustomers();
                }
             }
         
      }
}