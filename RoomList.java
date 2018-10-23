//Liste over værelser 
import java.util.*;
import java.util.ArrayList;

public class RoomList
{

 public static String getString()
   {
      Scanner sc = new Scanner(System.in);
      return sc.nextLine();
   }
   
   
   //Arraylist over værelser
   ArrayList<Room> roomList = new ArrayList<Room>();   
   
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
   
   
   /* //Man kan skabe ny værelse herfra) 
   public void createRoom(){
      int roomNo = 6;
      int kvm = 75;
      roomList.add(new Room(roomNo, kvm));
      
   }
   //Slette værelser herfra
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
