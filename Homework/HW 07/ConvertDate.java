package homework;


import java.util.Scanner;

public class ConvertDate
{
   public static void main(String args[])
   {
       try (Scanner sc = new Scanner(System.in)) {
		int firstSpace, commaPos;
		  
		   String date;
		  
		   System.out.print("Enter date to be converted: ");
		   date = sc.nextLine();
		  
		   date = date.trim();
  
		   firstSpace = date.indexOf(' ');
		
		   commaPos = date.indexOf(',');
		  
		   String day, month, year;
		
		   month = date.substring(0, firstSpace);
  
		   month = month.toLowerCase();
   
		   month = month.substring(0, 1).toUpperCase() + month.substring(1);
		  
		   month = month.trim();
		  
		   day = date.substring(firstSpace+1, commaPos);
		  
		   day = day.trim();
		  
		   year = date.substring(commaPos+2);
		  
		   year = year.trim();
		  
		   String output = day + " " + month + " " + year;
		  
		   System.out.println("\n Converted date: " + output + " \n");
	}
   }
}