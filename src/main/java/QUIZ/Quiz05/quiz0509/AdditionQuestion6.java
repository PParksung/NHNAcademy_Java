package QUIZ.Quiz05.quiz0509;

// Quiz 5-9 문제 6
public class AdditionQuestion6 {
    private int a, b;
    public AdditionQuestion6() {
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }
    public String getQuestion() {
        return "What is " + a + " + " + b + " ?";
    }
    public int getCorrectAnswer() {
        return a + b;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            AdditionQuestion6 a = new AdditionQuestion6();
            System.out.println(a.getQuestion() + " 정답: " + a.getCorrectAnswer());
        }
    }
} 