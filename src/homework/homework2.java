package homework;

public class homework2 {

	public static void main(String[] args) {
		/* -두 정수의 최대 공약수를 구하는 메소드를 생성하고,main에서 테스트 하시오
		 * -두 정수의 최대 공약수 메소드를 이용하여 두 정수의 최소공배수를 구하는 메소드를 생성하고, main에서 테스트 해보시오
		 * 최대 공약수가 g,두 정수가 A,B라고 하면 최소 공배수 I는 다음과 같다.
		 * */
		int a=8,b=12;
		System.out.println(GreatestCommonFactor(a,b));

	}
	
	public static int GreatestCommonFactor (int n1,int n2) {
		int g=0;
		for(int i=1;i<=n1;i++) {
			if(n1%i==0 && n2%i==0) {
				g=i;
			}
		}
		return g;
	}

}
