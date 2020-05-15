package day17;

import java.util.*;

public class VariableEx2 {
		/* 
		 * 객체 멤버 변수: 대부분의 사용자 클래스의 멤버변수는 객체 멤버변수이다.
		 * 클래스 멤버 변수: 
		 * 멤버 변수(클래스,객체):의미있는 정보를 클래스 안에 선언할 때 사용하는 변수
		 * 					해당정보가 메소드 곳곳에서 사용될 때
		 * 지역 변수: 메소드를 실행하는데 있어서 자체적으로 사용하는 변수
		 * 			외부에서 알려주는 정보와 상관 없음
		 * 매개 변수: 메소등서 기능을 실행하는데 있어 필요한 정보
		 */
	public static void main(String[] args) {
	
	}

}class ClassRoom{
	int cnt=0;//강의장의 학생 수
	int maxCnt=20;//강의장 정원
	String classNum="401호";//강의장 번호
	List<String> courseNameList=new ArrayList<String>();//강의장의 강의 리스트
	int i =0;//메소드에서 반복문을 이용할 때 사용할 변수=>멤버 변수로 만드는 것은 부적절
}