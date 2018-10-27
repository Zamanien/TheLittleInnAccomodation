//Værelse (Se det som en seperat klasse i Diagram model)
public class Room
{
   
   //attributter
   private int roomNumber; 
   private double price;
   private boolean occupied; 
   private int kvm; 
   private int beds; 
   private boolean clean; 
   
   
   public Room() { } 
   public Room(int roomNumber, double price, int kvm, int beds)
   {
      this.roomNumber = roomNumber; 
      this.price = price; 
      this.kvm = kvm;
      this.occupied = true;  
      this.beds = beds;
      this.clean = true; 
   }
   
   //getters og setters for attributterne
   public int getRoomNumber()
   {
      return this.roomNumber; 
   }
   
   public void setRoomNumber(int roomNumber)
   {
      this.roomNumber= roomNumber;
   }

   public double getPrice()
   {
      return this.price; 
   }
         public void setPrice(double price)
         {
         this.price = price;
         }  
   
   public boolean getOccupied()
   {
      return this.occupied;
   }
       public void setOccupied(boolean occupied)
          {
          this.occupied = occupied;
          }
  
   public int getKvm()
   {
      return this.kvm;
   }
       public void setKvm(int kvm)
          {
          this.kvm = kvm; 
          }
  
   public int beds()
   {
      return this.beds;
   }
        public void getBeds(int beds)
         {
         this.beds = beds;
         }
   
  
   public boolean clean()
   {
         return this.clean;     
   }
          public void setClean(boolean clean)
          {
          this.clean = clean; 
          }
   
   //Print
   public String toString(){
      return "Room Number:" + this.roomNumber + ", Prices: " + this.price + ", m2: " + this.kvm + ", Beds: " + this.beds + ", Clean: " + this.clean + ", Available: " + this.occupied;
   }
  

}