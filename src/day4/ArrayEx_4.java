package day4;

public class ArrayEx_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<로또번호생성기>");
		
		int[] ball =new int[45];
		
		for (int i=0;i<ball.length;i++)
			ball[i]=i+1;
		
		int temp=0;
		int j=0;
		
		for(int k=0;k<5;k++) {
			
			for (int i=0;i<6;i++) {
			j=(int)(Math.random()*45);
			temp=ball[i];
			ball[i]=ball[j];
			ball[j]=temp;
		}
		
		System.out.println();
		
		for(int i=0;i<6;i++)
			System.out.printf("ball[%d]=%2d | ",(i+1),ball[i]);
		
		}
				
		System.out.println();
	}

}
