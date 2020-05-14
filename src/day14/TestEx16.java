package day14;

public class TestEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=5;
		printstar(j);
		System.out.println();
		print("*****");
		print('-',100);
		System.out.println(print2('&',10));
	}
	public static String printstar(int j) {
		String a = null;
		for(int i=0;i<j;i++) {
			a="*";
			System.out.print(a);
		}
		return a;
	}
	public static void print(String str) {
		System.out.println(str);
	}
	public static void print(char ch,int cnt) {
		for(int i=1;i<=cnt;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	public static String print2(char ch,int cnt) {
		StringBuffer res=new StringBuffer(cnt);
		for(int i=1;i<=cnt;i++) {
			res.append(ch);
		}
		return res.toString();
	}

}
