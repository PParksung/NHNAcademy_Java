package QUIZ.Quiz04.quiz0409;
// Quiz 4-9 문제 4.7: 모자이크에서 무작위로 사각형을 선택하고, 이웃에게 색상을 복사하는 과정을 반복하는 프로그램의 기본 틀입니다.
public class Problem7 {
    public static void main(String[] args) {
        Mosaic.open(30, 30, 10, 10);
        for (int row = 0; row < 30; row++) {
            for (int col = 0; col < 30; col++) {
                int r = (int)(Math.random() * 256);
                int g = (int)(Math.random() * 256);
                int b = (int)(Math.random() * 256);
                Mosaic.setColor(row, col, r, g, b);
            }
        }
        while (Mosaic.isOpen()) {
            int row = (int)(Math.random() * 30);
            int col = (int)(Math.random() * 30);
            int dir = (int)(Math.random() * 4);
            int nRow = row, nCol = col;
            if (dir == 0 && row > 0) nRow--;
            else if (dir == 1 && row < 29) nRow++;
            else if (dir == 2 && col > 0) nCol--;
            else if (dir == 3 && col < 29) nCol++;
            Mosaic.setColor(nRow, nCol, Mosaic.getColor(row, col));
            Mosaic.delay(10);
        }
    }
} 