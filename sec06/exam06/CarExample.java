package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		// Getter과 Setter 메소드 사용
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: "+myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도: "+myCar.getSpeed());

	}

}
