package day4;

import java.util.Scanner;

public class ArrayEx_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("번호(1~45)중에서 번호6개를 입력하세요.: ");
//		int n1,n2,n3,n4,n5,n6;
//		int[] arr= {n1,n2,n3,n4,n5,n6};
		int[]arr=new int[6];//배열 선언과 동시에 생성
		
		for(int i=0; i<arr.length;i++ ) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		
		int[] ball =new int[45];
		for (int i=0;i<ball.length;i++)
			ball[i]=i+1;
		
		int temp=0;
		int j=0;
		
		for (int i=0;i<6;i++) {
			j=(int)(Math.random()*45);
			temp=ball[i];
			ball[i]=ball[j];
			ball[j]=temp;
		}
		for(int i=0;i<6;i++)
			System.out.printf("ball[%d]=%2d | ",(i+1),ball[i]);

	}
	
	public static boolean isDuplicated(int []arr,int num) {		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;	
			}			
		}
		return false;
	}	

}
