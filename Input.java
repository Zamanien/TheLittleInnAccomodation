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
   public static int getInt()
   {
   		int result;
		while(true)
		{
			//Tjekker om inputtet er et tal
			Scanner sc = new Scanner (System.in);
			if(sc.hasNextInt())
			{
				result = sc.nextInt();
				break;
			}
			else
			{
				System.out.println("Not a number, please try again");
			}
		}
		return result;
   }
}
