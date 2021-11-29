///////////////////////////////////////////////////////////////
// Solution to Programming Project 3 Homework #5             //
// Name: Rafid Shaon                                         //
// Lab time: Friday - 3:00 PM                                //
// Program description: Program #2                           //
///////////////////////////////////////////////////////////////

package homework;

import java.util.Scanner;

public class PrintNumberToWordie2 {
   public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Enter an integer: ");
		   int n = sc.nextInt();
		   calledPrintNumberToWordie(n);
	}

   }

   private static void calledPrintNumberToWordie(int n) {
       switch (n) {
       case 1:
           System.out.println("ONE");
           break;
       case 2:
           System.out.println("TWO");
           break;
       case 3:
           System.out.println("THREE");
           break;
       case 4:
           System.out.println("FOUR");
           break;
       case 5:
           System.out.println("FIVE");
           break;
       case 6:
           System.out.println("SIX");
           break;
       case 7:
           System.out.println("SEVEN");
           break;
       case 8:
           System.out.println("EIGHT");
           break;
       case 9:
           System.out.println("NINE");
           break;
       case 10:
           System.out.println("TEN");
           break;
       default:
    	   System.out.println("No match found");
    	   break;
       }
       if (n % 2 == 0)
           System.out.println(n+ " is divisible by 2.");
       else
           System.out.println(n+ " is not divisible by 2.");

   }
}