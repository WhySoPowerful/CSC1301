package labs;
import java.util.Scanner;
public class Sales
{
public static void main(String[] args)
{

int salespeople;

int[] sales;
int sum ;

int max, min, maxIndex, minIndex, target;

int targetReachedCount=0;

double avg;
@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
  

System.out.print("Enter the number of sales people :: ");
salespeople = scan.nextInt();
sales = new int[salespeople];
  
for (int i=0; i<sales.length; i++)
{
System.out.print("Enter sales for salesperson " + (i+1)
+ ": ");
sales[i] = scan.nextInt();
}
System.out.println("\nSalesperson Sales");
System.out.println("------------------ ");

sum = 0;
max = sales[0];
min = sales[0];
maxIndex = 0;
minIndex = 0;
  
for (int i=0; i<sales.length; i++)
{
System.out.println("Salesperson " + (i+1) + " :: $" + sales[i]);
sum += sales[i];
  
if(sales[i] > max)
{
max = sales[i];
maxIndex = i+1;
}
  
if(sales[i] < min)
{
min = sales[i];
minIndex = i+1;
}
  
}

avg = sum / sales.length;

System.out.println("\nTotal sales:: $" + sum);
System.out.println("\nAverage sales:: $" + avg);
System.out.println("\nSalesperson "+ maxIndex +" had the highest sale with $" + max +".");
System.out.println("\nSalesperson "+ minIndex +" had the loweest sale with $" + min +".");
  

System.out.print("Enter the target sales value :: ");
target = scan.nextInt();
  

for (int i=0; i<sales.length; i++)
{
if(sales[i] > target)
{
System.out.println("Salesperson " + (i+1) + " :: $" + sales[i]);
targetReachedCount++;
}
}
System.out.println("\nTotal number of salespeople whose sales exceeded the $" + target + " is " + targetReachedCount);
}
}