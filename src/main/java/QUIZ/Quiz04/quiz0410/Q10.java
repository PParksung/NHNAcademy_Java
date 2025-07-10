package QUIZ.Quiz04.quiz0410;

// Quiz 4-10 문제 10
public class Q10 {
    public static void stars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            stars(i);
        }
    }
} 