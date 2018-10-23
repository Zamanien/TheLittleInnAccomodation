public class Cleaning 
{
     public static void cleaning(int roomNumber, RoomList roomsList) 
     {
     
        for(int i = 0; i < roomsList.roomList.size(); i++) {
                        
              if(roomsList.roomList.get(i).getRumNo() == roomNumber)
              {
                roomsList.roomList.get(i).setClean(true);
                break;
              }
      }

   }

}