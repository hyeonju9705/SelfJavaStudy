package mamuri;

import java.io.BufferedReader;
import java.io.FileReader;

public class exam02 {
	public static void main(String[] args) throws Exception{
		String filePath = "src/mamuri/exam02.java";
		//start
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		while( (rowData=br.readLine())!= null) {
			System.out.println(++rowNumber+": "+rowData);
		}
		
		br.close();
		
	}
}
