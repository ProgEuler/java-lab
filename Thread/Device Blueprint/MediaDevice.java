public abstract class MediaDevice {

    private String deviceName;

    public MediaDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    protected void pairHardware() {
        System.out.println(
            "[" + deviceName + "] Hardware pairing sequence initiated..."
        );
        System.out.println("[" + deviceName + "] Pairing complete.");
    }

    public abstract void playAudio();
}
