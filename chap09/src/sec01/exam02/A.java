package sec01.exam02;

public class A {
	//instance field
	B field1= new B();
	C field2= new C();
	
	//instance method
	void method1() {
		B var1=new B();
		C var2 = new C();
		
	}
	
	//�����ʵ� �ʱ�ȭ
	static C field4 = new C();
	
	//���� �޼ҵ�
	static void method2() {
		C var2 = new C();
	}
	
	//instance member class
	class B{}
	
	//���� ��� Ŭ����
	static class C{}
}
