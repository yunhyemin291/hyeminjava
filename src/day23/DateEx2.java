package day23;

import java.util.*;

public class DateEx2 {

	public static void main(String[] args) {
		Calendar date=Calendar.getInstance();
		//month the value used to set the MONTH calendar field.Month value is 0-based. e.g., 0 for January.
		date.set(2020, 4,5);
		System.out.println(toString(date));
		date.add(Calendar.DATE, -14);
		//date.add(5, -14);
		System.out.println(toString(date));
		date.add(Calendar.DATE, 14);
		System.out.println(toString(date));
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
				

	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"-"+
				(date.get(Calendar.MONTH)+1)+"-"+
				date.get(Calendar.DATE);
	}

}
