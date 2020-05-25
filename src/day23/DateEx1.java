package day23;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx1 {
	/* 날짜를 내가 지정한 형태의 문자열로 변환하는 코드
	 * 2020년 5월 25일
	 * 2020-05-25
	 * */
	public static void main(String[] args) {
		Calendar date=Calendar.getInstance();
		date.add(Calendar.DATE,-7);
		Date today= date.getTime();
		SimpleDateFormat formet=new SimpleDateFormat("yyyy년 MM월 dd윌");
		System.out.println(formet.format(today));
		formet=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(formet.format(today));
	}

}
