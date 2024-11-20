import java.util.ArrayList;
import java.util.List;


// Клас для тесту
class Test {
    private long id;
    private String subject;
    private String description;
    private User tutor;
    private List<Question> questions;

    public Test(long id, String subject, String description, User tutor) {
        this.id = id;
        this.subject = subject;
        this.description = description;
        this.tutor = tutor;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public User getTutor() {
        return tutor;
    }
}