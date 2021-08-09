package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		// 강제 타입 변환
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();

	}

}
