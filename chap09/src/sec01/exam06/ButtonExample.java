package sec01.exam06;

public class ButtonExample {

	public static void main(String[] args) {
		// 버튼 이벤트 처리
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();

	}

}
