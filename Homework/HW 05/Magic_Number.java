///////////////////////////////////////////////////////////////
// Solution to Programming Project 3 Homework #5             //
// Name: Rafid Shaon                                         //
// Lab time: Friday - 3:00 PM                                //
// Program description: Program #3                           //
///////////////////////////////////////////////////////////////

package homework;

import java.util.Scanner;

import java.lang.Math;

public class Magic_Number

{

    public static void main(String args[])

    {

        int random_number = 0, guessed_number;

        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

        // define the range

        int max = 100;

        int min = 1;

        int range = max - min + 1;

        // generate random numbers within 1 to 10

        for (int i = min; i <= max; i++)

            random_number = (int)(Math.random() * range) + min;

        // taking input from user

        System.out.println("Enter a guess: ");

        guessed_number = input.nextInt();

        // printing the guessed number and the magic number

        System.out.println("\nThe secret number is: "+ random_number);

        System.out.println("Your guessed number is: "+guessed_number);

        // condition to check if guess is correct or not

        if(random_number == guessed_number)

            System.out.println("\nCongratulations! Your guess is correct.");

        else if(guessed_number < random_number)

            System.out.println("\nYour guess is smaller than the secret number.");

        else

            System.out.println("\nYour guess is bigger than the secret number.");

    }

}