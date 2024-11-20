import java.util.ArrayList;
import java.util.List;

class StudentAnswer {
    private User student;
    private Question question;
    private List<Option> selectedOptions;

    public StudentAnswer(User student, Question question) {
        this.student = student;
        this.question = question;
        this.selectedOptions = new ArrayList<>();
    }

    public void addSelectedOption(Option option) {
        selectedOptions.add(option);
    }

    public User getStudent() {
        return student;
    }

    public Question getQuestion() {
        return question;
    }

    public List<Option> getSelectedOptions() {
        return selectedOptions;
    }
}