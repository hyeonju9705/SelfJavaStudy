package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		// Ŭ���� �ܺο��� �޼ҵ� ȣ��
		Car myCar=new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ�: "+speed+"km/h");
	}

}
