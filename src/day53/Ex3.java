package day53;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요:");
		int num=scan.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(num+" * "+i+" = "+ num*i);
		}
		
		char ch=' ';
		for(;ch!='y'&&ch!='Y';) {
			System.out.print("문자를 입력하세요: ");
			ch=scan.next().charAt(0);
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
