package assignment16;

// Tämä rajapinta määrittelee mitä laite osaa tehdä
public interface Device {
    boolean isEnabled();          
    void enable();                
    void disable();               
    int getVolume();              
    void setVolume(int percent); 
}
