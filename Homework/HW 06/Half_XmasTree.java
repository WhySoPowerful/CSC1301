package homework;

import java.util.Scanner;
public class Half_XmasTree {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the desired number of rows :");
        int n = scan.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}