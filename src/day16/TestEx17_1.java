package day16;

import java.util.*;

public class TestEx17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);		
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		int num=0;
		int s=0,b=0;
		
				
		
		while(list1.size()<3) {
			int r= new Random().nextInt(9)+1;
			if(!list1.contains(r)) {
				list1.add(r);		
			}
		}System.out.println(list1);
		
		while(s!=3) {
			System.out.print("세 정수를 입력하세요: ");
			for(int i=0;i<3;i++) {
				num=scan.nextInt();
				list2.add(num);				
			}
			s=strike(list1,list2);
			if(s!=0) {
				System.out.print(s+"S");
			}
			b=ball(list1,list2);
			if(b!=0) {
				System.out.print(b+"B");
			}
			if(s==0||b==0) {
				System.out.print("3O");				
			}
			System.out.println();					
		}
		System.out.println("승리");
		
		
		
	}
	public static int strike(List<Integer> list1,List<Integer> list2) {
		int cnt=0;
		for(int i=0;i<list1.size();i++) {
			if(list1.contains(i)==list2.contains(i)) {
				cnt++;
			}
		}
		return cnt;
	}
	public static int ball(List<Integer> list1,List<Integer> list2) {
		int cnt=0;
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)==list2.get(i)) {
				cnt++;
			}
		}
		return cnt-strike(list1,list2);
	}
}
