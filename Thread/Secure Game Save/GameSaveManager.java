import java.io.*;

public class GameSaveManager {

    private static final String SAVE_FILE = "player_save.dat";

    public void saveProfile(PlayerProfile profile) {
        try (
            ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(SAVE_FILE)
            )
        ) {
            oos.writeObject(profile);
            System.out.println("Profile saved: " + profile);
            System.out.println(
                "Note: sessionPassword was NOT written to disk."
            );
        } catch (IOException e) {
            System.err.println("Save failed: " + e.getMessage());
        }
    }

    public PlayerProfile loadProfile() {
        try (
            ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(SAVE_FILE)
            )
        ) {
            PlayerProfile profile = (PlayerProfile) ois.readObject();
            System.out.println("Profile loaded: " + profile);
            System.out.println(
                "Note: sessionPassword is null after load = " +
                    !profile.hasActiveSession()
            );
            return profile;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Load failed: " + e.getMessage());
            return null;
        }
    }
}
