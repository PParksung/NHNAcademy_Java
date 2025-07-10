package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 3

public class Problem3 {

    public static void main(String[] args) {
        // TODO: Mosaic 창 열기
        Mosaic.open(10, 10, 25, 25);

        // TODO: 각 사각형을 빨간색으로 채우기
        fillWithRed();
    }

    public static void fillWithRed() {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                Mosaic.setColor(row, col, 255, 0, 0);
            }
        }
    }
} 