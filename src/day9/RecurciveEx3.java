package day9;

public class RecurciveEx3 {

	public static void main(String[] args) {
		ClassB b=new ClassB();
		b.print(5);
		
		
		System.out.println(sum(100));
		System.out.println(sum(-1,10));
	}
	//1부터 10까지 합을 구하는 코드를 재귀메서드로 작성해보세요
	
	public static int sum (int num){
		if(num<0) return 0;
		if(num==1) {
			return 1;
		}
		return num + (sum(num-1));
		
	}
	/*
	 * sum(1,10):1에서 10까지의 합
	 * 10+sum(1,9):1에서 9까지의 합+10
	 * 
	 * */
	public static int sum(int min,int max) {
		if(min>max)
			return 0;
		if(max==min) {
			return min;
		}
		return max+sum(min,max-1);
	}
	

}
class ClassA{
	public void print() {
		System.out.println("A클래스 입니다.");
	}
}
class ClassB extends ClassA{
	//printf메서드를 오버라이딩
	public void print() {
		//printf();//재귀 호출이 되어 스택 오버플로우 에러가 발생한다.
		super.print();//목적에 맞게 부모 클래스를 의미하는 super를 붙여줘야한다.
		System.out.println("B클래스 입니다.");
	}
	//print 메서드를 오버 로딩
	public void print(int num) {
		print();
		System.out.println("B클래스 입니다.");
	}
}
