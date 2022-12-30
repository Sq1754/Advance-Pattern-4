import java.util.Scanner;

public class Q11 {
public static void main(String[]args) {
		
		// Q11 print diamond or rhombus
	/*
	 *         *
	 *        ***
	 *       *****
	 *      *******
	 *      *******
	 *       *****
	 *        ***
	 *         *
	 *         
	 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give row number");
		int rows = sc.nextInt();
		// upper half
		for(int i=1;i<=rows;i++) {
			// spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
	

	// stars
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// lower half
		for(int i=rows;i>=1;i--) {
			// spaces
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			// stars
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
