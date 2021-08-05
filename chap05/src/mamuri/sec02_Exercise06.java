package mamuri;

import java.util.Scanner;

public class sec02_Exercise06 {	
	
	public static void main(String[] args) {
		// 학생수+점수입력받은 후 최고점수 , 평균점수 구하기
		boolean run = true;
		int studentNum=0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo ==1) {
				//작성
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores= new int[studentNum]; 
			} else if(selectNo ==2) {
				//작성
				for(int i=0; i<studentNum; i++) {
				System.out.print("scores["+i+"]>");
				scores[i]= Integer.parseInt(scanner.nextLine());
				}
			} else if(selectNo == 3) {
				//작성
				for(int i=0; i<studentNum; i++) {
				System.out.println("scores["+i+"]>"+scores[i]);
				}
			} else if(selectNo ==4) {
				//작성
				int max = 0,sum=0;
				for(int i=0; i<studentNum; i++) {
					
					if(max<scores[i]) {
						max=scores[i];
					}
					sum+=scores[i];
				}
				
				double avg=(double)sum/scores.length;
				
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
			} else if(selectNo ==5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
