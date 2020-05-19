package day18;

import java.util.*;

public class TestEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
* 3.영어사전을 프로그램으로 만들려고 한다 이때 단어를 저장할 수 있는 클래스를 생성해 보시오.
* 단어클래스
* -단어,품사,뜻을 저장하는 클래스
* */
class Word{
	String word;
	//String wordClass[];
	//String meaning[];
	List<String>wordClass=new ArrayList<String>();
	List<String>meanning=new ArrayList<String>();
	//단어는 중복되면 안되기 때문에, 해당하는 단어와 같은지를 판별하는 equals가 필요=>단어만 비교
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((meanning == null) ? 0 : meanning.hashCode());
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		result = prime * result + ((wordClass == null) ? 0 : wordClass.hashCode());
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
		if (meanning == null) {
			if (other.meanning != null)
				return false;
		} else if (!meanning.equals(other.meanning))
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		if (wordClass == null) {
			if (other.wordClass != null)
				return false;
		} else if (!wordClass.equals(other.wordClass))
			return false;
		return true;
	}
	
}
class Dic{
	List<Word> list=new ArrayList<Word>();
}