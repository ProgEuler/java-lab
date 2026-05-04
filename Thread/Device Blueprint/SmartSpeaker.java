// SmartSpeaker IS-A MediaDevice — inherits protected access to pairHardware()
public class SmartSpeaker extends MediaDevice {

    private int volumeLevel;

    public SmartSpeaker(String deviceName, int volumeLevel) {
        super(deviceName);
        this.volumeLevel = volumeLevel;
    }

    @Override
    public void playAudio() {
        // Authorized — SmartSpeaker is inside the inheritance tree
        pairHardware();
        System.out.println(
            "[" + getDeviceName() + "] Playing audio at volume " + volumeLevel
        );
    }
}
