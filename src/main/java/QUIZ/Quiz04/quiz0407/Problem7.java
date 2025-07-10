package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 7

import java.awt.*;

public class Problem7 {

    public static void main(String[] args) {
        Mosaic.open(10, 10, 25, 25);

        // TODO: 두 사각형의 색상을 교환
        Mosaic.setColor(0, 0, Color.RED);
        Mosaic.setColor(1, 1, Color.BLUE);

        Mosaic.delay(500);

        swapColors(0, 0, 1, 1);
    }

    public static void swapColors(int row1, int col1, int row2, int col2) {
        Color color1 = Mosaic.getColor(row1, col1);
        Color color2 = Mosaic.getColor(row2, col2);

        Mosaic.setColor(row1, col1, color2);
        Mosaic.setColor(row2, col2, color1);
    }
} 