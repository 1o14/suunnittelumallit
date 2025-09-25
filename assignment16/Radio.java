package assignment16;

// Radio on yksinkertainen laite
public class Radio implements Device {
    private boolean on = false;
    private int volume = 50;

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
}
