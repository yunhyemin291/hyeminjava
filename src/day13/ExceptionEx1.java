package day13;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			int arr[]=new int[4];
			//예외가 발생하면 그 이후 코드는 실행되지 않고 catch로 건너뛴다.
			arr[4]=10;
			System.out.println("Hello");
		}
		catch(ClassCastException e) {
			//예외처리
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e) {
			//예외처리
			System.out.println("배열 관련 예외가 발생");
			//e.printStackTrace();
		}
		catch(Exception e) {
			//예외처리
			System.out.println("예외 발생");
		}
	}

}
