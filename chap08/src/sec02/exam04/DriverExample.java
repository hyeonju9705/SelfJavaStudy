package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		// 객체타입확인
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);

	}

}
