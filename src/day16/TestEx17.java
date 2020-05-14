package day16;

import java.util.*;

public class TestEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1~10사이의 랜덤한 수  6개를 생성하여 리스트에 저장하고,출력하는 코드를 작성하세요. 단,중복불가
		 * 1.리스트 생성
		 * 2.반복문 실행
		 * 2-1.1-10사이의 랜덤한 수를 생성
		 * 2-2.리스트에 생성된 랜덤수가 있는지 체크
		 * 2-2-1.없으면 리스트에 추가
		 * 3.리스트 출력
		 * */
		List<Integer> list=new ArrayList<Integer>();
		while(list.size()<6) {
			int r= new Random().nextInt(10)+1;
			if(!list.contains(r)) {
				list.add(r);
			}
			
		}
		System.out.println(list);
//		
//		ArrayList list1=new ArrayList(10);
//		int[] num=new int[10];
//		Random rand=new Random();
//		for(int i=0;i<=6;i++) {
//			num[i]=rand.nextInt(10);
//		}
//		
		
	}

}
