package day53;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		/* 성적을 정수로 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * A+:100~95
		 * A:94~90
		 * B+:89~85
		 * B+84~80
		 * C+:79~75
		 * C:74~70
		 * D+:69~65
		 * D:64~60
		 * F:0~59 */
		Scanner scan=new Scanner(System.in);
		System.out.print("성적을 입력하세요: ");
		int score=scan.nextInt();
		char grade = 0;
		if(90 <= score && score <= 100) {
			grade='A';
		}else if(80<=score&&score<90) {
			grade='B';
		}else if(70<=score&&score<80) {
			grade='C';
		}else if(60<=score&&score<70) {
			grade='D';
		}else if(score<60){
			grade='F';
		}else {
			System.out.println("잘못된 성적입니다.");
		}
		if(grade%10>=5) {
			System.out.println("성적은 "+grade+"+ 입니다.");
		}else {
			System.out.println("성적은 "+grade+" 입니다.");
		}
		
		
	}

}
