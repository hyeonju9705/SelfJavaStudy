package mamuri;

import java.util.Scanner;

public class sec02_Exercise06 {	
	
	public static void main(String[] args) {
		// �л���+�����Է¹��� �� �ְ����� , ������� ���ϱ�
		boolean run = true;
		int studentNum=0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4. �м� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo ==1) {
				//�ۼ�
				System.out.print("�л���>");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores= new int[studentNum]; 
			} else if(selectNo ==2) {
				//�ۼ�
				for(int i=0; i<studentNum; i++) {
				System.out.print("scores["+i+"]>");
				scores[i]= Integer.parseInt(scanner.nextLine());
				}
			} else if(selectNo == 3) {
				//�ۼ�
				for(int i=0; i<studentNum; i++) {
				System.out.println("scores["+i+"]>"+scores[i]);
				}
			} else if(selectNo ==4) {
				//�ۼ�
				int max = 0,sum=0;
				for(int i=0; i<studentNum; i++) {
					
					if(max<scores[i]) {
						max=scores[i];
					}
					sum+=scores[i];
				}
				
				double avg=(double)sum/scores.length;
				
				System.out.println("�ְ� ����: "+max);
				System.out.println("��� ����: "+avg);
			} else if(selectNo ==5) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}

}
