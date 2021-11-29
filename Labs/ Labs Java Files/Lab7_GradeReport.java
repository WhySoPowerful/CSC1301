package labs;

public class Lab7_GradeReport {
	
	public static void main(String[] args) {
		try (java.util.Scanner in = new java.util.Scanner(System.in)) {
			int grade = 0;
			int tries = 0;
			int TOTAL_CHANCES = 3;
			int category = 0;
			do{
				System.out.println("Please enter the grade between 0 and 100");
				grade = in.nextInt();
				if(grade >= 0 && grade <= 100){
					category = grade / 10;
					switch(category){
					case 10: System.out.println("Perfect score job well"); break;
					case 9: System.out.println("well above average. Excellent"); break;
					case 8: System.out.println("above average Nice job"); break;
					case 7: System.out.println("average"); break;
					case 6:
					case 5:
					case 4:
					case 3:
					case 2:
					case 1:
					case 0: System.out.println("below average you should see the professor...to clarify the material presented in class..."); break;
					default: System.out.println("Invalid case"); break;              
					}	
					break;
					}
				else{
					System.out.println("Error: You must enter an integer between 0 and 100");
					tries++;
					}
				} while(tries < TOTAL_CHANCES);
			}
		}
	}