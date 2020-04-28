package day8;

public class RecursiveEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
	}
	//팩토리얼 메소드\ 
	public static int fact(int num) {
		if(num==1||num==0)
			return 1;
		if(num<0)
			return 0;
		return num*fact(num-1);
	}
}
//5 7 10(n=5) 11 13 15
//10(n=4) 11 13 15(n=4일때 팩토리얼 호출)
//10(n=3) 11 13 15(n=3)
//10(n=2) 11 13 15(n=2)
//10(n=1) 11 12(f1을 빠져나감)
//15(f2의 15쥴을 실행하는데 이때 f2를 빠져나감)(1팩토리얼 매서드를 빠져나와 2팩토리얼의 리턴으로 이동,n=2)
//15(1팩토리얼 매서드를 빠져나와 3팩토리얼의 리턴으로 이동,n=3)
//15(1팩토리얼 매서드를 빠져나와 4팩토리얼의 리턴으로 이동,n=4)
//15(1팩토리얼 매서드를 빠져나와 5팩토리얼의 리턴으로 이동,n=5)
//7(5팩토리얼의 값이 계산되어 나옴)
//8

