package day54;


public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			calc(1,0,'?');
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	public static double calc(double num1,double num2,char op) throws Exception {
		switch(op) {
		case '+': return num1+num2;
		case '-': return num1-num2;
		case '*': return num1*num2;
		case '/' :
			if(num2 ==0) 
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			
			return num1/num2;
		case '%':
			if(num2==0)
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			return num1%num2;
		default:
			throw new Exception(op+"는 산술연산자가 아닙니다.");
		}
	}

}
