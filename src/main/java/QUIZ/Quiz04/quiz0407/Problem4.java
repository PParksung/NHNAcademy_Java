package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 4

public class Problem4 {

    public static void main(String[] args) {
        Mosaic.open(10, 10, 25, 25);

        // TODO: 창을 임의의 색상으로 채우기
        fillRandomColors();
    }

    public static void fillRandomColors() {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                int r = (int)(Math.random() * 256);
                int g = (int)(Math.random() * 256);
                int b = (int)(Math.random() * 256);
                Mosaic.setColor(row, col, r, g, b);
            }
        }
    }
} 