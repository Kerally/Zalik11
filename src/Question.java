import java.util.ArrayList;
import java.util.List;

// Клас питання
class Question {
    private long id;
    private String text;
    private List<Option> options;
    private boolean multipleChoice;

    public Question(long id, String text, boolean multipleChoice) {
        this.id = id;
        this.text = text;
        this.multipleChoice = multipleChoice;
        this.options = new ArrayList<>();
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public List<Option> getOptions() {
        return options;
    }

    public boolean isMultipleChoice() {
        return multipleChoice;
    }

    public String getText() {
        return text;
    }
}
