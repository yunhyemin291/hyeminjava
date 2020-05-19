package day18;

import java.util.*;

public class TestEx3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("성적을 입력하세요(0~100): ");
		int score=scan.nextInt();
		String grade=grade(score);
		if(grade.equals("X")) {
			System.out.println("올바른 점수가 아닙니다.");
		}else
			System.out.println(grade+" 학점입니다.");
		try {
			System.out.println(grade2(score)+" 학점입니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(StudentScore(score));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		scan.close();
	}
	public static char StudentScore(int scr) {
		if(scr>=90&&scr<=100) 
			return 'A';
		if(scr>=80&&scr<90) 
			return 'B';
		if(scr>=70&&scr<80) 
			return 'C';
		if(scr>=60&&scr<70) 
			return 'D';
		if(scr>=0&&scr<60) 
			return 'F';

		throw new ArithmeticException("예외: 0이상 100이하의 숫자를 입력하세요");
		
	}
	/* 기능: 정수 성적이 주어지면 성적에 맞는 학점을 알려주는 메소드(올바른 성적이 아닌 경우 X)
	 * 매개변수:정수 성적 =>int score
	 * 리턴타입:학점(추후 +를 추가할수도 있기 때문에)=>String
	 * 메소드명:grade
	 * */
	/**
	 * 
	 * @param score: 정수 성적
	 * @return:성적에 맞는 학점으로 A,B,C,D,F학점과 올바르지 않을 때의 학점 X를 반환
	 */
	public static String grade(int score) {
		if(score<0||score>100) return "X";
		if(score>=90) return "A";
		if(score>=80) return "B";
		if(score>=70) return "C";
		if(score>=60) return "D";
		return "F";
		
	}
	public static String grade2(int score) {
		if(score<0||score>100) 
			throw new ArithmeticException("올바른 점수가 아닙니다.");
		if(score>=90) return "A";
		if(score>=80) return "B";
		if(score>=70) return "C";
		if(score>=60) return "D";
		return "F";
		
	}
	
}
