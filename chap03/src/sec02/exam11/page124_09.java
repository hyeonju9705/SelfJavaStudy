package sec02.exam11;

import java.util.Scanner;

public class page124_09 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
			double inputData = Double.parseDouble(scanner.nextLine());
			System.out.println("ù��° ��: "+inputData);
		
			double inputData2= Double.parseDouble(scanner.nextLine());
			System.out.println("�ι�° ��: "+inputData2);
			System.out.println("================");
			
			if(inputData2 == 0.0) { System.out.println("���:���Ѵ�"); }
			else {System.out.println(inputData/inputData2); }
	}
}
