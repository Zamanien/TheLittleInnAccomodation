//Værelse (Se det som en seperat klasse i Diagram model)
public class Room
{

   //Brug ArraysList
   //Konstruktør 
   
   //atributter
   private int rumNo; 
   private double price;
   private boolean occupied; 
   private int kvm; 
   private int beds; 
   private boolean clean; 
   
   
   public Room() { } 
   public Room(int rumNo, double price, int kvm, int beds)
   {
      this.rumNo = rumNo; 
      this.price = price; 
      this.kvm = kvm;
      this.occupied = true;  
      this.beds = beds;
      this.clean = true; 
   }
   
   //getters og setters for attributterne
   public int getRumNo()
   {
      return this.rumNo; 
   }
      public void setRum(int rumNo)
          {
          this.rumNo = rumNo; 
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
      return "Rum Nummer: " + this.rumNo + ", Prices: " + this.price + ", kvm: " + this.kvm + ", Beds: " + this.beds + ", Clean: " + this.clean + ", Available: " + occupied;
   }
  

}