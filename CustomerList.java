//Liste over kundere
import java.util.*;
import java.util.ArrayList;

public class CustomerList
{

//ArrayList over kunder

   public ArrayList<Customer> customerList = new ArrayList<Customer>();
   public void createCustomer(int room)
   {
   
      //Her oprettes kunder
      int passportNumber = 176235;
      String customerName = "";
      int phoneNumber = 12345678;
      boolean validInput = false;
      System.out.println("PLease enter customer name: ");
      customerName = Input.getString();
      System.out.println("Enter passport number: ");
      
      //Checker om der skrives et tal som telefon nummer og for passport nummeret.
      while(!validInput)
      {
         
         Scanner sc = new Scanner (System.in);
         if(sc.hasNextInt())
         {
            passportNumber = sc.nextInt();
            validInput = true;
         }
         else{
         System.out.println("Not a number, please try again!");
         }
      }
      validInput = false;
      System.out.println("Enter phone number: ");
      while(!validInput)
      {
         
         Scanner sc = new Scanner (System.in);
         if(sc.hasNextInt())
         {
            phoneNumber = sc.nextInt();
            validInput = true;
         }
         else{
         System.out.println("Not a number, please try again!");
         }
      }
      
      addCustomer(passportNumber, customerName, phoneNumber, room);
   }
   public void addCustomer(int passportNumber, String customerName, int phoneNumber, int room)
   {
      // Her tilføjes constructor
      Customer customer = new Customer(passportNumber, customerName, phoneNumber, room);
      
      //Her tilføjes kunder
      customerList.add(customer);
      
   }
   public void removeCustomer(int roomNumber)
   {
      //Looper igennem alle kunder i listen
      for(int i = 0; i < customerList.size(); i++) {
         //Checker om der er en kunde med det værelse
         if(customerList.get(i).getRoom() == roomNumber)
         {
            //Fjerner kunden
            customerList.remove(i);
            break;
         }
      }
   }
   //Print af customers
   public void printCustomers()
   {
      int i;
      for(i=0;i<customerList.size();i++)
      {
         System.out.println(customerList.get(i).toString() + "\n");
         
      }
   }
}