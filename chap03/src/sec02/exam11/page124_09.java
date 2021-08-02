package sec02.exam11;

import java.util.Scanner;

public class page124_09 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
			double inputData = Double.parseDouble(scanner.nextLine());
			System.out.println("첫번째 수: "+inputData);
		
			double inputData2= Double.parseDouble(scanner.nextLine());
			System.out.println("두번째 수: "+inputData2);
			System.out.println("================");
			
			if(inputData2 == 0.0) { System.out.println("결과:무한대"); }
			else {System.out.println(inputData/inputData2); }
	}
}
