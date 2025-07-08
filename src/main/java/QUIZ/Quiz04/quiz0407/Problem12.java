package QUIZ.Quiz04.quiz0407;

// Quiz 4-7 문제 12
// import Mosaic;

public class Problem12 {

    public static void main(String[] args) {
        Mosaic.open(5, 5, 25, 25);

        // TODO: 임의의 색상으로 채우기
        fillRandomColors();

        // TODO: 평균 색상 계산
        int[] avgColor = calculateAverageColor(0, 0, 4, 4);
        System.out.println("평균 색상: R=" + avgColor[0] + ", G=" + avgColor[1] + ", B=" + avgColor[2]);
    }

    public static int[] calculateAverageColor(int startRow, int startCol, int endRow, int endCol) {
        // TODO: 지정된 영역의 평균 색상 계산
        return new int[]{0, 0, 0}; // 임시 반환값
    }

    public static void fillRandomColors() {
        // TODO: 무작위 색상으로 창 채우기
    }
} 