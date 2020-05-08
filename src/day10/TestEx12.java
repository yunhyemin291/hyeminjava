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
		Student tmpStudent;
		int size =30;
		Student std[]=new Student[size];
		int cnt=0;
		String name;
		
		while(menu!=5) {
			printMenu();
			menu =scan.nextInt();
			System.out.println("-------------------");
			switch(menu) {
			case 1:			
				System.out.println(">학생정보 추가<");
				tmpStudent=searchInfo(scan);
				System.out.print("이름을 입력하세요	:");
				name=scan.next();				
				tmpStudent.setName(name);	
				//검사
			
				
				if(isDuplicated(std, cnt, tmpStudent) !=-1) {
					System.out.println();
					System.out.println("이미 있는 학생입니다.");
					break;
				}
				std[cnt]=tmpStudent;
				//과목정보를입력할것인지를 묻는 안내문을 출력
				//과목정보를 입력한다고 대답하면 몇과목 입력할것인지를 물어봄
				//입력받은횟수만큼 과목명,중간,기말,수행평가,출석점수를 입력
				System.out.println("과목정보를 입력하시겠습니까?(y/n)");
				char subjectMenu=scan.next().charAt(0);
				switch(subjectMenu) {
				case'y': case'Y':
					inputSubject(scan,std[cnt]);
					break;
				default:
				}
				cnt++;
				tmpStudent=null;
				break;
				
			case 2:
				System.out.println(">학생정보 수정<");
				modifyStudent(std,cnt,scan);
				break;
				//수정할학생의 학년,반,번호를 입력받음
				//검색해서 없으면 없다고하고 종료
				//있으면 학생의 수정할 이름을 입력하고
				//과목을 수정할지 추가할지 그냥 넘어갈지를 물음
				//과목을 수정한다고 선택하면 과목명을 입력해서 검색
				//없으면 종료, 있으면 중간,기말, 수행평가,출석점수를 입력
				//과목을 추가한다고 했으면 추가할 과목의 과목명과 정보를 입력
				
				
				
			case 3:
				System.out.println(">학생정보 삭제<");
				System.out.println("삭제할 학생정보를 입력하세요.(검색)");
				//하나씩 검색해서 tmpStudent와 같은 학생이 있는지 확인
				//있으면 삭제 후 하나씩 밀어준다.
				tmpStudent=searchInfo(scan);	
				if(deleteStudent(std, tmpStudent, cnt)) cnt--;			
				break;
			case 4:
				System.out.println(">학생정보 출력<");
				printStudent(std,cnt);				
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴 입니다.");
			}
		}
		scan.close();
	}
	public static void printMenu() {
		System.out.println("--------메뉴--------");
		System.out.println("1.학생정보 추가");
		System.out.println("2.학생정보 수정");
		System.out.println("3.학생정보 삭제");
		System.out.println("4.학생정보 출력");
		System.out.println("5.프로그램 종료");
		System.out.println("메뉴를 선택하세요 > ");

	}
	public static Student searchInfo(Scanner scan) {
		System.out.print("학년을 입력하세요	:");
		int grade =scan.nextInt();
		System.out.print("반을 입력하세요	:");
		int classNum =scan.nextInt();
		System.out.print("번호를 입력하세요	:");
		int num =scan.nextInt();
		Student s =new Student();
		s.setGrade(grade);
		s.setClassNum(classNum);
		s.setNum(num);
		return s;
	}
	//void:콘솔에 출력하고 알려줄 정보가 없어서
	public static void printStudent(Student []std,int cnt) {
		for(int i=0;i<cnt;i++) {
			System.out.printf("%d학년 %d반 %d번 %s\n",std[i].getGrade(),
				std[i].getClassNum(),std[i].getNum(),
				std[i].getName());
			std[i].printScore();
		}
	}
	/*
	 * A -void -int
	 * B -Scanner scan -Student 학생정보 */
	public static void inputSubject(Scanner scan,Student s) {
		System.out.print("입력할 과목 수:");
		int subjectCnt=scan.nextInt();
		Subject []subjectList=new Subject[subjectCnt];
		for(int i=0;i<subjectCnt;i++) {
			System.out.print("과목명:");
			String title =scan.next();
			System.out.print("중간고사:");
			int midterm =scan.nextInt();
			System.out.print("기말고사:");
			int finals =scan.nextInt();
			System.out.print("수행평가:");
			int performance =scan.nextInt();
			System.out.print("출석점수:");
			int attendance =scan.nextInt();
			subjectList[i]
					=new Subject(title,midterm,finals,performance,attendance);
		}
		if(s==null)
			return;
		s.setScore(subjectList);
	}
	/*A -int:삭제된 뒤의 학생 수 -boolean:삭제여부
	 * B -int cnt:현재 학생수 -Student []std:저장된 학생 정보 -Student s:삭제할 학생 정보 */
	public static boolean deleteStudent(Student []std,Student deleteStudent,int cnt) {
		if(std==null||deleteStudent==null||cnt<=0)	return false;
		int pos=isDuplicated(std, cnt, deleteStudent);
		
		
		if(pos!=-1) {
			for(int j=pos;j<cnt-1;j++) {
				std[j]=std[j+1];
			}				
			System.out.println();
			System.out.println("삭제가 완료되었습니다.");
			return true;
		}		
		return false;
	}
	/*A int :중복되면 중복된 번지를 알려주고,중복안되면 -1을 반환 ,boolean
	 * B Student []std ,Student s, int cnt
	 * */
	public static int isDuplicated(Student std[],int cnt,Student s) {
		for(int i=0;i<cnt;i++) {
			if(std[i].equal(s)) {
				return i;
			}
		}
		return -1;
	}
	/*A void
	 * B Scanner */
	public static void modifyStudent (Student std[],int cnt,Scanner scan){
		System.out.println("수정할 학생정보를 입력하세요.(검색)");
		Student tmpStudent=searchInfo(scan);
		int pos =isDuplicated(std,cnt,tmpStudent);
		if(pos==-1) {
			System.out.println("없는 학생 정보입니다.");
			return;
		}
		System.out.print("이름을 입력하세요	:");
		String name=scan.next();				
		tmpStudent.setName(name);
		System.out.println("-------과목 수정-------");
		System.out.println("1. 수정");
		System.out.println("2. 추가");
		System.out.println("3. 종료");
		System.out.println("과목을 수정하시겠습니까?");
		int subMenu = scan.nextInt();
		switch(subMenu) {
		case 1:
			//해당 학생의 과목 정보를 가져옴
			Subject sList[] =std[pos].getScore();
			if(sList==null) {
				System.out.println("수정할 과목이 없습니다.");
				break;
			}	
			//수정할 과목을 입력					
			System.out.println("과목: ");
			String title=scan.next();
			//수정할 과목이 있는지 찾아야 함 있으면 아래작업을 하고, 없으면 종료					
			int subPos=-1;
			for(int i=0;i<sList.length;i++) {
				if (sList[i].getTitle().equals(title)){
					subPos=i;
					break;
				}
			}
			if(subPos==-1) {
				System.out.println("등록되지 않은 과목입니다.");
				break;
			}
			System.out.println("중간고사 :");
			int midterm=scan.nextInt();
			System.out.println("기말고사 :");
			int finals=scan.nextInt();
			System.out.println("수행평가 :");
			int performance=scan.nextInt();
			System.out.println("출석점수 :");
			int attendance=scan.nextInt();
			sList[subPos].setMidterm(midterm);
			sList[subPos].setFinals(finals);
			sList[subPos].setPerformance(performance);
			sList[subPos].setAttendance(attendance);
			//중간,기말,수행평가,출석점수를 다 새로 수정
			break;
		case 2:
			Student s=new Student();
			inputSubject(scan, s);
			std[pos].addScore(s.getScore());
			break;
		}
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
	
	public Subject[] getScore() {
		return score;
	}

	public void addScore(Subject[] addscore) {
		int aSize=0,bSize=0;
		if(score!=null) aSize=score.length;
		if(addscore!=null) bSize=addscore.length;
		
		Subject []tmp=new Subject[aSize+bSize];
		for(int i=0;i<aSize;i++) {
			tmp[i]=score[i];
		}
		for(int j=0;j<bSize;j++) {
			tmp[aSize+j]=addscore[j];
		}
		score=tmp;		
	}

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
		if(score==null)return;
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
	public boolean equal(Student s) {
		if(this.grade !=s.grade) return false;
		if(this.classNum !=s.classNum) return false;
		if(this.num !=s.num) return false;
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
