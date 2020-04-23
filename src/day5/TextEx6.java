package day5;

import java.util.Scanner;

public class TextEx6 {

	public static void main(String[] args) {
	/*다음과 같이 출력되도록 코드를 작성하세요
	 * a
	 * ab
	 * abc
	 * abcd
	 * abcde*/
		
	char chr;
	for (int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			
		}
	}
		
		
		
		
	/*두정수를 입력하면 다음과 같이 출력되도록 작성하세요
	 * 3 5
	 *  1  2  3  4  5 
	 *  6  7  8  9 10
	 * 11 12 13 14 15*/
	int num1,num2 ;
	Scanner scan=new Scanner(System.in);
	System.out.print("두 정수를 입력하세요:");
	num1=scan.nextInt();
	num2=scan.nextInt();
	
		for (int i=1;i<=num1*num2;i++) {
			if(i%num2==0) {System.out.println();
			}
			System.out.printf("%3d",i);
			}
//i가 num2의 배수이면 줄을바꾼다 num1회 반복
			
		

	}

}
