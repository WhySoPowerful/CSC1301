package labs;

import java.util.*;

public class lab12 {

	public static void main(String[] args) {
		Cat();
		HalfHalf();
		FancyMyName();
	}
	
	public static void Cat() {
		
		 String s = "cat";

	        
	        System.out.println(s);
	        for (int i = s.length() - 1; i >= 0; i--) {
	            System.out.print(s.charAt(i));
	        }
	        System.out.println();
	}
	
	public static void HalfHalf() {
   	 
   	 @SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String userString = console.nextLine();
        System.out.println(userString.substring(0,userString.length()/2).toLowerCase()+userString.substring(userString.length()/2,userString.length()).toUpperCase());
    }
	
    public static void FancyMyName() {
    	
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name;
		{
		System.out.println("Please enter your first name and last name, separated by a space?");
		name = sc.nextLine();
		System.out.println("You entered the name: " +name );
		int i =name.indexOf(' ');
		String s1=name.substring(0,i),s2=name.substring(i+1);
		String initial = s1.charAt(0)+""+s2.charAt(0);
		System.out.println("Your first name is "+s1+": has "+s1.length()+" characters");
		System.out.println("Your last name is "+s2+": has "+s2.length()+" characters");
		System.out.println("Your initials are: "+initial);
		}
	  }
    }