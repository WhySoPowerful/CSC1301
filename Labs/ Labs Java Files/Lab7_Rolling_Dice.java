package labs;

public class Lab7_Rolling_Dice {
	
	public static void main(String[] args) {
		int number1=((int)(Math.random()*6))+1;
		int number2=((int)(Math.random()*6))+1;
		System.out.println("The first die comes up "+number1);
		System.out.println("The second die comes up "+number2);
		System.out.println("Your total roll is "+(number1+number2));
		if ( number1+number2 > 6) {
			System.out.println ("Total roll is greater than 6");
			}
		else
			if ( number1+number2 < 6) {
				System.out.println ("Total roll is less than 6");
				}
		}
	}