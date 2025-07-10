package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 13

public class Problem13 {

    static int currentRow = 5;
    static int currentCol = 5;

    public static void main(String[] args) {
        Mosaic.open(10, 10, 25, 25);

        // TODO: 랜덤 이동 실행
        randomWalk(20);

        System.out.println("최종 위치: (" + currentRow + ", " + currentCol + ")");
    }

    public static void randomWalk(int steps) {
        for (int i = 0; i < steps; i++) {
            // 0.0 <= Math.random() < 1.0  0~3
            int direction = (int) (Math.random() * 4);

            switch (direction) {
                case 0: // 위
                    if (currentRow > 0) currentRow--;
                    break;
                case 1: // 아래
                    if (currentRow < 9) currentRow++;
                    break;
                case 2: // 왼쪽
                    if (currentCol > 0) currentCol--;
                    break;
                case 3: // 오른쪽
                    if (currentCol < 9) currentCol++;
                    break;
            }

            Mosaic.setColor(currentRow, currentCol, 255, 0, 0);
            Mosaic.delay(100);
        }
    }
} 