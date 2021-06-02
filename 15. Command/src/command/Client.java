package command;

public class Client {

	public static void main(String[] args) {
		Heater heater = new Heater();
		Lamp lamp = new Lamp();
		
		Command heaterOnCommand = new HeaterOnCommand(heater);
		Command lampOnCommand = new LampOnCommand(lamp);
		OKGoogle okGoogle = new OKGoogle();
		
		
		// ���͸� �Ҵ�
		okGoogle.setCommand(heaterOnCommand);
		okGoogle.talk();
		
		// ������ �Ҵ�
		okGoogle.setCommand(lampOnCommand);
		okGoogle.talk();
	}

}
