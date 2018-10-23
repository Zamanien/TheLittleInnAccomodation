//Liste over værelser 
import java.util.*;
import java.util.ArrayList;

public class RoomList
{

   //Arraylist over værelser
   ArrayList<Room> roomList = new ArrayList<Room>();
   
   public void reserveRoom(int roomNumber, CustomerList customerList)
   {
      for(int i = 0; i < roomList.size(); i++) {

         if(roomList.get(i).getRoomNumber() == roomNumber)
         {
            if(roomList.get(i).getOccupied())
            {
               roomList.get(i).setOccupied(false);
               customerList.createCustomer(roomList.get(i).getRoomNumber());
               System.out.println("Reservation has been completed");
            }
            else
            {
               System.out.println("Room isn't available");
            }
            break;
         }
      }
   }
   public void checkOut(int roomNumber)
   {
      for(int i = 0; i < roomList.size(); i++) {

         if(roomList.get(i).getRoomNumber() == roomNumber)
         {
            roomList.get(i).setClean(false);
            roomList.get(i).setOccupied(true);
            break;
         }
      }
   } 
   
   public RoomList()
   //Forloop fra værelse 1-3 (Andre variabler)
   {  
      for (int  i = 1; i <= 3; i++)
      {
         roomList.add(new Room(i,500, 92, 4));
         
      }
      //ForLoop fra værelse 4-6 (andre variabler)
      for (int j = 4; j <= 6; j++)
      {
         roomList.add(new Room(j, 350, 82, 2)); 
      }
      //Forloop fra værelse 7-10 (andre variabler) 
      for (int k = 7; k <= 10; k++)
      {
         roomList.add(new Room(k, 250, 56, 1)); 
      }
   }
   //print af arraylists
   public void printRoomList(){
      for(int i = 0; i < roomList.size(); i++) {
         System.out.println(roomList.get(i).toString() + "\n");
      }
      
   }
}
