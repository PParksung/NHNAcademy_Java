package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 9

public class Problem9 {

    public static void main(String[] args) {
        Mosaic.open(10, 10, 25, 25);

        // TODO: 100번의 색상 교란 애니메이션 실행
        animateRandomColors(100);
    }

    public static void animateRandomColors(int steps) {
        for (int i = 0; i < steps; i++) {
            int row = (int)(Math.random() * 10);
            int col = (int)(Math.random() * 10);
            int r = (int)(Math.random() * 256);
            int g = (int)(Math.random() * 256);
            int b = (int)(Math.random() * 256);
            Mosaic.setColor(row, col, r, g, b);
            Mosaic.delay(50);
        }
    }
} 