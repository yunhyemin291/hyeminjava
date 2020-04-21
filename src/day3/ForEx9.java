package day3;

public class ForEx9 {

	public static void main(String[] args) {
		/* *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* *		i=1
		 * **		i=2
		 * ***		i=3
		 * ****		i=4
		 * *****	i=5
		 */
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*     *	i=1 공=4
		 *    **	i=2 공=3
		 *   ***	i=3 공=2
		 *  ****	i=4 공=1
		 * *****	i=5 공=0
		 * 				공=5-i
		 */
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
