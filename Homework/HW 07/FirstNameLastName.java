package homework;

import java.util.*;
public class FirstNameLastName
{
public static void main(String args[])
{
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
char ch = 'Y';
String name;
do
{
System.out.println("Please enter your first name and last name, separated by a space.");
name = sc.nextLine();
System.out.println(name+"----");
int i =name.indexOf(' ');
String s1=name.substring(0,i),s2=name.substring(i+1);
String initial = s1.charAt(0)+""+s2.charAt(0);
System.out.println();
System.out.println("\n Hello there "+s1+" I have your first name as "+s1+", which has "+s1.length()+" characters");
System.out.println("\n Hello again "+s1+" I have your last name as "+s2+", which has "+s2.length()+" characters");
System.out.println("\n Did you know that your initials are "+initial);
System.out.println("\n Do you wish to continue (Y)Yes or (N)No ?");
ch = sc.next().charAt(0);
sc.nextLine();
}
while(ch=='Y' || ch=='y');
}
}
