package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 5

public class Problem5 {

    static int currentRow = 5;
    static int currentCol = 5;

    public static void main(String[] args) {
        Mosaic.open(10, 10, 25, 25);

        for (int i = 0; i < 50; i++) {
            // TODO: 현재 위치를 무작위로 이동
            randomMove();
            Mosaic.setColor(currentRow, currentCol, 0, 0, 255);
            Mosaic.delay(50);
        }

        // 최종 위치 출력
        System.out.println("최종 위치: (" + currentRow + ", " + currentCol + ")");
    }

    public static void randomMove() {
        int dir = (int)(Math.random() * 4);
        if (dir == 0 && currentRow > 0) currentRow--; // 위
        else if (dir == 1 && currentRow < 9) currentRow++; // 아래
        else if (dir == 2 && currentCol > 0) currentCol--; // 왼쪽
        else if (dir == 3 && currentCol < 9) currentCol++; // 오른쪽
    }
} 