package day6;

import java.util.Scanner;

public class TestEx8 {

	public static void main(String[] args) {
		/*학생의 성적을 입력받아 해당 학생의 성적을 학점으로 출력하세요
		 * 100~90:A
		 * 89~80:B
		 * 79~70:C
		 * 69~60:D
		 * 59~0:F
		 * 100점이상 :잘못된 수 입니다.
		 * */
		
		Scanner scan=new Scanner(System.in);
		
		int score;
		
		int i=0;
		
		while(true) {
		i++;
			System.out.print("성적을 입력하세요.(종료하려면 음수를 입력하세요):");		
			score=scan.nextInt();
		
			if (90<=score&&100>=score)
			System.out.println("당신의 성적은 A입니다.");
			
			else if(80<=score&&89>=score) 
			System.out.println("당신의 성적은 B입니다.");
			
			else if(70<=score&&79>=score) 
			System.out.println("당신의 성적은 C입니다.");
			
			else if(60<=score&&69>=score) 
			System.out.println("당신의 성적은 D입니다.");
			
			else if(0<=score&&59>=score) 
			System.out.println("당신의 성적은 F입니다.");
			
			else if(100<score)
			System.out.println(score+"는 잘못된 정수 입니다.");
			
			else {
				System.out.println("지금까지 입력확인한 학생의 수는"+(i-1)+"명 입니다");
				System.out.println("종료합니다.");
				break;
			}
		}
		
		
		scan.close();
	}

}
