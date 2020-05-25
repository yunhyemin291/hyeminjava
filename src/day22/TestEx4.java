package day22;

public class TestEx4 {

	public static void main(String[] args) {
		/* -배열이 주어지면 주어진 배열의 평균을 구하는 메소드
		 * 배열이주어지면 주어진 배열의 합을 구하는 메소드를 생성하여
		 * main메소드에서 테스트해보세요.
		 * */
		int []arr=new int[5];
		System.out.print("배열: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			if(i==arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+", ");
		}
		System.out.println();
		System.out.printf("배열의 합: %d, 평균: %.2f",add(arr),average(arr));

	}
	/*기능:주어진 배열의 합을 구하여 반환하는 메서드
	 * 매개변수:배열=>int []arr
	 * 리턴타입:합=>int sum
	 * 메소드명:add
	 * */
	public static int add(int []arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	/*기능:주어진 배열의 평균을 구하여 반환하는 메서드
	 * 매개변수:배열=>int []arr
	 * 리턴타입:평균=>double res
	 * 메소드명:average
	 * */
	public static double average(int []arr) {
		double res=add(arr)/arr.length;
		return res;
	}

}
