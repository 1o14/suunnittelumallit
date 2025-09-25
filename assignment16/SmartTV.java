package assignment16;

// SmartTV on uusi laite, joka osaa selata nettiä
public class SmartTV implements Device {
    private boolean on = false;
    private int volume = 30;

    public boolean isEnabled() {
        return on;
    }

    public void enable() {
        on = true;
    }

    public void disable() {
        on = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int percent) {
        volume = percent;
    }

    public void browseInternet() {
        if (on) {
            System.out.println("Browsing internet on SmartTV...");
        } else {
            System.out.println("SmartTV is off. Cannot browse.");
        }
    }
}
