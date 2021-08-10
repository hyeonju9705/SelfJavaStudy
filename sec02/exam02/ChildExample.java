package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// 자동타입 변환 후의 멤버 접근
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
	}

}
