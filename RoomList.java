//Liste over værelser 

import java.util.ArrayList;

public class RoomList
{

   //Arraylist over værelser
   ArrayList<Room> roomList = new ArrayList<Room>();   
   
   public RoomList(){
      
      for (int  i = 1; i <= 10; i++){
         roomList.add(new Room(i, 90, 2));
      }
   }
   /*
   public void createRoom(){
      int roomNo = 6;
      int kvm = 75;
      roomList.add(new Room(roomNo, kvm));
      
   }
   
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
         System.out.println(roomList.get(i).toString());
      }
   }
}
