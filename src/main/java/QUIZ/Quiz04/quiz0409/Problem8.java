package QUIZ.Quiz04.quiz0409;
// Quiz 4-9 문제 4.8: 10문제 덧셈 퀴즈를 생성, 진행, 채점하는 프로그램의 기본 틀입니다.
public class Problem8 {
    static int[] firstNumbers = new int[10];
    static int[] secondNumbers = new int[10];
    static int[] userAnswers = new int[10];

    public static void makeQuiz() {
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < 10; i++) {
            firstNumbers[i] = rand.nextInt(50) + 1;
            secondNumbers[i] = rand.nextInt(50) + 1;
        }
    }

    public static void administerQuiz() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ". " + firstNumbers[i] + " + " + secondNumbers[i] + " = ");
            userAnswers[i] = sc.nextInt();
        }
    }

    public static void gradeQuiz() {
        int score = 0;
        for (int i = 0; i < 10; i++) {
            int correct = firstNumbers[i] + secondNumbers[i];
            System.out.print((i+1) + ". " + firstNumbers[i] + " + " + secondNumbers[i] + " = " + userAnswers[i]);
            if (userAnswers[i] == correct) {
                System.out.println("  정답");
                score += 10;
            } else {
                System.out.println("  오답 (정답: " + correct + ")");
            }
        }
        System.out.println("총점: " + score);
    }

    public static void main(String[] args) {
        makeQuiz();
        administerQuiz();
        gradeQuiz();
    }
} 