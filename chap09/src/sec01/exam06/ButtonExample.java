package sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		// ��ư �̺�Ʈ ó��
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();

	}

}
