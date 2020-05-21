package day21;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		// 세 정수를 입력받아 입력받은 정수의 합과 평균을 구하세요. 평균은 소수점 2째자리까지 출력
		Scanner scan=new Scanner(System.in);
		System.out.print("세 정수를 입력하세요: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();		
		System.out.printf("합: %d, 평균:%.2f\n",a+b+c,(double)(a+b+c)/3);
		
		
		
		int sum=0;
		double res=0.0;
		System.out.print("세 정수를 입력하세요: ");
		for(int i=1;i<=3;i++) {
			sum+=scan.nextInt();
		}
		res=sum/3.0;
		System.out.print("합: "+sum);
		System.out.printf(" 평균: %.2f",res);
		scan.close();
	}

}
