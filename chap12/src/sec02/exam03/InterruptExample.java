package sec02.exam03;

public class InterruptExample {

	public static void main(String[] args) {
		// 1�� �� ��� �����带 ����
		Thread thread = new PrintThread2();
		thread.start();
		
		try { Thread.sleep(1000); }catch (InterruptedException e) {}
		
		thread.interrupt();
		
	}

}
