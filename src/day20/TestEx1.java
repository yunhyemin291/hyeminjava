package day20;

import java.util.*;

public class TestEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		List<Word> diction=new ArrayList<Word>();
		Word word=null;
		char menu='1';		
		do {
			printMenu();
			menu=scan.next().charAt(0);
			switch(menu) {
			case '1':
				System.out.println(">추가할 단어와 품사와 의미를 입력하세요.: ");
				word=inputAllWord(scan);
				if(insertWord(diction,word)) {
					System.out.println("<단어장에 단어를 추가했습니다.>");
				}else {
					System.out.println("<단어장에 단어를 추가하지 못했습니다.>");
				}
				break;
			case '2':
				System.out.println(">수정할 단어와 품사와 의미를 입력하세요.: ");
				word=inputAllWord(scan);
				if(modifyWord(diction,word)) {
					System.out.println("<단어장에 단어를 수정했습니다.>");
				}else {
					System.out.println("<단어장에 단어를 수정하지 못했습니다.>");
				}
				break;
			case '3':
				System.out.println(">삭제할 단어를 입력하세요.: ");
				word=inputSearchWord(scan);
				if(deleteWord(diction,word)) {
					System.out.println("<단어장에 단어를 삭제했습니다.>");
				}else {
					System.out.println("<단어장에 단어를 삭제하지 못했습니다.>");
				}				
				break;
			case '4':
				System.out.print(">검색할 단어를 입력하세요.: ");
				word=inputSearchWord(scan);
				Word tmp=searchWord(diction,word);
				if(tmp!=null) {
					System.out.println(tmp);
				}else {
					System.out.println("<단어장에"+word.word+"가 없습니다.>");
				}
				break;
			case '5':
				System.out.println("<프로그램을 종료합니다.>");
				break;
			default:System.out.println("<올바른 메뉴를 입력하세요.>");
			}
			
		}while(menu!='5');
		scan.close();
		
	}
	public static void printMenu() {
		System.out.println("1.단어추가");
		System.out.println("2.단어수정");
		System.out.println("3.단어삭제");
		System.out.println("4.단어검색");
		System.out.println("5.종료");
		System.out.print("메뉴를 선택하세요: ");
	}
	/*기능:입력받은 영어단어,품사,뜻이 중복되지 않으면 리스트에 등록하는 메소드
	 * 매개변수:단어,리스트=>word a,List<String> diction
	 * 리턴타입:저장여부=>boolean
	 * 메소드명: insertWord
	 * */
	public static boolean insertWord(List<Word> diction,Word word) {
		//리스트가 없거나 단어가 없다면 실패,이미있는 단어인경우 실패
		if(diction==null||word==null||diction.contains(word)) {
			return false;
		}
		diction.add(word);
		return true;
	}
	/*기능:단어,품사,뜻을 입력받아 단어를 만들어 반환하는 메소드
	 * 매개변수:스캐너=>Scanner scan
	 * 리턴타입:단어객체=>Word
	 * 메소드명: inputAllWord
	 * */
	public static Word inputAllWord(Scanner scan) {
		Word word=new Word();
		char menu='y';
		String tmp="";	
		System.out.print("단어: ");
		word.word=scan.next();		
		do {			
			System.out.print("품사: ");
			while((tmp=scan.nextLine()).trim().length()==0);
			word.wordClass.add(tmp);
			System.out.print("의미: ");
			while((tmp=scan.nextLine()).trim().length()==0);
			word.meaning.add(tmp);
			System.out.print("품사와 의미를 더 입력 하시겠습니까?(y/n): ");
			menu=scan.next().charAt(0);			
		}while(menu=='y'||menu=='Y');
		
		return word;
	}
	/*기능:단어장에 해당 단어가 있으면 검색해서 단어를 반환하고 없으면 null을 반환하는 메소드
	 * 매개변수:단어,리스트=>word a,List<String> diction
	 * 리턴타입:검색된 단어=>Word
	 * 메소드명: searchWord
	 * */
	public static Word searchWord(List<Word> diction,Word word) {
		if(diction==null||word==null)
			return null;
		//향상된 for문으로 diction에 있는 단어들을 하나씩 가져와서 tmp에 연결
		for(Word tmp:diction) {
			//단어장에서 꺼내온 단어 tmp와 검색단어 word를 비교하여 같으면 단어장에서 꺼내온 단어를 반환
			if(tmp.equals(word))
				return tmp;
		}
		//단어장을 다 확인했는데 검색단어 word가 없으면 null을 반환
		return null;
	}
	/*기능:스캐너를 통해 검색어를 입력하여 검색어를 단어로 변환하여 반환하는 메소드
	 * 매개변수:스캐너=>Scanner
	 * 리턴타입:검색어로 만들어진 단어=>Word
	 * 메소드명: inputSearchWord
	 * */
	public static Word inputSearchWord(Scanner scan) {
		return new Word(scan.next(),null,null);
	}
	/*기능:단어장에 삭제하려는 단어가 있으면 리스트에서 삭제하고 true를 반환,없으면 false를 반환하는 메소드
	 * 매개변수:단어장,삭제하려는 단어=>List<Word> diction,Word word
	 * 리턴타입:삭제여부=>boolean
	 * 메소드명: deleteWord
	 * */
	public static boolean deleteWord(List<Word> diction,Word word) {
		if(diction==null||word==null)
			return false;
		return diction.remove(word);
	}
	/*기능:수정할 단어가 주어지면 단어장에서 해당 단어를 찾아 단어를 교체하는 true를 반환하고, 교체하지 못하면 false를 반환하는 메소드
	 * 매개변수:리스트,수정할 단어=>List<Word> diction,Word word
	 * 리턴타입:수정여부=>boolean
	 * 메소드명: modifyWord
	 * */
	public static boolean modifyWord(List<Word> diction,Word word) {
		if(diction==null||word==null||!diction.contains(word))
			return false;
		diction.remove(word);
		diction.add(word);
		return true;
	}
	

}
class Word{
	String word;//단어
	List<String> wordClass=new ArrayList<String>();//품사
	List<String> meaning=new ArrayList<String>();//뜻
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;		
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
	
		return true;
	}
	@Override
	public String toString() {
		String str="단어: "+word+"\n";
		for(int i=0;i<meaning.size();i++) {
			str+=(i+1)+". ("+wordClass.get(i)+") "+meaning.get(i)+"\n";
			}
		return str;
	}
	public Word() {}
	public Word(String word, List<String> wordClass, List<String> meaning) {
		super();
		this.word = word;
		this.wordClass = wordClass;
		this.meaning = meaning;
	}
	
}