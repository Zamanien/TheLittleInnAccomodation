//Liste over kundere
import java.util.*;
import java.util.ArrayList;

public class CustomerList
{

//ArrayList over kunder

   public ArrayList<Customer> customerList = new ArrayList<Customer>();
   
   public CustomerList()
   {
      
   }
   public String createCustomer()
   {
   
      //Her oprettes kunder
      int passportNumber = 176235;
      String customerName = "";
      int phoneNumber = 12345678;
      boolean validInput = false;
      Input.println("PLease enter customer name");
      customerName = Input.getString();
      Input.println("Enter passport #");
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
         Input.println("Not a number, please try again");
         }
      }
      validInput = false;
      Input.println("Enter phone number");
      while(!validInput)
      {
         
         Scanner sc = new Scanner (System.in);
         if(sc.hasNextInt())
         {
            phoneNumber = sc.nextInt();
            validInput = true;
         }
         else{
         Input.println("Not a number, please try again");
         }
      }
      
      addCustomer(passportNumber, customerName, phoneNumber);
      
      return customerName;
   }
   public void addCustomer(int passportNumber, String customerName, int phoneNumber)
   {
      Customer customer = new Customer(passportNumber, customerName, phoneNumber);
      /*
      customer.setPassportNumber(passportNumber);
      customer.setPhoneNumber(phoneNumber);
      customer.setCustomerName(customerName);
      */
      //Her tilføjes kunder
      customerList.add(customer);
      
   }
   //Print af customers
   public void printCustomers()
   {
      
      int i;
      for(i=0;i<customerList.size();i++)
      {
         //Customer current = customerList.get(i);
         //Input.println("Customer #:"+ (i+1) +"\nName: "+ current.getCustomerName()+"\nPassport number: "+getPassportNumber()+"\nPhone Number: "+getPhoneNumber()+"\n\n");
         System.out.println(customerList.get(i).toString());
         
      }
      
   }


}