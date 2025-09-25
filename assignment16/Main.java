package assignment16;

// Testataan uusi laite ja kaukosäädin
public class Main {
    public static void main(String[] args) {
        Device smartTV = new SmartTV();
        SmartRemote remote = new SmartRemote(smartTV);

        remote.power(); // Käynnistetään TV
        remote.voiceControl("browse"); // Käytetään äänikomentoa
    }
}
