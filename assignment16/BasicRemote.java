package assignment16;

// BasicRemote on tavallinen kaukosäädin
public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    public void power() {
        if (device.isEnabled()) {
            device.disable();
            System.out.println("Device is turned off");
        } else {
            device.enable();
            System.out.println("Device is turned on");
        }
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
        System.out.println("Volume increased to " + device.getVolume());
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
        System.out.println("Volume decreased to " + device.getVolume());
    }
}
