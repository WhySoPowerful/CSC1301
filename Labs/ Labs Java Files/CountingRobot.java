package labs;

import java.util.Scanner;

public class CountingRobot {
	public static void main(String[] args) {
		int start,end,step;
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your starting integer");
		int x = start=scan.nextInt();
		System.out.println("Please ending your starting integer");
		int y = end=scan.nextInt();
		System.out.println("Please ending your step size");
		int z = step=scan.nextInt();
		for(int i=start;i<=end;i=i+step) {
			System.out.println("Counting numbers from " +x +" to " +y + " in increments of " +z + " is: "  +i);
		}
		scan.close();
		}
	}
