

public class Menu
{
      public static void main(String[] args) 
      {
         boolean end = false; 
         String choice; 
            
             while(!end)
             {
             //Liste over valg
             System.out.println("Menu: \nPress '1' to make a reservation");
             System.out.println("Press '2' to view available rooms");
             System.out.println("Press '3' to view unavailable rooms");
             System.out.println("Press '4' to end");
             choice = Input.getString();
             //choice2Two= RoomList.getString();
             
             //if-else metoder over valg
               if(choice.equals("1"))
                  {
                     System.out.println("Make a reservation");
                   
                  }
             /* else if(choiceTwo.equals("2"))
                  {
                     System.out.println();
                  }
                  */   
                  
               else if(choice.equals("3"))
                  {
                     System.out.println("Show unavailable rooms");
                  }
                else if(choice.equals("4"))
                  {
                     end = true;
                  }
             }
         
      }
}