package labs;

import java.util.Scanner;

public class lab8 {
	public static void main(String []args) {
		//Do not add any code except the call the functions
		PrintSquare();
		GradeAverage();
		Add2Integers();
		SumProductMinMax3();
		
		
	}
	@SuppressWarnings("resource")
	public static void PrintSquare() {
		
		System.out.println("Please type a number: ");
		
		Scanner input = new Scanner(System.in);
		
		double num = input.nextDouble();
		
		double sq = num * num;
				
		System.out.println("The square of that number is " + sq);
		
		
	}
	@SuppressWarnings("resource")
	public static void GradeAverage() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name = input.next();
		
		System.out.println("Enter the grade for 3 subjects: ");
		
		double grade1 = input.nextDouble();
		
		double grade2 = input.nextDouble();
		
		double grade3 = input.nextDouble();
		
		double average = (grade1 + grade2 + grade3) / 3.0;
		
		System.out.println("Name: " + name);
		
		System.out.println("Average: " + average);
		
		
	}
	@SuppressWarnings("resource")
	public static void Add2Integers() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		
		int num1 = input.nextInt();
		
		System.out.println("Enter second integer: ");
		
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The sum is: " + sum);
		
		
	}
	
	@SuppressWarnings("resource")
	public static void SumProductMinMax3() {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		
		int num1 = input.nextInt();
		
		System.out.println("Enter second integer: ");
		
		int num2 = input.nextInt();
		
		System.out.println("Enter third integer: ");
		
		int num3 = input.nextInt();
		
		int sum = num1 + num2 + num3;
		
		int product = num1 * num2 * num3;
		
		System.out.println("The sum is: " + sum);
		
		System.out.println("The product is: " + product);
		
		int small = Math.min(num1,num2);
		
		int smallest = Math.min(small, num3);
		
		int large = Math.max(num1, num2);
		
		int largest = Math.max(large, num3);
		
		
		System.out.println("The min is: " + smallest);
       
		System.out.println("The max is: " + largest);
        
		
		
		
		
		
		
	}
	
	

}
