package day22;

public class TestEx2 {

	public static void main(String[] args) {
		/* -구구단을 2단에서 9단까지 출력하는 코드를 작성하세요
		 * -구구단을 2단에서 9단까지 출력하는 메소드를 만들고, 이를 main에서 테스트하세요.
		 * */
		timesTable(2,11);

	}
	/*기능:구구단을 start단에서 end단까지 출력
	 * 매개변수:start단, end단=>int start,int end
	 * 리턴타입:없음
	 * 메서드명:timesTable
	 * */
	public static void timesTable(int start,int end) {
		for(int i=start;i<=end;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%d × %d = %2d\n",i,j,i*j);
				}
			if(i!=end)
				System.out.println("------------");
		}
	}

}
