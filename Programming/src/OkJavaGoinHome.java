import iot.opentutorials.iot.Elevator;
import iot.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoinHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "JAVA APT 507";
        
        // Elevator call 
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);
         
        // Security off 
        Security mySecurity = new Security(id);
        mySecurity.off();
         
        // Light on
        Lighting hallLamp = new Lighting(id+" / Hall Lamp");
        hallLamp.on();
         
        Lighting floorLamp = new Lighting(id+" / floorLamp");
        floorLamp.on();
	}

}
