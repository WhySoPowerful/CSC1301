///////////////////////////////////////////////////////////////
// Solution to Programming Project 3 Homework #5             //
// Name: Rafid Shaon                                         //
// Lab time: Friday - 3:00 PM                                //
// Program description: Program #1                           //
///////////////////////////////////////////////////////////////

package homework;

import java.util.Scanner;

public class PrintNumberToWordie {

public static void main(String []args){
try (Scanner scan = new Scanner(System.in)) {
	System.out.println("Enter an integer: ");
	int n = scan.nextInt();
	if(n==1) {
	System.out.println("ONE");
	} else if(n==2) {
	System.out.println("TWO");
	} else if(n==3) {
	System.out.println("THREE");
	} else if(n==4) {
	System.out.println("FOUR");
	} else if(n==5) {
	System.out.println("FIVE");
	} else if(n==6) {
	System.out.println("SIX");
	} else if(n==7) {
	System.out.println("SEVEN");
	} else if(n==8) {
	System.out.println("EIGHT");
	} else if(n==9) {
	System.out.println("NINE");
	} else if(n==10) {
	System.out.println("TEN");
	} else {
	System.out.println("No match found");
	}
	  
	if(n % 2==0) {
	System.out.println(n+" is divisible by 2.");
	} else {
	System.out.println(n+" is not divisible by 2.");
	}
}
}
}
