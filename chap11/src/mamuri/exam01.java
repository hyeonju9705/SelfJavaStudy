package mamuri;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exam01 {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		String strNow= sdf.format(now);
		System.out.println(strNow);
	}
}
