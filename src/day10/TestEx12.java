package day10;

import java.util.Scanner;

public class TestEx12 {

	public static void main(String[] args) {
		/* 학생들을 관리하는 프로그램을 작성하세요
		 * -학생 정보:학년,반,번호,이름,국어,영어,수학 등
		 * -기능 :학생 정보 추가, 학생 정보 수정,학생 정보 삭제, 학생 정보 출력
		 * 
		 * 예시
		 * 메뉴
		 * 1.학생정보추가
		 * 2.학생정보수정
		 * 3.학생정보삭제
		 * 4.학생정보출력
		 * 5.종료
		 * 메뉴를선택하세요:1*/
		Scanner scan=new Scanner(System.in);
		int menu =0;		
		while(menu!=5) {
			printMenu();
			menu =scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("이름을 입력하세요: ");
				String name=scan.next();
				System.out.print("학년을 입력하세요: ");
				int grade =scan.nextInt();
				System.out.print("반을 입력하세요: ");
				int classNum =scan.nextInt();
				System.out.print("번호를 입력하세요: ");
				int num =scan.nextInt();
				System.out.printf("> %d학년 %d반 %d번 %s\n", grade,classNum,num,name);	
				//과목정보를입력할것인지를 묻는 안내문을 출력
				//과목정보를 입력한다고 대답하면 몇과목 입력할것인지를 물어봄
				//입력받은횟수만큼 과목명,중간,기말,수행평가,출석점수를 입력
				break;
				
			case 2:
				System.out.println("학생정보 수정기능");
				//수정할학생의 학년,반,번호를 입력받음
				//검색해서 없으면 없다고하고 종료
				//있으면 학생의 수정할 이름을 입력하고
				//과목을 수정할지 추가할지 그냥 넘어갈지를 물음
				//과목을 수정한다고 선택하면 과목명을 입력해서 검색
				//없으면 종료, 있으면 중간,기말, 수행평가,출석점수를 입력
				//과목을 추가한다고 했으면 추가할 과목의 과목명과 정보를 입력
				System.out.println("수정할 학생이름을 입력하세요: ");
				break;
			case 3:
				System.out.println("학생정보 삭제기능");
				System.out.println("삭제할 학생이름을 입력하세요: ");
				break;
			case 4:
				System.out.println("학생정보 출력기능");
				
				System.out.println("출력할 학생이름을 입력하세요: ");
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴 입니다.");
			}
		}
	}
	public static void printMenu() {
		System.out.println("-------메뉴-------");
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정");
		System.out.println("3.학생정보 삭제");
		System.out.println("4.학생정보 출력");
		System.out.println("5.프로그램 종료");
		System.out.println("메뉴를 선택하세요 : ");
	}
}
/* 1.데이터 관리를 위한 작업
 * 	=>변수나 클래스를 이용
 * 	학생정보=>Student 클래스
 * 	과목정보=>Subject 클래스
 * 2.기능 구현
 * 	=>기능을 인터페이스로 정의하고, 해당 인터페이스를 구현하는 구현 클래스
 * */
interface Manage{
	public int insertStudent(Student []arr,Student std);
	public void modifyStudent(Student []arr,Student std);
	public int deleteStudent(Student []arr,Student std);
	public void printStudent(Student []arr,int count);
}


class Student{	
	//멤버 변수 설정
	private String name="";
	private int grade;
	private int classNum;
	private int num;
	private Subject score[];
	
	//getters setters 설정	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}	
	
	public void setScore(Subject...score) {
		this.score = new Subject[score.length];
		for(int i=0;i<score.length;i++) {
			//this.score[i]=score[i];
			this.score[i]=new Subject(score[i]);
		}
	}
	public void printScore() {
		for(Subject tmp:score) {
			tmp.print();
		}
	}

	//기능 설정
	public boolean equal(int grade,int classNum,int num,String name) {
		if(this.grade !=grade) return false;
		if(this.classNum !=classNum) return false;
		if(this.num !=num) return false;
		if(!this.name.equals(name)) return false;
		return true;
	}

}
class Subject{
	//과목명, 중간,기말,수행, 출석
	private String title;
	private int midterm;
	private int finals;
	private int performance;
	private int attendance;
	
	public void print() {
		System.out.println("--------"+title+"--------");
		System.out.println("중간고사: "+midterm);
		System.out.println("기말고사: "+finals);
		System.out.println("수행평가: "+performance);
		System.out.println("출석점수: "+attendance);
		System.out.println("-------------------");
	}

	public Subject(String title, int midterm, int finals, int performance, int attendance) {
		super();
		this.title = title;
		this.midterm = midterm;
		this.finals = finals;
		this.performance = performance;
		this.attendance = attendance;
	}

	public Subject(Subject subject) {
		midterm=subject.midterm;
		finals=subject.finals;
		performance=subject.performance;
		attendance=subject.attendance;
		title=subject.title;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMidterm() {
		return midterm;
	}

	public void setMidterm(int midterm) {
		this.midterm = midterm;
	}

	public int getFinals() {
		return finals;
	}

	public void setFinals(int finals) {
		this.finals = finals;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	
	
	
}
