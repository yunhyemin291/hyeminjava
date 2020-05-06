package day7;

import java.util.Scanner;

public class TestEx10 {

	public static void main(String[] args) {
		
		int size=3;
		int com[] = new int [size];
		int user[]=new int[size];
		int min =1, max=9;
		int s=0 ,b=0;					
//		printArray(com);
		Scanner scan=new Scanner(System.in);
		createArray(min,max,size,com);	
		//반복 시작(3S가 나올때까지)
		while(s != 3) {
			System.out.println("세 정수를 입력하세요: ");
			//사용자가 세 수를 입력
			int cnt =0;
			while(cnt<3) {
				
				user[cnt]=scan.nextInt();
				cnt++;
			}
			//스트라이크 판별
			s=strike(com,user);
			if(s!=0)
				System.out.print(s+"S");
			//볼을 판별
			b=ball(com,user);
			if(b!=0)
				System.out.print(b+"B");
			//3아웃 판별
			if(s==0&&b==0)
				System.out.print("3O");
			System.out.println();
		}
		System.out.println("종료!");
		
		scan.close();
		
	}		
	public static int strike(int []com,int []user) {
		int cnt=0;
		for(int i=0;i<com.length;i++) {
			if(com[i]==user[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	public static int ball(int []com,int []user) {
		int cnt=0;
		for(int tmp:com) {
			if(isDuplicated(user,tmp)) {
				cnt++;
			}
		}
		return cnt - strike(com,user);
	}
	//중복되지 않게배열3
	/* 기능:min에서 max사이의 중복되지 않는 n개의 랜덤값을 생성하여 배열에 저장하는 메서드
	 * 매개변수 : min에서 max, n개,배열=>int min int max, int n,int []arr
	 * 리턴타입:예외처리를 위해 true이면 배열생성
	 * 		false이면 배열생성 실패
	 * 메서드명:createArray
	 * 예를 들면 min=1,max=3이고, n=4인 경우 min-max사이의 중복되지 않은 랜덤한 수는 총 3개인데
	 * 4개를 만들어야 하니 1개를 만들수가 없어서 무한루프에 빠진다.
	 * 번지 0 1 2 3
	 * 값 1 3 2
	 * r 1 3 1 3 1 2
	 * ,max - min+1>= n이면 배열 생성 가능, 아니면 배열 생성 실패
	 * */
	
	public static boolean createArray(int min,int max,int n,int []arr) {
		if(arr==null) 
			return false;
		if(max-min+1<n)
			return false;
		int cnt = 0;//현재 배열에 저장된 갯수
		while(cnt<n) {
			int r= random(min,max);
			if(!isDuplicated(arr,r)) {
				arr[cnt++]=r;
			}
		}
		return true;
	}
	
	//배열 랜덤 설정2
	public static int random(int max,int min) {
		
		if(min>max) {
			int tmp=min;
			min=max;
			max=tmp;			
		}
		return (int)(Math.random()*(max-min+1)+min);
		
	}
	//배열출력4
//	public static void printArray(int []arr) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		
//	}
	//배열만듬1
	public static boolean isDuplicated(int []arr,int num) {		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;	
			}			
		}
		return false;
	}
}
