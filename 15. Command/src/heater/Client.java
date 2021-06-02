package heater;

public class Client {

	public static void main(String[] args) {
		Heater heater = new Heater();
		OKGoogle okGoogle = new OKGoogle(heater);
		okGoogle.talk();
	}

}
