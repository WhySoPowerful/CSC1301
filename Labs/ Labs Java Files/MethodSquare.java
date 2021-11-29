package labs;

public class MethodSquare {
	
	public static void main(String[] args) {
		printSquare(3,6);
	}
	public static void printSquare(int min, int max) {
		int difference = max-min;
		for (int i = 0; i <= difference; i++) {
			for (int j = 0; j <= (difference); j++) {
				System.out.print((j+i)%(difference+1)+ min);
			}
			System.out.println("");
		}

	}

}
