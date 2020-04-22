package day4;

public class TestEx3 {

	public static void main(String[] args) {
		/* 1. 정수 10개를 저장할 수 있는 배열을 선언하고 생성하세요
		 * 2. 1부터 10까지 차례대로 배열에 저장하세요
		 * 3. 저장된 배열의 값을 출력하세요.
		 * 4. 인덱스(번지)가 짝수이면 현재 저장된 수에 2를 곱해서 저장하세요
		 * 5. 저장된 배열의 값을 다시 출력하세요
		 */
		
		
		int arr[]=new int[10];//=>1.배열의 선언 및 생성
		for(int i=0;i<arr.length;i++) {  //=>2.반복문을 이용하여 0번지에는 1, 1번지에는 2,..9번지에는 10을 저장하도록 한다.
			arr[i]=i+1;		
		}
		//3.0번지 부터 9번지까지 배열의 값을 출력
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%2d ",arr[i]);
		}
		System.out.println();
		
		for(int i=2;i<arr.length;i+=2) {
			arr[i]=arr[i]*2;
			//arr[i]*=2;
		}
		for(int tmp:arr) {
			System.out.printf("%2d ", tmp);
		
		}
		System.out.println();		
		
	
	}

}
