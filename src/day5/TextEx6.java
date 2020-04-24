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
		
	char ch='a'+1;
	
	int num = 5;
	for (int i=0;i<num;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print((char)('a'+j));
		}
		System.out.println();
		/*문자상수 a +상수 1을 하면 자료형변환이 일어나지 않고 더해지기 때문에
		 * 결과가 문자 b가 나오면 바로 문자형 ch에 저장이 가능하다
		 * */
	}
	/*ch=(char)(ch+1);
	 * 문자변수 + 상수를 하면 문자 변수ch가 정수형 int로 형변환 되어 더해지기 때문에
	 * 결과가 정수가 된다.
	 * */
	System.out.println(ch+1);
	System.out.println((char)(ch+1));
		
		
		
		
	/*두정수를 입력하면 다음과 같이 출력되도록 작성하세요
	 * 3 5
	 *  1  2  3  4  5 
	 *  6  7  8  9 10
	 * 11 12 13 14 15*/
	int num1,num2 ;
	Scanner scan=new Scanner(System.in);
	System.out.println("두 정수를 입력하세요:");
	num1=scan.nextInt();
	num2=scan.nextInt();
	
		for (int i=1;i<=num1*num2;i++) {
			System.out.printf("%3d",i);
			if(i%num2==0) {
			System.out.println();
			}
			
		}
		
		System.out.println("----------------");
		
		System.out.println("두 정수를 입력하세요:");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		for (int i=0,cnt=1;i<num1;i++) {
			for(int j=0;j<num2;j++) {
				//System.out.printf("%3d",cnt++);
				System.out.printf("%3d",num2*i+j+1);
			}
			System.out.println();
			
		}			
		

	}

}
