package day18;

import java.util.*;

public class TestEx7 {

	public static void main(String[] args) {
		/* 정수 n개를 입력받아 저장하고, 저장된 n개의 정수를 거꾸로 출력하는 코드를 작성하세요.
		 * 예)
		 * 입력받을 정수의 갯수 :5
		 * 정수 5개를 입력하세요: 1 2 3 4 5
		 * 입력 받은 정수를 거꾸로 출력:5 4 3 2 1
		 * */
		Scanner scan=new Scanner(System.in);
		Stack<Integer> arr=new Stack<Integer>();
		//List<Integer> arr=new ArrayList<Integer>();
		int size=0;
		System.out.print("입력 받을 정수의 갯수: ");
		size=scan.nextInt();
		System.out.print("정수 "+size+"개를 입력하세요: ");
		for(int i=0;i<size;i++) {
			int tmp=scan.nextInt();
			arr.push(tmp);
		}
		System.out.print("입력받은 정수를 거꾸로 출력: ");
//		for(int i=(arr.size())-1;i>=0;i--) {
//			System.out.print(arr.get(i)+" ");
//		}
		Stack<Integer> tmp=new Stack<Integer>();
		tmp.addAll(arr);
		for(int i=size-1;i>=0;i--) {
			System.out.print(tmp.pop()+" ");
		}
		
		scan.close();
	}

}
