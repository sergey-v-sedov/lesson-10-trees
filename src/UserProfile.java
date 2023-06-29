import java.util.UUID;

public class UserProfile {
    String id;
    String login;
    String email;

    public UserProfile(String login, String email) {
        this.id = UUID.randomUUID().toString();
        this.login = login;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}