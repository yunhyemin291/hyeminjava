package day3;

public class ForEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			if(i==3) {
				break;
			}	
		}
		for(int i = 1;i<=10;i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}
	}

}
