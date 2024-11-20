import java.util.ArrayList;
import java.util.List;


// Клас варіанту відповіді
class Option {
    private long id;
    private String text;
    private boolean isCorrect;

    public Option(long id, String text, boolean isCorrect) {
        this.id = id;
        this.text = text;
        this.isCorrect = isCorrect;
    }

    public String getText() {
        return text;
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}
