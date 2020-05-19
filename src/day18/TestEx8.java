package day18;

import java.util.*;

public class TestEx8 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		List<Integer> arr=new ArrayList<Integer>();
		int num=0;
		System.out.print("정수를 입력하세요: ");
		num=scan.nextInt();
		int n=num,n2=num;
		int size=0;
		while(n>0) {
			size++;
			n/=10;
		}
		
		for(int i=0;i<size;i++) {
			int tmp=n2%10;			
			arr.add(tmp);
			n2/=10;
		}
		System.out.print("결과: ");
		for(int i=0;i<(arr.size());i++) {
			System.out.print(arr.get(i));
		}		
		System.out.println();
		System.out.println("================");
		
		int tmp=num;
		String res="";
		while(tmp!=0) {
			res+=tmp%10;
			tmp=tmp/10;
		}
		if(num!=0)
			System.out.println(res);
		else
			System.out.println(num);
		
		res=""+num;
		String reverseRes="";
		for(int i=res.length()-1;i>=0;i--) {
			reverseRes+=res.charAt(i);
		}
		System.out.println(reverseRes);
		
		scan.close();
	}

}
