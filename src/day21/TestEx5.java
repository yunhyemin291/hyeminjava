package day21;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		//5개짜리 배열을 만들어서 배열에 5개의 정수를 입력한 후, 
		//입력한 정수중에 가장 큰 수를 출력하는 코드를 작성하세요
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 5개를 입력하세요: ");
		int[]arr=new int[5];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("가장 큰 수: "+max);
		scan.close();
	}

}
