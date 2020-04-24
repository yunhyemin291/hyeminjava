package day6;

import java.util.Scanner;

public class TestEx7 {

	public static void main(String[] args) {
		// 문자를 입력받아 출력하는 과정 소문자q가 입력되고 종료합니다가 출력되기 전까지 반복하세요
		// 
						
		Scanner scan=new Scanner(System.in);
		
		char ch;
		
		while(true) {
			System.out.print("문자를 입력하세요:");
			ch = scan.next().charAt(0);
			
			if(ch!='q') 
				System.out.println("입력받은문자:"+ch);
			else {
				System.out.println("종료합니다.");	
				break;
			}
		}
		scan.close();
	}

}

