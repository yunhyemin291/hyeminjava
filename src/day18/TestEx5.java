package day18;

import java.util.*;

public class TestEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*-정수가 주어졌을 때 해당 정수가 소수인지 아닌지 출력하는 코드를 작성하세요. 단 메소드를 생성하여 작업할 것
		 * -두 정수가 주어졌을때 두 정수의 최대 공약수가 1이면 서로소라고 출력하고,
		 *  서로소가 아니면 서로소가 아님 아니라고 출력하는 코드를 작성하세요. 단 메소드를 생성하여 작업할 것
		 * */
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num1=scan.nextInt();
		try {
			if(isPrime(num1)) {
			System.out.println(num1+"는 소수 입니다.");
			}else {
			System.out.println(num1+"는 합성수 입니다.");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		primeNumber(7);
		coprime(2,8);

	}
	public static void primeNumber(int n1) {
		int cnt =0;
		for(int i=1;i<=n1;i++) {
			if(n1%i==0)
				cnt++;
		}
		if(cnt==2) {
			System.out.println("소수 입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
	}
	public static void coprime(int n1,int n2) {
		int cnt=0;
		for(int i=1;i<=n2;i++) {
			if(n1%i==0&&n2%i==0) {
				cnt++;
			}
		}
		if(cnt==1) {
			System.out.println("서로소 입니다.");
		}else {
			System.out.println("서로소가 아닙니다.");
		}
	}
	/*기능: 정수가 소수이면 true를 소수가 아니면 false를 반환하는 메소드
	 * 매개변수:정수=>int num
	 * 리턴타입:true 아니면 false=>boolean
	 * 메소드명:isPrime
	 * */
	public static boolean isPrime(int num) {
		if(num==1) {
			throw new ArithmeticException("예외: 1은 소수도 아니고 합성수도 아닙니다.");
		}
		if(num<1)
			throw new ArithmeticException("예외: 음수와 0은 소수 판별을 할 수 없습니다.");
		for(int i=2;i*i<=num;i++) {
			//i가 num의 약수이면, num가 i의 배수이면
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}	