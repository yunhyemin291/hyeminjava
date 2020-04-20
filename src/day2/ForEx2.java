package day2;

public class ForEx2 {

	public static void main(String[] args) {
		/* 구구단 7단을 출력하는 코드를 for문을 이용하여 작성하세요.
		*1.반복횟수 : i는 1부터 9까지 1씩 증가
		*2.규칙성 : 
		*7×1=7
		*7×2=14
		*7×3=21
		*7×4=28
		*7×5=35
		*7×6=42
		*7×7=49
		*7×8=56
		*7×9=63
		*/
		
		int i, num = 7;
		
		for(i=1;i<=9;i+=1) {
			System.out.printf("%d × %d = %d\n",num,i,num*i);
		}
		
		for(i=1;i<=9;i+=1) {
			System.out.println(num+" × "+ i + " = "+ num*i) ;
		}
	}

}
