package sec02.exam02;

public class Anonymous {
	//field �ʱⰪ���� ����
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	void method1() {
		//���� ���������� ����
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("Audio�� ���ϴ�.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
		};
		//���� ���� ���
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
