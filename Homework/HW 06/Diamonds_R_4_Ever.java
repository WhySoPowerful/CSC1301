package homework;

import java.util.Scanner;
public class Diamonds_R_4_Ever {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = console.nextInt();
        
        for(int row=0;row<N;row++){
            System.out.print("          ");
            printCharTimes('.',N-row);
            printCharTimes('*',row*2+1);
            printCharTimes('.',N-row);
            System.out.println();
        }
        System.out.print("          ");
        printCharTimes('*',2*N+1);
        System.out.println();
        for(int row=N-1;row>=0;row--) {
            System.out.print("          ");
            printCharTimes('.',N-row);
            printCharTimes('*',row*2+1);
            printCharTimes('.',N-row);
            System.out.println();

        }
    }
    private static void printCharTimes(char c, int times){

        for (int i=1;i<=times;i++){
            System.out.print(c+" ");
        }
    }
}