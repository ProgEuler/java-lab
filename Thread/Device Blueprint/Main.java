public class Main {

    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker("HomePod", 8);
        speaker.playAudio();

        System.out.println("---");

        AppController controller = new AppController();
        controller.startApp();
    }
}
