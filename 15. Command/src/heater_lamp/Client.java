package heater_lamp;

public class Client {
	public static void main(String args[]) {
		Heater heater = new Heater();
		Lamp lamp = new Lamp();
		OKGoogle okGoogle = new OKGoogle(heater, lamp);
		
		// 램프 켜짐
		okGoogle.setMode(0);
		okGoogle.talk();
		
		// 알람 울림
		okGoogle.setMode(1);
		okGoogle.talk();
	}

}
