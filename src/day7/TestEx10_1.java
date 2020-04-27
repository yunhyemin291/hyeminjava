package day7;

import java.util.Scanner;

public class TestEx10_1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] num=new int[4];
		int[] ans=new int[4];
		
		int ball=0;
		int strike=0;
		
		for(int i=0;i<ans.length;i++) {
			num[i]=(int)(Math.random()*9)+1;
			for(int j=1;j<i;j++) {
				if (num[i]==num[j]) {
					i--;
					break;
				}
			}
		}
		for (int x=0;x<5;x++) {
			System.out.print("숫자를 입력하세요:");
			for(int i=0;i<num.length;i++) {
				
				ans[i]=scan.nextInt();				
			}
			
			for(int i=0;i<num.length;i++) {
				for(int j=0;j<ans.length;j++) {
					if(num[i]==ans[j]) {
						if(i==j) {
							strike++;
						}else {
							ball++;
						}
					}
				}
			}
			if(ball==0 && strike==0) {
				System.out.print("OUT");
			}else if(ball==0 && strike!=0){
				if(strike==ans.length){
					System.out.println("정답입니다.");
					break;
				}else {
					System.out.print(strike+"S");
				}
			}else if(ball!=0 && strike==0) {
				System.out.print(ball+"B");
			}else {
				System.out.print(strike+"S"+ball+"B");
			}
			ball=0;
			strike=0;
			System.out.println();
			System.out.printf("기회가 %d번 남았습니다.\n",19-x);
			
			if(x==5) {
				System.out.println("패배했습니다.답은");
				for(int y=0;y<ans.length;y++) {
					System.out.print(num[y]);
				}
			}
		}
		
	}

}
