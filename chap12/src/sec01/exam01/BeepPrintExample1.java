package sec01.exam01;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		// ���� �����常 �̿��� ���
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}