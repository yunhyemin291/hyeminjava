package day3;

import java.util.Scanner;

public class WhileEx_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int sum=0;
		boolean flag=true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");
		
		while(flag) {
			System.out.print(">>");
			
			
			num=scanner.nextInt();
			
			
			if(num!=0) {
				sum +=num;
			}else {
				flag=false;
			}
		}
		System.out.println("합계 :"+sum);
		

		scanner.close();
		

	}

}
