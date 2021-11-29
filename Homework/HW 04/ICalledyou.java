///////////////////////////////////////////////////////////////
// Homework #04                                              //
// Name: Rafid Shaon                                         //
// Lab time: Friday - 3:00 PM                                //
// Program description: Part B - Program #2                  //
///////////////////////////////////////////////////////////////

package homework;

import java.util.Scanner;

public class ICalledyou {
	public static void main(String args[]) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a number:");
			int n1 = scanner.nextInt();
			System.out.println("Enter another number:");
			int n2 = scanner.nextInt();
			System.out.println("Product: "+ product(n1,n2));
			
			System.out.println("Enter a number:");
			int n3 = scanner.nextInt();
			System.out.println("Enter another number:");
			int n4 = scanner.nextInt();
			System.out.println("Largest number: "+Math.max(n3,n4));
			}
		}
	
	private static int product(int n1, int n2) {
		return n1*n2;
		}
	}