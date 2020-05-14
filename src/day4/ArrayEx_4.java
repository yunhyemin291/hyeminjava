package day4;

public class ArrayEx_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<로또>");
		
		int[] ball =new int[45];
		int[] lotto=new int[45];
		int bonus=0;
		bonus=(int)(Math.random()*45);
		if(contains(ball, bonus)) {
			System.out.println(bonus);
		}
				
		createRandomArray(ball);
		System.out.println();
		createRandomArray(lotto);
						
		System.out.println();
	}
	public static boolean contains(int []arr,int num) {
		for(int tmp:arr) {
			if(tmp==num)
				return false;
		}
		return true;
	}
	public static int[] createRandomArray(int []array) {
		for (int i=0;i<array.length;i++)
			array[i]=i+1;
		
		int temp=0;
		int j=0;
		for (int i=0;i<6;i++) {
			j=(int)(Math.random()*45);
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		
		for(int i=0;i<6;i++)
			System.out.printf("[%2d] ",array[i]);
		
		return array;
	}
}
