package day17;

import java.util.Scanner;

public class MethodEx1 {

	public static void main(String[] args) {
		/* main 메서드 부터 실행 순서를 줄수로 표현하세요
		 * 10-19>16>46-54>38-39>54>19
		 * */
		Scanner scan=new Scanner(System.in);
		System.out.print("두 정수와 산술연산자를 입력하세요(예:1 + 2): ");
		int num1,num2;
		char op;
		try {
			num1=scan.nextInt();
			op=scan.next().charAt(0);
			num2=scan.nextInt();
			System.out.printf("%d %c %d = %.1f\n",num1,op,num2,calc(num1,op,num2));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}		
		scan.close();
	}
	//기능: 두 정수의 합을 반환하는 메소드
	public static int sum(int n1,int n2) {		
		return n1+n2;
	}
	//기능: 두 정수의 차를 반환하는 메소드
	public static int sub(int n1,int n2) {		
		return n1-n2;
	}
	//기능: 두 정수의 곱를 반환하는 메소드
	public static int mul(int n1,int n2) {		
		return n1*n2;
	}
	//기능: 정수a를 정수b로 나눈 결과를 반환하는 메소드
	public static double div(int n1,int n2) {		
		return (double)n1/n2;
	}
	//기능: 정수a를 정수b로 나눈 나머지를 반환하는 메소드
	public static int mod(int n1,int n2) {		
		return n1%n2;
	}
	//기능:  정수a와 정수b를 산술연산자 op의 결과로 반환하는 메소드
	public static double calc(int n1,char op,int n2) {
		switch(op) {
		case '+': return sum(n1,n2);
		case '-': return sub(n1,n2);
		case '*': return mul(n1,n2);
		case '/':
			if(n2==0)throw new ArithmeticException("예외 발생: 0으로 나눌 수 없습니다.");
			return div(n1,n2);
		case '%': 
			if(n2==0)throw new ArithmeticException("예외 발생: 0으로 나눌 수 없습니다.");
			return mod(n1,n2);
		default:
			throw new ArithmeticException("예외 발생: "+op+"는 산술 연산자가 아닙니다.");
		}
	}

}
