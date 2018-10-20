//Værelse (Se det som en seperat klasse i Diagram model)
public class Room
{

   //Brug ArraysList
   //Konstruktør 
   
   //atributter
   private int rumNo; 
   private boolean occupied = false; 
   private int kvm; 
   private int beds; 
   
   
   public Room()
   {   
   }
   
   public Room(int rumNo, int kvm, int beds)
   {
      this.rumNo = rumNo;  
      this.kvm = kvm;
      this.occupied = false;  
      this.beds = beds; 
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
   
   public String toString(){
      return "Rum Nummer: " + this.rumNo + ", kvm: " + this.kvm + ", Antal senge: " + this.beds; 
   }
   
  /* public void testRooms(int rum, String status)
   {
      setRum(rum);
      setStatus(status); 
   }*/
   

}