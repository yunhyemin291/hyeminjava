package day53;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				continue;				
			}
			sum+=i;
		}
		System.out.println(sum);
		int j=0;
		sum=0;
		while(++j<=10) {
			if(j%2==1)
				continue;
			sum+=j;
		}
		System.out.println(sum);
	}

}
