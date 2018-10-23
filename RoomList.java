//Liste over v�relser 
import java.util.*;
import java.util.ArrayList;

public class RoomList
{

 public static String getString()
   {
      Scanner sc = new Scanner(System.in);
      return sc.nextLine();
   }
   
   
   //Arraylist over v�relser
   ArrayList<Room> roomList = new ArrayList<Room>();   
   
   public RoomList()
   //Forloop fra v�relse 1-3 (Andre variabler)
   {  
      for (int  i = 1; i <= 3; i++)
      {
         roomList.add(new Room(i,500, 92, 4));
         
      }
      //ForLoop fra v�relse 4-6 (andre variabler)
      for (int j = 4; j <= 6; j++)
      {
         roomList.add(new Room(j, 350, 82, 2)); 
      }
      //Forloop fra v�relse 7-10 (andre variabler) 
      for (int k = 7; k <= 10; k++)
      {
         roomList.add(new Room(k, 250, 56, 1)); 
      }
   }
   
   
   /* //Man kan skabe ny v�relse herfra) 
   public void createRoom(){
      int roomNo = 6;
      int kvm = 75;
      roomList.add(new Room(roomNo, kvm));
      
   }
   //Slette v�relser herfra
   public void deleteRoom(int roomNo){
      for(int i = 0; i < roomList.size(); i++){
         if(roomList.get(i).getRumNo() == roomNo){
            roomList.remove(i);
         }
         
      
      
   }
   */
   //print af arraylists
   public void printRoomList(){
      for(int i = 0; i < roomList.size(); i++) {
         System.out.println(roomList.get(i).toString() + "\n");
      }
      
   }
}
