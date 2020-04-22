package day4;

public class TestEx5 {

	public static void main(String[] args) {
		// 배열의 내용을 정렬하는 예제
		int arr[]=new int [10];
		int rMin =1;
		int rMax =100;
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*(rMax-rMin+1))+rMin;
		}
		for(int tmp:arr) {
			System.out.printf("%3d ",tmp);
		}
		System.out.println();
		
		for(int i =0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		for(int tmp:arr) {
			System.out.printf("%3d ",tmp);
		}
		System.out.println();
		
		System.out.printf("최소는 %3d , 최대는 %3d",arr[0],arr[9]);
	}

}
