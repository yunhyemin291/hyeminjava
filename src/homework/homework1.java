package homework;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		int user=0;
		int com=0;
		int cnt=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("1~50까지의 수를 입력하여 수를 맞추세요. ");
		com=(int)(Math.random()*50)+1;
		//System.out.println(com);
		
		while(user!=com) {
			System.out.print(">>");
			user=scan.nextInt();
			if(com>user) {
				System.out.println("Up");
			}if(user>com) {
				System.out.println("Down");
			}	
			cnt++;		
			System.out.println("남은기회: "+(6-cnt));
			System.out.println();
			
			if(cnt==6)
				break;
		}
		if(user==com)
			System.out.println("정답입니다.");
		else
			System.out.println("GAME OVER. 정답은 :"+com);
		
		scan.close();
	}

}
