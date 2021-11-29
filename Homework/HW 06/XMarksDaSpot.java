package homework;

import java.util.Scanner;

public class XMarksDaSpot {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = console.nextInt();


        for(int row=0;row<N;row++){
            System.out.println();
            for(int col=1;col<=2*N+1;col++){
                if(col==row+1 || col==2*N+1-row){
                    System.out.print("* ");
                }else{
                    System.out.print(". ");
                }
            }

        }
        System.out.println();
        for(int col=1;col<=2*N+1;col++){
            if(col==N+1){
                System.out.print("* ");
            }else{
                System.out.print(". ");
            }
        }
        for(int row=1;row<=N;row++){
            System.out.println("          ");
            for(int col=1;col<=2*N+1;col++) {
                if(col==N+1-row || col==N+1+row){
                    System.out.print("* ");
                }else{
                    System.out.print(". ");
                }

            }
        }
    }
}