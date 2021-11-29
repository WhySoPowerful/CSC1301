///////////////////////////////////////////////////////////////
// Homework #04                                              //
// Name: Rafid Shaon                                         //
// Lab time: Friday - 3:00 PM                                //
// Program description: Part B - Bonus Program #3            //
///////////////////////////////////////////////////////////////

package homework;

public class NumberGrid {

	public static void main(String[] args) {
		printGrid(4, 6);
		}
	public static void printGrid(int rows, int cols) {
		for(int i=1, sum =0;i<=rows;i++) {
			sum = i;
			for(int j=1;j<=cols;j++) {
				System.out.print(sum+" ");
				sum = sum + rows;
				}
			System.out.println();
			}
		}
	}