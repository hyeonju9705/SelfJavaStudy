package sec01.exam05;

public class OutterExample {

	public static void main(String[] args) {
		// ���� Ŭ����
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}

}
