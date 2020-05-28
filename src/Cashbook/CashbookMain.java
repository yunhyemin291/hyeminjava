package Cashbook;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CashbookMain {
	
	
	public static void main(String[] args) {
		List<Cashbook> list =new ArrayList<Cashbook>();
		List<Cashbook> subList=null;
		Cashbook cashbook=null;
		Scanner scan=new Scanner(System.in);
		int index =0;
		int menu ;
		int kind=-1;
		char subMenu;
		String search;
		do {
			menu =printMenu(scan);
			switch(menu) {
			case 1:
				cashbook=inputCashbook(scan);
				System.out.println("------------------");
				if(registerCashbook(list,cashbook))
					System.out.println("가계내역을 등록했습니다.");
				else
					System.out.println("가계내역 등록에 실패했습니다.");
				System.out.println("------------------");
				break;
			case 2:
				System.out.println("------------------");
				for(int i=0;i<list.size();i++)
					System.out.println(i+1+". "+list.get(i));
				System.out.println("------------------");
				do {
					System.out.println("수정할 가계내역을 선택하세요: ");
					index=scan.nextInt();
					System.out.println(list.get(index-1)+"항목이 맞습니까?(y/n)");
					subMenu=scan.next().charAt(0);
				}while(subMenu=='n');
				cashbook=inputCashbook(scan);
				System.out.println("------------------");
				if(modifyCashbook(list,index,cashbook))
					System.out.println("가계내역을 등록했습니다.");
				else
					System.out.println("가계내역 등록에 실패했습니다.");
				System.out.println("------------------");
				break;
			case 3:
			case 4:
				
			default:
				System.out.println("잘못된 메뉴입니다.");
				
			
			}
		}while(true);
		
	}
	public static int printMenu(Scanner scan) {
		System.out.println("---------------------");
		System.out.println("1.가계내역 등록");
		System.out.println("2.가계내역 수정");
		System.out.println("3.가계내역 확인");
		System.out.println("4.프로그램 종료");
		System.out.println("---------------------");
		System.out.println("메뉴를 선택하세요: ");
		int menu=scan.nextInt();
		System.out.println("---------------------");
		return menu;
	}
	
	
	/*기능: 주어진 가계부 내역(Cashbook)을 가계부(list)에 저장하는 메소드
	 * 매개변수:가계부, 가계부 내역=>List<Cashbook> list,Cashbook cashbook 
	 * 리턴타입:등록여부=>boolean
	 * 메서드명:registerCashbook
	 * */
	public static boolean registerCashbook(List<Cashbook> list,Cashbook cashbook) {
		if(list==null||cashbook==null)
			return false;
		list.add(cashbook);
		list.sort(new Comparator<Cashbook>() {
			@Override
			public int compare(Cashbook o1, Cashbook o2) {
//				int year1=Integer.parseInt(o1.getDate().substring(0,4));
//				int year2=Integer.parseInt(o2.getDate().substring(0,4));
//				int month1=Integer.parseInt(o1.getDate().substring(5,7));
//				int month2=Integer.parseInt(o2.getDate().substring(5,7));
//				int day1=Integer.parseInt(o1.getDate().substring(8,9));
//				int day2=Integer.parseInt(o2.getDate().substring(8,9));
				
				String arr1[]=o1.getDate().split("-");
				String arr2[]=o2.getDate().split("-");
				for(int i=0;i<arr1.length;i++) {
					//arr의 0번지:년도
					//arr의 1번지:월
					//arr의 2번지:일
					if(Integer.parseInt(arr1[i])>Integer.parseInt(arr2[i]))
						return -1;
					else if(Integer.parseInt(arr1[i])<Integer.parseInt(arr2[i]))
						return 1;
				}
				return 0;
			}
		});
		return true;
	}
	/*기능:스캐너를 통해 가계부 내역을 입력받아 가계부 내역을 반환하는 메소드
	 * 매개변수:스캐너=>Scanner scan
	 * 리턴타입:가계부 내역=>Cashbook
	 * 메서드명:inputCashbook
	 * */
	public static Cashbook inputCashbook(Scanner scan) {
		System.out.print("수입(0)/지출(1):" );
		int income=scan.nextInt();
		Pattern p=Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
		Matcher m;
		String date;
		//날짜 패턴이 다른 경우 맞을때 까지 입력받음
		do {
			System.out.print("날짜(예:2020-05-22):");
			date=scan.next();
			m=p.matcher(date);
		}while(!m.matches());
		
		System.out.print("분류:");
		String type=scan.next();
		System.out.print("내용 :");
		String content="";
		while((content=scan.nextLine()).trim().length()==0);
		System.out.print("금액(원):");
		int money=scan.nextInt();
		Cashbook cashbook =new Cashbook(income,date,type,content,money);
		return cashbook;
	}
	
	/*기능:가계부에서 확인 하려는 종류에 맞는 검색 결과를 리스트로 반환하는 메소드
	 * 매개변수:가계부,종류,검색어=>List<Cashbook> list,int kind,String search
	 * 리턴타입:검색된 가계부=>List<Cashbook>
	 * 메서드명:searchCashbook
	 * */
	public static List<Cashbook> searchCashbook(List<Cashbook> list,int kind,String search){
		List<Cashbook> searchList=new ArrayList<Cashbook>();
		switch(kind) {
		case 1:
			Pattern p=Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
			Matcher m=p.matcher(search);
			if(!m.matches()) {
				System.out.println("날짜 형태의 검색어가 아닙니다.");
				return null;
			}
			for(Cashbook tmp:list) {
				if(tmp.getDate().equals(search))
					searchList.add(tmp);
			}
			return searchList;
		case 2:
			if(!search.equals("수입")&&!search.equals("지출")) {
				System.out.println("검색어는 수입 또는 지출이어야 합니다.");
				return null;
			}
			boolean isIncome=search.equals("수입");
			for(Cashbook tmp:list) {
				if(tmp.isIncome()==isIncome)
					searchList.add(tmp);		
			}
			return searchList;
		case 3:
			for(Cashbook tmp:list) {
				if(tmp.getType().equals(search))
					searchList.add(tmp);
			}
			return searchList;
		}
		return null;		
	}
	/*기능:가계부에서 수정할 위치를 알려주면 수정 항목으로 수정하는 메소드
	 * 매개변수:가계부,수정할 위치, 수정항목=>List<Caschbook> list,int index,Cashbook cashbook
	 * 리턴타입:수정여부=>boolean
	 * 메서드명:modifyCashbook
	 * */
	public static boolean modifyCashbook(List<Cashbook> list,int index,Cashbook cashbook) {
		if(list ==null||cashbook==null||list.size()<index)
			return false;
		//list.set(index-1,cashbook);
		list.remove(index-1);
		registerCashbook(list, cashbook);
		return true;
	}
	
	
}
	
	/*기능:
	 * 매개변수:
	 * 리턴타입:
	 * 메서드명:
	 * */
	

