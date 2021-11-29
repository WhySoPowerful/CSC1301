package labs;

public class Number_Calculations {
	public static void main(String[] args) {
		int x=21;
		double y=3.3;
		System.out.println ("My age is " +x);
		System.out.println ("Twice my age is " +(x*2));
		System.out.println ("Three times my age is " +(x*3));
		System.out.println ("Half of my age is " +(x*.5));
		System.out.println ("My gpa is " +y);
		System.out.println ("Half my gpa is "+String.format("%.11f", y/2));
	}

}
