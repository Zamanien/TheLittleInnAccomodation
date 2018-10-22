import java.util.*;
//Klassen input indtager String 
public class Input
{
   public static String getString()
   {
      Scanner skan = new Scanner(System.in);
      return skan.nextLine();
   }
   public static void println(String text) 
   {
      System.out.println(text);
   }
}
