package QUIZ.Quiz05.quiz0509;

// Quiz 5-9 문제 4
import java.util.Scanner;

interface IntQuestion7 {
    String getQuestion();
    int getCorrectAnswer();
}

class AdditionQuestion7 implements IntQuestion7 {
    private int a, b;
    public AdditionQuestion7() {
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }
    public String getQuestion() {
        return "What is " + a + " + " + b + " ?";
    }
    public int getCorrectAnswer() {
        return a + b;
    }
}

class SubtractionQuestion7 implements IntQuestion7 {
    private int a, b;
    public SubtractionQuestion7() {
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
    }
    public String getQuestion() {
        return "What is " + a + " - " + b + " ?";
    }
    public int getCorrectAnswer() {
        return a - b;
    }
}

public class Quiz7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntQuestion7[] quiz = new IntQuestion7[5];
        quiz[0] = new AdditionQuestion7();
        quiz[1] = new SubtractionQuestion7();
        quiz[2] = new AdditionQuestion7();
        quiz[3] = new SubtractionQuestion7();
        quiz[4] = new IntQuestion7() {
            public String getQuestion() {
                return "What is the answer to the ultimate question" +
                       "of life, the universe, and everything?";
            }
            public int getCorrectAnswer() {
                return 42;
            }
        };
        int score = 0;
        for (IntQuestion7 q : quiz) {
            System.out.println(q.getQuestion());
            int ans = sc.nextInt();
            if (ans == q.getCorrectAnswer()) {
                System.out.println("정답!");
                score++;
            } else {
                System.out.println("오답! 정답은 " + q.getCorrectAnswer());
            }
        }
        System.out.println("총 점수: " + score + "/5");
    }
} 