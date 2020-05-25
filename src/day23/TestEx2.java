package day23;

import java.util.*;

public class TestEx2 {

	public static void main(String[] args) {
		/* 중복되지 않는 정수 5개를 Set에 저장하고, 저장된 값의 합과 평균을 구하세요.
		 * */
		Set<Integer> set=new HashSet<Integer>();
		Scanner scan=new Scanner(System.in);
		int size=5;
		/* 문제에서 정수 5개를 입력받는게 아니라 중복되지 않은 정수 5개를 입력받아야 하기 때문에
		 * 반복 횟수는 5번으로 고정된 것이 아니라 Set에 5개가 저장될 때 까지 반복해야 한다.
		 * */
		System.out.print("정수 5개를 입력하세요: ");
		for(;set.size()<size;) {
			set.add(scan.nextInt());
		}
		
		System.out.println(sum(set));
		System.out.println((double)sum(set)/5);
	
		
		
		scan.close();
	
	}
	public static int sum(Collection<Integer> c) {
		Iterator<Integer> it=c.iterator();
		int sum=0;		
		while(it.hasNext()) {
			Integer tmp=it.next();
			if(tmp!=null)
				sum+=tmp;
		}
	return sum;
	}

}
