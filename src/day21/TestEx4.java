package day21;

import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		// -5개짜리 배열을 만들어서 배열에 5개의 정수를 입력한 후, 입력한 정수의 합과 평균을 구하세요.
		//(반복문과 배열을 꼭 이용)
		Scanner scan=new Scanner(System.in);
		int[] arr= new int[5];
		int sum = 0;
		double res;
		System.out.print("다섯 정수를 입력하세요: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			sum+=arr[i];
		}
		res=sum/arr.length;
		System.out.print("합: "+sum);
		System.out.printf(" 평균: %.2f\n",res);
		scan.close();
		
	}

}
