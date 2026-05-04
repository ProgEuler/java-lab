public class AppController {

    public void startApp() {
        SmartSpeaker speaker = new SmartSpeaker("HomePod", 8);

        speaker.playAudio();
    }
}
