public class Main {
    public static void main(String[] args) {
        // Створення тьютора
        User tutor = new User(1, "John Doe", "john@example.com", UserType.TUTOR);

        // Створення тесту
        Test test = new Test(1, "Mathematics", "Basic Algebra", tutor);

        // Додавання питань
        Question question1 = new Question(1, "What is 2+2?", false);
        question1.addOption(new Option(1, "3", false));
        question1.addOption(new Option(2, "4", true));
        question1.addOption(new Option(3, "5", false));

        Question question2 = new Question(2, "Select prime numbers.", true);
        question2.addOption(new Option(4, "2", true));
        question2.addOption(new Option(5, "4", false));
        question2.addOption(new Option(6, "7", true));

        test.addQuestion(question1);
        test.addQuestion(question2);

        // Імітація відповіді студента
        User student = new User(2, "Alice", "alice@example.com", UserType.STUDENT);
        StudentAnswer answer1 = new StudentAnswer(student, question1);
        answer1.addSelectedOption(question1.getOptions().get(1)); // Вибір відповіді "4"

        System.out.println("Student " + student.getName() + " answered: " +
                answer1.getSelectedOptions().get(0).getText() + " for question: " + question1.getText());
    }
}