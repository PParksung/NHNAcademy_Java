package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 5
// import Mosaic;

public class Problem5 {

    static int currentRow = 5;
    static int currentCol = 5;

    public static void main(String[] args) {
        //Mosaic.open(10, 10, 25, 25);

        for (int i = 0; i < 50; i++) {
            // TODO: 현재 위치를 무작위로 이동
            randomMove();
        }

        // 최종 위치 출력
        System.out.println("최종 위치: (" + currentRow + ", " + currentCol + ")");
    }

    public static void randomMove() {
        // TODO: 행과 열을 무작위로 변경
    }
} 