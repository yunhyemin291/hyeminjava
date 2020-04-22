package day4;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		/*  두 정수와 문자하나를 입력받아 출력하는 코드를 작성하세요.
		 *  두 정수와 문자 하나를 입력받아
		 *  =>정수형변수 2개를 선언하고, 문자형 변수 1개를 선언후 Scanner를 통해
		 *  정수와 문자를 입력받을 수 있다
		 * 출력하는 =>system.out.println을 활용할 수 있다.
		 */
		
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		//char op;
		/*String str;
		
		System.out.println("두 정수와 문자하나를 입력하세요(예:1 + 2) :");
		num1 =scan.nextInt();
		//op =scan.next().charAt(0);
		str=scan.next();
		num2 =scan.nextInt();
		System.out.println("출력 :");
//		System.out.println(""+num1+" "+op+" "+num2);
//		System.out.printf("%d %c %d\n",num1,op,num2);
		System.out.println(""+num1+" "+str+" "+num2);
		System.out.printf("%d %s %d\n",num1,str,num2);*/

		/*입력받은 문자가 +이면 두수의 합을 출력하고
		* -이면 두 수의 차를 출력하고
		* *이면 두 수의 곱한 결과를 출력하고
		* %이면 두수의 나머지 결과를 출력하는 코드를 작성하세요.
		*/
		
		char op;
		System.out.println("두 정수와 산술연산자(+,-,*,/,%)를 입력하세요(예:1 + 2):");
		num1 =scan.nextInt();
		op =scan.next().charAt(0);
		num2 =scan.nextInt();
		scan.close();
		
		
		if(op=='+') {
			System.out.printf("%d + %d = %d\n", num1,num2,num1+num2);		
		} else if(op=='-') {
			System.out.printf("%d - %d = %d\n", num1,num2,num1-num2);
		} else if(op=='*') {
			System.out.printf("%d × %d = %d\n", num1,num2,num1*num2);
		} else if(op=='/') {
			System.out.printf("%d ÷ %d = %.2f\n", num1,num2,(double)num1/num2);
		} else if(op=='%') {
			System.out.printf("%d %% %d = %d\n", num1,num2,num1%num2);	
		} else {
			System.out.println(op+"는 올바른 부호가 아닙니다.");
		}
		
		switch(op) {
		case '+':
			System.out.printf("%d + %d = %d\n", num1,num2,num1+num2);
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", num1,num2,num1-num2);
			break;
		case '*':
			System.out.printf("%d × %d = %d\n", num1,num2,num1*num2);
			break;
		case '/':
			System.out.printf("%d ÷ %d = %.2f\n", num1,num2,(double)num1/num2);
			break;
		case '%':
			System.out.printf("%d %% %d = %d\n", num1,num2,num1%num2);
			break;	
		default:
			System.out.println(op+"는 산술연산자가 아닙니다.");
		}

	}

}
