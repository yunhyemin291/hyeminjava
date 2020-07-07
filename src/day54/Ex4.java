package day54;

import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		// 컬렉션 프레임 어크를 이용하여 1부터 10까지 저장하는 코드를 작성하세요
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		for(int i = 1 ;i<=10;i++) {
			arr.add(i);
		}
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
