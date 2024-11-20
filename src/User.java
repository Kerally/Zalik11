import java.util.ArrayList;
import java.util.List;

// Клас користувача
class User {
    private long id;
    private String name;
    private String email;
    private UserType userType;

    public User(long id, String name, String email, UserType userType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userType = userType;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public UserType getUserType() {
        return userType;
    }
}

// Перелік для типу користувача
enum UserType {
    STUDENT, TUTOR
}