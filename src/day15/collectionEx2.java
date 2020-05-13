package day15;

import java.util.*;
import java.util.Scanner;

public class collectionEx2 {

	public static void main(String[] args) {
		/* 오늘의 할일을 리스트에 저장하고 출력하는 코드를 Arraylist를 이용하여 작업하세요.
		 * 예)
		 * 오늘의 할일을 추가하시겠습니까?(y/n) :y
		 * 오늘의 할일을 입력하세요:수업
		 * 오늘의 할일을 추가하시겠습니까?(y/n) :y
		 * 오늘의 할일을 입력하세요:점심
		 * 오늘의 할일을 추가하시겠습니까?(y/n) :n
		 * 오늘의 할일
		 * 1.수업
		 * 2.점심
		 * 프로그램을 종료합니다.
		 * */
		Scanner scan=new Scanner(System.in);
		char a;
		String toDo;
		ArrayList<String>list=new ArrayList<String>();
		
		while(true) {
			System.out.print("오늘의 할 일을 추가하시겠습니까?(y/n): ");
			a=scan.next().charAt(0);
			scan.nextLine();
			//nextLine()이 엔터를 가져가서 자동으로 다음 실행으로 넘어가서 이를 방지하기 위한 코드
			if(a=='y'||a=='Y') {
				System.out.print("오늘의 할 일을 입력하세요: ");
				toDo=scan.nextLine();
				
				list.add(toDo);
			}if(a=='n'||a=='N') {
				System.out.println("<오늘의 할 일>");
				for(int i=0;i<list.size();i++) {
					System.out.println(i+1+". "+list.get(i));					
				}
				break;
			}
			
		}
		scan.close();
	}
}
