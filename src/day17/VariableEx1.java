package day17;

public class VariableEx1 {
	static int num1;//클래스 멤버 변수,일반 변수
	static A a1;//참조 변수,클래스 변수
	int num2;//일반 변수,객체 변수
	A a2;//객체 변수,참조 변수
	
	
	public static void main(String[] args) {//매개 변수,참조 변수
		int num3;//지역 변수,일반 변수
		A a3;//참조 변수, 지역 변수
		a3=new A();
		a3.num=10;
	}
	
	public static void test(int num1,A a1) {//매개 변수,일반 변수//매개 변수,참조 변수
		
	}
	public void test() {
		a2=new A();
	}

}
class A{
	int num;
}
/* 멤버 변수
 * -객체 멤버 변수: static이 없는 멤버 변수, 각 객체들이 공유하지 않는 변수, 클래스 안의 객체 메소드 안에서 선언 없이 사용가능
 * -클래스 멤버 변수: static이 있는 멤버 변수, 각 개체들이 공유하는 변수, 클래스 안의 객체 메소드 안에서 선언 없이 사용가능
 * 지역 변수: 메소드 안에서 선언 되는 변수들(매개 변수 포함)로 해당 지역에서만 사용 가능
 * 매개 변수: 메소드 선언부에서 ()안에 들어가는 변수들, 메소드를 실행하는데 있어 필요한 정보
 * 		,매개변수는 지역변수
 * 일반 변수: 자료형이 int와 같은 기본 자료형인 변수들
 * 참조 변수: 일반 변수가 아닌 변수로 클래스의 객체나 배열등이 있으며, 주소를 저장
 * */
 