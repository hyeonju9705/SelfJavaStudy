package mamuri;

import java.util.Calendar;

public class exam02 {

	public static void main(String[] args) {
		// Calendar Ŭ������ �̿��ؼ� ����Ͽ��Ͻú� ���
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek="��";
			break;
		case Calendar.TUESDAY:
			strWeek="ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek="��";
			break;
		case Calendar.THURSDAY:
			strWeek="��";
			break;
		case Calendar.FRIDAY:
			strWeek="��";
			break;
		case Calendar.SATURDAY:
			strWeek="��";
			break;
		default:
			strWeek = "��";
		}
		
		int hour = Calendar.HOUR;
		int minute = Calendar.MINUTE;
		
		System.out.print(year+"�� ");
		System.out.print(month+"�� ");
		System.out.print(day+"�� ");
		System.out.print(strWeek+"���� ");
		System.out.print(hour+"�� ");
		System.out.print(minute+"�� ");
		
	}

}
