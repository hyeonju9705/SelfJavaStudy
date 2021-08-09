package sec01.exam06;

import sec01.exam03.RemoteControl;
import sec01.exam05.SmartTelevision;

public class MyClass {
	//field
	RemoteControl rc = new Television();
	
	//»ý¼ºÀÚ
	MyClass(){}
	
	MyClass(RemoteControl rc){
		this.rc=rc;
		rc.turnOn();
		rc.setVolue(5);
	}
	
	//method
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
