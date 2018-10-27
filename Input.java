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
      boolean validInput = false;
   	int result = 1;
		while(!validInput)
		{
			//Tjekker om inputtet er et tal (hasNext - returnerer 'true'    hvis der er et andet token i dets input) 
			Scanner sc = new Scanner (System.in);
			if(sc.hasNextInt())
			{
				result = sc.nextInt();
				validInput = true;
			}
			else
			{
				System.out.println("Not a number, please try again");
			}
		}
		return result;
   }
}
