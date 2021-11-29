package labs;

import java.util.Random;
import java.util.Scanner;

public class Blackjack_Jr {

   public static void main(String[] args) {
       int card1;
       int card2;
       int player1;
       int dealer;
       Random rand = new Random();
       int card3 = rand.nextInt(11);
       int card4 = rand.nextInt(11);
       try (Scanner in = new Scanner(System.in)) {
		System.out.println("Blackjack Jr!");
		   System.out.println();
		   System.out.print("Pick Your First Card from 1-10: ");
		   card1 = in.nextInt();

		   while (!(card1 >= 1 && card1 <= 10)) {

		       System.out.print("Invalid number please reenter number: Pick Your First Card from 1-10: ");
		       card1 = in.nextInt();
		   }
		   System.out.print("Pick Your Second Card from 1-10: ");
		   card2 = in.nextInt();

		   while (!(card2 >= 1 && card2 <= 10)) {

		       System.out.print("Invalid number please reenter number: Pick Your Second Card from 1-10: ");
		       card2 = in.nextInt();
		   }
	}

       System.out.println();
       player1 = card1 + card2;
       dealer = card3 + card4;

       System.out.print("You drew " + card1);
       System.out.println(" and " + card2+".");
       System.out.println("Your total is " + player1+".");
       System.out.println();

       System.out.print("The dealer has " + card3);
       System.out.println(" and " + card4+".");
       System.out.println("Dealer's total is " + dealer+".");
       System.out.println();
       
       if (player1 > dealer) {
           System.out.println("YOU WIN!");
       } else {
           System.out.println("YOU LOSE!");
       
       }

   }

}