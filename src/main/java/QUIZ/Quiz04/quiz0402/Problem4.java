package QUIZ.Quiz04.quiz0402;

// Quiz 4-2 문제 4
public class Problem4 {
    static int gamesPlayed = 0;
    static int gamesWon = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            playGame();
            showScore();
        }
    }

    public static void playGame() {
        System.out.println("게임을 시작합니다.");
        gamesPlayed++;
        if (Math.random() < 0.5) {
            gamesWon++;
        }
    }

    public static void showScore() {
        System.out.printf("Played: %d, Won: %d\n", gamesPlayed, gamesWon);
    }
} 