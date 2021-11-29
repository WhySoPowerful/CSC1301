///////////////////////////////////////////////////////////////
// Homework #04                                              //
// Name: Rafid Shaon                                         //
// Lab time: Friday - 3:00 PM                                //
// Program description: Part B - Program #1                  //
///////////////////////////////////////////////////////////////

package homework;

import java.util.Scanner;

public class payroll {
	public static void main(String[] args) {
		String name;
		int numHours;
        double rateOfPay, taxRate, grossPay, netPay, taxAmount;
        try (Scanner in = new Scanner(System.in)) {
			System.out.print("Please enter employee's name: ");
			name = in.nextLine();
			System.out.print("Please enter number of hours the employee has worked: ");
			numHours = in.nextInt();
			System.out.print("Please enter the hourly rate of pay: $");
			rateOfPay = in.nextDouble();
			System.out.print("please enter federal tax rate: %");
			taxRate = in.nextDouble();
		}
        // calculate gross pay
        grossPay = rateOfPay * numHours;
        // calculate tax amount
        taxAmount = grossPay * taxRate / 100.0;
        // calculate net pay
        netPay = grossPay - taxAmount;

        // output result
        System.out.println("Employee name \t" + name);
        System.out.println("Hours worked \t" + numHours);
        System.out.println("Hourly rate \t$" + rateOfPay);
        System.out.println("Gross pay \t\t$" + grossPay);
        System.out.println("Tax deducted \t$" + taxAmount);
        System.out.println("Net pay \t\t$" + netPay);
    }
}