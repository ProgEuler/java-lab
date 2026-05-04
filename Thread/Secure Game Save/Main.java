public class Main {

    public static void main(String[] args) {
        GameSaveManager manager = new GameSaveManager();

        PlayerProfile player = new PlayerProfile("GamerX", 4800);
        player.setPassword("asdf1234");

        System.out.println("_________Before save_________");
        System.out.println("Session active: " + player.hasActiveSession());

        manager.saveProfile(player);

        System.out.println("\n------After Load-------");

        PlayerProfile loaded = manager.loadProfile();
    }
}
