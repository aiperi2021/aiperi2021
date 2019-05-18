package WednesdayRecap;

public class DeviceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {34,5,65,5,2};
		
		
		iPhone iphone = new iPhone();
		Android android = new Android();
		Phone phone = new Phone();
		
		android = (Android) phone;
		iphone = (iPhone) phone;
				
		android.wakeUpWithVoiceAssistant();
		
		iphone.wakeUpWithVoiceAssistant();

	}

}
