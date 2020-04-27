package day7;

public class MethodEx5 {

	public static void main(String[] args) {
		int num=7;
		
		if(isPrime1(num)) {
			System.out.println(num+"은 소수입니다.");			
		}else {
			System.out.println(num+"은 소수가 아닙니다.");
		}
		if(isPrime2(num)) {
			System.out.println(num+"은 소수입니다.");			
		}else {
			System.out.println(num+"은 소수가 아닙니다.");
		}

	}
	/* 기능:주어진 정수가 소수인지 아닌지 알려주는 메서드
	 * 매개변수:정수=> num
	 * 리턴타입:소수인지아닌지=>boolean
	 * 메서드명:isPrime
	 * */
	public static boolean isPrime1(int num) {
		int cnt=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				cnt++;		
		}
		if(cnt==2)
			return true;
		
		return false;
	}
	public static boolean isPrime2(int num) {
		if(num==1)
			return false;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) 
				return false;			
		}
		return true;			
	}
	
}
