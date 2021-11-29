package labs;

import java.lang.Math;

import java.util.Scanner;

public class Powers {

     public static void main(String[] args) { 

         int i;

         int largestNum;

         @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

         System.out.print("Please enter the whole number: "); 

         largestNum = s.nextInt(); 

        

         System.out.println("n\tn^2\tn^3\tn^4"); 

        

         for(i = 1; i<=largestNum; i++) 
         {

                     System.out.println(i+"\t"+(int)Math.pow(i, 2)+"\t"+(int)Math.pow(i, 3)+"\t"+(int)Math.pow(i, 4));


         }
     }

}