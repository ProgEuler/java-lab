import java.io.Serializable;

public class PlayerProfile implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private int score;

    private transient String sessionPassword;

    public PlayerProfile(String username, int score) {
        this.username = username;
        this.score = score;
    }

    public String getUsername() {
        return username;
    }

    public void setUser(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPassword(String password) {
        this.sessionPassword = password;
    }

    public boolean hasActiveSession() {
        return sessionPassword != null;
    }

    @Override
    public String toString() {
        return (
            "PlayerProfile{username='" +
            username +
            "', score=" +
            score +
            ", sessionActive=" +
            hasActiveSession() +
            "}"
        );
    }
}
