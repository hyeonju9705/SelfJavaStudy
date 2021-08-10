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
	
	//정적필드 초기화
	static C field4 = new C();
	
	//정적 메소드
	static void method2() {
		C var2 = new C();
	}
	
	//instance member class
	class B{}
	
	//정적 멤버 클래스
	static class C{}
}
