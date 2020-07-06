package day53;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요:");
		int num=scan.nextInt();
		int i=1;
		while(i<=9) {
			System.out.println(num+" * "+ i +" = "+ num*i++);
		}
		
		char ch=' ';
		while(ch!='y'&&ch!='Y') {
			System.out.print("문자를 입력하세요: ");
			ch=scan.next().charAt(0);
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
