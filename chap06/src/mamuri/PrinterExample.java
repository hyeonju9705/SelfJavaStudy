package mamuri;

public class PrinterExample {

	public static void main(String[] args) {
		// 메소드 호출하여 매개값 콘솔에 출력
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}

}
