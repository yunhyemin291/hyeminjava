package day22;

public class TestEx1 {

	public static void main(String[] args) {
		/* 정수 start와 정수 end가 주어지면 start부터 end까지의 합을 반환하는 메소드를 생성하고,
		 * main메소드에서 테스트해보세요.
		 * */
			
		System.out.println(sum(2,5));

	}
	/*기능:정수 start와 정수 end가 주어지면 start부터 end까지의 합을 반환
	 * 매개변수:두 정수=>int start,int end
	 * 리턴타입:정수의 합=>int
	 * 메서드명:sum
	 */
	public static int sum(int start,int end) {
		int res=0;
		for(int i=start;i<=end;i++) {
			res+=i;
		}
		return res;
	}

}
