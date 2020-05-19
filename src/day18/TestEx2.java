package day18;

import java.util.*;

public class TestEx2 {

	public static void main(String[] args) {
		/* 1.성적을 입력받아 입력받은 성적이 어떤 학점인지 판별하는 코드를 작성하세요.
		 * A:90이상 100이하
		 * B:80이상 90미만
		 * C:70이상 80미만
		 * D:60이상 70미만
		 * F:0이상 60미만
		 * 2. 1번에서 작성한 내용을 메소드로 만드세요.
		 * 3.영어사전을 프로그램으로 만들려고 한다 이때 단어를 저장할 수 있는 클래스를 생성해 보시오.
		 * */
		Scanner scan=new Scanner(System.in);
		System.out.print("성적을 입력하세요: ");
		int score=scan.nextInt();
		scan.close();
		
		if(score>=90&&score<=100) 
			System.out.println("A");
		if(score>=80&&score<90) 
			System.out.println("B");
		if(score>=70&&score<80) 
			System.out.println("C");
		if(score>=60&&score<70) 
			System.out.println("D");
		if(score>=0&&score<60) 
			System.out.println("F");
		if(score<0&&score>100)
			throw new ArithmeticException("예외: 0이상 100이하의 숫자를 입력하세요");
		
		
	}

}
