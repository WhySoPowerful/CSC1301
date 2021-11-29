package homework;

import java.util.Scanner;
public class Full_XmasTree {

public static void main(String[] args) {
int number;
Scanner scanner = new Scanner(System.in);
System.out.println("Please Enter The Desired Number Of Rows :");
number = scanner.nextInt();
      
for (int i = 0; i < number; i++) {
for (int j = number - i; j > 1; j--) {
System.out.print(" ");
}
for (int j = 0; j <= i; j++) {
System.out.print("* ");
}
System.out.println();
}
       int height=number/3;
for (int i = number-height; i < number + 1; i++) {
       for (int j = number; j > i; j--) {
System.out.print(" ");
}
for (int k = 0; k < (2 * i - 1); k++) {
System.out.print("*");
}
System.out.println();
}
       for (int row = 1; row <= number; row++)
{
for (int c = 1; c <= number-row; c++) 
       System.out.print(" ");
for (int c = 1; c <= 2*row - 1; c++) 
System.out.print("*");

System.out.println();
   if(row==1)break;
}


       for (int row = 1; row <= number; row++) 
{
for (int c = 1; c <= number-row; c++) 
       System.out.print(" ");
for (int c = 1; c <= 2*row - 1; c++) 
System.out.print("*");

System.out.println();
   if(row==height)break;
}
      
scanner.close();
}
}