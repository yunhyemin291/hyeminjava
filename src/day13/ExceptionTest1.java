package day13;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		/* 반복문을 통해 문자를 입력받고 입력받은 문자가 1이면 1입니다라는 예외를 발생시키는 코드를
		 * 작성하세요.
		 * 예)
		 * 문자를 입력하세요 : a
		 * 문자를 입력하세요 : b
		 * 문자를 입력하세요 : 1
		 * 예외가 발생했습니다. : 1 
		 */
		char ch;
		Scanner scan=new Scanner(System.in);
		
		
		try {
			for(;;) {
				System.out.println("문자를 입력하세요 : ");
				ch=scan.next().charAt(0);
				if(ch=='1') {
					throw new Exception("예외가 발생했습니다.:"+ch);
				}
				if(ch=='a') {
					throw new Exception("알파벳 예외입니다.");
				}
			}
			//실행문 1
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			
		}
		System.out.println("프로그램 종료합니다.");
		scan.close();
	}

}
