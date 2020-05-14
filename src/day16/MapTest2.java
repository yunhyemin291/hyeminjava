package day16;

import java.util.*;

public class MapTest2 {

	public static void main(String[] args) {
		

		
		Scanner scan=new Scanner(System.in);
		int menu=0;
		String id,pw;
		HashMap<String, String> map=new HashMap<String, String>();
		
				
		
		while (menu!=3) {
			System.out.println("<메뉴>");
			System.out.println("1.등록");
			System.out.println("2.검색");
			System.out.println("3.종료");
			System.out.println("메뉴를 선택하세요: ");
			menu=scan.nextInt();
			if(menu==1) {
				System.out.print("id: ");
				id=scan.next();
				
				System.out.print("pw: ");
				pw=scan.next();
				map.put(id,pw);	
			}
			if(menu==2) {
				System.out.print("id: ");
				id=scan.next();
				pw=map.get(id);
				if(pw==null) {
					System.out.println("입력하신 id는 존재하지 않습니다.");
				}else {
					System.out.println(id+"의 비밀번호는"+pw+"입니다.");						
				}
			}
			if(menu==3) {
				System.out.println("종료합니다.");
				break;
			}
			
		}		
		
	}

}
