public class Customer
{
   //atributter
   private int passportNumber; 
   private String customerName; 
   private int phoneNumber; 
   private int id;
   
   
   public Customer(int passportNumber, String customerName, int phoneNumber) 
   {
   this.passportNumber = passportNumber; 
   this.customerName = customerName;
   this.phoneNumber = phoneNumber; 
   }
   
 
   //Getters og setters
    public int getPassportNumber()
   {
      return this.passportNumber;
   }
   
      public void setPassportNumber(int passportNumber)
      {
         this.passportNumber = passportNumber; 
      }
    
    public String getCustomerName()
    {
      return this.customerName;
    }
      
       public void setCustomerName(String customerName)
       {
         this.customerName = customerName;
       }
    
    public int getPhoneNumber() 
      {
         return this.phoneNumber;
      }

      public void setPhoneNumber(int phoneNumber)
      {
         this.phoneNumber = phoneNumber; 
      }
      
      
      //print
   public String toString()
   {
      return "Customer Name: " + this.customerName + ", Phone Number: " + this.phoneNumber + ", Passport Number: " + passportNumber;
   }
  
}