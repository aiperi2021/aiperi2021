package WednesdayRecap;

public class iPhone extends Phone {
	

	public static void main(String[] args) {
		Phone phone = new Phone();

		System.out.println(phone.isOn);

		if (phone.isOn == false) {
			phone.turnOn();
		}	
		phone.assistantName = "Siri";
		phone.phoneModel = "iPhone";
		phone.wakeUpWithVoiceAssistant();
	}
}
