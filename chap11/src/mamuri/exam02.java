package mamuri;

import java.util.Calendar;

public class exam02 {

	public static void main(String[] args) {
		// Calendar 클래스를 이용해서 년월일요일시분 출력
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek="월";
			break;
		case Calendar.TUESDAY:
			strWeek="화";
			break;
		case Calendar.WEDNESDAY:
			strWeek="수";
			break;
		case Calendar.THURSDAY:
			strWeek="목";
			break;
		case Calendar.FRIDAY:
			strWeek="금";
			break;
		case Calendar.SATURDAY:
			strWeek="토";
			break;
		default:
			strWeek = "일";
		}
		
		int hour = Calendar.HOUR;
		int minute = Calendar.MINUTE;
		
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
		System.out.print(strWeek+"요일 ");
		System.out.print(hour+"시 ");
		System.out.print(minute+"분 ");
		
	}

}
