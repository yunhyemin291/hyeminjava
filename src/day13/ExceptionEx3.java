package day13;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.println(calc(1,'%',0));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static double calc(int num1,char op,int num2) 
			throws Exception, ArithmeticException{
		double res =0.0;
		switch(op) {
		case'+':			res=num1+num2; break;
		case'-':			res=num1-num2; break;
		case'*':			res=num1*num2; break;
		case'/':
			if(num2==0)throw new ArithmeticException("0으로 나눌 수 없습니다.");
			res=num1/num2; break;
		case'%':
			if(num2==0)throw new ArithmeticException("0으로 나눌 수 없습니다.");
			res=num1%num2; break;
		default:
			throw new Exception(op+"는 산술연산자가 아닙니다.");
		}
		return res;
		
	}

}
