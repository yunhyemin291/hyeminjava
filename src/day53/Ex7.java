package day53;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("두 정수를 입력하세요: ");
		int min=scan.nextInt();
		int max=scan.nextInt();
		System.out.println(min+"부터 "+max+" 까지의 합: "+sum(min,max));
	}
	public static int sum(int min, int max) {
		int res = 0;
		for(int i = min ;i<=max;i++) {
			res+=i;
		}
		return res;
	}

}
