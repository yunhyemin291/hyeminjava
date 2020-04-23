package day4;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 배열에 임의의 수 넣는 예제
		int arr[]=new int [3];
		int max=45;
		int min=1;
		//임의의 수를 생성하여 배열에 저장(중복 가능)
		for(int i=0;i<arr.length;i++) {
			int random = (int)(Math.random()*(max-min+1))+min;
			arr[i] = random;

		}
		for(int tmp:arr) {
			System.out.print(tmp+" ");
		}
		
		//임의의 수를 생성하여 배열에 저장(중복 X)
		int arr2[]=new int [6];
		int cnt = 0;//배열에 저장된 랜덤수의 갯수
		while(cnt<arr2.length) {
			//생성된 랜덤수 random : 1 1 2 9
			//배열에 저장된 갯수 cnt : 0
			//저장된 배열의 값 arr2 :1 2 9
//			배열의 0번지부터 배열에 저장된 랜덤수의 갯수-1번지까지 중복여부 체크하여
//			중복되지 않으면 배열에 랜덤수를 저장하고 배열에 저장된 랜덤수의 갯수를 1증가
			int random = (int)(Math.random()*(max-min+1))+min;
			int i = 0;
			while(i<cnt) {
				if(random==arr2[i]){
					break;
				}
				i++;
			}
			if(i==cnt) {
				arr2[cnt]=random;
				cnt++;
			}
		}
		System.out.println();
		for(int tmp:arr2) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		
		System.out.println();
		
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

