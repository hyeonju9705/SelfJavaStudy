package sec03.exam01;

import java.io.*;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception{
		// Ű����κ��� ���� ���� ���ڿ� ���
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.println("�Է��ϼ���: ");
			String lineStr = br.readLine();
			if(lineStr.equals("q")|| lineStr.equals("quit")) break;
			System.out.println("�Էµ� ����: "+lineStr);
			System.out.println();
		}
		
		br.close();
	}

}
