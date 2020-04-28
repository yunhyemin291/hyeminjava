package day8;

public class TestEx11 {

	public static void main(String[] args) {
		//5 6 7 8 10 11 7 8 9 순서로 동작
//		int num1=1,num2=2;
//		int res = sum(num1,num2);
//		System.out.println(res);
		
		//5 12 13 19 20 16 17 20 13 14 15
		int num1=1,num2=2;
		int res=sum2(num1,num2,3);
		System.out.println(res);	
	}	
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	public static int sum2(int num1,int num2,int num3) {
		return sum(num1,num2)+num3;
	}
}
