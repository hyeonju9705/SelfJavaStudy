package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// superº¯¼ö
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode=SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
