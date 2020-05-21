package day21;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		// 두 정수를 입력받아 큰 수를 출력하는 코드를 작성하세요
		Scanner scan=new Scanner(System.in);
		System.out.print("두 정수를 입력하세요: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>b) 
			System.out.println("큰 수는 "+a+"입니다.");
		else 
			System.out.println("큰 수는 "+b+"입니다.");
		scan.close();
	}

}
