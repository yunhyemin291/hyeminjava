package day22;

public class TestEx3 {

	public static void main(String[] args) {
		/*-배열에서 가장 큰 값을 출력하는 예제를 이용하여 배열에서 가장 큰값을 반환하는 메소드를 생성하고   
		 * main메소드에서 테스트해보세요.*/
		int[]arr= new int[5];
		int cnt=0;
		while(cnt<arr.length) { 
			int random = (int)(Math.random()*(10))+1; 
			int i = 0; 
			while(i<cnt) { 
				if(random==arr[i]) 
					break; 
				i++; 
			} 
			if(i==cnt) { 
				arr[cnt]=random; 
				cnt++; 
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		
		System.out.println("가장 큰 수: "+maxNum(arr));	
		
	}
	/*기능:배열에서 가장 큰 정수를 반환함
	 * 매개변수:배열=>arr
	 * 리턴타입:int
	 * 메소드명:maxNum
	 * */
	public static int maxNum(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) 
				max=arr[i];
		}
		return max;
	}

}
