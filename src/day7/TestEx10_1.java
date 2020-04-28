package day7;

import java.util.Scanner;

public class TestEx10_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] com=new int[4];
		int[] user=new int[4];
		int num=0;
		int count=0;
		boolean loop;
		
		
		
		int ball=0;
		int strike=0;
		
		
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if (com[i]==com[j]) {
					i--;
					break;
				}
			}
		}		
		System.out.println();
		System.out.println("****숫자 야구게임 시작****");
		System.out.println();
		System.out.println("-1~9사이의 정수만 입력해야합니다.");
		System.out.println("-숫자는 중복될 수 없습니다.");
		System.out.println("-기회는 총 10번입니다.");
		System.out.println();
		
		loop =true;
		while(loop) {
			System.out.println("4자리 정수를 입력하세요 >>");
			for(int i=0;i<user.length;i++) {
				num=scan.nextInt();
				user[i]=num;
				if(num<0||num>10) {
					System.out.println("올바른 수가 아닙니다 다시 입력하세요.");
					continue;
				}				
			}
			for (int i=0;i<com.length;i++) {
				for(int j=0;j<(user.length);j++) {
					if(com[i]==user[j]&&i==j) {
						strike++;
					}else if(com[i]==user[j]&&i!=j){
						ball++;
					}
				}				
			}
			if(strike>=4) {
				System.out.println();
				System.out.println("****승리****");
				break;
			}
			
			System.out.print("> "+strike+"S "+ball+"B");
			strike=0;
			ball=0;
			count++;			
			System.out.println(" 남은기회:"+(10-count));
			
			System.out.println("------------------");
			
			if(count==10) {
				System.out.println();
				System.out.println("정답 :"+com[0]+com[1]+com[2]+com[3]);
				loop=false;				
				System.out.println("****패배****");
			}
			
		}
			
		}
}

