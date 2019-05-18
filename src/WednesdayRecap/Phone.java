package WednesdayRecap;

public class Phone extends Device {

	String contact;
	String pictures;
	String assistantName;
	String phoneModel;

	public void makeCall() {
		System.out.println("Calling " + contact);
	}

	public void wakeUpWithVoiceAssistant() {
		System.out.println(String.format("Waking up %s with %s",
				phoneModel, assistantName));
	}

}
