package sec03.exam01;

import java.io.*;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception{
		// 키보드로부터 라인 단위 문자열 얻기
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.println("입려하세요: ");
			String lineStr = br.readLine();
			if(lineStr.equals("q")|| lineStr.equals("quit")) break;
			System.out.println("입력된 내용: "+lineStr);
			System.out.println();
		}
		
		br.close();
	}

}
