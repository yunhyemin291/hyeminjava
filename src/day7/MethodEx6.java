package day7;

public class MethodEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 20,min=10;
		System.out.println(random(max,min));
		
	}
	/*기능:min부터 max사이의 임의의 정수를 생성하여 알려주는 메서드
	 * 매개변수:최소값과 최댓값 =>max min
	 * 리턴타입:임의의 정수=>int
	 * 메서드명:random
	 * */
	public static int random(int max,int min) {
		
		if(min>max) {
			int tmp=min;
			min=max;
			max=tmp;			
		}
		return (int)(Math.random()*(max-min+1)+min);
		
	}
}
