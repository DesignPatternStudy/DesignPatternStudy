package heater_lamp;

public class OKGoogle {
	public static String[] modes = {"heater", "lamp"};
	
	private Heater heater;
	private Lamp lamp;
	private String mode;
	
	OKGoogle(Heater heater, Lamp lamp) {
		this.heater =heater;
		this.lamp = lamp;
	}
	
	public void setMode(int idx) {
		this.mode = modes[idx];
	}
	
	public void talk() {
		switch(this.mode) {
		case "heater" :
			this.heater.powerOn();
			break;
		case "lamp" :
			this.lamp.turnOn();
			break;
		}
	}
}
