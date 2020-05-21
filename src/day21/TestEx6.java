package day21;

public class TestEx6 {

	public static void main(String[] args) {
		// 9개 짜리 배열을 만들어서 2단의 결과를 배열에 저장하는 코드를 작성하세요
		//0 1 2 3 4 5 6 7 8 
		//2 4 6 8 10 12 14 16 18
		int[]arr=new int[9];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(i+1)*2;
			System.out.printf("%3d",arr[i]);
		}
		System.out.println();
		for(int i=1;i<=9;i++) {			
			System.out.printf("2 *%2d=%3d\n",i,2*i);
		}
				
	}

}
