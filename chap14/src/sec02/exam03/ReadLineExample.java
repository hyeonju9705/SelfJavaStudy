package sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception{
		// 라인 단위로 문자열 읽기
		Reader reader = new FileReader(
				ReadLineExample.class.getResource("langage.txt").getPath()
				);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();
			if(data==null) break;
			System.out.println(data);
		}
		
		br.close();
	}

}
