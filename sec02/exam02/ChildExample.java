package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// �ڵ�Ÿ�� ��ȯ ���� ��� ����
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
	}

}
