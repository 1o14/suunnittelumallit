package assignment16;

// SmartRemote on uusi kaukosäädin, joka osaa käyttää äänikomentoa
public class SmartRemote extends BasicRemote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl(String command) {
        System.out.println("Voice command received: " + command);
        if (command.equalsIgnoreCase("browse")) {
            if (device instanceof SmartTV) {
                ((SmartTV) device).browseInternet(); // Käynnistetään selaus
            } else {
                System.out.println("Device does not support browsing.");
            }
        }
    }
}
